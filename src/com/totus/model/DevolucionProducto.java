package com.totus.model;

import java.util.Date;
import com.totus.utilities.Constant;
        
/**
 *
 * @author mikaelo
 */
public class DevolucionProducto extends Model{
    private final long ide = 1L;
    
    private Devolucion devolucion;
    private Product producto;
        
    public DevolucionProducto(){
        super(Constant.DEVOLUCION_PRODUCTO);
    }
    public DevolucionProducto(Devolucion devolucion, Product producto){
        super(Constant.DEVOLUCION_PRODUCTO);
        this.devolucion = devolucion;
        this.producto = producto;
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    public Product getProducto() {
        return producto;
    }

    public void setProducto(Product producto) {
        this.producto = producto;
    }

}
