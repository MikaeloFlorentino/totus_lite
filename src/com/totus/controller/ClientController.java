package com.totus.controller;

import com.totus.model.Error;
import com.totus.model.Client;
import com.totus.table.ClientTab;
import com.totus.utilities.Utilies;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikaelo
 */
public class ClientController  extends Controller<Client> {
    
    public ClientController(){
        super();
    }
    
    
     public Client getClientById(Client instance) throws SQLException{
        ClientTab clientTab = new ClientTab();
        Client client = new Client();
        instance.setCampos(
                clientTab.getPerson()+", "+
                clientTab.getName()+", "+
                clientTab.getFirst_last_name()+", "+
                clientTab.getSecond_last_name()+", "+
                clientTab.getBirth_date()+", "+
                clientTab.getStreet()+", "+
                clientTab.getDistrit()+", "+
                clientTab.getPostal_code()+", "+
                clientTab.getState()+", "+
                clientTab.getCity()+", "+
                clientTab.getRfc()
               
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    while (result .next()){
                        client.setExists(true);
                        client.setId(instance.getId());
                        client.setPersona(result.getString(1) );
                        client.setNombre(result.getString(2) );
                        client.setApellidoPaterno(result.getString(3));
                        client.setApellidoMaterno(result.getString(4));
                        client.setFechaNacimiento(result.getDate(5));
                        client.setCalle(result.getString(6));
                        client.setColonia(result.getString(7));
                        client.setCodigo_postal(result.getString(8));
                        client.setEstado(result.getString(9));
                        client.setMunicipio(result.getString(10));
                        client.setRfc(result.getString(11));
                        client.setError(new Error("000000", "Lista encontrada"));
                        
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
        return client;
    }
    
    
    
    public Client updateAll(Client instance) {
        ClientTab clientTab = new ClientTab();
        instance.setCampos(
                clientTab.getPerson() + " = '" + instance.getPersona() + "', " +
                clientTab.getName() + " = '" + instance.getNombre() + "', "+
                clientTab.getFirst_last_name()  + " = '" + instance.getApellidoMaterno() + "', "+
                clientTab.getSecond_last_name()  + " = '" + instance.getApellidoMaterno() + "', "+
                clientTab.getBirth_date()  + " = '" + instance.getFechaNacimiento() + "', "+
                clientTab.getStreet()  + " = '" + instance.getCalle() + "', "+
                clientTab.getDistrit()  + " = '" + instance.getColonia() + "', "+
                clientTab.getPostal_code()  + " = '" + instance.getCodigo_postal() + "', "+
                clientTab.getState()  + " = '" + instance.getEstado() + "', "+
                clientTab.getCity()  + " = '" + instance.getMunicipio() + "', "+
                clientTab.getRfc()  + " = '" + instance.getRfc() + "'"
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
    public Client save(Client instance){
        
        ClientTab clientTab = new ClientTab();
        instance.setCampos(
               clientTab.getPerson()+", "+
                clientTab.getName()+", "+
                clientTab.getFirst_last_name()+", "+
                clientTab.getSecond_last_name()+", "+
                clientTab.getBirth_date()+", "+
                clientTab.getStreet()+", "+
                clientTab.getDistrit()+", "+
                clientTab.getPostal_code()+", "+
                clientTab.getState()+", "+
                clientTab.getCity()+", "+
                clientTab.getRfc()
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
    public Client delete(Client instance) {
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

    public List<Client> getListByName(Client instance) {
        List<Client> listClient = new ArrayList<>();
        ClientTab clientTab = new ClientTab();
        Client client = new Client();
        instance.setCampos(
                clientTab.getId()+", "+
                clientTab.getName()+"||' '||"+
                clientTab.getFirst_last_name()+"||' '||"+
                clientTab.getSecond_last_name()+" as name, "+
                clientTab.getStreet()
               
            );
        if(null != instance.getNombre()){
            if(instance.getNombre().trim().length()>0){
                instance.setCondicional(" WHERE "+clientTab.getName()+" like '%"+instance.getNombre()+"%' or " +clientTab.getFirst_last_name()+" like '%"+instance.getNombre()+"%' or " +clientTab.getSecond_last_name()+" like '%"+instance.getNombre()+"%'");
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
                        client = new Client();
                        client.setId(result.getInt(1) );
                        client.setNombre(result.getString(2) );
                        client.setCalle(result.getString(3));
                        client.setError(new Error("000000", "Lista encontrada"));
                        listClient.add(client);
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
        return listClient;
    }
}
