/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totus.controller;

import com.totus.model.Error;
import com.totus.model.Provider;
import com.totus.table.ProviderTab;
import com.totus.utilities.Utilies;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikaelo
 */
public class ProviderController  extends Controller<Provider> {
    
    public ProviderController(){
        super();
    }
    
    
     public Provider getProviderById(Provider instance) throws SQLException{
        ProviderTab providerTab = new ProviderTab();
        Provider provider = new Provider();
        instance.setCampos(
                providerTab.getPerson()+", "+
                providerTab.getName()+", "+
                providerTab.getFirst_last_name()+", "+
                providerTab.getSecond_last_name()+", "+
                providerTab.getBirth_date()+", "+
                providerTab.getStreet()+", "+
                providerTab.getDistrit()+", "+
                providerTab.getPostal_code()+", "+
                providerTab.getState()+", "+
                providerTab.getCity()+", "+
                providerTab.getRfc()
               
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    while (result .next()){
                        provider.setExists(true);
                        provider.setId(instance.getId());
                        provider.setPersona(result.getString(1) );
                        provider.setNombre(result.getString(2) );
                        provider.setApellidoPaterno(result.getString(3));
                        provider.setApellidoMaterno(result.getString(4));
                        provider.setFechaNacimiento(result.getDate(5));
                        provider.setCalle(result.getString(6));
                        provider.setColonia(result.getString(7));
                        provider.setCodigo_postal(result.getString(8));
                        provider.setEstado(result.getString(9));
                        provider.setMunicipio(result.getString(10));
                        provider.setRfc(result.getString(11));
                        provider.setError(new Error("000000", "Lista encontrada"));
                        
                    }
                } catch (SQLException ex) {
                    instance.setError(new Error("000003", ex.getMessage()));
                }
            }
        } catch (SQLException ex) {
            instance.setError(new Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new Error("000001", ex.getMessage()));
        }
        return provider;
    }
    
    
    
    public Provider updateAll(Provider instance) {
        ProviderTab providerTab = new ProviderTab();
        instance.setCampos(
                providerTab.getPerson() + " = '" + instance.getPersona() + "', " +
                providerTab.getName() + " = '" + instance.getNombre() + "', "+
                providerTab.getFirst_last_name()  + " = '" + instance.getApellidoMaterno() + "', "+
                providerTab.getSecond_last_name()  + " = '" + instance.getApellidoMaterno() + "', "+
                providerTab.getBirth_date()  + " = '" + instance.getFechaNacimiento() + "', "+
                providerTab.getStreet()  + " = '" + instance.getCalle() + "', "+
                providerTab.getDistrit()  + " = '" + instance.getColonia() + "', "+
                providerTab.getPostal_code()  + " = '" + instance.getCodigo_postal() + "', "+
                providerTab.getState()  + " = '" + instance.getEstado() + "', "+
                providerTab.getCity()  + " = '" + instance.getMunicipio() + "', "+
                providerTab.getRfc()  + " = '" + instance.getRfc() + "'"
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        try {
            instance = super.update(instance);
            instance.setError(new Error("000000", "Usuario Actualizado"));
        } catch (SQLException ex) {
            instance.setError(new Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new Error("000001", ex.getMessage()));
        }
        
        return instance;
    }
    
    
    
    
    
    @Override
    public Provider save(Provider instance){
        
        ProviderTab providerTab = new ProviderTab();
        instance.setCampos(
               providerTab.getPerson()+", "+
                providerTab.getName()+", "+
                providerTab.getFirst_last_name()+", "+
                providerTab.getSecond_last_name()+", "+
                providerTab.getBirth_date()+", "+
                providerTab.getStreet()+", "+
                providerTab.getDistrit()+", "+
                providerTab.getPostal_code()+", "+
                providerTab.getState()+", "+
                providerTab.getCity()+", "+
                providerTab.getRfc()
            );
        
        instance.setValor("'"+
                instance.getPersona() + "', " +
                "'" + instance.getNombre() + "', "+
                "'" + instance.getApellidoMaterno() + "', "+
                "'" + instance.getApellidoMaterno() + "', "+
                "'" + new Utilies().converterDate(instance.getFechaNacimiento()) + "', "+
                "'" + instance.getCalle() + "', "+
                "'" + instance.getColonia() + "', "+
                "'" + instance.getCodigo_postal() + "', "+
                "'" + instance.getEstado() + "', "+
                "'" + instance.getMunicipio() + "', "+
                "'" + instance.getRfc() + "'"
            );
        
        instance.setCondicional(" RETURNING id");
                
        try {
            instance = super.save(instance);
            instance.setError(new Error("000000", "Usuario Creado: "));
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

    
    @Override
    public Provider delete(Provider instance) {
        instance.setCondicional(" WHERE id="+instance.getId());
        
        try {
            instance = super.delete(instance);
            instance.setError(new Error("000000", "Usuario Eliminado"));
        } catch (SQLException ex) {
            instance.setError(new Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new Error("000001", ex.getMessage()));
        }
        
        return instance;
    }

    public List<Provider> getListByName(Provider instance) {
        List<Provider> listProvider = new ArrayList<>();
        ProviderTab providerTab = new ProviderTab();
        Provider provider = new Provider();
        instance.setCampos(
                providerTab.getId()+", "+
                providerTab.getName()+"||' '||"+
                providerTab.getFirst_last_name()+"||' '||"+
                providerTab.getSecond_last_name()+" as name, "+
                providerTab.getStreet()
               
            );
        if(null != instance.getNombre()){
            if(instance.getNombre().trim().length()>0){
                instance.setCondicional(" WHERE "+providerTab.getName()+" like '%"+instance.getNombre()+"%' or " +providerTab.getFirst_last_name()+" like '%"+instance.getNombre()+"%' or " +providerTab.getSecond_last_name()+" like '%"+instance.getNombre()+"%'");
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
                        provider.setId(result.getInt(1) );
                        provider.setNombre(result.getString(2) );
                        provider.setCalle(result.getString(3));
                        provider.setError(new Error("000000", "Lista encontrada"));
                        listProvider.add(provider);
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
        return listProvider;
    }
}
