package com.totus.controller;


import com.totus.model.Client;
import com.totus.model.Error;
import com.totus.model.Product;
import com.totus.model.Devolucion;
import com.totus.model.DevolucionProducto;
import com.totus.model.Provider;
import com.totus.model.User;
import com.totus.table.ClientTab;
import com.totus.table.ProductTab;
import com.totus.table.DevolucionProductoTab;
import com.totus.table.DevolucionTab;
import com.totus.table.ProviderTab;
import com.totus.table.UserTab;
import com.totus.utilities.Constant;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mikaelo
 */
public class DevolucionProductoController extends Controller<DevolucionProducto> {
    
    public DevolucionProductoController(){
        super();
    }
    
    @Override
    public DevolucionProducto save(DevolucionProducto instance){
        
        DevolucionProductoTab devolucionProductoTab = new DevolucionProductoTab();
        instance.setCampos(
                devolucionProductoTab.getDevolucionId()+", "+
                devolucionProductoTab.getProductoId()
            );
        
        instance.setValor(
                instance.getDevolucion().getId()+ ", " +
                instance.getProducto().getId() 
            );
        instance.setCondicional("");
                
        try {
            super.save(instance);
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
     * 
     */
    public List<DevolucionProducto> getListByDevolucion(DevolucionProducto instance) {
        List<DevolucionProducto> listDevolucionProducto = new ArrayList<>();
        DevolucionProductoTab devolucionProductoTab = new DevolucionProductoTab();
        ProductTab productTab = new ProductTab();
        ProviderTab providerTab = new ProviderTab();
        DevolucionProducto devolucionProducto = new DevolucionProducto();
        instance.setCampos(
                "dp."+devolucionProductoTab.getDevolucionId()+", "+
                "dp."+devolucionProductoTab.getProductoId()+", "+
                "p."+productTab.getDescription()+", "+
                "p."+productTab.getLote()+", "+
                "p."+productTab.getBill()+", "+
                "p."+productTab.getReturn_date()+", "+
                "p."+productTab.getProvider_id()+", "+
                "pr."+providerTab.getName()+", "+
                "pr."+providerTab.getFirst_last_name()+", "+
                "pr."+providerTab.getSecond_last_name()
                        
            );
        instance.setCondicional(" dp inner join public.products p ON dp."+devolucionProductoTab.getProductoId()+"=p."+productTab.getId()+ 
                                " inner join public.providers pr ON p."+productTab.getProvider_id()+"=pr."+providerTab.getId()+ 
                                " WHERE dp." +devolucionProductoTab.getDevolucionId()+" = "+instance.getDevolucion().getId()
            );
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    Integer a = null;
                    while (result .next()){
                        devolucionProducto = new DevolucionProducto();
                        devolucionProducto.setExists(true);

                        devolucionProducto.setDevolucion(new Devolucion(result.getInt(1) ));
                        devolucionProducto.setProducto(new Product(result.getInt(2)) );
                        devolucionProducto.getProducto().setDescripcion( result.getString(3) );
                        devolucionProducto.getProducto().setLote( result.getString(4) );
                        devolucionProducto.getProducto().setFactura( result.getString(5) );
                        devolucionProducto.getProducto().setFechaDevolucion(result.getDate(6) );
                        devolucionProducto.getProducto().setProvider( new Provider( result.getInt(7) ));
                        devolucionProducto.getProducto().getProvider().setNombre( result.getString(8) );
                        devolucionProducto.getProducto().getProvider().setApellidoPaterno( result.getString(9) );
                        devolucionProducto.getProducto().getProvider().setApellidoMaterno( result.getString(10) );
                              
                        
                        
                        
                        devolucionProducto.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        listDevolucionProducto.add(devolucionProducto);
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
        return listDevolucionProducto;
    }
    
    public void saveList(Devolucion devolucion,List<Product> listProducto) {
        DevolucionProducto dp = null;
        for(Product product : listProducto){
                dp = new DevolucionProducto(devolucion, product);
                dp = this.save(dp);

        }
        
    }
    
/*
    / **
     * Actualiza todo el devolucion, los productos los pone como vendidos o no_vendidos
     * @param instance
     * @param vendido 
     * /
    public void actualizaDevolucionVenta(DevolucionProducto instance, boolean vendido){
        DevolucionProductoTab devolucionProductoTab = new DevolucionProductoTab();
        instance.setCampos(
                devolucionProductoTab.getVendido()+" = " + vendido 
            );
        instance.setCondicional(" WHERE "+devolucionProductoTab.getDevolucion_id()+"="+instance.getDevolucion().getId() );
        
        try {
            super.update(instance);
            instance.setError(new com.totus.model.Error("000000", "Quierofano Cerrado"));
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        
    }
    
    / **
     * Actualiza por devolucion y prodcuto, vndido o no_vendido
     * @param instance
     * @param vendido
     * @return 
     * /
     public DevolucionProducto actualizaVenta(DevolucionProducto instance,  boolean vendido){
        DevolucionProductoTab devolucionProductoTab = new DevolucionProductoTab();
        ProductTab productTab = new ProductTab();
        instance.setCampos(
                devolucionProductoTab.getVendido()+" = " + vendido 
            );
        // / *
        instance.setCondicional(" WHERE "+devolucionProductoTab.getDevolucion_id()+"="+instance.getDevolucion().getId() +
                " and " + devolucionProductoTab.getProducto_id()+"="+instance.getProduct().getId()
            );
        // * /
        instance.setCondicional(" FROM public.products"+
                " WHERE devolucion_producto."+devolucionProductoTab.getDevolucion_id()+"="+instance.getDevolucion().getId() +
                " and devolucion_producto." + devolucionProductoTab.getProducto_id()+"="+instance.getProduct().getId()+
                " and devolucion_producto." + devolucionProductoTab.getProducto_id()+"= products."+productTab.getId()+
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
    
    / **
     * Registra cada producto ligado al devolucion, todo esta como no vendido
     * @param devolucion
     * @param listProduct 
     * /
    public void abrir(Devolucion devolucion, List<Product> listProduct) {
        DevolucionProducto devolucionProducto = new DevolucionProducto();
        for(Product p : listProduct){
            devolucionProducto = new DevolucionProducto();
            devolucionProducto.setDevolucion(devolucion);
            devolucionProducto.setProduct(p);
            this.save(devolucionProducto);
        }
    }
    
    / **
     * Actualiza todo el devolucion como vendido y luego cada producto en la lista lo manda como no vendido
     * @param devolucion
     * @param listProduct 
     * /
    public void cerrar(Devolucion devolucion, List<Product> listProduct) {
        DevolucionProducto devolucionProducto = new DevolucionProducto();
        devolucionProducto.setDevolucion(devolucion);
        this.actualizaDevolucionVenta(devolucionProducto, Constant.VENDIDO);
        
        for(Product p : listProduct){
            devolucionProducto = new DevolucionProducto();
            devolucionProducto.setDevolucion(devolucion);
            devolucionProducto.setProduct(p);
            this.actualizaVenta(devolucionProducto, Constant.NO_VENDIDO);
        }
        
    }
*/
    
/*
     public List<DevolucionProducto> getListByDevolucionVendido(DevolucionProducto instance, boolean vendido) {
        List<DevolucionProducto> listDevolucionProducto = new ArrayList<>();
        DevolucionProductoTab devolucionProductoTab = new DevolucionProductoTab();
        DevolucionProducto devolucionProducto = new DevolucionProducto();
        instance.setCampos(
                devolucionProductoTab.getDevolucion_id()+", "+
                devolucionProductoTab.getProducto_id()+", "+
                devolucionProductoTab.getVendido()
            );
        instance.setCondicional(" WHERE " +devolucionProductoTab.getDevolucion_id() +" = "+instance.getDevolucion().getId() +
            " and " +     devolucionProductoTab.getVendido()+" = "+ vendido
            );
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    Integer a = null;
                    while (result .next()){
                        devolucionProducto = new DevolucionProducto();
                        devolucionProducto.setExists(true);

                        devolucionProducto.setDevolucion(new Devolucion(result.getInt(1) ));
                        devolucionProducto.setProduct(new Product(result.getInt(2)) );
                        devolucionProducto.setVendido(result.getBoolean(3) );
                        
                        
                        
                        devolucionProducto.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        listDevolucionProducto.add(devolucionProducto);
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
        return listDevolucionProducto;
    }
*/

    
}
