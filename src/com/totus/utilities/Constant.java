package com.totus.utilities;

import com.totus.model.User;

/**
 *
 * @author mikaelo
 */
public class Constant {
    public static String PARAMETER_FILE_SERVER;
    public static String PARAMETER_FILE_PROTOCOL;
    public static String PARAMETER_FILE_PATH;
    public static String PARAMETER_FILE_PORT;
    
    public static String PARAMETER_FILE_PG_SERVER;
    public static String PARAMETER_FILE_PG_PORT;
    public static String PARAMETER_FILE_PG_USER;
    public static String PARAMETER_FILE_PG_PASS;
    public static String PARAMETER_FILE_PG_DATB;
    
    public static String PARAMETER_FILE_PATH_REPORT;
    
    final public static String PARAMETER_SERVER = "server";
    final public static String PARAMETER_PROTOCOL = "protocol";
    final public static String PARAMETER_PATH = "path";
    final public static String PARAMETER_PORT = "port";

    final public static String PARAMETER_PG_SERVER = "pg_server";
    final public static String PARAMETER_PG_PORT = "pg_port";
    final public static String PARAMETER_PG_USER = "pg_user";
    final public static String PARAMETER_PG_PASS = "pg_pass";
    final public static String PARAMETER_PG_DATB = "pg_datb";

    final public static String PARAMETER_PATH_REPORT="path_repo";
    
    final public static String PARAMETER_FILE = "totus.conf";
    
    final public static String USER = "users";
    final public static String CLIENT = "clients";
    final public static String STATUS = "statuses";
    final public static String PROVIDER = "providers";
    final public static String PRODUCT = "products";
    final public static String USER_TYPE = "user_types";
    final public static String QUIROFANO = "quirofano";
    final public static String QUIROFANO_PRODUCTO = "quirofano_producto";

    final public static String URL_USER_AUTENTICATE = "authenticate";
 
    
    final public static String REPORT_ABRIR = "abrir";
    final public static String REPORT_CERRAR = "cerrar";
    
    final public static int STATUS_ACTIVO = 1;
    final public static int STATUS_QUIROFANO = 3;
    final public static int STATUS_VENDIDO = 4;
    
    
    final public static boolean VENDIDO=true;
    final public static boolean NO_VENDIDO=false;
    
    public static User user;
}