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
import java.time.Instant;
import java.util.ArrayList;
import javax.swing.JComboBox;
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
        addDosenToCBox(model.loadDosen(), view.getCboxMhsKodeDoswal());
        addDosenToCBox(model.loadDosen(), view.getCboxMhsKodeDoswal());
        
    }
//
//    private Mahasiswa getMhsWhenBtnAddMhsPressed() {
//        Mahasiswa m = new Mahasiswa
//        view.getTfMhsNIM();
//        
//        return m;
//    }
    
    private void addDosenToTableDosen(ArrayList<Dosen> data, JTable table) /**Done*/{ 
        DefaultTableModel t = (DefaultTableModel) table.getModel();

        t.setRowCount(0);
        for (Dosen d : data) {
            String JK;
            if (d.getIsMale() == 1) {
                JK = "Laki-Laki";
            } else if (d.getIsMale() == 2) {
                JK = "Perempuan";
            } else {
                JK = "";
            }
            
            String[] s = {""+d.getKode()
                    ,d.getNama()
//                    ,(d.getTglLahir().getYear()+1900)+"-"+d.getTglLahir().getMonth()+"-"+d.getTglLahir().getDay()
//                    ,d.getTglLahir()+""
                    ,d.getTempatLahir()+", "+d.getTglLahir().toLocaleString()
                    ,JK
                    ,d.getAlamat()
                    ,d.getNoHp()+""};
            t.addRow(s);
        }
    }
    
    private void addMahasiswaToTableMhs(ArrayList<Mahasiswa> data, JTable table) {
        /**
         *Belom kelar 
         *
         */
        
        DefaultTableModel t = (DefaultTableModel) table.getModel();

        t.setRowCount(0);
        for (Mahasiswa d : data) {
            String JK;
            if (d.IsMale()) {
                JK = "Laki-Laki";
            } else {
                JK = "Perempuan";
            }
            String NIM = Long.toString(d.getNim());
            String[] s = {""+d.getNama()
                    ,NIM
                    ,JK
                    ,d.getTempatLahir()+", "+d.getTanggalLahir().toLocaleString()};
            t.addRow(s);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if (src.equals(view.getBtnDsnAdd())) {
            try {
                Dosen d = new Dosen();
                d.setNama(view.getTfDsnNama());
                d.setKode(Integer.parseInt(view.getTfDsnKode()));
                d.setTglLahir(view.getDateDsnBirthday().getDate());
                d.setTempatLahir(view.getTfDsnBirthplace());
                d.setIsMale(view.getCboxDsnJK().getSelectedIndex());
                d.setAlamat(view.getTfAlamat());
                d.setNoHp(Long.parseLong(view.getTfNoHp()));
                
                if (model.addDosen(d)) {
                    view.showMessage("Berhasil ditambahkan");
                    addDosenToTableDosen(model.loadDosen(), view.getTblDosen());
                    view.reset();
                } else {
                    JOptionPane.showMessageDialog(view, "gagal ditambahkan");
                }
            } catch (Exception ae) {
                ae.printStackTrace();
            }
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
        else if (src.equals(view.getBtnMhsAdd())) {
            try {
//                if (view.getCboxMhsKodeDoswal().getSelectedIndex()  == 0) {
//                    JOptionPane.showConfirmDialog(view, "Silahkan isi dosen wali terlebih dahulu", "Field tidak lengkap", 1);
//                } else {
                    Mahasiswa mhs = new Mahasiswa();
                    System.out.println("1");
                    mhs.setNama(view.getTfMhsNama());
                    System.out.println("2");
                    mhs.setAlamat(view.getTfMhsAlamat());
                    System.out.println("3");
                    mhs.setTanggalLahir(view.getDateMhsBirthday().getDate());
                    System.out.println("4");
                    System.out.println("tanggal "+view.getDateMhsBirthday().getDate());
                    System.out.println("5");
                    mhs.setTempatLahir(view.getTfMhsBirthplace());
                    System.out.println("6");
                    mhs.setAlamat(view.getTfMhsAlamat());
                    System.out.println("7");

                    Dosen dosen = model.getDosenByKode(Integer.parseInt(view.getCboxMhsKodeDoswal().getSelectedItem().toString()));
                    System.out.println(dosen.getKode());
                    mhs.setDosenWali(dosen);
                    
                    
                     
                    if (model.addMahasiswa(mhs)) {
                        view.showMessage("Mahasiswa berhasil ditambahkan! ");
                        addMahasiswaToTableMhs(model.loadMahasiswa(), view.getTblMahasiswa());
                        view.reset();
                    } else {
                        JOptionPane.showMessageDialog(view, "Gagal menambahkan mahasiswa", "Kesalahan saat menambahkan", 0);
                    }
//                }
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
        
    }
    
    public void addDosenToCBox(ArrayList<Dosen> data, JComboBox cb)/*DONE*/{
        cb.removeAllItems();
        for (Dosen dosen : data) {
            cb.addItem(dosen.getKode());
        }
    }
    
    
    
}
