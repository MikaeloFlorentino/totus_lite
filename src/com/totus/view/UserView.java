package com.totus.view;

import com.totus.controller.UserController;
import com.totus.controller.UserTypeController;
import com.totus.finderView.UserTypeFinder;
import com.totus.finderView.UserFinder;


import javax.swing.JOptionPane;
import com.totus.model.User;
import com.totus.model.UserType;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mikaelo
 */
public class UserView  extends View <User> {

    
    UserController userController;
    User user;
    UserType userType;
    UserTypeController userTypeController;
    Map<String, String> userTypeMap = new HashMap<>();
    Map<String, String> statusMap = new HashMap<>();
    boolean passMath;
    boolean salida;
    UserFinder userFinder;
    UserTypeFinder userTypeFinder;
    
    public UserView(java.awt.Frame parent, boolean modal) {
        super("Catalogo - Usuarios", 628, 560, parent, modal);
 
        initComponents();
        setLocationRelativeTo(null);
        user = new User();
        userType=new UserType();
        user.setUser_type(userType);
                
        userTypeController = new UserTypeController();
        userController = new UserController();
        passMath=false;
        salida=false;
        userFinder = new UserFinder(parent, true);
        userTypeFinder = new UserTypeFinder(parent, true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBBuscar = new javax.swing.JButton();
        jLIdentificador = new javax.swing.JLabel();
        jTIdentificador = new javax.swing.JTextField();
        jLPassword = new javax.swing.JLabel();
        jLPasswordVerify = new javax.swing.JLabel();
        jLUsername = new javax.swing.JLabel();
        jTPassword = new javax.swing.JPasswordField();
        jTPasswordVerify = new javax.swing.JPasswordField();
        jTUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBEstatus = new javax.swing.JComboBox<>();
        jLFirstLast = new javax.swing.JLabel();
        jLSecondLast = new javax.swing.JLabel();
        jTName = new javax.swing.JTextField();
        jLEmail = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jTFirstLast = new javax.swing.JTextField();
        jTSecondLast = new javax.swing.JTextField();
        jLName = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        JCBirth = new com.toedter.calendar.JDateChooser();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        JTTUId = new javax.swing.JTextField();
        JTTUDescripcion = new javax.swing.JTextField();
        JBTUBuscar = new javax.swing.JButton();

        jBBuscar.setText("Buscar");
        jBBuscar.setNextFocusableComponent(jTUsername);
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLIdentificador.setText("Identificador");

        jTIdentificador.setNextFocusableComponent(jBBuscar);
        jTIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTIdentificadorKeyPressed(evt);
            }
        });

        jLPassword.setText("Contraseña");

        jLPasswordVerify.setText("Validar Contraseña");

        jLUsername.setText("Username");

        jTPassword.setNextFocusableComponent(jTPasswordVerify);

        jTPasswordVerify.setNextFocusableComponent(JTTUId);

        jTUsername.setNextFocusableComponent(jTPassword);

        jLabel1.setText("Tipo Usuario");

        jLabel2.setText("Estatus");

        jCBEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jCBEstatus.setNextFocusableComponent(jTName);

        jLFirstLast.setText("Paterno");

        jLSecondLast.setText("Materno");

        jTName.setNextFocusableComponent(jTFirstLast);

        jLEmail.setText("Correo");

        jTEmail.setNextFocusableComponent(JCBirth);

        jTFirstLast.setNextFocusableComponent(jTSecondLast);

        jTSecondLast.setNextFocusableComponent(jTEmail);

        jLName.setText("Nombre");

        jLFecha.setText("Fecha Nacimiento");

        JCBirth.setNextFocusableComponent(jBGuardar);

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
        jBCancelar.setNextFocusableComponent(jTIdentificador);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        JTTUId.setNextFocusableComponent(JBTUBuscar);
        JTTUId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTTUIdFocusLost(evt);
            }
        });

        JTTUDescripcion.setEditable(false);
        JTTUDescripcion.setNextFocusableComponent(jCBEstatus);

        JBTUBuscar.setText("Buscar");
        JBTUBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTUBuscarActionPerformed(evt);
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
                        .addComponent(jLIdentificador)
                        .addGap(18, 18, 18)
                        .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLPasswordVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSecondLast, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFirstLast, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTEmail)
                                    .addComponent(jTSecondLast)
                                    .addComponent(jTFirstLast)
                                    .addComponent(jTName)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JCBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTPasswordVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCBEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTTUId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTTUDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBTUBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBGuardar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIdentificador)
                    .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsername)
                    .addComponent(jTUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPassword)
                    .addComponent(jTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPasswordVerify)
                    .addComponent(jTPasswordVerify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTTUId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTTUDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTUBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jCBEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLName)
                    .addComponent(jTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFirstLast)
                    .addComponent(jTFirstLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSecondLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSecondLast))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLFecha)
                    .addComponent(JCBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        laodData();
        if(!user.isExists()){
            if(passMath){
                user.setUsername(jTUsername.getText());
                user = userController.save(user);
                validaData();
                jTIdentificador.setText("");
                
            }else{
                JOptionPane.showMessageDialog(this, "Los password no coinciden", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            if(passMath){
                user = userController.updateAll(user);
            }else{
                user = userController.updateWhitOutPass(user);
            }
            validaData();
            jTIdentificador.setText("");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        laodData();
        if(user.isExists()){
            int a = 1;
            try{
                a= JOptionPane.showConfirmDialog(this, "Deseas borrar este item", "Alerta", JOptionPane.YES_NO_CANCEL_OPTION);//, "Alerta", JOptionPane.QUESTION_MESSAGE);
                if(a==0){
                    user = userController.delete(user);
                    if(0 == user.getError().getStatus().compareTo("000000")){
                        JOptionPane.showMessageDialog(this, "Eliminado correctamente", "Afirmativo",JOptionPane.INFORMATION_MESSAGE);
                        user = new User();
                        userType = new UserType();
                        user.setUser_type(userType);
                        jTIdentificador.setText("");
                        downlaodData();
                    }else{
                        JOptionPane.showMessageDialog(this, "No se elimino: "+user.getError().getStatus()+"\n"+user.getError().getDetail(), "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, "No se pudo borrar: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jTIdentificadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdentificadorKeyPressed
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
            userFinder.abre();
            if(userFinder.getSelect()!=0){
                jTIdentificador.setText(String.valueOf(userFinder.getSelect()));
                busca();
            }else{
                user = new User();
                userType = new UserType();
                user.setUser_type(userType);
                downlaodData();
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void JTTUIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTTUIdFocusLost
        if(null != JTTUId.getText()){
            if(0 != JTTUId.getText().trim().compareTo("")){
                buscaUserType();
                 
            }
        }
    }//GEN-LAST:event_JTTUIdFocusLost

    private void JBTUBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTUBuscarActionPerformed
        userTypeFinder.abre();
        if(userTypeFinder.getSelect()!=0){
            JTTUId.setText(String.valueOf(userTypeFinder.getSelect()));
            buscaUserType();
        }else{
            userType = new UserType();
        }
    }//GEN-LAST:event_JBTUBuscarActionPerformed

    
    private void buscaUserType(){
        try{
            userType = new UserType(Integer.parseInt(JTTUId.getText()));
            userType = userTypeController.getUserTypeById(userType);
            if(userType.isExists()){
                JTTUDescripcion.setText(userType.getDescription());
            }
        }catch(Exception e){

        }
    }
    
    
    private void busca(){
        try{
            user.setId(Integer.parseInt(jTIdentificador.getText()));
            user= userController.getUserById(user);
            System.out.println("user desc: "+user.getUser_type().getDescription());
            if(!user.isExists()){
                JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
                jTIdentificador.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            user = new User();
            userType = new UserType();
            user.setUser_type(userType);
            jTIdentificador.setText("");
        }finally{
            downlaodData();
        }
    }

    private void laodData(){
        user.setUser_type(userType);
        user.setName(jTName.getText());
        user.setFirst_last_name(jTFirstLast.getText());
        user.setSecond_last_name(jTSecondLast.getText());
        user.setEmail(jTEmail.getText());
        user.setBirth_date(JCBirth.getDate());
        
        if(0 == String.valueOf(jTPassword.getPassword()).compareTo( String.valueOf(jTPasswordVerify.getPassword()) )){
            user.setPassword(String.valueOf(jTPassword.getPassword()));
            passMath=true;
        }else{
            passMath=false;
            user.setPassword("");
        }
        user.setUser_type(userType);
        user.setStatus(jCBEstatus.getSelectedItem().toString());
    }
    
    private void downlaodData(){
        
        jTUsername.setText(user.getUsername());
        jTPassword.setText(user.getPassword());
        jTPasswordVerify.setText(user.getPassword());
        jTName.setText(user.getName());
        jTFirstLast.setText(user.getFirst_last_name());
        jTSecondLast.setText(user.getSecond_last_name());
        jTEmail.setText(user.getEmail());
        JCBirth.setDate(user.getBirth_date());
        JTTUId.setText(String.valueOf(userType.getId()));
        JTTUDescripcion.setText(userType.getDescription());
        if(user.getUser_type().isExists()){
            
            JTTUId.setText(String.valueOf(user.getUser_type().getId()));
            JTTUDescripcion.setText(user.getUser_type().getDescription());
            userType=user.getUser_type();
        }else{
            
            JTTUId.setText(null);
            JTTUDescripcion.setText(null);
        }
    }
    
    
    private void validaData(){
        if(0 == user.getError().getStatus().compareTo("000000")){
            JOptionPane.showMessageDialog(this, user.getError().getDetail()+"\n"+ user.getId(), "Correcto", JOptionPane.INFORMATION_MESSAGE);
            user = new User();
            userType = new UserType();
            user.setUser_type(userType);
            downlaodData();                    
        }else{
            JOptionPane.showMessageDialog(this, user.getError().getStatus()+"\n"+user.getError().getDetail(), "Denegado el acceso", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTUBuscar;
    private com.toedter.calendar.JDateChooser JCBirth;
    private javax.swing.JTextField JTTUDescripcion;
    private javax.swing.JTextField JTTUId;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<String> jCBEstatus;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLFirstLast;
    private javax.swing.JLabel jLIdentificador;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLPasswordVerify;
    private javax.swing.JLabel jLSecondLast;
    private javax.swing.JLabel jLUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTFirstLast;
    private javax.swing.JTextField jTIdentificador;
    private javax.swing.JTextField jTName;
    private javax.swing.JPasswordField jTPassword;
    private javax.swing.JPasswordField jTPasswordVerify;
    private javax.swing.JTextField jTSecondLast;
    private javax.swing.JTextField jTUsername;
    // End of variables declaration//GEN-END:variables

    
}
