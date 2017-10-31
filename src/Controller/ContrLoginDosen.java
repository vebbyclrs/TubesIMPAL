/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.VLoginDosen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author vebbyclrs
 */
public class ContrLoginDosen implements ActionListener, KeyListener {

    Aplikasi model;
    VLoginDosen loginFrame;
    
    public ContrLoginDosen() {
        model = new Aplikasi();
        loginFrame = new VLoginDosen();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }
    
    public void btnMasukPerformed (ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource().equals(loginFrame.getBtnMasuk())) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                btnMasukPerformed(null);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    
    
}
