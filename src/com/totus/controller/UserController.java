package com.totus.controller;

import com.totus.model.Error;
import com.totus.model.User;
import com.totus.model.UserType;
import com.totus.table.UserTab;
import com.totus.table.UserTypeTab;
import com.totus.utilities.Utilies;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikaelo
 */
public class UserController extends Controller<User> {
    
    public UserController(){
        super();
    }
    
    
    public User getUserById(User instance){
        UserTab userTab = new UserTab();
        UserTypeTab userTypeTab = new UserTypeTab();
        User user = new User();
        instance.setCampos(
                "u."+userTab.getUsername()+", "+
                "u."+userTab.getUser_type_id()+", "+
                "u."+userTab.getStatus()+", "+
                "u."+userTab.getName()+", "+
                "u."+userTab.getFirst_last_name()+", "+
                "u."+userTab.getSecond_last_name()+", "+
                "u."+userTab.getBirth_date()+", "+
                "u."+userTab.getEmail()+", "+
                "t."+userTypeTab.getDescription()
            );
        instance.setCondicional(" u left join user_types t on u.user_type_id = t.id  WHERE u.id="+instance.getId());
        
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
                        user.setStatus( result.getString(3) );
                        user.setName(result.getString(4));
                        user.setFirst_last_name(result.getString(5));
                        user.setSecond_last_name(result.getString(6));
                        user.setBirth_date(result.getDate(7));
                        user.setEmail(result.getString(8));
                        user.getUser_type().setDescription(result.getString(9));
                        user.getUser_type().setExists(true);
                        user.setError(new Error("000000", "Lista encontrada"));
                        
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
        return user;
    }
    
    
    
    public User updateAll(User instance) {
        UserTab userTab = new UserTab();
        instance.setCampos(
                userTab.getUser_type_id()+" = " + instance.getUser_type().getId() + ", "+
                userTab.getStatus()+" = '" + instance.getStatus()  + "', "+
                userTab.getName()+" = '" + instance.getName() + "', "+
                userTab.getFirst_last_name()+" = '" + instance.getFirst_last_name() + "', "+
                userTab.getSecond_last_name()+" = '" + instance.getSecond_last_name() + "', "+
                userTab.getBirth_date()+" = '" + new Utilies().converterDate(instance.getBirth_date())+ "', "+
                userTab.getEmail()+" = '" + instance.getEmail()+"', "+
                userTab.getEncrypted_password()+" = md5('" + instance.getPassword()+"')"
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
    
    
    public User updateWhitOutPass(User instance) {
        UserTab userTab = new UserTab();
        instance.setCampos(
                userTab.getUser_type_id()+" = " + instance.getUser_type().getId() + ", "+
                userTab.getStatus()+" = '" + instance.getStatus()  + "', "+
                userTab.getName()+" = '" + instance.getName() + "', "+
                userTab.getFirst_last_name()+" = '" + instance.getFirst_last_name() + "', "+
                userTab.getSecond_last_name()+" = '" + instance.getSecond_last_name() + "', "+
                userTab.getBirth_date()+" = '" + new Utilies().converterDate(instance.getBirth_date())+ "', "+
                userTab.getEmail()+" = '" + instance.getEmail()+"'"
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
    public User save(User instance){
        
        UserTab userTab = new UserTab();
        instance.setCampos(
                userTab.getUsername()+", "+
                userTab.getUser_type_id()+", "+
                userTab.getStatus()+", "+
                userTab.getName()+", "+
                userTab.getFirst_last_name()+", "+
                userTab.getSecond_last_name()+", "+
                userTab.getBirth_date()+", "+
                userTab.getEmail()+", "+
                userTab.getEncrypted_password()
            );
        
        instance.setValor("'"+
                instance.getUsername()+"', "+
                instance.getUser_type().getId()+", '"+
                instance.getStatus()+"', '"+
                instance.getName()+"', '"+
                instance.getFirst_last_name()+"', '"+
                instance.getSecond_last_name()+"', '"+
                new Utilies().converterDate(instance.getBirth_date())+"', '"+
                instance.getEmail()+"', md5('"+
                instance.getPassword()+"') "
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
    public User delete(User instance) {
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

    public List<User> getListByUserName(User instance) {
        List<User> listUser = new ArrayList<>();
        UserTab userTab = new UserTab();
        User user = new User();
        instance.setCampos(
                userTab.getId()+", "+
                userTab.getUsername()+", "+
                userTab.getName()+"||' '||"+
                userTab.getFirst_last_name()+"||' '||"+
                userTab.getSecond_last_name()+" as name"
               
            );
        if(null != instance.getUsername()){
            if(instance.getUsername().trim().length()>0){
                instance.setCondicional(" WHERE "+userTab.getUsername()+" like '%"+instance.getUsername()+"%' ");
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
                        user = new User();
                        user.setId(result.getInt(1) );
                        user.setUsername(result.getString(2) );
                        user.setName(result.getString(3));
                        user.setError(new Error("000000", "Lista encontrada"));
                        listUser.add(user);
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
        return listUser;
    }
    
    
}
