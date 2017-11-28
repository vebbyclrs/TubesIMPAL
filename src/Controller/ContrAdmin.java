/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.VAdmin;
import View.VLoginAdmin;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Time;
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
    private ContrLoginAdmin vlogin;
    private Cek cek = new Cek();
    
    
    public ContrAdmin() {
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
        this.view = new VAdmin();
        this.model = new Aplikasi();
//        nextNIM = model.loadMahasiswa().get(model.loadMahasiswa().size()).getNim()+1;
        view.setVisible(true);
        view.setActionListener(this);
        view.setTfMhsNIM(model.nextNIM+"");
        view.setJadTfIdJadwal(model.nextIDJad+"");
        
        addDosenToTableDosen(model.loadDosen(), view.getTblDosen());
        addDosenToCBox(model.loadDosen(), view.getCboxMatkulKodeDosen());
        addDosenToCBox(model.loadDosen(), view.getCboxMhsKodeDoswal());
        addMahasiswaToTableMhs(model.loadMahasiswa(), view.getTblMahasiswa());
        addMatkulToTableMatkul(model.loadMatkul(), view.getTblMatkul());
        addMatkulToTableMatkul(model.loadMatkul(), view.getTblJadwalMatkul());
        
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
    private  void addDosenToCBox(ArrayList<Dosen> data, JComboBox cb)/*DONE*/{
        cb.removeAllItems();
        cb.addItem("--Pilih dosen--");
        for (Dosen dosen : data) {
            cb.addItem(dosen.getKode());
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
    private void addMatkulToTableMatkul(ArrayList<MataKuliah> data, JTable table) {
        DefaultTableModel t = (DefaultTableModel) table.getModel();

        t.setRowCount(0);
        for (MataKuliah m : data) {
            String[] s = {""+m.getKodeMk()
                    , m.getNamaMk()
                    , m.getSKS()+""
                    , m.getDosen().getKode()+""
                    ,m.getTingkat()+""
            };
            t.addRow(s);
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        if (src.equals(view.getBtnDsnAdd())) {
            try {
                if (cek.vAdmin_Dosen(view)) {
                   Dosen d = new Dosen();
                    d.setNama(view.getTfDsnNama());
                    d.setKode(Integer.parseInt(view.getTfDsnKode()));
                    d.setTglLahir(view.getDateDsnBirthday().getDate());
                    d.setTempatLahir(view.getTfDsnBirthplace());
                    d.setIsMale(view.getCboxDsnJK().getSelectedIndex());
                    d.setAlamat(view.getTfDsnAlamat());
                    d.setNoHp(Long.parseLong(view.getTfDsnNoHp()));
                    d.setUsername(view.getTfDsnUsername());
                    d.setPassword(view.getTfDsnPassword());
                    
                    if (model.addDosen(d)) {
                        view.showMessage("Berhasil ditambahkan");
                        addDosenToTableDosen(model.loadDosen(), view.getTblDosen());
                        addDosenToCBox(model.loadDosen(), view.getCboxMatkulKodeDosen());
                        addDosenToCBox(model.loadDosen(), view.getCboxMhsKodeDoswal());
                        view.reset();
                    } else {
                        JOptionPane.showMessageDialog(view, "gagal ditambahkan");
                    } 
                } else {
                    view.showMessageFieldKosong();
                }

                
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(view, ae.getLocalizedMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                ae.printStackTrace();
            }
        }
        else if (src.equals(view.getBtnAddMatkul())) {
            try {
                if ( cek.vAdmin_MataKuliah(view)) {
                    Dosen d = model.getDosenByKode(Integer.parseInt(view.getCboxMatkulKodeDosen().getSelectedItem()+"")); //Diragukan
                    System.out.println(d.getNama());
                    MataKuliah matkul  = new MataKuliah(
                            Integer.parseInt(view.getTfMatkulKode()), 
                            view.getTfMatkulNama(), 
                            view.getCboxMatkulSKS().getSelectedIndex(),
                            view.getCboxMatkulTingkat().getSelectedIndex());
                    matkul.setDosen(d);
                    
                    if (model.addMatkul(matkul)) {
                        view.showMessage("Berhasil ditambahkan");
                        addMatkulToTableMatkul(model.loadMatkul(), view.getTblMatkul());
                        addMatkulToTableMatkul(model.loadMatkul(), view.getTblJadwalMatkul());
//                        throw new IllegalArgumentException("Belum!");
                        view.reset();

                    } else {
                        view.showMessage("Gagal menyimpan mata kuliah");
                    }
                } else {
                    view.showMessageFieldKosong();
                }
                
            }catch (Exception ae) {
                JOptionPane.showMessageDialog(view, ae.getLocalizedMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                ae.printStackTrace();
            }
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        else if (src.equals(view.getBtnMhsAdd())) {
            try {
                if (cek.vAdmin_Mahasiswa(view)) {
                    view.showMessageFieldKosong();
                } else {

                    Mahasiswa mhs = new Mahasiswa();
                    mhs.setNim(0);
                    mhs.setNama(view.getTfMhsNama());
                    mhs.setAlamat(view.getTfMhsAlamat());
                    mhs.setTanggalLahir(view.getDateMhsBirthday().getDate());
                    System.out.println("tanggal "+view.getDateMhsBirthday().getDate());
                    mhs.setIsMale(view.getCboxMhsJK().getSelectedIndex());
                    mhs.setTempatLahir(view.getTfMhsBirthplace());
                    mhs.setAlamat(view.getTfMhsAlamat());
                    mhs.setPassword(view.getTfMhsPassword());
                    mhs.setUsername(view.getTfMhsUsername());
                    
                    Dosen dosen = model.getDosenByKode(Integer.parseInt(view.getCboxMhsKodeDoswal().getSelectedItem().toString()));
                    System.out.println(dosen.getKode());
                    mhs.setDosenWali(dosen);
                    
                    if (model.addMahasiswa(mhs)) {
                        view.showMessage("Mahasiswa berhasil ditambahkan! ");
                        addMahasiswaToTableMhs(model.loadMahasiswa(), view.getTblMahasiswa());
                        view.setTfMhsNIM(model.nextNIM+"");
                        view.reset();
                    } else {
                        JOptionPane.showMessageDialog(view, "Gagal menambahkan mahasiswa", "Kesalahan saat menambahkan", 0);
                    }
                }
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(view, ae.getLocalizedMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                ae.printStackTrace();
            }
        } else if (src.equals(view.getJadBtnAdd())) {
            int selectedRow = view.getJadTblMatkul().getSelectedRow();
//            int selectedColumn = view.getJadTblMatkul().getSelectedColumn();
            System.out.println("Selected Row = "+selectedRow);
            if (selectedRow == -1) {
                view.showMessage("Tidak ada matakuliah yang dipilih");
            } else {
                try {
                    MataKuliah m = new MataKuliah(
                            Integer.parseInt(view.getJadTblMatkul().getValueAt(selectedRow, 0)+""),
                            view.getJadTblMatkul().getValueAt(selectedRow, 1)+"",
                            Integer.parseInt(view.getJadTblMatkul().getValueAt(selectedRow, 2)+""),
                            Integer.parseInt(view.getJadTblMatkul().getValueAt(selectedRow, 4)+"")
                    );
                    Dosen d = model.getDosenByKode(Integer.parseInt(view.getJadTblMatkul().getValueAt(selectedRow, 3)+""));
                    m.setDosen(d);
                    
                    Time t = new Time(Integer.parseInt(view.getJadCbJam().getSelectedItem()+""),
                            Integer.parseInt(view.getJadCbMenit().getSelectedItem()+""),
                            0);
                    System.out.println("Time: "+t.getTime());
   
                    Jadwal j =new Jadwal(
                            0,
                            m,
                            t,
                            view.getJadCbHari().getSelectedItem()+"");
                    
                    if (model.addJadwal(j)) {
                        view.showMessage("Jadwal berhasil ditambahkan");
                        addJadwalToTableJadwal(model.loadJadwal(), view.getJadTblJadwal());
                        view.setJadTfIdJadwal(model.nextIDJad+"");
                        view.reset();
                    }
                } catch (Exception ae) {
                    ae.printStackTrace();
                    JOptionPane.showMessageDialog(view, ae.getLocalizedMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource().equals(view.getBtnLogout())) {
            view.setVisible(false);
            vlogin = new ContrLoginAdmin();
            
        }
        
    }
    
    private  void addJadwalToTableJadwal (ArrayList<Jadwal> listJadwal, JTable table) {
        DefaultTableModel t = (DefaultTableModel) table.getModel();

        t.setRowCount(0);
        for (Jadwal j : listJadwal) {
            String[] s = {
                j.getIdJadwal()+"",
                j.getMatkul().getKodeMk()+"",
                j.getHari(),
                j.getPukul().toString()                
            };
            t.addRow(s);
        }
    }
    
    
    
}
