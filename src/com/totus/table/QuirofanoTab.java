/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totus.table;

/**
 *
 * @author mikaelo
 */
public class QuirofanoTab {
    
    private final String id = "id";
    private final String user_id = "user_id";
    private final String client_id = "client_id";
    private final String abierto = "abierto";
    private final String fecha_apertura = "fecha_apertura";
    private final String fecha_cierre = "fecha_cierre";

    public String getId() {
        return id;
    }

    public String getClient_id() {
        return client_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getAbierto() {
        return abierto;
    }

    public String getFecha_apertura() {
        return fecha_apertura;
    }

    public String getFecha_cierre() {
        return fecha_cierre;
    }
    
}
