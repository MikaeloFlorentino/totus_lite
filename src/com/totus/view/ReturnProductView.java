package com.totus.view;

import com.totus.controller.ProductController;
import com.totus.finderView.ProductFinder;
import com.totus.model.Product;
import com.totus.model.Quirofano;
import com.totus.report.Report;
import com.totus.utilities.Constant;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikaelo
 */
public class ReturnProductView extends View <Quirofano> {

    private boolean key;
    private int agrega;
    DefaultTableModel model;
    
    private Product product;
    List<Product> listProduct;
    ProductController productController;
    ProductFinder productFinder;
    Report report;
    
    public ReturnProductView(java.awt.Frame parent, boolean modal) {
        super("Productos - Regresar al Proveedor", 728, 486, parent, modal);
        
        initComponents();
        agrega = 1;
        key=false;
        model =  (DefaultTableModel) jTProductos.getModel();
        
        product = new Product();
        listProduct = new ArrayList<Product>();
        productController = new ProductController();
        productFinder = new ProductFinder(parent, true);
       
        report = new Report();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBAbrir = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JTPId = new javax.swing.JTextField();
        JTPNombre = new javax.swing.JTextField();
        JBAgregar = new javax.swing.JButton();
        JBPBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();
        JBEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JBAbrir.setText("Devolver");
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

        JBAgregar.setText("Agregar");
        JBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarActionPerformed(evt);
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

        jLabel6.setText("Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(JTPId)
                        .addGap(18, 18, 18)
                        .addComponent(JTPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBPBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addComponent(JBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTPId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(JBEliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBAbrir))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        productFinder.abre(Constant.STATUS_DEVUELTO);
        if(productFinder.getSelect()!=0){
            JTPId.setText(String.valueOf(productFinder.getSelect()));
            buscaProduct();
        }else{
            product = new Product();
        }
    }//GEN-LAST:event_JBPBuscarActionPerformed

    private void JBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarActionPerformed
        if(product.isExists()){
            try {
                //model.addRow(new Object[]{ product.getId(), product.getLote(), product.getClave(), product.getDescripcion() });
                agregaTabla();
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(this, ex.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_JBAgregarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        if(jTProductos.getSelectedRow()== -1){
            JOptionPane.showMessageDialog(this, "No se a seleccionado un registro", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            model.removeRow(jTProductos.getSelectedRow());
        }
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAbrirActionPerformed
        try {
            laodData();
            agrega = JOptionPane.showConfirmDialog(this, "Deseas devolver los productos", "Abrir", JOptionPane.YES_NO_CANCEL_OPTION);//, "Alerta", JOptionPane.QUESTION_MESSAGE);
            if( 0 == agrega ){    
                productController.actualizaEstatus(listProduct, Constant.STATUS_DEVUELTO);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_JBAbrirActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_JBCancelarActionPerformed

    
    private void agregaTabla() throws Exception {
        for(int i = 0; i<model.getRowCount(); i++){
            if(product.getId() == (int) model.getValueAt(i, 0)){
                throw new Exception("Ya esta agregado ese producto");
            }
        }
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
                if( (Constant.STATUS_ACTIVO == product.getStatus().getId())
                   || (Constant.STATUS_INACTIVO == product.getStatus().getId()) ){
                    
                    agrega = JOptionPane.showConfirmDialog(this, "Deseas agregar este item", "Encontrado", JOptionPane.YES_NO_CANCEL_OPTION);//, "Alerta", JOptionPane.QUESTION_MESSAGE);
                    if( 0 == agrega ){    
                        //model.addRow(new Object[]{ product.getId(), product.getLote(), product.getClave(), product.getDescripcion() });
                        try {
                            //model.addRow(new Object[]{ product.getId(), product.getLote(), product.getClave(), product.getDescripcion() });
                            agregaTabla();
                        } catch (Exception ex) {
                           JOptionPane.showMessageDialog(this, ex.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "El producto no esta activo\n"+product.getStatus().getId(), "Error", JOptionPane.ERROR_MESSAGE);
                    product = new Product();
                    JTPId.setText("");
                    JTPNombre.setText("");
                    
                }
                
            }else{
                JTPNombre.setText("");
                
            }
        }catch(Exception e){

        }
    }
    
    
    
    private void laodData() throws Exception {
        if(0 == model.getRowCount()){
            throw new Exception("No hay productos");
        }
        for(int i = 0; i<model.getRowCount(); i++){
            product = new Product((int) model.getValueAt(i, 0));
            listProduct.add(product);
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAbrir;
    private javax.swing.JButton JBAgregar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBPBuscar;
    private javax.swing.JTextField JTPId;
    private javax.swing.JTextField JTPNombre;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables
}
