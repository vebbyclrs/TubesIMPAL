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
//            if 
//                    (view.getTxtDsnNama().equals("") || view.getTxtDsnKode().equals("")||
//                    view.getTxtDsnBirthplace().equals("")||
////                    view.getDateDsnBirthday().getDate() == null ||
//                    view.getCboxMhsJK().getSelectedIndex() == 0) {
//                JOptionPane.showMessageDialog(view,"Field tidak boleh kosong","Terjadi kesalahan input",0);    
//            } else 
//            {
            try {

                Dosen d = new Dosen();
                System.out.println(view.getDateDsnBirthday().getDate());
//                System.out.println("1");
              // d.setNama(view.getTxtDsnNama());
//                System.out.println("2");
                //d.setKode(Integer.parseInt(view.getTxtDsnKode().getText()));
//                System.out.println("3");
                d.setTglLahir(view.getDateDsnBirthday().getDate());
//                d.setTglLahir((Date) view.getDateDsnBirthday().getDate());
//                System.out.println("4");
               // d.setTempatLahir(view.getTxtDsnBirthplace());
//                System.out.println("5");
               // d.setIsMale(2 == view.getCboxDsnJK().getSelectedIndex()); //Kalo cowo, selected = 2
//                System.out.println("6");
                //System.out.println(d.getNama());
                model.addDosen(d);
            } catch (Exception ae) {
                throw new IllegalArgumentException("Gabisa nyimpen");
            }
//            }
            
        }
    }
    
    
    
    
}
