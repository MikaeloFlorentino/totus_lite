package com.totus.model;

/**
 *
 * @author mikaelo
 */
public class Model {
    private int id;
    private String tabla;
    private String campos;
    private String valor;
    private String condicional;
    private boolean exists;
    private Error error;
    
    public Model(String tabla){
        this.tabla = tabla;
        this.exists = false;
    }

    public String getTabla() {
        return tabla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getCampos() {
        return campos;
    }

    public void setCampos(String campos) {
        this.campos = campos;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCondicional() {
        return condicional;
    }

    public void setCondicional(String condicional) {
        this.condicional = condicional;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

}