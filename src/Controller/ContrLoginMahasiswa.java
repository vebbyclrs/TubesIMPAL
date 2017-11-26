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
 * @author VebbyClrs
 */
public class ContrLoginMahasiswa implements ActionListener, KeyListener{

    private VLoginMahasiswa view;
    private Aplikasi model;

    public ContrLoginMahasiswa() {
        model = new Aplikasi();
        view = new VLoginMahasiswa();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getBtnMasuk())) {
            btnMasukPerformed(e);
        }
    }
    
    public void btnMasukPerformed(ActionEvent e) {
        String username = view.getTxtUserName().getText();
        String password = view.getTxtPassword().getText();
        
        try {
            Mahasiswa m = model.getMahasiswaByUsername(username);
            if (m == null) {
                view.showMessage("Email salah");
            } else {
                if (!m.getPassword().equals(password)) {
                    view.showMessage("Password salah");
                } else {
                    view.setVisible(false);
                    new ContrMahasiswa();
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
        if (e.getSource().equals(view.getBtnMasuk())) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                btnMasukPerformed(null);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
