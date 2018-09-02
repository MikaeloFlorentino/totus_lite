package com.totus.view;

import com.totus.controller.ClientController;
import com.totus.finderView.ClientFinder;
import javax.swing.JOptionPane;
import com.totus.model.Client;

/**
 *
 * @author mikaelo
 */
public class ClientView extends View <Client> {

    ClientController clientController;
    Client client;
    boolean salida;
    ClientFinder clientFinder;
    /**
     * Creates new form CCliente
     */
    public ClientView(java.awt.Frame parent, boolean modal) {
        super("Catalogo - Cliente", 464, 504, parent, modal);
        initComponents();
        clientController = new ClientController();
        client = new Client();
        salida=false;
        clientFinder = new ClientFinder(parent, true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNombre = new javax.swing.JLabel();
        jLPaterno = new javax.swing.JLabel();
        jLMaterno = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTPaterno = new javax.swing.JTextField();
        jTMaterno = new javax.swing.JTextField();
        jLFecha = new javax.swing.JLabel();
        jLCalle = new javax.swing.JLabel();
        jLColonia = new javax.swing.JLabel();
        jTCalle = new javax.swing.JTextField();
        jTColonia = new javax.swing.JTextField();
        jLCP = new javax.swing.JLabel();
        jTCP = new javax.swing.JTextField();
        jLEstado = new javax.swing.JLabel();
        jCbEstado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTMunicipio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTRFC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLIdentificador = new javax.swing.JLabel();
        jTIdentificador = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDateChooser14 = new com.toedter.calendar.JDateChooser();
        jLabelTipo = new javax.swing.JLabel();
        jCBUserType = new javax.swing.JComboBox<>();

        setSize(new java.awt.Dimension(0, 0));

        jLNombre.setText("Nombre");

        jLPaterno.setText("Paterno");

        jLMaterno.setText("Materno");

        jLFecha.setText("Fecha Nacimiento");

        jLCalle.setText("Calle y Número");

        jLColonia.setText("Colonia");

        jLCP.setText("CP");

        jLEstado.setText("Estado");

        jCbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Coahuila", "Colima", "Chiapas", "Chihuahua", "Ciudad de México", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Edo Mex.", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));

        jLabel9.setText("Municipio");

        jLabel10.setText("RFC");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLIdentificador.setText("Identificador");

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

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabelTipo.setText("Tipo");

        jCBUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fisica", "Moral" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLColonia)
                        .addGap(18, 18, 18)
                        .addComponent(jTColonia)
                        .addGap(18, 18, 18)
                        .addComponent(jLCP)
                        .addGap(18, 18, 18)
                        .addComponent(jTCP, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLCalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCalle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser14, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 151, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLEstado)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTMunicipio))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jCBUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addComponent(jLPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTNombre)
                                .addComponent(jTPaterno)
                                .addComponent(jTMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLIdentificador)
                            .addGap(18, 18, 18)
                            .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIdentificador)
                    .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jCBUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPaterno)
                            .addComponent(jTPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLMaterno)
                            .addComponent(jTMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLFecha))
                    .addComponent(jDateChooser14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCalle)
                    .addComponent(jTCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLColonia)
                    .addComponent(jTColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCP)
                    .addComponent(jTCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstado)
                    .addComponent(jCbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        laodData();
        if(!client.isExists()){
            
                
                client = clientController.save(client);
                validaData();
                
            
        }else{
                           
                client = clientController.updateAll(client);
            
            validaData();
            jTIdentificador.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTIdentificadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdentificadorKeyPressed
        if(27 == evt.getKeyCode())
            this.setVisible(false);
    }//GEN-LAST:event_jTIdentificadorKeyPressed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        jTIdentificador.setText(jTIdentificador.getText().trim());
        if((0 != jTIdentificador.getText().compareTo(""))&& (!salida)){
            busca();
        }else{
            clientFinder.abre();
            if(clientFinder.getSelect()!=0){
                jTIdentificador.setText(String.valueOf(clientFinder.getSelect()));
                busca();
            }else{
                client = new Client();
                downlaodData();
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        laodData();
        if(client.isExists()){
            int a = 1;
            try{
                a= JOptionPane.showConfirmDialog(this, "Deseas borrar este item", "Alerta", JOptionPane.YES_NO_CANCEL_OPTION);//, "Alerta", JOptionPane.QUESTION_MESSAGE);
                if(a==0){
                    client = clientController.delete(client);
                    if(0 == client.getError().getStatus().compareTo("000000")){
                        JOptionPane.showMessageDialog(this, "Eliminado correctamente", "Afirmativo",JOptionPane.INFORMATION_MESSAGE);
                        jTIdentificador.setText("");
                        client = new Client();
                        downlaodData();
                    }else{
                        JOptionPane.showMessageDialog(this, "No se elimino: "+client.getError().getStatus()+"\n"+client.getError().getDetail(), "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, "No se pudo borrar: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void busca(){
        try{
            client.setId(Integer.parseInt(jTIdentificador.getText()));
            client= clientController.getClientById(client);
            if(!client.isExists()){
                JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
                jTIdentificador.setText(null);
                jTIdentificador.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            client = new Client();
            jTIdentificador.setText("");
        }finally{
            downlaodData();
        }
    }
    
    private void downlaodData() {
        jTNombre.setText(client.getNombre());
        jTPaterno.setText(client.getApellidoPaterno());
        jTMaterno.setText(client.getApellidoMaterno());
        jDateChooser14.setDate(client.getFechaNacimiento());
        jTCalle.setText(client.getCalle());
        jTColonia.setText(client.getCalle());
        jTColonia.setText(client.getColonia());
        jTCP.setText(client.getCodigo_postal());
        //jCbEstado.setText(client.getCalle());
        jTMunicipio.setText(client.getMunicipio());
        jTRFC.setText(client.getRfc());
    }
    
    private void laodData() {
        client.setNombre(jTNombre.getText());
        client.setPersona(jCBUserType.getSelectedObjects().toString());
        client.setApellidoPaterno(jTPaterno.getText());
        client.setApellidoMaterno(jTMaterno.getText());
        client.setFechaNacimiento(jDateChooser14.getDate());
        client.setCalle(jTCalle.getText());
        client.setColonia(jTColonia.getText());
        client.setCodigo_postal(jTCP.getText());
        client.setEstado(jCbEstado.getSelectedItem().toString());
        client.setMunicipio(jTMunicipio.getText());
        client.setRfc(jTRFC.getText());
    }
    
    private void validaData(){
        if(0 == client.getError().getStatus().compareTo("000000")){
            JOptionPane.showMessageDialog(this, client.getError().getDetail()+"\n"+ client.getId(), "Correcto", JOptionPane.INFORMATION_MESSAGE);
            client = new Client();
            downlaodData();                    
        }else{
            JOptionPane.showMessageDialog(this, client.getError().getStatus()+"\n"+client.getError().getDetail(), "Denegado el acceso", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCBUserType;
    private javax.swing.JComboBox<String> jCbEstado;
    private com.toedter.calendar.JDateChooser jDateChooser14;
    private javax.swing.JLabel jLCP;
    private javax.swing.JLabel jLCalle;
    private javax.swing.JLabel jLColonia;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLIdentificador;
    private javax.swing.JLabel jLMaterno;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPaterno;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JTextField jTCP;
    private javax.swing.JTextField jTCalle;
    private javax.swing.JTextField jTColonia;
    private javax.swing.JTextField jTIdentificador;
    private javax.swing.JTextField jTMaterno;
    private javax.swing.JTextField jTMunicipio;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPaterno;
    private javax.swing.JTextField jTRFC;
    // End of variables declaration//GEN-END:variables
}
