package com.totus.view;

import com.totus.model.Model;
/**
 *
 * @author mikaelo
 * @param <T>
 */
public abstract class View <T extends Model> extends javax.swing.JDialog{
    private boolean visible;
    /*public View(String titulo, int ancho, int alto){
        setTitle(titulo);
        setSize(new java.awt.Dimension(ancho, alto));
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }*/
    public View(String titulo, int ancho, int alto, java.awt.Frame parent, boolean modal){
        super(parent, modal);
        setTitle(titulo);
        setSize(new java.awt.Dimension(ancho, alto));
        setLocationRelativeTo(null);
        setResizable(false);
        //setAlwaysOnTop(true);
    }
}
