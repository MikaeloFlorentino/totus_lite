package com.totus.view;

import java.util.Arrays;
import com.totus.controller.LoginController;
import com.totus.model.User;
//import com.totus.model.wrapper.UserWrapper;
import com.totus.utilities.Constant;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mikaelo
 */
public class LoginView  extends javax.swing.JFrame {
    
    LoginController loginController;
//    UserWrapper userWrapper;
    User usuario;
    /**
     * Creates new form Login
     */
    public LoginView() {
        usuario = new User();
//        userWrapper = new UserWrapper();
        loginController = new LoginController();
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTUsername = new javax.swing.JTextField();
        jLUsername = new javax.swing.JLabel();
        jLPassword = new javax.swing.JLabel();
        jTPassword = new javax.swing.JPasswordField();
        jBLoggin = new javax.swing.JButton();
        jLIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control Inventarios 1.0.0");

        jLUsername.setText("Usuario");
        jLUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLUsernameMouseClicked(evt);
            }
        });

        jLPassword.setText("Contraseña");

        jBLoggin.setText("Ingresar");
        jBLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogginActionPerformed(evt);
            }
        });

        jLIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/totus/image/logo_nariux.png"))); // NOI18N
        jLIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBLoggin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jTUsername)
                            .addComponent(jLIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPassword)
                    .addComponent(jTPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBLoggin)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogginActionPerformed
        usuario.setUsername(jTUsername.getText());
        usuario.setPassword(String.valueOf(jTPassword.getPassword()));
        
        usuario = loginController.getSeachLogin(usuario);
        
        if(usuario.isExists()){
            JOptionPane.showMessageDialog(this, "Bienvenido:\n"+ usuario.getName()+ " " + usuario.getFirst_last_name(), "Acceso Correcto", JOptionPane.INFORMATION_MESSAGE);
            
            Constant.user= usuario;
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MenuView().setVisible(true);
                }
            });
            this.setVisible(false);

        }else{
            JOptionPane.showMessageDialog(this, usuario.getError().getStatus()+"\n"+usuario.getError().getDetail(), "Denegado el acceso", JOptionPane.ERROR_MESSAGE);
        }
        
            
    }//GEN-LAST:event_jBLogginActionPerformed

    private void jLIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLIconMouseClicked
        jTUsername.setText("mikaelo");
        jTPassword.setText("123456");
        jBLogginActionPerformed(null);
    }//GEN-LAST:event_jLIconMouseClicked

    private void jLUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLUsernameMouseClicked
        JOptionPane.showMessageDialog(this, "v. 1.0.7\nhttps://www.nariux.com/totus/version", "Version", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLUsernameMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLoggin;
    private javax.swing.JLabel jLIcon;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLUsername;
    private javax.swing.JPasswordField jTPassword;
    private javax.swing.JTextField jTUsername;
    // End of variables declaration//GEN-END:variables
}
