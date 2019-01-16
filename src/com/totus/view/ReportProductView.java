package com.totus.view;

import com.totus.model.Quirofano;
import com.totus.report.Report;
import com.totus.utilities.Constant;
import com.totus.utilities.Utilies;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author mikaelo
 */
public class ReportProductView extends View <Quirofano> {

    Report report;
    
    public ReportProductView(java.awt.Frame parent, boolean modal) {
        super("Reporte - Lista de Quirofano", 603, 100, parent, false);
        
        initComponents();
        
        report = new Report();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBCancelar = new javax.swing.JButton();
        JBImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCSelecciuon = new javax.swing.JComboBox<>();
        jTFClave = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBImprimir.setText("Imprimir");
        JBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBImprimirActionPerformed(evt);
            }
        });

        jLabel1.setText("Lisado de Productos");

        jCSelecciuon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "todos", "por caducar", "clave" }));
        jCSelecciuon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCSelecciuonItemStateChanged(evt);
            }
        });

        jTFClave.setEditable(false);
        jTFClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFClaveKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCSelecciuon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTFClave, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCSelecciuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBImprimir)
                    .addComponent(JBCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBImprimirActionPerformed
        try{
        
            Map parameters= new HashMap();
            switch(jCSelecciuon.getSelectedIndex()){
                case Constant.REPORT_PRODUCTOS_TODOS_ID:
                    report.getReport(Constant.REPORT_PRODUCTOS, parameters);
                    break;
                case Constant.REPORT_PRODUCTOS_CADUCAR_ID:
                    report.getReport(Constant.REPORT_PRODUCTOS_CADUCAR, parameters);
                    break;
                case Constant.REPORT_PRODUCTOS_CLAVE_ID:
                    parameters.put("PCLAVE", jTFClave.getText());
                    report.getReport(Constant.REPORT_PRODUCTOS_CLAVE, parameters);
                    break;
            }
            // 
        
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_JBImprimirActionPerformed

    private void jTFClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFClaveKeyPressed
        if(27 == evt.getKeyCode()){
            this.setVisible(false);

        }

    }//GEN-LAST:event_jTFClaveKeyPressed

    private void jCSelecciuonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCSelecciuonItemStateChanged
        if((0 == jCSelecciuon.getSelectedIndex()) ||
                (1 == jCSelecciuon.getSelectedIndex()) ){
            jTFClave.setEditable(false);
        }else{
            jTFClave.setEditable(true);
        }
    }//GEN-LAST:event_jCSelecciuonItemStateChanged

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBImprimir;
    private javax.swing.JComboBox<String> jCSelecciuon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFClave;
    // End of variables declaration//GEN-END:variables
}
