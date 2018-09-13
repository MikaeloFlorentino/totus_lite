package com.totus.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mikaelo
 */
public class Load {
 
    private void setValores(String llave, String valor){
        if(0 == llave.compareTo(Constant.PARAMETER_SERVER)){
            Constant.PARAMETER_FILE_SERVER = valor;
        }else
        if(0 == llave.compareTo(Constant.PARAMETER_PROTOCOL)){
            Constant.PARAMETER_FILE_PROTOCOL = valor;
        }else
        if(0 == llave.compareTo(Constant.PARAMETER_PATH)){
            Constant.PARAMETER_FILE_PATH = valor;
        }else
        if(0 == llave.compareTo(Constant.PARAMETER_PORT)){
            Constant.PARAMETER_FILE_PORT = valor;
        }else
        if(0 == llave.compareTo(Constant.PARAMETER_PG_SERVER)){
            Constant.PARAMETER_FILE_PG_SERVER = valor;
        }else
        if(0 == llave.compareTo(Constant.PARAMETER_PG_PORT)){
            Constant.PARAMETER_FILE_PG_PORT = valor;
        }else
        if(0 == llave.compareTo(Constant.PARAMETER_PG_USER)){
            Constant.PARAMETER_FILE_PG_USER = valor;
        }else
        if(0 == llave.compareTo(Constant.PARAMETER_PG_PASS)){
            Constant.PARAMETER_FILE_PG_PASS = valor;
        }else
        if(0 == llave.compareTo(Constant.PARAMETER_PG_DATB)){
            Constant.PARAMETER_FILE_PG_DATB = valor;
        }else
        if(0 == llave.compareTo(Constant.PARAMETER_PATH_REPORT)){
            Constant.PARAMETER_FILE_PATH_REPORT = valor;
        }      
    }
    
    public void mainLoad() throws FileNotFoundException, IOException{
        FileReader f = new FileReader(new File(Constant.PARAMETER_FILE));
        BufferedReader b = new BufferedReader(f);
        String cadena;
        String[] datos;
        while((cadena = b.readLine())!=null) {
            
            if(0 < cadena.length())
            if(cadena.charAt(0) != '#'){
                cadena = cadena.replaceAll(" ", "");
                datos = cadena.split("=");
                setValores(datos[0], datos[1]);
            }
        }
        b.close();
    }

}