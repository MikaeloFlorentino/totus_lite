package com.totus.finderView;

import com.totus.controller.ProductController;
import com.totus.model.Product;
import com.totus.utilities.Constant;
import com.totus.utilities.Utilies;
import com.totus.view.View;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikaelo
 */
public class ProductFinder  extends View <Product> {

    ProductController productController;
    Product product;
    DefaultTableModel model;
    private int select;
    List<Product> listProduct;
    private int statusId;
    private int quirofanoId;
    /**
     * Creates new form ProviderFinder
     */
    public ProductFinder(java.awt.Frame parent, boolean modal) {
        super("Busqueda - Producto", 653, 299, parent, modal);
        initComponents();
        productController = new ProductController();
        product = new Product();
        model = (DefaultTableModel) jTFProduct.getModel();
        select = 0;
        model.setNumRows(0);
        listProduct = null;
        statusId=0;
        quirofanoId=0;
    }

    
    public int getSelect(){
        return select;
    }
    
    public void abre(int statusId){
        select = 0;
        model.setNumRows(0);
        listProduct = null;
        this.statusId = statusId;
        this.setVisible(true);
        
    }
    
    public void abre(int statusId, int quirofanoId){
        select = 0;
        model.setNumRows(0);
        listProduct = null;
        this.statusId = statusId;
        this.quirofanoId = quirofanoId;
        this.setVisible(true);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFProduct = new javax.swing.JTable();
        jTFNombre = new javax.swing.JTextField();
        jBFBuscarP = new javax.swing.JButton();
        jBFSeleccionar = new javax.swing.JButton();
        jBFProCancelar = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre producto");

        jTFProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "identificador", "Nombre", "Factura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTFProduct);

        jTFNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNombreKeyPressed(evt);
            }
        });

        jBFBuscarP.setText("Buscar");
        jBFBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFBuscarPActionPerformed(evt);
            }
        });

        jBFSeleccionar.setText("Seleccionar");
        jBFSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFSeleccionarActionPerformed(evt);
            }
        });

        jBFProCancelar.setText("Cancelar");
        jBFProCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFProCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jBFBuscarP))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBFProCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBFSeleccionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBFBuscarP))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBFSeleccionar)
                    .addComponent(jBFProCancelar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBFBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFBuscarPActionPerformed
        model.setNumRows(0);
        product.setDescripcion(jTFNombre.getText());
        if(0 != statusId){
            if(0 == quirofanoId){
                if(Constant.STATUS_DEVUELTO != statusId){
                    listProduct = productController.getListByNameStatus(product, statusId);
                }else{
                    listProduct = productController.getListByAcivsNoActivs(product);
                }
            }else{
                listProduct = productController.getListByQuirofano(product, statusId, quirofanoId);
                
            }
        }else{
            listProduct = productController.getListByName(product);
        }
        if(listProduct.size()>0){
            for(Product p: listProduct){
                model.addRow(new Object[]{p.getId(), p.getDescripcion(), p.getFactura()});
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "No se encontraron datos", "Error",JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_jBFBuscarPActionPerformed

    private void jBFProCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFProCancelarActionPerformed
        select = 0;
        this.setVisible(false);
    }//GEN-LAST:event_jBFProCancelarActionPerformed

    private void jBFSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFSeleccionarActionPerformed
        
        if(jTFProduct.getSelectedRow()== -1){
            JOptionPane.showMessageDialog(this, "No se a seleccionado un registro", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            select=listProduct.get(jTFProduct.getSelectedRow()).getId();
            System.out.println("select: "+ select);            
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBFSeleccionarActionPerformed

    private void jTFNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreKeyPressed
        if(27 == evt.getKeyCode()){
            this.setVisible(false);
            
        }
        
    }//GEN-LAST:event_jTFNombreKeyPressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFBuscarP;
    private javax.swing.JButton jBFProCancelar;
    private javax.swing.JButton jBFSeleccionar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTable jTFProduct;
    // End of variables declaration//GEN-END:variables
}
