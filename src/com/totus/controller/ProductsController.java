/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totus.controller;

import com.totus.model.Status;
import com.totus.model.Provider;
import com.totus.table.ProductTab;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mikaelo
 */
public class ProductsController extends Controller<Provider> {
    
    public ProductsController(){
        super();
    }
    
    public Provider getProductsExpiration(Provider instance) throws SQLException{
        ProductTab providerTab = new ProductTab();
        Provider user = new Provider();
        /*instance.setCampos(
                userTab.getUsername()+", "+
                userTab.getUser_type_id()+", "+
                userTab.getStatus_id()+", "+
                userTab.getName()+", "+
                userTab.getFirst_last_name()+", "+
                userTab.getSecond_last_name()+", "+
                userTab.getBirth_date()+", "+
                userTab.getEmail()
            );
        instance.setCondicional(" WHERE id="+);
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    while (result .next()){
                        user.setExists(true);
                        user.setId(instance.getId());
                        user.setUsername( result.getString(1) );
                        user.setUser_type( new UserType(result.getInt(2)) );
                        user.setStatus( new Status(result.getInt(3)));
                        user.setName(result.getString(4));
                        user.setFirst_last_name(result.getString(5));
                        user.setSecond_last_name(result.getString(6));
                        user.setBirth_date(result.getDate(7));
                        user.setEmail(result.getString(8));
                        user.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        
                    }
                } catch (SQLException ex) {
                    instance.setError(new com.totus.model.Error("000003", ex.getMessage()));
                }
            }
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }*/
        return user;
    }

}
