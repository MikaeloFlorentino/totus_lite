package com.totus.model;

import java.util.Date;
import com.totus.utilities.Constant;
        
/**
 *
 * @author mikaelo
 */
public class Devolucion extends Model{
    private final long ide = 1L;
    
    private String message;
    private Date fecha;
        
    public Devolucion(){
        super(Constant.DEVOLUCION);
    }
    public Devolucion(int id){
        super(Constant.DEVOLUCION);
        super.setId(id);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
