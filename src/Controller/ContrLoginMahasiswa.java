/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.*;
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
    private ContrMahasiswa selfContr;
    ContrLoginDosen loginDosen;
    ContrLoginAdmin loginAdmin;

    public ContrLoginMahasiswa() {
        
       try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        
        model = new Aplikasi();
        view = new VLoginMahasiswa();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setActionListener(this);
        view.setKeyListener(this);  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getBtnMasuk())) {
            btnMasukPerformed(e);
        }
        else if (e.getSource().equals(view.getBtnLoginAdmin())) {
            btnLoginAdminActionPerformed(e);
        }
        else if (e.getSource().equals(view.getBtnLoginDosen())) {
            btnLoginDosenActionPerformed(e);
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
                    selfContr = new ContrMahasiswa(m);
                }
            }
        } catch (Exception ae) {
            ae.printStackTrace();
        }
    }
    
    
    public void btnLoginDosenActionPerformed(ActionEvent ae) {
        System.out.println("btnLoginDosen pressed on Mahasiswa Login");
        view.setVisible(false);
        loginDosen = new ContrLoginDosen();
    }
    
    public void btnLoginAdminActionPerformed (ActionEvent ae) {
        System.out.println("btnLoginAdmin pressed on Mahasiswa Login");
        view.setVisible(false);
        loginAdmin = new ContrLoginAdmin();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if ((e.getSource().equals(view.getTxtPassword()))||e.getSource().equals(view.getTxtUserName())) {
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
