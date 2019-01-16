package com.totus.view;

import com.totus.controller.ProductController;
import com.totus.model.Product;
import com.totus.report.Report;
import com.totus.utilities.Constant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikaelo
 */
public class MenuView extends javax.swing.JFrame {

    ClientView clientView= new ClientView(this, true);
    UserView userView = new UserView(this, true);
    ProviderView providerView = new ProviderView(this, true);
    //NewJFrame providerView = new NewJFrame();
    QuirofanoAbrirView  quirofanoAbrirView;
    QuirofanoCerrarView  quirofanoCerrarView;
    QuirofanoVentaView quirofanoVentaView;
    ProductView productView;
    DevolucionView returnProductView;
    ReportQuirofanoSumaryView reportQuirofanoSumaryView;
    ReportQuirofanoListView reportQuirofanoListView;
    ReportDevolucionListView reportDevolucionListView;
    ReportProductView reportProductView;
    ProductController productController;
    Product product;
    DefaultTableModel model;
    private int meses;
    List<Product> listProduct;
    Report report;
    /**
     * Creates new form Menu
     */
    public MenuView() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        productController = new ProductController();
        product = new Product();
        model = (DefaultTableModel) JTProductExpiration.getModel();
        meses = 0;
        model.setNumRows(0);
        listProduct = null;
        report = new Report();
        cargaProductosExpirados();
        
        quirofanoAbrirView = new QuirofanoAbrirView(this, false);
        quirofanoCerrarView = new QuirofanoCerrarView(this, false);
        quirofanoVentaView  = new QuirofanoVentaView(this, false);
        productView = new ProductView(this, true);
        returnProductView = new DevolucionView(this, false);
        reportQuirofanoSumaryView = new ReportQuirofanoSumaryView(this, false);
        reportQuirofanoListView = new ReportQuirofanoListView(this, false);
        reportDevolucionListView = new ReportDevolucionListView(this, false);
        reportProductView = new ReportProductView(this, false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtMonth = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTProductExpiration = new javax.swing.JTable();
        JBAcutaliza = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMCClients = new javax.swing.JMenuItem();
        jMCProvider = new javax.swing.JMenuItem();
        jMCUsers = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Cerrar = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        JMIAbrir = new javax.swing.JMenuItem();
        JMIVenta = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control Inventario 1.0.0");

        jtMonth.setText("9");

        jLabel1.setText("Meses:");

        JTProductExpiration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Caducidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTProductExpiration);

        JBAcutaliza.setText("Actualziar");
        JBAcutaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAcutalizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBAcutaliza, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAcutaliza)
                    .addComponent(jtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Catalogos");

        jMCClients.setText("Clientes");
        jMCClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCClientsActionPerformed(evt);
            }
        });
        jMenu1.add(jMCClients);

        jMCProvider.setText("Proveedores");
        jMCProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCProviderActionPerformed(evt);
            }
        });
        jMenu1.add(jMCProvider);

        jMCUsers.setText("Usuarios");
        jMCUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCUsersActionPerformed(evt);
            }
        });
        jMenu1.add(jMCUsers);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Productos");

        jMenuItem3.setText("Registro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        Cerrar.setText("Quirofano");

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Cerrar.add(jMenuItem2);

        JMIAbrir.setText("Cerrar");
        JMIAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIAbrirActionPerformed(evt);
            }
        });
        Cerrar.add(JMIAbrir);

        JMIVenta.setText("Venta");
        JMIVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIVentaActionPerformed(evt);
            }
        });
        Cerrar.add(JMIVenta);

        jMenu2.add(Cerrar);

        jMenuItem4.setText("Devolver Proveedor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar.add(jMenu2);

        jMenu3.setText("Reportes");

        jMenuItem7.setText("Clientes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem9.setText("Proveedores");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem5.setText("Productos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem1.setText("Devoluciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem8.setText("Listado Quirofanos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem6.setText("Quirofanos Cerrados");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);
        jMenu3.add(jSeparator1);

        jMenuBar.add(jMenu3);

        jMenu5.setText("Servicio");

        jMenuItem11.setText("About it");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Licencia");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar.add(jMenu5);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jMCProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCProviderActionPerformed
        if(!providerView.isVisible()){
            providerView = new ProviderView(this, true);
            providerView.setVisible(true);
        }else{
            providerView.toFront();
        }
    }//GEN-LAST:event_jMCProviderActionPerformed

    private void jMCUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCUsersActionPerformed
        if(1 == Constant.user.getUser_type().getId()){
            if(!userView.isVisible()){
                userView = new UserView(this, true);
                userView.setVisible(true);
            }else{
                providerView.toFront();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Usuario no administrativo ", "Denegado el acceso", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jMCUsersActionPerformed

    private void jMCClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCClientsActionPerformed
        if(!clientView.isVisible()){
            clientView = new ClientView(this, true);
            clientView.setVisible(true);
        }else{
            clientView.toFront();
        }
    }//GEN-LAST:event_jMCClientsActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        JOptionPane.showMessageDialog(this, "Sistema NARIUX v1.0.2\n para uso exclusivo de TUTOS\n2018", "Acerca de.", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        JOptionPane.showMessageDialog(this, "Comercial de software privado\n v1.0.2", "Licencia", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if(!reportProductView.isVisible()){
            reportProductView = new ReportProductView(this, true);
            reportProductView.setVisible(true);
        }else{
            reportProductView.toFront();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if(!reportQuirofanoSumaryView.isVisible()){
            reportQuirofanoSumaryView = new ReportQuirofanoSumaryView(this, true);
            reportQuirofanoSumaryView.setVisible(true);
        }else{
            reportQuirofanoSumaryView.toFront();
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if(!productView.isVisible()){
            productView = new ProductView(this, true);
            productView.setVisible(true);
        }else{
            productView.toFront();
        }        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void JBAcutalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAcutalizaActionPerformed
        cargaProductosExpirados();
    }//GEN-LAST:event_JBAcutalizaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        if(!quirofanoAbrirView.isVisible()){
            quirofanoAbrirView = new QuirofanoAbrirView(this, false);
            quirofanoAbrirView.setVisible(true);
        }else{
            quirofanoAbrirView.toFront();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void JMIAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIAbrirActionPerformed
        if(!quirofanoCerrarView.isVisible()){
            quirofanoCerrarView = new QuirofanoCerrarView(this, false);
            quirofanoCerrarView.setVisible(true);
        }else{
            quirofanoCerrarView.toFront();
        }
    }//GEN-LAST:event_JMIAbrirActionPerformed

    private void JMIVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIVentaActionPerformed
        if(!quirofanoVentaView.isVisible()){
            quirofanoVentaView = new QuirofanoVentaView(this, false);
            quirofanoVentaView.setVisible(true);
        }else{
            quirofanoVentaView.toFront();
        }
    }//GEN-LAST:event_JMIVentaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(!returnProductView.isVisible()){
            returnProductView = new DevolucionView(this, false);
            returnProductView.setVisible(true);
        }else{
            returnProductView.toFront();
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // ReportQuirofanoListView
        if(!reportQuirofanoListView.isVisible()){
            reportQuirofanoListView = new ReportQuirofanoListView(this, false);
            reportQuirofanoListView.setVisible(true);
        }else{
            reportQuirofanoListView.toFront();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // ReportDevolucionListView
        if(!reportDevolucionListView.isVisible()){
            reportDevolucionListView = new ReportDevolucionListView(this, false);
            reportDevolucionListView.setVisible(true);
        }else{
            reportDevolucionListView.toFront();
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Map parameters = new HashMap();
        report.getReport(Constant.REPORT_CLIENTES, parameters);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Map parameters = new HashMap();
        report.getReport(Constant.REPORT_PROVEEDORES, parameters);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

     private void cargaProductosExpirados(){
        model.setNumRows(0);
        meses = Integer.parseInt(jtMonth.getText());
        listProduct = productController.getProductsExpiration(product, meses);
        if(listProduct.size()>0){
            for(Product p: listProduct){
                model.addRow(new Object[]{p.getId(), p.getFechaExpiracion()});
            }
            JOptionPane.showMessageDialog(this, "Se encontraron productos por caducar", "Alerta",JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cerrar;
    private javax.swing.JButton JBAcutaliza;
    private javax.swing.JMenuItem JMIAbrir;
    private javax.swing.JMenuItem JMIVenta;
    private javax.swing.JTable JTProductExpiration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMCClients;
    private javax.swing.JMenuItem jMCProvider;
    private javax.swing.JMenuItem jMCUsers;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jtMonth;
    // End of variables declaration//GEN-END:variables
}
