package com.totus.controller;

import com.totus.model.Error;
import com.totus.model.Status;
import com.totus.model.User;
import com.totus.model.UserType;
import com.totus.table.UserTab;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mikaelo
 */
public class LoginController extends Controller<User> {
    
    public LoginController(){
        super();
    }
    
    public User getSeachLogin(User instance){
        UserTab userTab = new UserTab();
        User user = new User();
        user.setError(new Error("000004", "Login incorrecto"));
        instance.setCampos(
                userTab.getUsername()+", "+
                userTab.getUser_type_id()+", "+
                userTab.getStatus_id()+", "+
                userTab.getName()+", "+
                userTab.getFirst_last_name()+", "+
                userTab.getSecond_last_name()+", "+
                userTab.getBirth_date()+", "+
                userTab.getEmail()
            );
        instance.setCondicional(" WHERE username='"+instance.getUsername()+"' and encrypted_password=md5('"+instance.getPassword()+"')");
        
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    while (result .next()){
                        user.setExists(true);
                        user.setUsername( result.getString(1) );
                        user.setUser_type( new UserType(result.getInt(2)) );
                        user.setStatus( new Status(result.getInt(3)));
                        user.setName(result.getString(4));
                        user.setFirst_last_name(result.getString(5));
                        user.setSecond_last_name(result.getString(6));
                        user.setBirth_date(result.getDate(7));
                        user.setEmail(result.getString(8));
                        user.setError(new Error("000000", "Usuario encontrado"));
                    }
                } catch (SQLException ex) {
                    user.setError(new Error("000003", ex.getMessage()));
                }
            }
        } catch (SQLException ex) {
            user.setError(new Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            user.setError(new Error("000001", ex.getMessage()));
        }
        
        return user;
            
    }
}
