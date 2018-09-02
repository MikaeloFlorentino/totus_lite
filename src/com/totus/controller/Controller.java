/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totus.controller;

import com.totus.model.Model;
import com.totus.model.User;
import com.totus.utilities.Constant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mikaelo
 */
public abstract class Controller <T extends Model> {
    
    /**
     * Hace el insert de la clase
     * 
     * @param instance
     * @return 
     */
    public T save(T instance) throws SQLException, ClassNotFoundException{
        int ret=0;

        Conexion conect = new Conexion();
        Connection con=conect.mkConnection();
        String cmd= "insert into "+instance.getTabla()+" ("+instance.getCampos()+") values ("+instance.getValor()+") " + instance.getCondicional();
        System.out.println(cmd);
        
        
        ResultSet result = null;
        PreparedStatement ps;

        ps = con.prepareStatement(cmd);
        result = ps.executeQuery();
        try {
            
            result .next();
            instance.setId(result.getInt(1));
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
        //}catch()
        /*
            if (ps.executeUpdate() != 0){
                ret = ps.getUpdateCount();
                instance.setId(ret);
            }*/
            
        ps.close();
        
        con.close();
        
        return instance;
    }
    
    /**
     * Select de lo que se manda en la instance
     * @param instance
     * @return 
     */
    public ResultSet select(T instance) throws SQLException, ClassNotFoundException {
        Conexion conect = new Conexion();
        Connection con=conect.mkConnection();
        String cmd= "SELECT "+ instance.getCampos() +" from "+instance.getTabla()+" "+instance.getCondicional();
        System.out.println(cmd);
        
        ResultSet result = null;
        PreparedStatement ps;
        
        ps = con.prepareStatement(cmd);
        result = ps.executeQuery();
        
        con.close();
        
        return result;
    }
    
    /**
     * Hace el insert de la clase
     * 
     * @param instance
     * @return 
     */
    public T update(T instance) throws ClassNotFoundException, SQLException{
        Conexion conect = new Conexion();
        Connection con=conect.mkConnection();
        String cmd= "update "+instance.getTabla()+" set "+instance.getCampos()+" "+instance.getCondicional();
        System.out.println(cmd);
        
        
        PreparedStatement ps;
        ps = con.prepareStatement(cmd);
        ps.executeUpdate();
            
            ps.close();
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return instance;
    }

    public T delete(T instance) throws ClassNotFoundException, SQLException{
        Conexion conect = new Conexion();
        Connection con=conect.mkConnection();
        String cmd= "delete from  "+instance.getTabla()+" "+instance.getCondicional();
        System.out.println(cmd);
        
        
        PreparedStatement ps;
        ps = con.prepareStatement(cmd);
        ps.executeUpdate();
            
            ps.close();
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return instance;
    }
}
