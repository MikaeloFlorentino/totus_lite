package com.totus.controller;

import com.totus.model.Error;
import com.totus.model.UserType;
import com.totus.table.UserTypeTab;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikaelo
 */
public class UserTypeController extends Controller<UserType> {
    
    public UserTypeController(){
        super();
    }
    
    /**
     * Hace un select sin filtro, regresa todo el data de la tabla
     * @return
     * @throws SQLException 
     */
    public List<UserType> getAll(){
        UserTypeTab userTypeTab = new UserTypeTab();
        
        UserType instance = new UserType();
        List<UserType> listUserType = new ArrayList<UserType>();
        instance.setCampos(
                userTypeTab.getId()+", "+
                userTypeTab.getDescription()
            );
        instance.setCondicional("");
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    while (result .next()){
                        instance = new UserType();
                        instance.setExists(true);
                        instance.setId( result.getInt(1) );
                        instance.setDescription( result.getString(2) );
                        instance.setError(new Error("000000", "Lista encontrada"));
                        listUserType.add(instance);
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
        
        return listUserType;
    }
}
