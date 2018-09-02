package com.totus.Main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.totus.utilities.Load;
import com.totus.view.LoginView;

/**
 *
 * @author mikaelo
 */
public class Main {
    
    public static void main(String args[]){
        Load load = new Load();
        try {
            load.mainLoad();
            LoginView loginVista = new LoginView();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    loginVista.setVisible(true);
                }
            });
        
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}