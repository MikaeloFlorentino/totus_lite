package com.totus.controller;

import com.totus.utilities.Constant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mikaelo
 */
public class Conexion {
    
    private Connection con;
    
    public Conexion() throws ClassNotFoundException{
       Class.forName("org.postgresql.Driver");
    }

    public Connection mkConnection() throws SQLException{
        con = DriverManager.getConnection( "jdbc:postgresql://"+Constant.PARAMETER_FILE_PG_SERVER+":"+Constant.PARAMETER_FILE_PG_PORT+"/"+Constant.PARAMETER_FILE_PG_DATB, Constant.PARAMETER_FILE_PG_USER, Constant.PARAMETER_FILE_PG_PASS);        
        return con;
    }

    public boolean validacon(Connection con1){
        boolean ret=false;
        try {
            if(con1!=null)
            if (!con1.isClosed()) {
                ret = true;
            }
        } catch (SQLException ex) {
            ret=false;
        }
        return ret;
    }

    public boolean closeConecction(){
        try{
            con.close();
        }catch(SQLException sqle){
            return false;
        }
        return true;
    }
}
