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
import com.totus.model.Product;
import com.totus.model.Quirofano;
import com.totus.model.QuirofanoProducto;
import com.totus.report.Report;
import com.totus.utilities.Constant;
import com.totus.utilities.Utilies;
import java.math.BigDecimal;
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
public class QuirofanoVentaView extends View <Quirofano> {

    private boolean salida;
    private int agrega;
    DefaultTableModel model;
    
    private Quirofano quirofano;
    private QuirofanoProducto quirofanoProducto;
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
    
    public QuirofanoVentaView(java.awt.Frame parent, boolean modal) {
        super("Productos - Venta Quirofano", 609, 643, parent, modal);
        
        initComponents();
        salida = false;
        agrega = 1;
        model =  (DefaultTableModel) jTProductos.getModel();
        
        quirofano = new Quirofano();
        quirofanoProducto = new QuirofanoProducto();
        product = new Product();
        listProduct = new ArrayList<Product>();
        listQuirofanoProducto = new ArrayList<QuirofanoProducto>();
        
        quirofanoController =  new QuirofanoController();
        quirofanoProductoController = new QuirofanoProductoController();
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

        JBCerrar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTIdentificador = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JTUid = new javax.swing.JTextField();
        JTUNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDFechaApertura = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDFechaCierre = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jChAbierto = new javax.swing.JCheckBox();
        JBImprimir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTCId = new javax.swing.JTextField();
        jTCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JBCerrar.setText("Venta");
        JBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrarActionPerformed(evt);
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
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuario Salida");

        JTUid.setEditable(false);

        JTUNombre.setEditable(false);

        jLabel3.setText("Apertura");

        jDFechaApertura.setEnabled(false);

        jLabel4.setText("Cierre");

        jDFechaCierre.setEnabled(false);

        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Lote", "Clave", "Descripcion", "Precio Venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTProductos);

        jLabel6.setText("Lista de Productos vendidos");

        jChAbierto.setText("Vendido");
        jChAbierto.setEnabled(false);

        JBImprimir.setText("Imprimir");
        JBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImprimirActionPerformed(evt);
            }
        });

        jLabel7.setText("Cliente");

        JTCId.setEditable(false);

        jTCliente.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDFechaApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jChAbierto)
                            .addGap(18, 18, 18)
                            .addComponent(JBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JBCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                .addComponent(jTCliente)))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))))
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
                    .addComponent(JTUNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTCId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDFechaApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jChAbierto)
                    .addComponent(JBImprimir)
                    .addComponent(JBCancelar)
                    .addComponent(JBCerrar))
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

    private void JBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrarActionPerformed
        if(quirofano.isExists()){
            if(quirofano.isVendido()){
                JOptionPane.showMessageDialog(this, "El quirofano ya fue vendido", "Error",JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                        
                    laodData();
                    agrega = JOptionPane.showConfirmDialog(this, "Deseas vender el quirofano", "Vender", JOptionPane.YES_NO_CANCEL_OPTION);//, "Alerta", JOptionPane.QUESTION_MESSAGE);
                    if( 0 == agrega ){    
                        quirofano = quirofanoController.vender(quirofano);
                        productController.actualizaPrecio(listProduct);
                        validaData();
                    }
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(this,ex.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_JBCerrarActionPerformed

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
            parameters.put("NCLIENTE", quirofano.getClient().getNombre());
            parameters.put("NUSUARIO", quirofano.getUser().getName());
            report.getReport(Constant.REPORT_CERRAR, parameters);
          //  this.setVisible(false);
        }
    }//GEN-LAST:event_JBImprimirActionPerformed

    
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
            listQuirofanoProducto = new ArrayList<QuirofanoProducto>();
            if(!quirofano.isExists()){
                JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
                jTIdentificador.setText(null);
                jTIdentificador.setText("");
            }else{
                quirofanoProducto = new QuirofanoProducto();
                quirofanoProducto.setQuirofano(quirofano);
                if(quirofano.isAbierto()){
                    JOptionPane.showMessageDialog(this, "El quierodano no esta cerrado", "Error",JOptionPane.ERROR_MESSAGE);
                    quirofano = new Quirofano();
                }else{
                    listQuirofanoProducto = quirofanoProductoController.getListByQuirofanoVendido(quirofanoProducto, Constant.VENDIDO);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            quirofano = new Quirofano();
            jTIdentificador.setText("");
        }finally{
            downlaodData();
        }
    }
    
    
    private void laodData()  throws Exception {
        for(int i = 0; i<model.getRowCount(); i++){
            product = new Product((int) model.getValueAt(i, 0));
            product.setPrecioVenta(new BigDecimal(String.valueOf( model.getValueAt(i, 4))));
            if( 0 ==product.getPrecioVenta().compareTo(BigDecimal.ZERO)){
                throw new Exception("El producto "+product.getId()+ " no tiene precio");
            }
            listProduct.add(product);
        }
    }
    private void downlaodData(){
        if(quirofano.getUser().isExists()){
            JTUid.setText( String.valueOf(quirofano.getUser().getId()) );
            JTUNombre.setText(quirofano.getUser().getName());
        }else{
            JTUid.setText("");
            JTUNombre.setText("");
        }
        if(quirofano.getClient().isExists()){
            JTCId.setText( String.valueOf(quirofano.getClient().getId()) );
            jTCliente.setText(quirofano.getClient().getNombre());
        }else{
            
            JTCId.setText("");
            jTCliente.setText("");
        }
        jDFechaApertura.setDate(quirofano.getFechaApertura());
        if(!quirofano.isAbierto()){
            jDFechaCierre.setDate(quirofano.getFechaCierre());
        }
        jChAbierto.setSelected(quirofano.isVendido());
        model.setNumRows(0);
        Product p;
        for(QuirofanoProducto qp : listQuirofanoProducto){
            p = productController.getProductById(qp.getProduct());
            model.addRow(new Object[]{ p.getId(), p.getLote(), p.getClave(), p.getDescripcion(), p.getPrecioVenta() });
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBCerrar;
    private javax.swing.JButton JBImprimir;
    private javax.swing.JTextField JTCId;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTextField jTIdentificador;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables
}
