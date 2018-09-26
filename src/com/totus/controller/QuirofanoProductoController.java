package com.totus.controller;


import com.totus.model.Client;
import com.totus.model.Error;
import com.totus.model.Product;
import com.totus.model.Quirofano;
import com.totus.model.QuirofanoProducto;
import com.totus.model.User;
import com.totus.table.ClientTab;
import com.totus.table.ProductTab;
import com.totus.table.QuirofanoProductoTab;
import com.totus.table.QuirofanoTab;
import com.totus.table.UserTab;
import com.totus.utilities.Constant;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikaelo
 */
public class QuirofanoProductoController extends Controller<QuirofanoProducto> {
    
    public QuirofanoProductoController(){
        super();
    }
    
    @Override
    public QuirofanoProducto save(QuirofanoProducto instance){
        
        QuirofanoProductoTab quirofanoProductoTab = new QuirofanoProductoTab();
        instance.setCampos(
                quirofanoProductoTab.getQuirofano_id()+", "+
                quirofanoProductoTab.getProducto_id()+", "+
                quirofanoProductoTab.getVendido()
            );
        
        instance.setValor(
                instance.getQuirofano().getId()+ ", " +
                instance.getProduct().getId() + ", "+
                false
            );
        instance.setCondicional("");
                
        try {
            instance = super.save(instance);
            instance.setError(new Error("000000", "Registros Creado: "));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            if(ex.getMessage().startsWith("ERROR: duplicate key")){
                instance.setError(new Error("000002", "Duplicado correo o username"));
            }else{
                instance.setError(new Error("000002", ex.getMessage()));
            }
            
        } catch (ClassNotFoundException ex) {
            instance.setError(new Error("000001", ex.getMessage()));
        }
        return instance;
    }

    /**
     * Actualiza todo el quirofano, los productos los pone como vendidos o no_vendidos
     * @param instance
     * @param vendido 
     */
    public void actualizaQuirofanoVenta(QuirofanoProducto instance, boolean vendido){
        QuirofanoProductoTab quirofanoProductoTab = new QuirofanoProductoTab();
        instance.setCampos(
                quirofanoProductoTab.getVendido()+" = " + vendido 
            );
        instance.setCondicional(" WHERE "+quirofanoProductoTab.getQuirofano_id()+"="+instance.getQuirofano().getId() );
        
        try {
            super.update(instance);
            instance.setError(new com.totus.model.Error("000000", "Quierofano Cerrado"));
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        
    }
    
    /**
     * Actualiza por quirofano y prodcuto, vndido o no_vendido
     * @param instance
     * @param vendido
     * @return 
     */
     public QuirofanoProducto actualizaVenta(QuirofanoProducto instance,  boolean vendido){
        QuirofanoProductoTab quirofanoProductoTab = new QuirofanoProductoTab();
        ProductTab productTab = new ProductTab();
        instance.setCampos(
                quirofanoProductoTab.getVendido()+" = " + vendido 
            );
        /*
        instance.setCondicional(" WHERE "+quirofanoProductoTab.getQuirofano_id()+"="+instance.getQuirofano().getId() +
                " and " + quirofanoProductoTab.getProducto_id()+"="+instance.getProduct().getId()
            );
        */
        instance.setCondicional(" FROM public.products"+
                " WHERE quirofano_producto."+quirofanoProductoTab.getQuirofano_id()+"="+instance.getQuirofano().getId() +
                " and quirofano_producto." + quirofanoProductoTab.getProducto_id()+"="+instance.getProduct().getId()+
                " and quirofano_producto." + quirofanoProductoTab.getProducto_id()+"= products."+productTab.getId()+
                " and products."+productTab.getPerishable()+"="+Constant.SI
            );
        
        try {
            instance = super.update(instance);
            instance.setError(new com.totus.model.Error("000000", "Quierofano Cerrado"));
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        
        return instance;
    }
    
    /**
     * Registra cada producto ligado al quirofano, todo esta como no vendido
     * @param quirofano
     * @param listProduct 
     */
    public void abrir(Quirofano quirofano, List<Product> listProduct) {
        QuirofanoProducto quirofanoProducto = new QuirofanoProducto();
        for(Product p : listProduct){
            quirofanoProducto = new QuirofanoProducto();
            quirofanoProducto.setQuirofano(quirofano);
            quirofanoProducto.setProduct(p);
            this.save(quirofanoProducto);
        }
    }
    
    /**
     * Actualiza todo el quirofano como vendido y luego cada producto en la lista lo manda como no vendido
     * @param quirofano
     * @param listProduct 
     */
    public void cerrar(Quirofano quirofano, List<Product> listProduct) {
        QuirofanoProducto quirofanoProducto = new QuirofanoProducto();
        quirofanoProducto.setQuirofano(quirofano);
        this.actualizaQuirofanoVenta(quirofanoProducto, Constant.VENDIDO);
        
        for(Product p : listProduct){
            quirofanoProducto = new QuirofanoProducto();
            quirofanoProducto.setQuirofano(quirofano);
            quirofanoProducto.setProduct(p);
            this.actualizaVenta(quirofanoProducto, Constant.NO_VENDIDO);
        }
        
    }

    /**
     * 
     */
    public List<QuirofanoProducto> getListByQuirofano(QuirofanoProducto instance) {
        List<QuirofanoProducto> listQuirofanoProducto = new ArrayList<>();
        QuirofanoProductoTab quirofanoProductoTab = new QuirofanoProductoTab();
        QuirofanoProducto quirofanoProducto = new QuirofanoProducto();
        instance.setCampos(
                quirofanoProductoTab.getQuirofano_id()+", "+
                quirofanoProductoTab.getProducto_id()+", "+
                quirofanoProductoTab.getVendido()
            );
        instance.setCondicional(" WHERE " +quirofanoProductoTab.getQuirofano_id() +" = "+instance.getQuirofano().getId());
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    Integer a = null;
                    while (result .next()){
                        quirofanoProducto = new QuirofanoProducto();
                        quirofanoProducto.setExists(true);

                        quirofanoProducto.setQuirofano(new Quirofano(result.getInt(1) ));
                        quirofanoProducto.setProduct(new Product(result.getInt(2)) );
                        quirofanoProducto.setVendido(result.getBoolean(3) );
                        
                        
                        
                        quirofanoProducto.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        listQuirofanoProducto.add(quirofanoProducto);
                    }
                } catch (SQLException ex) {
                    instance.setError(new com.totus.model.Error("000003", ex.getMessage()));
                }
            }
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        return listQuirofanoProducto;
    }

     public List<QuirofanoProducto> getListByQuirofanoVendido(QuirofanoProducto instance, boolean vendido) {
        List<QuirofanoProducto> listQuirofanoProducto = new ArrayList<>();
        QuirofanoProductoTab quirofanoProductoTab = new QuirofanoProductoTab();
        QuirofanoProducto quirofanoProducto = new QuirofanoProducto();
        instance.setCampos(
                quirofanoProductoTab.getQuirofano_id()+", "+
                quirofanoProductoTab.getProducto_id()+", "+
                quirofanoProductoTab.getVendido()
            );
        instance.setCondicional(" WHERE " +quirofanoProductoTab.getQuirofano_id() +" = "+instance.getQuirofano().getId() +
            " and " +     quirofanoProductoTab.getVendido()+" = "+ vendido
            );
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    Integer a = null;
                    while (result .next()){
                        quirofanoProducto = new QuirofanoProducto();
                        quirofanoProducto.setExists(true);

                        quirofanoProducto.setQuirofano(new Quirofano(result.getInt(1) ));
                        quirofanoProducto.setProduct(new Product(result.getInt(2)) );
                        quirofanoProducto.setVendido(result.getBoolean(3) );
                        
                        
                        
                        quirofanoProducto.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        listQuirofanoProducto.add(quirofanoProducto);
                    }
                } catch (SQLException ex) {
                    instance.setError(new com.totus.model.Error("000003", ex.getMessage()));
                }
            }
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        return listQuirofanoProducto;
    }

}
