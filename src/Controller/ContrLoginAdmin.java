/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.*;
import View.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
        
/**
 *
 * @author VebbyClrs
 */
public class ContrLoginAdmin implements ActionListener,KeyListener  {

    VLoginAdmin view;
    Aplikasi apk;
    ContrAdmin selfContr;
    ContrLoginDosen loginDosenContr;
    ContrLoginMahasiswa loginMhsContr;

    public ContrLoginAdmin() {
        view = new VLoginAdmin();
        apk = new Aplikasi();
        view.setVisible(true);
        view.setActionListener(this);
        view.setKeyListener(this);
    }
    
    public  void btnLoginActionPerformed(ActionEvent ae) {
        System.out.println("btnLoginPerformed!!!!!");
        String email = view.getTxtUserName().getText();
        String pass = view.getTxtPassword().getText();
        
        try {
            Admin adm = apk.getAdminByUsername(email);
            if (adm == null) {
                view.showMessage("PENGGUNA TIDAK DITEMUKAN");
            } else {
                if ( adm.getPassword().equals(pass)) {
                    view.setVisible(false);
                    selfContr = new ContrAdmin();
                } else {
                    view.showMessage("PASSWORD SALAH!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void btnLoginDosenActionPerformed(ActionEvent ae) {
        System.out.println("btnLoginDosenPerformed!!!!!");
        view.setVisible(false);
        loginDosenContr = new ContrLoginDosen();
    }
    
    public void btnLoginMhsActionPerformed (ActionEvent ae) {
        System.out.println("btnLoginMhsPerformed!!!!!");
        view.setVisible(false);
        loginMhsContr = new ContrLoginMahasiswa();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getBtnMasuk())) {
            btnLoginActionPerformed(e);
        } else if (e.getSource().equals(view.getBtnLoginDosen())) {
            btnLoginDosenActionPerformed(e);
        } else if (e.getSource().equals(view.getBtnLoginMhs())) {
            btnLoginMhsActionPerformed(e);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource().equals(view.getTxtPassword())) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                btnLoginActionPerformed(null);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    
    
}
