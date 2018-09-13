/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totus.model;

import com.totus.utilities.Constant;


/**
 *
 * @author mikaelo
 */
public class QuirofanoProducto extends Model{
    private final long ide = 1L;
    
    private Quirofano quirofano;
    private Product product;
    private boolean vendido;

    public QuirofanoProducto() {
        super(Constant.QUIROFANO_PRODUCTO);
    }
    
    public QuirofanoProducto(int id){
        super(Constant.QUIROFANO_PRODUCTO);
        super.setId(id);
    }

    public Quirofano getQuirofano() {
        return quirofano;
    }

    public void setQuirofano(Quirofano quirofano) {
        this.quirofano = quirofano;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    
    
}
