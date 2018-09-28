package com.totus.view;

import com.totus.controller.DevolucionController;
import com.totus.controller.DevolucionProductoController;
import com.totus.controller.ProductController;
import com.totus.finderView.DevolucionFinder;
import com.totus.finderView.ProductFinder;
import com.totus.model.Devolucion;
import com.totus.model.Product;
import com.totus.model.Devolucion;
import com.totus.model.DevolucionProducto;
import com.totus.report.Report;
import com.totus.utilities.Constant;
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
public class DevolucionView extends View <Devolucion> {

    private boolean key;
    private int agrega;
    DefaultTableModel model;
    
    private Product product;
    List<Product> listProduct;
    ProductController productController;
    ProductFinder productFinder;
    Report report;
    
    private boolean salida;
    private Devolucion devolucion;
    private DevolucionController devolucionController;
    private DevolucionProductoController devolucionProductoController;
    private List<DevolucionProducto> listDevolucionProducto;
    private DevolucionProducto devolucionProducto;
    private DevolucionFinder devolucionFinder;
    
    public DevolucionView(java.awt.Frame parent, boolean modal) {
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
        salida = false;
        devolucion = new Devolucion();
        devolucionController = new DevolucionController();
        devolucionProductoController = new DevolucionProductoController();
        listDevolucionProducto = new ArrayList<DevolucionProducto>();
        devolucionProducto = new DevolucionProducto();
        devolucionFinder = new DevolucionFinder(parent, Constant.SI);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTMensaje = new javax.swing.JTextArea();
        jBBuscar = new javax.swing.JButton();
        jLIdentificador = new javax.swing.JLabel();
        jTIdentificador = new javax.swing.JTextField();
        jLIdentificador1 = new javax.swing.JLabel();
        JBImprimir = new javax.swing.JButton();

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

        jTMensaje.setColumns(20);
        jTMensaje.setRows(5);
        jScrollPane2.setViewportView(jTMensaje);

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLIdentificador.setText("Identificador");

        jTIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTIdentificadorKeyPressed(evt);
            }
        });

        jLIdentificador1.setText("Mensaje");

        JBImprimir.setText("Imprimir");
        JBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addComponent(jLIdentificador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLIdentificador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                                        .addComponent(JBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JBAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTPId, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(JBPBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIdentificador)
                    .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLIdentificador1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTPId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTPNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPBuscar)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBEliminar)
                        .addGap(128, 128, 128)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBCancelar)
                    .addComponent(JBAbrir)
                    .addComponent(JBImprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if(devolucion.isExists()){
            JOptionPane.showMessageDialog(this, "Estos articulos ya fueron deueltos", "Error",JOptionPane.ERROR_MESSAGE);

        }else{
            try {
                laodData();
                agrega = JOptionPane.showConfirmDialog(this, "Deseas devolver los productos", "Abrir", JOptionPane.YES_NO_CANCEL_OPTION);//, "Alerta", JOptionPane.QUESTION_MESSAGE);
                if( 0 == agrega ){    
                    devolucion = devolucionController.save(devolucion);
                    devolucionProductoController.saveList(devolucion, listProduct);
                    productController.actualizaEstatus(listProduct, Constant.STATUS_DEVUELTO);
                    validaData();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_JBAbrirActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        jTIdentificador.setText(jTIdentificador.getText().trim());
        if((0 != jTIdentificador.getText().compareTo(""))&& (!salida)){
            busca();
        }else{
            devolucionFinder.abre();
            if(devolucionFinder.getSelect()!=0){
                jTIdentificador.setText(String.valueOf(devolucionFinder.getSelect()));
                busca();
            }else{
                devolucion = new Devolucion();
                downlaodData();
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

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

    private void JBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImprimirActionPerformed
        if(devolucion.isExists()){
            this.setAlwaysOnTop(false);
            Map parameters= new HashMap();
            parameters.put("DEVOLUCION", String.valueOf(devolucion.getId()) );
            parameters.put("MENSAJE", devolucion.getMessage() );
            parameters.put("FCIERRE",new Utilies().converterDateWhitOutHour(devolucion.getFecha()) );
            
            
            report.getReport(Constant.REPORT_DEVOLUCION, parameters);
            //  this.setVisible(false);
        }
    }//GEN-LAST:event_JBImprimirActionPerformed

    private void busca(){
        try{
            devolucion.setId(Integer.parseInt(jTIdentificador.getText()));
            devolucion= devolucionController.getDevolucionById(devolucion);
            if(!devolucion.isExists()){
                JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
                jTIdentificador.setText(null);
                jTIdentificador.setText("");
                listDevolucionProducto = new ArrayList<DevolucionProducto>();
            }else{
                devolucionProducto = new DevolucionProducto();
                devolucionProducto.setDevolucion(devolucion);
                listDevolucionProducto = devolucionProductoController.getListByDevolucion(devolucionProducto);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            devolucion = new Devolucion();
            jTIdentificador.setText("");
        }finally{
            downlaodData();
        }
    }
    
    private void validaData(){
        if(0 == devolucion.getError().getStatus().compareTo("000000")){
            JOptionPane.showMessageDialog(this, devolucion.getError().getDetail()+"\n"+ devolucion.getId(), "Correcto", JOptionPane.INFORMATION_MESSAGE);
            devolucion = new Devolucion();
            downlaodData();                    
        }else{
            JOptionPane.showMessageDialog(this, devolucion.getError().getStatus()+"\n"+devolucion.getError().getDetail(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void downlaodData(){
        System.out.println(devolucion.getMessage());
        jTMensaje.setText(devolucion.getMessage());
        model.setNumRows(0);
        Product p;
        for(DevolucionProducto devolucionProducto : listDevolucionProducto){
            p = devolucionProducto.getProducto();
            model.addRow(new Object[]{ devolucionProducto.getId(), p.getLote(), p.getClave(), p.getDescripcion() });
        }
    }
    
    private void agregaTabla() throws Exception {
        for(int i = 0; i<model.getRowCount(); i++){
            if(product.getId() == (int) model.getValueAt(i, 0)){
                product = new Product();
                JTPId.setText("");
                JTPNombre.setText("");
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
            if(product.isExists()
               && product.isPerecedero() ){
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
                    JOptionPane.showMessageDialog(this, "El producto no esta activo o no es perecedero\n"+product.getStatus().getId(), "Error", JOptionPane.ERROR_MESSAGE);
                    product = new Product();
                    JTPId.setText("");
                    JTPNombre.setText("");
                    
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "El producto no es perecedero\nID: "+product.getId(), "Error", JOptionPane.ERROR_MESSAGE);
                product = new Product();
                JTPId.setText("");
                JTPNombre.setText("");
                
            }
        }catch(Exception e){

        }
    }
    
    
    
    private void laodData() throws Exception {
        listProduct = new ArrayList<Product>();
        devolucion.setMessage(jTMensaje.getText());
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
    private javax.swing.JButton JBImprimir;
    private javax.swing.JButton JBPBuscar;
    private javax.swing.JTextField JTPId;
    private javax.swing.JTextField JTPNombre;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JLabel jLIdentificador;
    private javax.swing.JLabel jLIdentificador1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTIdentificador;
    private javax.swing.JTextArea jTMensaje;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables
}
