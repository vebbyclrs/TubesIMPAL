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
    public static long nextNIM;
    
    
    public ContrAdmin() {
        this.view = new VAdmin();
        this.model = new Aplikasi();
        nextNIM = model.loadMahasiswa().get(model.loadMahasiswa().size()-1).getNim()+1;
        view.setVisible(true);
        view.setActionListener(this);
        view.setTfMhsNIM(nextNIM+"");
        
        addDosenToTableDosen(model.loadDosen(), view.getTblDosen());
        addDosenToCBox(model.loadDosen(), view.getCboxKodeDosen());
        addDosenToCBox(model.loadDosen(), view.getCboxMhsKodeDoswal());
        addMahasiswaToTableMhs(model.loadMahasiswa(), view.getTblMahasiswa());
        
    }
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
                    ,d.getTempatLahir()+", "+d.getTglLahir().toLocaleString()
                    ,JK
                    ,d.getAlamat()
                    ,d.getNoHp()+""};
            t.addRow(s);
        }
    }
    
    private void addMahasiswaToTableMhs(ArrayList<Mahasiswa> data, JTable table) {
        DefaultTableModel t = (DefaultTableModel) table.getModel();

        t.setRowCount(0);
        for (Mahasiswa d : data) {
            String JK;
            if (d.IsMale()==1) {
                JK = "Laki-Laki";
            } else if (d.IsMale() == 2) {
                JK = "Perempuan";
            } else {
                JK = "unknown";
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
                    addDosenToCBox(model.loadDosen(), view.getCboxKodeDosen());
                    addDosenToCBox(model.loadDosen(), view.getCboxMhsKodeDoswal());
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
                    mhs.setNim(0);
                    mhs.setNama(view.getTfMhsNama());
                    mhs.setAlamat(view.getTfMhsAlamat());
                    mhs.setTanggalLahir(view.getDateMhsBirthday().getDate());
                    System.out.println("tanggal "+view.getDateMhsBirthday().getDate());
                    mhs.setIsMale(view.getCboxMhsJK().getSelectedIndex());
                    mhs.setTempatLahir(view.getTfMhsBirthplace());
                    mhs.setAlamat(view.getTfMhsAlamat());
                    

                    Dosen dosen = model.getDosenByKode(Integer.parseInt(view.getCboxMhsKodeDoswal().getSelectedItem().toString()));
                    System.out.println(dosen.getKode());
                    mhs.setDosenWali(dosen);
                    
                    
                     
                    if (model.addMahasiswa(mhs)) {
                        view.showMessage("Mahasiswa berhasil ditambahkan! ");
                        addMahasiswaToTableMhs(model.loadMahasiswa(), view.getTblMahasiswa());
                        nextNIM++;
                        view.setTfMhsNIM(nextNIM+"");
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
        cb.addItem("--Pilih dosen wali--");
        for (Dosen dosen : data) {
            cb.addItem(dosen.getKode());
        }
    }
    
    
    
}
