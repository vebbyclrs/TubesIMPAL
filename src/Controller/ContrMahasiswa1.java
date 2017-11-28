/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import Model.MataKuliah;
import View.VMahasiswa;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ENDRIAWAN
 */
public class ContrMahasiswa1 implements ActionListener, KeyListener, ListSelectionListener {

    Aplikasi model;
    VMahasiswa view;

    public ContrMahasiswa1(Mahasiswa m) {
        
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
        
        this.model = new Aplikasi();
        this.view = new VMahasiswa();
        view.setVisible(true);
        view.addListener(this);
        
        view.getTblTingkat1().removeAll();
        
        showProfileTab(m);
        
        addJadwalToTableMatkul(model.loadJadwalTingkat(1), view.getTblTingkat1());
        addJadwalToTableMatkul(model.loadJadwalTingkat(2), view.getTblTingkat2());
        addJadwalToTableMatkul(model.loadJadwalTingkat(3), view.getTblTingkat3());
        addJadwalToTableMatkul(model.loadJadwalTingkat(4), view.getTblTingkat4());
      
    }
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src.equals(view.getBtnAddT1())) {
            if (view.getTblTingkat1().getSelectedRow() == -1) {
                view.showMessage("Tidak ada jadwal yang dipilih");
            } else {
                Jadwal j = model.getJadwalById(Integer.parseInt(view.getTblTingkat1().getValueAt(view.getTblTingkat1().getSelectedRow(), 0)+""));
                /**
                 * belom kelar
                 */
            }
            
        }
        else if (src.equals(view.getBtnLogout())) {
            view.setVisible(false);
            ContrLoginMahasiswa clogin= new ContrLoginMahasiswa();
        }
        
    }

    public void showProfileTab(Mahasiswa mhs){
        view.setTxtName(mhs.getNama());
        view.setTxtNIM(Long.toString(mhs.getNim()));
        view.setTxtTptLahir(mhs.getTempatLahir());
        view.setTxtTglLahir(mhs.getTanggalLahir().toString());
        view.setTxtNoHp(Long.toString(mhs.getNoHp()));
        view.setTxtEmail(mhs.getUsername());
        if (mhs.IsMale() == 1) {
            view.getTfJK().setText("Laki-Laki");
        }else {
            view.getTfJK().setText("Perempuan");
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
    }

    private void addJadwalToTableMatkul(ArrayList<Jadwal> data, JTable table) {
        DefaultTableModel t = (DefaultTableModel) table.getModel();

        t.setRowCount(0);
        
        for (Jadwal j : data) {
            System.out.println(j.getMatkul().getKodeMk());
            String[] s = {
                j.getIdJadwal()+"",
                j.getHari()+" "+j.getPukul(),
                j.getMatkul().getKodeMk()+"",
                j.getMatkul().getNamaMk(),
                j.getMatkul().getDosen().getNama() +" ("+ j.getMatkul().getDosen().getKode()+")"};
            t.addRow(s);   
            System.out.println(s[2]);
        }
    }
    
//    private void refreshAllTableMatkul(){
//        addMatkulToTableMatkul(model.loadDaftarMatkulAllTingkattttt().get(0), view.getTblTingkat1());
//        addMatkulToTableMatkul(model.loadDaftarMatkulAllTingkattttt().get(1), view.getTblTingkat2());
//        addMatkulToTableMatkul(model.loadDaftarMatkulAllTingkattttt().get(2), view.getTblTingkat3());
//        addMatkulToTableMatkul(model.loadDaftarMatkulAllTingkattttt().get(3), view.getTblTingkat4());
//    }
        
//       //tabeltingkat.removeAll();
////list.removeAll() 
//        try {
//            
//       String[] columnNames = {"Shift",
//                        "Ruangan",
//                        "Kode Mata Kuliah",
//                        "Nama Mata Kuliah",
//                        "Kelas"}; 
//       Object[][] data = new Object [arrMK.size()][5];
//       int i = 0;
//        for (MataKuliah matkul : arrMK) {
//            String[] arrData = {matkul.getNamaMk(),
//                Integer.toString(matkul.getKodeMk()),
//               // matkul.getDosen().getNama(),
//                Integer.toString(matkul.getSKS()),
//                matkul.getNamaMk()};
//                data[i] = arrData;
//            }
//        DefaultTableModel tabel = new DefaultTableModel(data, columnNames);
//        tabeltingkat.setModel(tabel);
//
//            
//           // tabeltingkat.setModel(model);
//          //  dataList[i] = matkul.getKodeMk() + ":" + matkul.getNamaMk() + " (" + matkul.getSKS() + ")";
//          //  list.setListData(dataList);

//        } catch (Exception e) {
//            JOptionPane.showMessageDialog( null,"Belum terdapat mata kuliah pada DB","Null database", 1);
//        }
}
