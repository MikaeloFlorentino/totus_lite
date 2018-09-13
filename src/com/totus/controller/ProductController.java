/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totus.controller;

import com.totus.model.Status;
import com.totus.model.Product;
import com.totus.model.Provider;
import com.totus.table.ProductTab;
import com.totus.table.ProviderTab;
import com.totus.table.StatusTab;
import com.totus.utilities.Utilies;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikaelo
 */
public class ProductController extends Controller<Product> {
    
    public ProductController(){
        super();
    }
    
    public List<Product> getProductsExpiration(Product instance){
        List<Product> listProduct = new ArrayList<>();
        ProductTab productTab = new ProductTab();
        Product product = new Product();
        instance.setCampos(
                productTab.getId()+", "+
                productTab.getExpiration_date()
               
            );
        
        instance.setCondicional(" WHERE "+productTab.getExpiration_date()+" <=current_date + '"+instance.getCantidad()+" months':: interval");
        
            
        
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    while (result .next()){
                        product = new Product();
                        product.setId(result.getInt(1) );
                        product.setFechaExpiracion(result.getDate(2) );
                        product.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        listProduct.add(product);
                    }
                } catch (SQLException ex) {
                    //instance.setError(new Error("000003", ex.getMessage()));
                }
            }
        } catch (SQLException ex) {
            //instance.setError(new Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            //instance.setError(new Error("000001", ex.getMessage()));
        }
        return listProduct;
    }

    public Product getProductById(Product instance){
        ProductTab productTab = new ProductTab();
        ProviderTab providerTab = new ProviderTab();
        StatusTab statusTab = new StatusTab();
        Product product = new Product();
        instance.setCampos(
                "p."+productTab.getProvider_id()+", "+
                "p."+productTab.getStatus_id()+", "+
                "p."+productTab.getClave()+", "+
                "p."+productTab.getLote()+", "+
                "p."+productTab.getDescription()+", "+
                "p."+productTab.getFabrication_date()+", "+
                "p."+productTab.getExpiration_date()+", "+
                "p."+productTab.getReturn_date()+", "+
                "p."+productTab.getPrice_purchase()+", "+
                "p."+productTab.getCantidad()+", "+
                "p."+productTab.getBill()+", "+
                "r."+providerTab.getName()+", "+
                "s."+statusTab.getDescription()+""
               
            );
        instance.setCondicional(" p left join providers r on p.provider_id = r.id left join statuses s on p.status_id = s.id  WHERE  p.id="+instance.getId());
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    while (result .next()){
                        product.setExists(true);
                        product.setId(instance.getId());
                        product.setProvider(new Provider(result.getInt(1)) );
                        product.setStatus(new Status(result.getInt(2)) );
                        product.setClave(result.getString(3));
                        product.setLote(result.getString(4));
                        product.setDescripcion(result.getString(5));
                        product.setFechaFabricacion(result.getDate(6));
                        product.setFechaExpiracion(result.getDate(7));
                        product.setFechaDevolucion(result.getDate(8));
                        product.setPrecioCompra(result.getBigDecimal(9));
                        product.setCantidad(result.getInt(10));
                        product.setFactura(result.getString(11));
                        product.getProvider().setNombre(result.getString(12));
                        product.getStatus().setDescription(result.getString(12));
                        product.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        
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
        return product;
    }
    
    
    
    public Product updateAll(Product instance) {
        ProductTab productTab = new ProductTab();
        instance.setCampos(
                productTab.getProvider_id()+ " = " + instance.getProvider().getId()+ ", " +
                productTab.getStatus_id() + " = " + instance.getStatus().getId()+ ", "+
                productTab.getClave()+ " = '" + instance.getClave()+ "', "+
                productTab.getLote()+ " = '" + instance.getLote()+ "', "+
                productTab.getDescription()+ " = '" + instance.getDescripcion()+ "', "+
                productTab.getFabrication_date()+ " = '" + new Utilies().converterDate(instance.getFechaFabricacion())+ "', "+
                productTab.getExpiration_date()+ " = '" +  new Utilies().converterDate(instance.getFechaExpiracion())+ "', "+
                productTab.getReturn_date()+ " = '" + new Utilies().converterDate(instance.getFechaDevolucion())+ "', "+
                productTab.getPrice_purchase()+ " = '" + instance.getPrecioCompra()+ "', "+
                productTab.getCantidad() + " = " + instance.getCantidad()+ ", "+
                productTab.getBill() + " = '" + instance.getFactura()+ "'"
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        try {
            instance = super.update(instance);
            instance.setError(new com.totus.model.Error("000000", "Producto Actualizado"));
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        
        return instance;
    }
    
    public Product actualizaEstatus(Product instance) {
        ProductTab productTab = new ProductTab();
        instance.setCampos(
                productTab.getStatus_id() + " = " + instance.getStatus().getId()
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        try {
            instance = super.update(instance);
            instance.setError(new com.totus.model.Error("000000", "Producto Actualizado"));
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        
        return instance;
    }
    
    
    
    @Override
    public Product save(Product instance){
        
        ProductTab productTab = new ProductTab();
        instance.setCampos(
                productTab.getProvider_id()+", "+
                productTab.getStatus_id()+", "+
                productTab.getClave()+", "+
                productTab.getLote()+", "+
                productTab.getDescription()+", "+
                productTab.getFabrication_date()+", "+
                productTab.getExpiration_date()+", "+
                productTab.getReturn_date()+", "+
                productTab.getCantidad()+", "+
                productTab.getPrice_purchase()+", "+
                productTab.getBill()
            );
        
        instance.setValor(
                "" + instance.getProvider().getId() + ", "+
                "" + instance.getStatus().getId() + ", "+
                "'" + instance.getClave() + "', "+
                "'" + instance.getLote() + "', "+
                "'" + instance.getDescripcion()+ "', "+
                "'" + new Utilies().converterDate(instance.getFechaFabricacion()) + "', "+
                "'" + new Utilies().converterDate(instance.getFechaExpiracion()) + "', "+
                "'" + new Utilies().converterDate(instance.getFechaDevolucion()) + "', "+
                "" + instance.getCantidad() + ", "+
                "'" + instance.getPrecioCompra() + "', "+
                "'" + instance.getFactura()+"'"
            );
        
        instance.setCondicional(" RETURNING id");
                
        try {
            instance = super.save(instance);
            instance.setError(new com.totus.model.Error("000000", "Producto Creado: "));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            if(ex.getMessage().startsWith("ERROR: duplicate key")){
                instance.setError(new com.totus.model.Error("000002", "Duplicado correo o username"));
            }else{
                instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
            }
            
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        return instance;
    }

    
    @Override
    public Product delete(Product instance) {
        instance.setCondicional(" WHERE id="+instance.getId());
        
        try {
            instance = super.delete(instance);
            instance.setError(new com.totus.model.Error("000000", "Usuario Eliminado"));
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        
        return instance;
    }

    public List<Product> getListByName(Product instance) {
        List<Product> listProduct = new ArrayList<>();
        ProductTab productTab = new ProductTab();
        Product product = new Product();
        instance.setCampos(
                productTab.getId()+", "+
                productTab.getDescription()+", "+
                productTab.getBill()
               
            );
        if(null != instance.getDescripcion()){
            if(instance.getDescripcion().trim().length()>0){
                instance.setCondicional(" WHERE "+productTab.getDescription()+" like '%"+instance.getDescripcion()+"%'");
            }else{
                instance.setCondicional("");
            }
        }else{
            instance.setCondicional("");
        }
            
        
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    while (result .next()){
                        product = new Product();
                        product.setId(result.getInt(1) );
                        product.setDescripcion(result.getString(2) );
                        product.setFactura(result.getString(3));
                        product.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        listProduct.add(product);
                    }
                } catch (SQLException ex) {
                    //instance.setError(new Error("000003", ex.getMessage()));
                }
            }
        } catch (SQLException ex) {
            //instance.setError(new Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            //instance.setError(new Error("000001", ex.getMessage()));
        }
        return listProduct;
    }

    public void actualizaEstatus(List<Product> listProduct) {
        for(Product p : listProduct){
            p.setStatus(new Status(3));
            this.actualizaEstatus(p);
        }
    }
}
