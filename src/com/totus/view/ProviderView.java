package com.totus.view;

import com.totus.controller.ProviderController;
import com.totus.finderView.ProviderFinder;
import com.totus.model.Provider;
import javax.swing.JOptionPane;

/**
 *
 * @author mikaelo
 */
public class ProviderView  extends View <Provider> {

    ProviderController providerController;
    Provider provider;
    boolean salida;
    ProviderFinder providerFinder;
    /**
     * Creates new form CCliente
     */
    public ProviderView(java.awt.Frame parent, boolean modal) {
        super("Catalogo - Provedor", 490, 535, parent, modal);
        initComponents();
        providerController = new ProviderController();
        provider = new Provider();
        salida=false;
        providerFinder = new ProviderFinder(parent, true);
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTipo = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jLCalle = new javax.swing.JLabel();
        jLColonia = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLRFC = new javax.swing.JLabel();
        jLIdentificador = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLPaterno = new javax.swing.JLabel();
        jLMaterno = new javax.swing.JLabel();
        jTIdentificador = new javax.swing.JTextField();
        jCBUserType = new javax.swing.JComboBox<>();
        jBBuscar = new javax.swing.JButton();
        jTNombre = new javax.swing.JTextField();
        jTPaterno = new javax.swing.JTextField();
        jTMaterno = new javax.swing.JTextField();
        jDateChooser14 = new com.toedter.calendar.JDateChooser();
        jTCalle = new javax.swing.JTextField();
        jLCP = new javax.swing.JLabel();
        jLMunicipio = new javax.swing.JLabel();
        jTColonia = new javax.swing.JTextField();
        jTCP = new javax.swing.JTextField();
        jCbEstado = new javax.swing.JComboBox<>();
        jTMunicipio = new javax.swing.JTextField();
        jTRFC = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTipo.setText("Tipo");

        jLFecha.setText("Fecha Nacimiento");

        jLCalle.setText("Calle y Número");

        jLColonia.setText("Colonia");

        jLEstado.setText("Estado");

        jLRFC.setText("RFC");

        jLIdentificador.setText("Identificador");

        jLNombre.setText("Nombre");

        jLPaterno.setText("Paterno");

        jLMaterno.setText("Materno");

        jTIdentificador.setNextFocusableComponent(jBBuscar);
        jTIdentificador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTIdentificadorFocusLost(evt);
            }
        });
        jTIdentificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTIdentificadorKeyPressed(evt);
            }
        });

        jCBUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fisica", "Moral" }));

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLCP.setText("CP");

        jLMunicipio.setText("Municipio");

        jCbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Coahuila", "Colima", "Chiapas", "Chihuahua", "Ciudad de México", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Edo Mex.", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLMaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBUserType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(218, 218, 218))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTMaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jTIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLEstado)
                                    .addComponent(jLRFC))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLMunicipio)
                                .addGap(18, 18, 18)
                                .addComponent(jTMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser14, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLColonia)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTColonia, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLCP)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTCP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)
                                    .addComponent(jTCalle))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCancelar)
                .addGap(18, 18, 18)
                .addComponent(jBEliminar)
                .addGap(18, 18, 18)
                .addComponent(jBGuardar)
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
                    .addComponent(jLabelTipo)
                    .addComponent(jCBUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPaterno)
                    .addComponent(jTPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMaterno)
                    .addComponent(jTMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFecha)
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
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstado)
                    .addComponent(jCbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMunicipio)
                    .addComponent(jTMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLRFC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBEliminar)
                    .addComponent(jBCancelar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdentificadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTIdentificadorFocusLost
        
    }//GEN-LAST:event_jTIdentificadorFocusLost

    private void jTIdentificadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTIdentificadorKeyPressed
        if(27 == evt.getKeyCode()){
            this.setVisible(false);
            salida = true;
        }
    }//GEN-LAST:event_jTIdentificadorKeyPressed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        laodData();
        if(!provider.isExists()){
            
                
                provider = providerController.save(provider);
                validaData();
                
            
        }else{
                           
                provider = providerController.updateAll(provider);
            
            validaData();
            jTIdentificador.setText("");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        laodData();
        if(provider.isExists()){
            int a = 1;
            try{
                a= JOptionPane.showConfirmDialog(this, "Deseas borrar este item", "Alerta", JOptionPane.YES_NO_CANCEL_OPTION);//, "Alerta", JOptionPane.QUESTION_MESSAGE);
                if(a==0){
                    provider = providerController.delete(provider);
                    if(0 == provider.getError().getStatus().compareTo("000000")){
                        JOptionPane.showMessageDialog(this, "Eliminado correctamente", "Afirmativo",JOptionPane.INFORMATION_MESSAGE);
                        jTIdentificador.setText("");
                        provider = new Provider();
                        downlaodData();
                    }else{
                        JOptionPane.showMessageDialog(this, "No se elimino: "+provider.getError().getStatus()+"\n"+provider.getError().getDetail(), "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, "No se pudo borrar: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            }
            
            System.out.println("delete: " + a);
            //
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        /*NewJDialog n = new NewJDialog(parent, true);
        n.setVisible(true);
        System.out.println("id: " + n.getSelect());*/
        jTIdentificador.setText(jTIdentificador.getText().trim());
        if((0 != jTIdentificador.getText().compareTo(""))&& (!salida)){
            busca();
            
            /*try{
                provider.setId(Integer.parseInt(jTIdentificador.getText()));
                provider= providerController.getProviderById(provider);
                if(!provider.isExists()){
                    JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
                    jTIdentificador.setText(null);
                    jTIdentificador.setText("");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
                provider = new Provider();
                jTIdentificador.setText("");
            }finally{
                downlaodData();
            }*/
        }//if((jTIdentificador.getText()=="")&& (!salida)){
        else{
            providerFinder.abre();
            if(providerFinder.getSelect()!=0){
                jTIdentificador.setText(String.valueOf(providerFinder.getSelect()));
                busca();
            }else{
                provider = new Provider();
                downlaodData();
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void busca(){
        try{
            provider.setId(Integer.parseInt(jTIdentificador.getText()));
            provider= providerController.getProviderById(provider);
            if(!provider.isExists()){
                JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
                jTIdentificador.setText(null);
                jTIdentificador.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No existe el identificador: "+jTIdentificador.getText(), "Error",JOptionPane.ERROR_MESSAGE);
            provider = new Provider();
            jTIdentificador.setText("");
        }finally{
            downlaodData();
        }
    }
    
    private void downlaodData() {
        jTNombre.setText(provider.getNombre());
        jTPaterno.setText(provider.getApellidoPaterno());
        jTMaterno.setText(provider.getApellidoMaterno());
        jDateChooser14.setDate(provider.getFechaNacimiento());
        jTCalle.setText(provider.getCalle());
        jTColonia.setText(provider.getCalle());
        jTColonia.setText(provider.getColonia());
        jTCP.setText(provider.getCodigo_postal());
        //jCbEstado.setText(provider.getCalle());
        jTMunicipio.setText(provider.getMunicipio());
        jTRFC.setText(provider.getRfc());
    }
    
    private void laodData() {
        provider.setNombre(jTNombre.getText());
        provider.setPersona(jCBUserType.getSelectedItem().toString());
        provider.setApellidoPaterno(jTPaterno.getText());
        provider.setApellidoMaterno(jTMaterno.getText());
        provider.setFechaNacimiento(jDateChooser14.getDate());
        provider.setCalle(jTCalle.getText());
        provider.setColonia(jTColonia.getText());
        provider.setCodigo_postal(jTCP.getText());
        provider.setEstado(jCbEstado.getSelectedItem().toString());
        provider.setMunicipio(jTMunicipio.getText());
        provider.setRfc(jTRFC.getText());
    }
    
    private void validaData(){
        if(0 == provider.getError().getStatus().compareTo("000000")){
            JOptionPane.showMessageDialog(this, provider.getError().getDetail()+"\n"+ provider.getId(), "Correcto", JOptionPane.INFORMATION_MESSAGE);
            provider = new Provider();
            downlaodData();                    
        }else{
            JOptionPane.showMessageDialog(this, provider.getError().getStatus()+"\n"+provider.getError().getDetail(), "Denegado el acceso", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
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
    private javax.swing.JLabel jLMunicipio;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPaterno;
    private javax.swing.JLabel jLRFC;
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
