package com.totus.controller;

import com.totus.model.Error;
import com.totus.model.Status;
import com.totus.table.StatusTab;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikaelo
 */
public class StatusController extends Controller<Status> {
    
    public StatusController(){
        super();
    }
    
    

    public List<Status> getListByName(Status instance) {
        List<Status> listStatus = new ArrayList<>();
        StatusTab statusTab = new StatusTab();
        Status status = new Status();
        instance.setCampos(
                statusTab.getId()+", "+
                statusTab.getDescription()
               
            );
        if(null != instance.getDescription()){
            if(instance.getDescription().trim().length()>0){
                instance.setCondicional(" WHERE "+statusTab.getDescription()+" like '%"+instance.getDescription()+"%'");
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
                        status = new Status();
                        status.setId(result.getInt(1) );
                        status.setDescription(result.getString(2) );
                        status.setError(new Error("000000", "Lista encontrada"));
                        listStatus.add(status);
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
        return listStatus;
    }
    
    public Status getProviderById(Status instance) throws SQLException{
        StatusTab statusTab = new StatusTab();
        Status status = new Status();
        instance.setCampos(
                statusTab.getDescription()
               
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    while (result .next()){
                        status.setExists(true);
                        status.setId(instance.getId());
                        status.setDescription(result.getString(1) );
                        status.setError(new Error("000000", "Lista encontrada"));
                        
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
        return status;
    }
    
    /**
     * Hace un select sin filtro, regresa todo el data de la tabla
     * @return List<Status>
     * @throws SQLException 
     */
    public List<Status> getAll() {
        Status instance = new Status();
        StatusTab statusTab = new StatusTab();
        List<Status> listStatus = new ArrayList<Status>();
        instance.setCampos(
                statusTab.getId()+", "+
                statusTab.getDescription()
            );
        instance.setCondicional("");
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    while (result .next()){
                        instance = new Status();
                        instance.setExists(true);
                        instance.setId( result.getInt(1) );
                        instance.setDescription( result.getString(2) );
                        instance.setError(new Error("000000", "Lista encontrada"));
                        listStatus.add(instance);
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
        
        return listStatus;
    }
}
