package com.totus.view;

import com.totus.controller.ClientController;
import com.totus.controller.ProductController;
import com.totus.controller.QuirofanoController;
import com.totus.controller.QuirofanoProductoController;
import com.totus.controller.UserController;
import com.totus.finderView.ClientFinder;
import com.totus.finderView.ProductFinder;
import com.totus.finderView.QuirofanoFinder;
import com.totus.finderView.UserFinder;
import com.totus.model.Client;
import com.totus.model.Product;
import com.totus.model.Quirofano;
import com.totus.model.QuirofanoProducto;
import com.totus.model.User;
import com.totus.report.Report;
import com.totus.utilities.Utilies;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikaelo
 */
public class QuirofanoCerrarView extends View <Quirofano> {

    private boolean salida;
    private boolean key;
    private int agrega;
    DefaultTableModel model;
    
    private Client client;
    private Quirofano quirofano;
    private QuirofanoProducto quirofanoProducto;
    private User user;
    private Product product;
    List<Product> listProduct;
    List<QuirofanoProducto> listQuirofanoProducto;
    
    ClientController clientController;
    QuirofanoController quirofanoController;
    QuirofanoProductoController quirofanoProductoController;
    UserController userController;
    ProductController productController;
    
    ClientFinder clientFinder;
    QuirofanoFinder quirofanoFinder;
    UserFinder userFinder;
    ProductFinder productFinder;
    Report report;
    
    public QuirofanoCerrarView(java.awt.Frame parent, boolean modal) {
        super("Productos - Abrir Quirofano", 609, 643, parent, modal);
        
        initComponents();
        salida = false;
        agrega = 1;
        key=false;
        model =  (DefaultTableModel) jTProductos.getModel();
        
        client = new Client();
        quirofano = new Quirofano();
        quirofanoProducto = new QuirofanoProducto();
        user = new User();
        product = new Product();
        listProduct = new ArrayList<Product>();
        listQuirofanoProducto = new ArrayList<QuirofanoProducto>();
        
        clientController =  new ClientController();
        quirofanoController =  new QuirofanoController();
        quirofanoProductoController = new QuirofanoProductoController();
        userController = new UserController();
        productController = new ProductController();
        
        clientFinder = new ClientFinder(parent, true);
        quirofanoFinder = new QuirofanoFinder(parent, true);
        userFinder = new UserFinder(parent, true);
        productFinder = new ProductFinder(parent, true);
        
        report = new Report();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBAbrir = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTIdentificador = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JTUid = new javax.swing.JTextField();
        JTUNombre = new javax.swing.JTextField();
        JBUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jDFechaApertura = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDFechaCierre = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        JTPId = new javax.swing.JTextField();
        JTPNombre = new javax.swing.JTextField();
        JBPDevolver = new javax.swing.JButton();
        JBPBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();
        JBEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jChAbierto = new javax.swing.JCheckBox();
        JBImprimir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTCId = new javax.swing.JTextField();
        jTCliente = new javax.swing.JTextField();
        JBCBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JBAbrir.setText("Cerrar");
        JBAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAbrirActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Identificador;");

        jTIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTIdentificadorKeyPressed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.setNextFocusableComponent(JTUid);
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuario Salida");

        JTUid.setEditable(false);
        JTUid.setNextFocusableComponent(JBUsuario);
        JTUid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTUidFocusLost(evt);
            }
        });

        JTUNombre.setEditable(false);

        JBUsuario.setText("Buscar");
        JBUsuario.setNextFocusableComponent(JTCId);
        JBUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Apertura");

        jDFechaApertura.setEnabled(false);

        jLabel4.setText("Cierre");

        jDFechaCierre.setEnabled(false);

        jLabel5.setText("Producto");

        JTPId.setNextFocusableComponent(JBPBuscar);
        JTPId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTPIdFocusLost(evt);
            }
        });
        JTPId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTPIdKeyPressed(evt);
            }
        });

        JTPNombre.setEditable(false);

        JBPDevolver.setText("Devolver");
        JBPDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPDevolverActionPerformed(evt);
            }
        });

        JBPBuscar.setText("Buscar");
        JBPBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPBuscarActionPerformed(evt);
            }
        });

        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Lote", "Clave", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTProductos);

        JBEliminar.setText("Eliminar");
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        jLabel6.setText("Productos \\na\\ndevolver a \\inventario");

        jChAbierto.setText("Abierto");
        jChAbierto.setEnabled(false);

        JBImprimir.setText("Imprimir");
        JBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImprimirActionPerformed(evt);
            }
        });

        jLabel7.setText("Cliente");

        JTCId.setEditable(false);
        JTCId.setNextFocusableComponent(JBCBuscar);
        JTCId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTCIdFocusLost(evt);
            }
        });

        jTCliente.setEditable(false);

        JBCBuscar.setText("Buscar");
        JBCBuscar.setNextFocusableComponent(JTPId);
        JBCBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCBuscarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDFechaApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTPId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JBPBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jChAbierto)
                                .addGap(18, 18, 18)
                                .addComponent(JBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JBAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JBPDevolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTCId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTUid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTUNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(jTCliente))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(JBCBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTUid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTUNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTCId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDFechaApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTPId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBPDevolver)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(JBEliminar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChAbierto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBCancelar)
                        .addComponent(JBAbrir)
                        .addComponent(JBImprimir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdentificadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdentificadorKeyPressed
        if(10 == evt.getKeyCode()){
            if((0 != jTIdentificador.getText().compareTo(""))&& (!salida)){
                busca();
                jTIdentificador.nextFocus();
            }
        }
        if(27 == evt.getKeyCode()){
            this.setVisible(false);
            salida = true;
        }
    }//GEN-LAST:event_jTIdentificadorKeyPressed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        jTIdentificador.setText(jTIdentificador.getText().trim());
        if((0 != jTIdentificador.getText().compareTo(""))&& (!salida)){
            busca();
        }else{
            quirofanoFinder.abre();
            if(quirofanoFinder.getSelect()!=0){
                jTIdentificador.setText(String.valueOf(quirofanoFinder.getSelect()));
                busca();
            }else{
                quirofano = new Quirofano();
                downlaodData();
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void JBUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBUsuarioActionPerformed
        userFinder.abre();
        if(userFinder.getSelect()!=0){
            JTUid.setText(String.valueOf(userFinder.getSelect()));
            buscaUser();
        }else{
            user = new User();
        }
    }//GEN-LAST:event_JBUsuarioActionPerformed

    private void JTPIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTPIdFocusLost
        if(!key)
        if(null != JTPId.getText()){
            if(0 != JTPId.getText().trim().compareTo("")){
                buscaProduct();
                 
            }
        }
        key=false;
    }//GEN-LAST:event_JTPIdFocusLost

    private void JTPIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPIdKeyPressed
        if(10 == evt.getKeyCode())
        if(null != JTPId.getText()){
            if(0 != JTPId.getText().trim().compareTo("")){
                key=true;
                buscaProduct();
                key=true;
                JTPId.nextFocus();
                key=true;
            }
        }
    }//GEN-LAST:event_JTPIdKeyPressed

    private void JBPBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPBuscarActionPerformed
        productFinder.abre();
        if(productFinder.getSelect()!=0){
            JTPId.setText(String.valueOf(productFinder.getSelect()));
            buscaProduct();
        }else{
            product = new Product();
        }
    }//GEN-LAST:event_JBPBuscarActionPerformed

    private void JBPDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPDevolverActionPerformed
        if(product.isExists()){
            //model.addRow(new Object[]{ product.getId(), product.getLote(), product.getClave(), product.getDescripcion() });
            agregaTabla();
        }
    }//GEN-LAST:event_JBPDevolverActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        if(jTProductos.getSelectedRow()== -1){
            JOptionPane.showMessageDialog(this, "No se a seleccionado un registro", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            model.removeRow(jTProductos.getSelectedRow());
        }
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAbrirActionPerformed
        if(0 == model.getRowCount()){
            JOptionPane.showMessageDialog(this, "No hay productos asignados", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            if(quirofano.isExists()){
                JOptionPane.showMessageDialog(this, "El quirofano ya esta abirto", "Error",JOptionPane.ERROR_MESSAGE);
                
            }else{
                laodData();
                
                agrega = JOptionPane.showConfirmDialog(this, "Deseas abrir quirofano", "Abrir", JOptionPane.YES_NO_CANCEL_OPTION);//, "Alerta", JOptionPane.QUESTION_MESSAGE);
                if( 0 == agrega ){    
                    quirofano = quirofanoController.abrir(quirofano);
                    quirofanoProductoController.abrir(quirofano, listProduct);
                    productController.actualizaEstatus(listProduct);
                    validaData();
                }
            }
        }
    }//GEN-LAST:event_JBAbrirActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImprimirActionPerformed
        if(quirofano.isExists()){
            this.setAlwaysOnTop(false);
            Map parameters= new HashMap();
            parameters.put("QUIROFANO", String.valueOf(quirofano.getId()) );
            parameters.put("FAPERTURA", new Utilies().converterDate(quirofano.getFechaApertura()) );
            if(!quirofano.isAbierto())
                parameters.put("FCIERRE",new Utilies().converterDate(quirofano.getFechaCierre()) );
            else
                parameters.put("FCIERRE", "");
            parameters.put("NCLIENTE", client.getNombre());
            parameters.put("NUSUARIO", user.getName());
            report.getReport("quirofano", parameters);
            this.setVisible(false);
        }
    }//GEN-LAST:event_JBImprimirActionPerformed

    private void JTCIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTCIdFocusLost
        if(null != JTCId.getText()){
            if(0 != JTCId.getText().trim().compareTo("")){
                buscaCliente();                 
            }
        }
    }//GEN-LAST:event_JTCIdFocusLost

    private void JBCBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCBuscarActionPerformed
        clientFinder.abre();
        if(clientFinder.getSelect()!=0){
            JTCId.setText(String.valueOf(clientFinder.getSelect()));
            buscaCliente();
        }else{
            client = new Client();
        }
        
    }//GEN-LAST:event_JBCBuscarActionPerformed

    private void JTUidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTUidFocusLost
        if(null != JTUid.getText()){
            if(0 != JTUid.getText().trim().compareTo("")){
                buscaUser();                 
            }
        }
    }//GEN-LAST:event_JTUidFocusLost

    
    private void buscaCliente(){
        try{
            client = new Client(Integer.parseInt(JTCId.getText()));
            client = clientController.getClientById(client);
            if(client.isExists()){
                jTCliente.setText(client.getNombre());
            }else{
                jTCliente.setText("");
            }
        }catch(Exception e){
                System.out.println(e.getMessage());

        }
    }
    
    
    private void buscaUser(){
        try{
            user = new User(Integer.parseInt(JTUid.getText()));
            user = userController.getUserById(user);
            if(user.isExists()){
                JTUNombre.setText(user.getName());
            }else{
                JTUNombre.setText("");
            }
        }catch(Exception e){
                System.out.println(e.getMessage());

        }
    }
    
    private void agregaTabla(){
        model.addRow(new Object[]{ product.getId(), product.getLote(), product.getClave(), product.getDescripcion() });
        product = new Product();
        JTPId.setText("");
        JTPNombre.setText("");
    }
    private void buscaProduct(){
        try{
            product = new Product(Integer.parseInt(JTPId.getText()));
            product = productController.getProductById(product);
            if(product.isExists()){
                JTPNombre.setText(product.getDescripcion());
                agrega = JOptionPane.showConfirmDialog(this, "Deseas agregar este item", "Encontrado", JOptionPane.YES_NO_CANCEL_OPTION);//, "Alerta", JOptionPane.QUESTION_MESSAGE);
                if( 0 == agrega ){    
                    //model.addRow(new Object[]{ product.getId(), product.getLote(), product.getClave(), product.getDescripcion() });
                    agregaTabla();
                }
                
            }else{
                JTPNombre.setText("");
                
            }
        }catch(Exception e){

        }
    }
    
    private void validaData(){
        if(0 == product.getError().getStatus().compareTo("000000")){
            JOptionPane.showMessageDialog(this, quirofano.getError().getDetail()+"\n"+ quirofano.getId(), "Correcto", JOptionPane.INFORMATION_MESSAGE);
            product = new Product();
            
            downlaodData();                    
        }else{
            JOptionPane.showMessageDialog(this, product.getError().getStatus()+"\n"+product.getError().getDetail(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void busca(){
        try{
            quirofano.setId(Integer.parseInt(jTIdentificador.getText()));
            quirofano= quirofanoController.getQuirofanoById(quirofano);
            if(!quirofano.isExists()){
                JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
                jTIdentificador.setText(null);
                jTIdentificador.setText("");
                listQuirofanoProducto = new ArrayList<QuirofanoProducto>();
            }else{
                quirofanoProducto = new QuirofanoProducto();
                quirofanoProducto.setQuirofano(quirofano);
                listQuirofanoProducto = quirofanoProductoController.getListByQuirofano(quirofanoProducto);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            quirofano = new Quirofano();
            jTIdentificador.setText("");
        }finally{
            downlaodData();
        }
    }
    
    
    private void laodData(){
        if(user.isExists()){
            quirofano.setUser(user);
        }
        if(client.isExists()){
            quirofano.setClient(client);
        }
        
        for(int i = 0; i<model.getRowCount(); i++){
            product = new Product((int) model.getValueAt(i, 0));
            listProduct.add(product);
        }
    }
    private void downlaodData(){
        user= quirofano.getUser();
        client =  quirofano.getClient();
        if(user.isExists()){
            JTUid.setText( String.valueOf(user.getId()) );
            JTUNombre.setText(user.getName());
        }else{
            JTUid.setText("");
            JTUNombre.setText("");
        }
        if(client.isExists()){
            JTCId.setText( String.valueOf(client.getId()) );
            jTCliente.setText(client.getNombre());
        }else{
            
            JTCId.setText("");
            jTCliente.setText("");
        }
        jDFechaApertura.setDate(quirofano.getFechaApertura());
        if(!quirofano.isAbierto()){
            jDFechaCierre.setDate(quirofano.getFechaCierre());
        }
        jChAbierto.setSelected(quirofano.isAbierto());
        model.setNumRows(0);
        Product p;
        for(QuirofanoProducto quirofanoProducto : listQuirofanoProducto){
            p = productController.getProductById(quirofanoProducto.getProduct());
            model.addRow(new Object[]{ p.getId(), p.getLote(), p.getClave(), p.getDescripcion() });
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAbrir;
    private javax.swing.JButton JBCBuscar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBImprimir;
    private javax.swing.JButton JBPBuscar;
    private javax.swing.JButton JBPDevolver;
    private javax.swing.JButton JBUsuario;
    private javax.swing.JTextField JTCId;
    private javax.swing.JTextField JTPId;
    private javax.swing.JTextField JTPNombre;
    private javax.swing.JTextField JTUNombre;
    private javax.swing.JTextField JTUid;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JCheckBox jChAbierto;
    private com.toedter.calendar.JDateChooser jDFechaApertura;
    private com.toedter.calendar.JDateChooser jDFechaCierre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTextField jTIdentificador;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables
}
