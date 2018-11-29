/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totus.report;

import com.totus.controller.Conexion;
import com.totus.utilities.Constant;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author mikaelo
 */
public class Report {
 
    String archivo;
    Conexion conect;
    Connection con;
    
    public Report(){
        
    }
    
   /* public void getReport(String reporte) {
        archivo = Constant.PARAMETER_FILE_PATH_REPORT+reporte+".jrxml";
        System.out.println("\t Reporte: " + archivo);
        try {
            conect = new Conexion();
            con=conect.mkConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //JasperReport report = (JasperReport)  JRLoader.loadObject(archivo);
            JasperReport report = JasperCompileManager.compileReport(archivo);
            JasperPrint print = JasperFillManager.fillReport(report, new HashMap(), con);
            
            //JasperViewer.viewReport(print, false);
            JasperViewer jviewer = new JasperViewer(print,false);
                 jviewer.setTitle("Sistema de gestión de Cartera");
                 jviewer.setVisible(true);
           / *      
            JFrame frame = new JFrame("Report");
            frame.getContentPane().add(new JRViewer(print));
            frame.pack();
            frame.setVisible(true);* /
        } catch (JRException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    
    
    public void getReport(String reporte, Map parameters) {
        parameters.put("REPORTES", Constant.PARAMETER_FILE_PATH_REPORT);
        archivo = Constant.PARAMETER_FILE_PATH_REPORT+reporte+".jrxml";
        System.out.println("\t Reporte: " + archivo);
        try {
            conect = new Conexion();
            con=conect.mkConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //JasperReport report = (JasperReport)  JRLoader.loadObject(archivo);
            JasperReport report = JasperCompileManager.compileReport(archivo);
            JasperPrint print = JasperFillManager.fillReport(report, parameters, con);
            
            //JasperViewer.viewReport(print, false);
            JasperViewer jviewer = new JasperViewer(print,false);
                 jviewer.setTitle("Control Inventarios 1.0.0");
                 jviewer.setVisible(true);
           /*      
            JFrame frame = new JFrame("Report");
            frame.getContentPane().add(new JRViewer(print));
            frame.pack();
            frame.setVisible(true);*/
        } catch (JRException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}


