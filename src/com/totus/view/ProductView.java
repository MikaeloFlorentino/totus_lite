/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totus.view;

import com.totus.controller.ProductController;
import com.totus.controller.ProviderController;
import com.totus.controller.StatusController;
import com.totus.finderView.ProductFinder;
import com.totus.finderView.ProviderFinder;
import com.totus.finderView.StatusFinder;
import com.totus.model.Product;
import com.totus.model.Provider;
import com.totus.model.Status;
import com.totus.report.Report;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author mikaelo
 */
public class ProductView extends View <Product> {

    ProductController productController;
    ProviderController providerController;
    StatusController statusController;
    Product product;
    Provider provider;
    Status status;
    boolean salida;
    ProductFinder productFinder;
    ProviderFinder providerFinder;
    StatusFinder statusFinder;
    Report reporte;
    Map parameters;
    
    public ProductView(java.awt.Frame parent, boolean modal) {
        super("Productos - Productos", 582, 421, parent, modal);
        initComponents();
        productController = new ProductController();
        providerController = new ProviderController();
        statusController   = new StatusController();
        product = new Product();
        provider = new Provider();
        status = new Status();
        productFinder  = new ProductFinder(parent, true);
        providerFinder = new ProviderFinder(parent, true);
        statusFinder   = new StatusFinder(parent, true);
        salida=false;
        reporte = new Report();
        parameters = new HashMap();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTIdentificador = new javax.swing.JTextField();
        JBBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JTPidProvedor = new javax.swing.JTextField();
        JTPNombreProvedor = new javax.swing.JTextField();
        JBPBuscarProvedor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JTSidStatus = new javax.swing.JTextField();
        JTSNombreStatus = new javax.swing.JTextField();
        JBSBuscarStatua = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTClave = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTLote = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTDescripcion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDFabricacion = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        JDDevolucion = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        JDExpiracion = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        JTCantidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTCompra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JTFactura = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        JBCodigo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Identificador;");

        jTIdentificador.setNextFocusableComponent(JBBuscar);
        jTIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTIdentificadorKeyPressed(evt);
            }
        });

        JBBuscar.setText("Buscar");
        JBBuscar.setNextFocusableComponent(JTPidProvedor);
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Provedor");

        JTPidProvedor.setNextFocusableComponent(JBPBuscarProvedor);
        JTPidProvedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTPidProvedorFocusLost(evt);
            }
        });

        JTPNombreProvedor.setEditable(false);

        JBPBuscarProvedor.setText("Buscar");
        JBPBuscarProvedor.setNextFocusableComponent(JTSidStatus);
        JBPBuscarProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPBuscarProvedorActionPerformed(evt);
            }
        });

        jLabel3.setText("Status");

        JTSidStatus.setNextFocusableComponent(JBSBuscarStatua);
        JTSidStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTSidStatusFocusLost(evt);
            }
        });

        JTSNombreStatus.setEditable(false);

        JBSBuscarStatua.setText("Buscar");
        JBSBuscarStatua.setName(""); // NOI18N
        JBSBuscarStatua.setNextFocusableComponent(jTClave);
        JBSBuscarStatua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSBuscarStatuaActionPerformed(evt);
            }
        });

        jLabel4.setText("Clave");

        jTClave.setNextFocusableComponent(jTLote);

        jLabel5.setText("Lote");

        jTLote.setNextFocusableComponent(jTDescripcion);

        jLabel6.setText("Descripción");

        jTDescripcion.setNextFocusableComponent(jDFabricacion);

        jLabel7.setText("Fabricación");

        jDFabricacion.setNextFocusableComponent(JDExpiracion);

        jLabel8.setText("Devolicon");

        JDDevolucion.setNextFocusableComponent(JTCompra);

        jLabel9.setText("Expiracion");

        JDExpiracion.setNextFocusableComponent(JDDevolucion);

        jLabel10.setText("Cantidad");

        JTCantidad.setNextFocusableComponent(JTFactura);

        jLabel11.setText("Compra $");

        JTCompra.setNextFocusableComponent(JTCantidad);

        jLabel12.setText("Factura");

        JTFactura.setNextFocusableComponent(jBGuardar);

        jBGuardar.setText("Guardar");
        jBGuardar.setNextFocusableComponent(jBEliminar);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.setNextFocusableComponent(jBCancelar);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.setNextFocusableComponent(JBCodigo);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        JBCodigo.setText("Codigo");
        JBCodigo.setNextFocusableComponent(jTIdentificador);
        JBCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JDExpiracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDFabricacion, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(JDDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(JTCantidad)
                                    .addComponent(JTFactura, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jTDescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JTPidProvedor, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(JTSidStatus))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTPNombreProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTSNombreStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JBPBuscarProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JBSBuscarStatua, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(JBCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBCancelar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBGuardar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTClave, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTLote, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTPidProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTPNombreProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPBuscarProvedor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTSidStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTSNombreStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBSBuscarStatua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDFabricacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(JTCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JDExpiracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(JTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JTFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBCancelar)
                    .addComponent(JBCodigo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        laodData();
        if(!product.isExists()){

            product = productController.save(product);
            validaData();

        }else{

            product = productController.updateAll(product);

            validaData();
            jTIdentificador.setText("");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        laodData();
        if(product.isExists()){
            int a = 1;
            try{
                a= JOptionPane.showConfirmDialog(this, "Deseas borrar este item", "Alerta", JOptionPane.YES_NO_CANCEL_OPTION);//, "Alerta", JOptionPane.QUESTION_MESSAGE);
                if(a==0){
                    product = productController.delete(product);
                    if(0 == product.getError().getStatus().compareTo("000000")){
                        JOptionPane.showMessageDialog(this, "Eliminado correctamente", "Afirmativo",JOptionPane.INFORMATION_MESSAGE);
                        jTIdentificador.setText("");
                        product = new Product();
                        downlaodData();
                    }else{
                        JOptionPane.showMessageDialog(this, "No se elimino: "+product.getError().getStatus()+"\n"+product.getError().getDetail(), "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }

            }catch (Exception e){
                JOptionPane.showMessageDialog(this, "No se pudo borrar: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        jTIdentificador.setText(jTIdentificador.getText().trim());
        if((0 != jTIdentificador.getText().compareTo(""))&& (!salida)){
            busca();
        }else{
            productFinder.abre();
            if(productFinder.getSelect()!=0){
                jTIdentificador.setText(String.valueOf(productFinder.getSelect()));
                busca();
            }else{
                product = new Product();
                downlaodData();
            }
        }
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JBCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCodigoActionPerformed
        /*if(product.isExists()){
            parameters = new HashMap();
            parameters.put("IDENTIFICADOR", String.valueOf(product.getId()));
        
            reporte.getReport("barras", parameters);
        }*/
        
    }//GEN-LAST:event_JBCodigoActionPerformed

    private void jTIdentificadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdentificadorKeyPressed
        if(27 == evt.getKeyCode()){
            this.setVisible(false);
            salida = true;
        }
    }//GEN-LAST:event_jTIdentificadorKeyPressed

    private void JTPidProvedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTPidProvedorFocusLost
        if(null != JTPidProvedor.getText()){
            if(0 != JTPidProvedor.getText().trim().compareTo("")){
                buscaProvider();
                 
            }
        }
    }//GEN-LAST:event_JTPidProvedorFocusLost

    private void JBPBuscarProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPBuscarProvedorActionPerformed
        providerFinder.abre();
        if(providerFinder.getSelect()!=0){
            JTPidProvedor.setText(String.valueOf(providerFinder.getSelect()));
            buscaProvider();
        }else{
            provider = new Provider();
        }
    }//GEN-LAST:event_JBPBuscarProvedorActionPerformed

    private void JTSidStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTSidStatusFocusLost
        if(null != JTSidStatus.getText()){
            if(0 != JTSidStatus.getText().trim().compareTo("")){
                buscaStatus();
            }
        }
    }//GEN-LAST:event_JTSidStatusFocusLost

    private void JBSBuscarStatuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSBuscarStatuaActionPerformed
        statusFinder.abre();
        if(statusFinder.getSelect()!=0){
            JTSidStatus.setText(String.valueOf(statusFinder.getSelect()));
            buscaStatus();
        }else{
            status = new Status();
        }
    }//GEN-LAST:event_JBSBuscarStatuaActionPerformed

    private void buscaStatus(){
        try{
            status = new Status(Integer.parseInt(JTSidStatus.getText()));
            status = statusController.getProviderById(status);
            if(status.isExists()){
                JTSNombreStatus.setText(status.getDescription());
            }
        }catch(Exception e){

        }
    }
    
    private void buscaProvider(){
        try{
           provider = new Provider(Integer.parseInt(JTPidProvedor.getText()));
            provider = providerController.getProviderById(provider);
            if(provider.isExists()){
                JTPNombreProvedor.setText(provider.getNombre());
            }
        }catch(Exception e){

        }
    }
    
    private void busca(){
        try{
            product.setId(Integer.parseInt(jTIdentificador.getText()));
            product= productController.getProductById(product);
            if(!product.isExists()){
                JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
                jTIdentificador.setText(null);
                jTIdentificador.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            product = new Product();
            jTIdentificador.setText("");
        }finally{
            downlaodData();
        }
    }
    
    private void downlaodData() {
        if(product.isExists()){
            JTPidProvedor.setText(String.valueOf(product.getProvider().getId()));
            JTPNombreProvedor.setText(product.getProvider().getNombre());
            JTSidStatus.setText(String.valueOf(product.getStatus().getId()));
            JTSNombreStatus.setText(product.getStatus().getDescription());
            provider = product.getProvider();
            status = product.getStatus();
        }else{
            JTPidProvedor.setText(null);
            JTPNombreProvedor.setText(null);
            JTSidStatus.setText(null);
            JTSNombreStatus.setText(null);
        }
        
        jTClave.setText(product.getClave());
        jTLote.setText(product.getLote());
        jTDescripcion.setText(product.getDescripcion());
        jDFabricacion.setDate(product.getFechaFabricacion());
        JDExpiracion.setDate(product.getFechaExpiracion());
        JDDevolucion.setDate(product.getFechaDevolucion());
        JTCompra.setText(String.valueOf(product.getPrecioCompra()));
        JTCantidad.setText(String.valueOf(product.getCantidad()));
        JTFactura.setText(product.getFactura());
    }
    
    private void laodData() {
        product.setProvider(provider);
        product.setStatus(status);
        product.setClave(jTClave.getText());
        product.setLote(jTLote.getText());
        product.setDescripcion(jTDescripcion.getText());
        product.setFechaFabricacion(jDFabricacion.getDate());
        product.setFechaExpiracion(JDExpiracion.getDate());
        product.setFechaDevolucion(JDDevolucion.getDate());
        product.setPrecioCompra(new BigDecimal(JTCompra.getText()));
        product.setCantidad(Integer.parseInt(JTCantidad.getText()));
        product.setFactura(JTFactura.getText());
    }
    
    private void validaData(){
        if(0 == product.getError().getStatus().compareTo("000000")){
            JOptionPane.showMessageDialog(this, product.getError().getDetail()+"\n"+ product.getId(), "Correcto", JOptionPane.INFORMATION_MESSAGE);
            product = new Product();
            
            downlaodData();                    
        }else{
            JOptionPane.showMessageDialog(this, product.getError().getStatus()+"\n"+product.getError().getDetail(), "Denegado el acceso", JOptionPane.ERROR_MESSAGE);
        }
    }
 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBCodigo;
    private javax.swing.JButton JBPBuscarProvedor;
    private javax.swing.JButton JBSBuscarStatua;
    private com.toedter.calendar.JDateChooser JDDevolucion;
    private com.toedter.calendar.JDateChooser JDExpiracion;
    private javax.swing.JTextField JTCantidad;
    private javax.swing.JTextField JTCompra;
    private javax.swing.JTextField JTFactura;
    private javax.swing.JTextField JTPNombreProvedor;
    private javax.swing.JTextField JTPidProvedor;
    private javax.swing.JTextField JTSNombreStatus;
    private javax.swing.JTextField JTSidStatus;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private com.toedter.calendar.JDateChooser jDFabricacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTClave;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTIdentificador;
    private javax.swing.JTextField jTLote;
    // End of variables declaration//GEN-END:variables
}
