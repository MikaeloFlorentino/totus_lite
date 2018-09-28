package com.totus.controller;

import com.totus.model.Client;
import com.totus.model.Devolucion;
//import com.totus.model.Product;
//import com.totus.model.Status;
import com.totus.model.User;
import com.totus.table.DevolucionTab;
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
public class DevolucionController extends Controller<Devolucion> {
    
    public DevolucionController(){
        super();
    }
    
    /**
     * Consulta por ID
     * @param instance
     * @return 
     */
    public Devolucion getDevolucionById(Devolucion instance){
        DevolucionTab devolucionTab = new DevolucionTab();
        Devolucion devolucion = new Devolucion();
        instance.setCampos(
                devolucionTab.getId()+", "+
                devolucionTab.getMessage()+", "+
                devolucionTab.getFecha()
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    Integer a = null;
                    while (result .next()){
                        devolucion.setExists(true);

                        devolucion.setId(instance.getId());
                        devolucion.setMessage(result.getString(2) );
                        devolucion.setFecha(result.getDate(3));
                        devolucion.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        
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
        return devolucion;
    }
    
    /**
     * Consulta para el Finder por Nombre de Usuario
     * @param instance
     * @return 
     */
    public List<Devolucion> getListByUserMessage(Devolucion instance){
        List<Devolucion> listDevolucion = new ArrayList<>();
        DevolucionTab devolucionTab = new DevolucionTab();
        Devolucion devolucion = new Devolucion();
        instance.setCampos(
                devolucionTab.getId()+", "+
                devolucionTab.getMessage()+", "+
                devolucionTab.getFecha()
            );
        if(null != instance.getMessage()){
            if(instance.getMessage().trim().length()>0){
                instance.setCondicional(" WHERE "+devolucionTab.getMessage()+" like '%"+instance.getMessage()+"%' ");
            }else{
                instance.setCondicional(" ");
            }
        }else{
            instance.setCondicional("  ");
        }
        
        ResultSet result=null;
        try {
            result = super.select(instance);
            if(result != null){
                try {
                    
                    while (result .next()){
                        devolucion = new Devolucion();
                        devolucion.setExists(true);

                        devolucion.setId( result.getInt(1) );
                        devolucion.setMessage(result.getString(2) );
                        devolucion.setFecha(result.getDate(3));
                        devolucion.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        listDevolucion.add(devolucion);
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

        return listDevolucion;
    }
    
    @Override
    public Devolucion save(Devolucion instance){
        
        DevolucionTab devolucionTab = new DevolucionTab();
        instance.setCampos(
                devolucionTab.getMessage()
            );
        
        instance.setValor(
                "'"+instance.getMessage()+"'"
            );
        
        instance.setCondicional(" RETURNING id");
                
        try {
            instance = super.save(instance);
            instance.setError(new com.totus.model.Error("000000", "Devolucion abierto: "));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            if(ex.getMessage().startsWith("ERROR: duplicate key")){
                instance.setError(new com.totus.model.Error("000002", "Duplicado correo o devolucionname"));
            }else{
                instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
            }
            
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }

        return instance;
    }
    /*
    / **
     * Consulta para el Finder por Nombre de Cliente
     * @param instance
     * @return 
     * /
    public List<Devolucion> getListByClientName(Devolucion instance){
        List<Devolucion> listDevolucion = new ArrayList<>();
        DevolucionTab devolucionTab = new DevolucionTab();
        UserTab userTab = new UserTab();
        ClientTab clientTab = new ClientTab();
        Devolucion devolucion = new Devolucion();
        instance.setCampos(
                "q."+devolucionTab.getId()+", "+
                "q."+devolucionTab.getUser_id()+", "+
                "q."+devolucionTab.getClient_id()+", "+
                "q."+devolucionTab.getAbierto()+", "+
                "q."+devolucionTab.getFecha_apertura()+", "+
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
                        devolucion = new Devolucion();
                        devolucion.setExists(true);

                        devolucion.setId(result.getInt(1) );

                        devolucion.setUser(new User(result.getInt(2)));
                        a = devolucion.getUser().getId();
                        
                        if(a != null){
                            devolucion.getUser().setName(result.getString(6));
                        }
                        
                        devolucion.setClient(new Client(result.getInt(3)));
                        a = devolucion.getClient().getId();
                        
                        if(a != null){
                            devolucion.getClient().setNombre(result.getString(7));
                        }
                        
                        devolucion.setAbierto(result.getBoolean(4) );
                        devolucion.setFechaApertura(result.getDate(5));
                        devolucion.setError(new com.totus.model.Error("000000", "Lista encontrada"));
                        listDevolucion.add(devolucion);
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

        return listDevolucion;
    }
    
    public Devolucion updateAll(Devolucion instance) {
        DevolucionTab devolucionTab = new DevolucionTab();
// / *        instance.setCampos(
                devolucionTab.getDevolucion_type_id()+" = " + instance.getDevolucion_type().getId() + ", "+
                devolucionTab.getStatus()+" = '" + instance.getStatus()  + "', "+
                devolucionTab.getName()+" = '" + instance.getName() + "', "+
                devolucionTab.getFirst_last_name()+" = '" + instance.getFirst_last_name() + "', "+
                devolucionTab.getSecond_last_name()+" = '" + instance.getSecond_last_name() + "', "+
                devolucionTab.getBirth_date()+" = '" + new Utilies().converterDate(instance.getBirth_date())+ "', "+
                devolucionTab.getEmail()+" = '" + instance.getEmail()+"', "+
                devolucionTab.getEncrypted_password()+" = md5('" + instance.getPassword()+"')"
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        try {
            instance = super.update(instance);
            instance.setError(new com.totus.model.Error("000000", "Usuario Actualizado"));
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }* /
        
        return instance;
    }
    
    
    public Devolucion cerrar(Devolucion instance) {
        DevolucionTab devolucionTab = new DevolucionTab();
        instance.setCampos(
                devolucionTab.getAbierto()+" = " + false + ", "+
                devolucionTab.getFecha_cierre()+" = '" + new Utilies().getToday()+ "'"
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
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
    
    
    
    

    public Devolucion vender(Devolucion instance) {
        DevolucionTab devolucionTab = new DevolucionTab();
        instance.setCampos(
                devolucionTab.getVendido()+" = " + true 
            );
        instance.setCondicional(" WHERE id="+instance.getId());
        
        try {
            instance = super.update(instance);
            instance.setError(new com.totus.model.Error("000000", "Quierofano Vendido"));
        } catch (SQLException ex) {
            instance.setError(new com.totus.model.Error("000002", ex.getMessage()));
        } catch (ClassNotFoundException ex) {
            instance.setError(new com.totus.model.Error("000001", ex.getMessage()));
        }
        
        return instance;
    }
*/
    
}
