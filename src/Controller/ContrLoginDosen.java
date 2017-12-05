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
public class ContrLoginDosen implements ActionListener,KeyListener  {

    VLoginDosen view;
    Aplikasi apk;
    VLoginAdmin viAdmin;
    VLoginMahasiswa viMhs;

    public ContrLoginDosen() {
        
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
        view = new VLoginDosen();
        apk = new Aplikasi();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        
        view.setActionListener(this);
        view.setKeyListener(this);
    }
    
    public  void btnLoginActionPerformed(ActionEvent ae) /*DONE*/{
        System.out.println("btnLoginPerformed!!!!!");
        String email = view.getTxtUserName();
        String pass = view.getTxtPassword();
//        System.out.println( username);
//        System.out.println( pass);
        
        try {

            Dosen dsn = apk.getDosenByUsername(username);
//            System.out.println(dsn.getKode());
//            System.out.println(dsn.getUsername());
            if (dsn == null ){
                JOptionPane.showMessageDialog(viAdmin, "Pengguna tidak ditemukan", "Login gagal", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!dsn.getPassword().equals(pass)) {
                    JOptionPane.showMessageDialog(viAdmin, "Password salah", "Login gagal", JOptionPane.ERROR_MESSAGE);
                } else {
                    view.setVisible(false);
                    ContrDosen in = new ContrDosen();

                }
            }
        } catch (Exception e) {
            //throw new IllegalArgumentException("gagal Masuk");
            JOptionPane.showMessageDialog(view, e.getLocalizedMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    public void btnLoginMhsActionPerformed (ActionEvent ae) {
        System.out.println("btnLoginMhsPerformed!!!!!");
        view.setVisible(false);
        new ContrLoginMahasiswa();
    }
    
    public void btnLoginAdminActionPerformed (ActionEvent ae) {
        System.out.println("btnLoginAdminActionPerformed!!!!!");
        view.setVisible(false);
        new ContrLoginAdmin();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getBtnMasuk())) {
            btnLoginActionPerformed(e);
        } else if (e.getSource().equals(view.getBtnLoginAdmin())) {
            btnLoginAdminActionPerformed(e);
        } else if (e.getSource().equals(view.getBtnLoginMahasiswa())) {
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
