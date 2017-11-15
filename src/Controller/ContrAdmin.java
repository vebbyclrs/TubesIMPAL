/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.VAdmin;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author VebbyClrs
 */
public class ContrAdmin implements ActionListener {
    private VAdmin view;
    private Aplikasi model;

    public ContrAdmin() {
        this.view = new VAdmin();
        this.model = new Aplikasi();
        
        view.setVisible(true);
        view.addListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if (src.equals(view.getBtnDsnAdd())) {
            if (view.getTxtDsnNama().equals("") || view.getTxtDsnKode().equals("")||
                    view.getTxtDsnBirthplace().equals("")||
                    view.getDateDsnBirthday().getDate() == null ||
                    view.getCboxMhsJK().getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(view,"Field tidak boleh kosong","Terjadi kesalahan input",0);    
            } else {
                Dosen d = new Dosen();
                d.setNama(view.getTxtDsnNama());
                d.setKode(Integer.parseInt(view.getTxtDsnKode()));
                d.setTglLahir((Date) view.getDateDsnBirthday().getDate());
                d.setTempatLahir(view.getTxtDsnBirthplace());
                d.setIsMale(2 == view.getCboxDsnJK().getSelectedIndex()); //Kalo cowo, selected = 2
            }
        }
    }
    
    
    
    
}