package com.totus.finderView;

import com.totus.controller.UserTypeController;
import com.totus.model.UserType;
import com.totus.view.View;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikaelo
 */
public class UserTypeFinder  extends View <UserType> {

    UserTypeController statusController;
    UserType status;
    DefaultTableModel model;
    private int select;
    List<UserType> listUserType;
    /**
     * Creates new form UserTypeFinder
     */
    public UserTypeFinder(java.awt.Frame parent, boolean modal) {
        super("Busqueda - UserType", 653, 299, parent, modal);
        initComponents();
        statusController = new UserTypeController();
        status = new UserType();
        model = (DefaultTableModel) jTFUserType.getModel();
        select = 0;
        model.setNumRows(0);
        listUserType = null;
    }

    
    public int getSelect(){
        return select;
    }
    
    public void abre(){
        select = 0;
        model.setNumRows(0);
        listUserType = null;
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFUserType = new javax.swing.JTable();
        jTFNombre = new javax.swing.JTextField();
        jBFBuscarP = new javax.swing.JButton();
        jBFSeleccionar = new javax.swing.JButton();
        jBFProCancelar = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre provedor");

        jTFUserType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "identificador", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTFUserType);

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
        status.setDescription(jTFNombre.getText());
        listUserType = statusController.getListByName(status);
        if(listUserType.size()>0){
            for(UserType p: listUserType){
                model.addRow(new Object[]{p.getId(), p.getDescription()});
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
        
        if(jTFUserType.getSelectedRow()== -1){
            JOptionPane.showMessageDialog(this, "No se a seleccionado un registro", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            select=listUserType.get(jTFUserType.getSelectedRow()).getId();
            System.out.println("select: "+ select);            
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBFSeleccionarActionPerformed

    private void jTFNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreKeyPressed
        if(27 == evt.getKeyCode()){
            this.setVisible(false);
            //salida = true;
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
    private javax.swing.JTable jTFUserType;
    // End of variables declaration//GEN-END:variables
}
