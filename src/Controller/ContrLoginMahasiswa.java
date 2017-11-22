/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.VLoginMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vebbyclrs
 */
public class ContrLoginMahasiswa implements ActionListener, KeyListener{

    private VLoginMahasiswa loginFrame;
    private Aplikasi model;

    public ContrLoginMahasiswa() {
        model = new Aplikasi();
        loginFrame = new VLoginMahasiswa();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(loginFrame.getBtnMasuk())) {
            btnMasukPerformed(e);
        }
    }
    
    public void btnMasukPerformed(ActionEvent e) {
        String username = loginFrame.getTxtUserName().getText();
        String password = loginFrame.getTxtUserName().getText();
        
        try {
            Mahasiswa m = model.getMahasiswaByEmail(username);
            if (m == null) {
                loginFrame.showMessage("Email salah");
            } else {
                if (!m.getPassword().equals(password)) {
                    loginFrame.showMessage("Password salah");
                } else {
                    loginFrame.setVisible(false);
                    
                }
            }
        } catch (Exception ae) {
            ae.printStackTrace();
        }
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
