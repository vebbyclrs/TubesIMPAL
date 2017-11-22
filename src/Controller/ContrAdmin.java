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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
        view.setActionListener(this);
        
        addDosenToTableDosen(model.loadDosen(), view.getTblDosen());
        
    }

    private void addDosenToTableDosen(ArrayList<Dosen> data, JTable table) /**Done*/{ 
        DefaultTableModel t = (DefaultTableModel) table.getModel();

        t.setRowCount(0);
        for (Dosen d : data) {
            String[] s = {""+d.getKode(),d.getNama()};
            t.addRow(s);
        }
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
                d.setNama(view.getTfDsnNama());
                System.out.println("nama "+d.getNama());
                d.setKode(Integer.parseInt(view.getTfDsnKode()));
                
                d.setTglLahir(view.getDateDsnBirthday().getDate());
                System.out.println("1 "+view.getDateDsnBirthday().getDate());
                d.setTempatLahir(view.getTfDsnBirthplace());
                d.setIsMale(view.getCboxDsnJK().getSelectedIndex());
                if (model.addDosen(d)) {
                    view.showMessage("Berhasil ditambahkan");
                    addDosenToTableDosen(model.loadDosen(), view.getTblDosen());
                    view.reset();
                } else {
                    JOptionPane.showMessageDialog(view, "gagal ditambahkan");
                }
            } catch (Exception ae) {
                ae.printStackTrace();
//                throw new IllegalArgumentException("Gabisa nyimpen");
            }
//            }
            
        }
        else if (src.equals(view.getBtnAddMatkul())) {
            try {
                if ( view.getCboxSKS().getSelectedIndex()!=0) {
                    MataKuliah matkul = new MataKuliah(
                        Integer.parseInt(view.getTfKodeMatkul()),
                        view.getTfNamaMatkul(),
                        view.getCboxSKS().getSelectedIndex(),
                        (Dosen)view.getCboxKodeDosen().getSelectedItem());
                    //addMatkul
                } else {
                    view.showMessage("SKS belum dipilih");
                }
                
            } catch (Exception ae) {
            }
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    
    
    
}
