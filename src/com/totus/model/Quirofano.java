package com.totus.model;

import com.totus.utilities.Constant;
import java.util.Date;

/**
 *
 * @author mikaelo
 */
public class Quirofano extends Model{
    private final long ide = 1L;
    
    private User user;
    private Client client;
    private boolean abierto;
    private Date fechaApertura;
    private Date fechaCierre;
    private boolean vendido;

    public Quirofano() {
        super(Constant.QUIROFANO);
    }
    
    public Quirofano(int id){
        super(Constant.QUIROFANO);
        super.setId(id);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public boolean isVendido() {
        return vendido;
    }
    
    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
        
}
