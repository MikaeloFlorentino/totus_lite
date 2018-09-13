package com.totus.controller;

import com.totus.model.Client;
import com.totus.model.Quirofano;
//import com.totus.model.Product;
//import com.totus.model.Status;
import com.totus.model.User;
import com.totus.table.QuirofanoTab;
import com.totus.table.ProductTab;
import com.totus.table.ClientTab;
import com.totus.table.UserTab;
import com.totus.utilities.Utilies;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mikaelo
 */
public class QuirofanoController extends Controller<Quirofano> {
    
    public QuirofanoController(){
        super();
    }
    
    /**
     * Consulta por ID
     * @param instance
     * @return 
     */
    public Quirofano getQuirofanoById(Quirofano instance){
        QuirofanoTab quirofanoTab = new QuirofanoTab();
        ClientTab clientTab = new ClientTab();
        UserTab userTab = new UserTab();
        Quirofano quirofano = new Quirofano();
        quirofano.setClient(new Client());
        quirofano.setUser(new User());
        instance.setCampos(
                "q."+quirofanoTab.getUser_id()+", "+
                "q."+quirofanoTab.getAbierto()+", "+
                "q."+quirofanoTab.getFecha_apertura()+", "+
                "q."+quirofanoTab.getFecha_cierre()+", "+
                "u."+userTab.getName()+", "+
                "q."+quirofanoTab.getClient_id()+", "+
                "c."+clientTab.getName()
            );
        instance.setCondicional(" q left join users u on q.user_id = u.id left join clients c on q.client_id = c.id  WHERE q.id="+instance.getId());
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    Integer a = null;
                    while (result .next()){
                        quirofano.setExists(true);

                        quirofano.setId(instance.getId());
                        quirofano.setUser(new User(result.getInt(1) ));
                        quirofano.setAbierto(result.getBoolean(2));
                        quirofano.setFechaApertura( result.getDate(3) );
                        quirofano.setFechaCierre(result.getDate(4));
                        quirofano.setClient(new Client(result.getInt(6) ));
                        
                        a = quirofano.getUser().getId();
                        if(a != null){
                            quirofano.getUser().setName(result.getString(5));
                            quirofano.getUser().setExists(true );
                        }else{
                            quirofano.setUser(new User( ));
                        }
                        
                        a = quirofano.getClient().getId();
                        if(a != null){
                            quirofano.getClient().setNombre( result.getString(7) );
                            quirofano.getClient().setExists(true );
                        }else{
                            quirofano.setClient(new Client());
                        }
                        
                        quirofano.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        
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
        return quirofano;
    }
    
    /**
     * Consulta para el Finder por Nombre de Usuario
     * @param instance
     * @return 
     */
    public List<Quirofano> getListByUserName(Quirofano instance){
        List<Quirofano> listQuirofano = new ArrayList<>();
        QuirofanoTab quirofanoTab = new QuirofanoTab();
        UserTab userTab = new UserTab();
        ClientTab clientTab = new ClientTab();
        Quirofano quirofano = new Quirofano();
        instance.setCampos(
                "q."+quirofanoTab.getId()+", "+
                "q."+quirofanoTab.getUser_id()+", "+
                "q."+quirofanoTab.getClient_id()+", "+
                "q."+quirofanoTab.getAbierto()+", "+
                "q."+quirofanoTab.getFecha_apertura()+", "+
                "u."+userTab.getName()+", "+
                "c."+clientTab.getName()
            );
        if(null != instance.getUser().getName()){
            if(instance.getUser().getName().trim().length()>0){
                instance.setCondicional(" q left join users u on q.user_id = u.id left join clients c on q.client_id=c.id WHERE u."+userTab.getName()+" like '%"+instance.getUser().getName()+"%' ");
            }else{
                instance.setCondicional(" q left join users u on q.user_id = u.id left join clients c on q.client_id=c.id ");
            }
        }else{
            instance.setCondicional(" q left join users u on q.user_id = u.id left join clients c on q.client_id=c.id ");
        }
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    Integer a = null;
                    while (result .next()){
                        quirofano = new Quirofano();
                        quirofano.setExists(true);

                        quirofano.setId(result.getInt(1) );

                        quirofano.setUser(new User(result.getInt(2)));
                        a = quirofano.getUser().getId();
                        
                        if(a != null){
                            quirofano.getUser().setName(result.getString(6));
                        }
                        
                        quirofano.setClient(new Client(result.getInt(3)));
                        a = quirofano.getClient().getId();
                        
                        if(a != null){
                            quirofano.getClient().setNombre(result.getString(7));
                        }
                        
                        quirofano.setAbierto(result.getBoolean(4) );
                        quirofano.setFechaApertura(result.getDate(5));
                        quirofano.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        listQuirofano.add(quirofano);
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

        return listQuirofano;
    }
    
    /**
     * Consulta para el Finder por Nombre de Cliente
     * @param instance
     * @return 
     */
    public List<Quirofano> getListByClientName(Quirofano instance){
        List<Quirofano> listQuirofano = new ArrayList<>();
        QuirofanoTab quirofanoTab = new QuirofanoTab();
        UserTab userTab = new UserTab();
        ClientTab clientTab = new ClientTab();
        Quirofano quirofano = new Quirofano();
        instance.setCampos(
                "q."+quirofanoTab.getId()+", "+
                "q."+quirofanoTab.getUser_id()+", "+
                "q."+quirofanoTab.getClient_id()+", "+
                "q."+quirofanoTab.getAbierto()+", "+
                "q."+quirofanoTab.getFecha_apertura()+", "+
                "u."+userTab.getName()+", "+
                "c."+clientTab.getName()
            );
        if(null != instance.getClient().getNombre()){
            if(instance.getClient().getNombre().trim().length()>0){
                instance.setCondicional(" q left join users u on q.user_id = u.id left join clients c on q.client_id=c.id WHERE c."+clientTab.getName()+" like '%"+instance.getClient().getNombre()+"%' ");
            }else{
                instance.setCondicional(" q left join users u on q.user_id = u.id left join clients c on q.client_id=c.id ");
            }
        }else{
            instance.setCondicional(" q left join users u on q.user_id = u.id left join clients c on q.client_id=c.id ");
        }
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    Integer a = null;
                    while (result .next()){
                        quirofano = new Quirofano();
                        quirofano.setExists(true);

                        quirofano.setId(result.getInt(1) );

                        quirofano.setUser(new User(result.getInt(2)));
                        a = quirofano.getUser().getId();
                        
                        if(a != null){
                            quirofano.getUser().setName(result.getString(6));
                        }
                        
                        quirofano.setClient(new Client(result.getInt(3)));
                        a = quirofano.getClient().getId();
                        
                        if(a != null){
                            quirofano.getClient().setNombre(result.getString(7));
                        }
                        
                        quirofano.setAbierto(result.getBoolean(4) );
                        quirofano.setFechaApertura(result.getDate(5));
                        quirofano.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        listQuirofano.add(quirofano);
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

        return listQuirofano;
    }
    
    public Quirofano updateAll(Quirofano instance) {
        QuirofanoTab quirofanoTab = new QuirofanoTab();
/*        instance.setCampos(
                quirofanoTab.getQuirofano_type_id()+" = " + instance.getQuirofano_type().getId() + ", "+
                quirofanoTab.getStatus()+" = '" + instance.getStatus()  + "', "+
                quirofanoTab.getName()+" = '" + instance.getName() + "', "+
                quirofanoTab.getFirst_last_name()+" = '" + instance.getFirst_last_name() + "', "+
                quirofanoTab.getSecond_last_name()+" = '" + instance.getSecond_last_name() + "', "+
                quirofanoTab.getBirth_date()+" = '" + new Utilies().converterDate(instance.getBirth_date())+ "', "+
                quirofanoTab.getEmail()+" = '" + instance.getEmail()+"', "+
                quirofanoTab.getEncrypted_password()+" = md5('" + instance.getPassword()+"')"
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        try {
            instance = super.update(instance);
            instance.setError(new com.totus.model.Error("000000", "Usuario Actualizado"));
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }*/
        
        return instance;
    }
    
    
    public Quirofano cerrar(Quirofano instance) {
        QuirofanoTab quirofanoTab = new QuirofanoTab();
        instance.setCampos(
                quirofanoTab.getAbierto()+" = " + true + ", "+
                quirofanoTab.getFecha_cierre()+" = '" + new Utilies().getToday()+ "'"
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        try {
            instance = super.update(instance);
            instance.setError(new com.totus.model.Error("000000", "Usuario Actualizado"));
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        
        return instance;
    }
    
    
    
    public Quirofano abrir(Quirofano instance){
        
        QuirofanoTab quirofanoTab = new QuirofanoTab();
        instance.setCampos(
                quirofanoTab.getClient_id()+", "+
                quirofanoTab.getUser_id()+", "+
                quirofanoTab.getAbierto()+", "+
                quirofanoTab.getFecha_apertura()
            );
        
        instance.setValor(
                instance.getClient().getId()+", "+
                instance.getUser().getId()+", "+
                true+", '"+
                new Utilies().getToday()+"' "
            );
        
        instance.setCondicional(" RETURNING id");
                
        try {
            instance = super.save(instance);
            instance.setError(new com.totus.model.Error("000000", "Quirofano abierto: "));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            if(ex.getMessage().startsWith("ERROR: duplicate key")){
                instance.setError(new com.totus.model.Error("000002", "Duplicado correo o quirofanoname"));
            }else{
                instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
            }
            
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }

        return instance;
    }

    
}
