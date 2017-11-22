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
import java.awt.List;
import java.awt.TextArea;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ENDRIAWAN
 */
public class ContrMahasiswa implements ActionListener, KeyListener, ListSelectionListener {

    Aplikasi model;
    VMahasiswa view;
    int JumlahSks = 0;
    ArrayList<MataKuliah> daftarRegMatkul;
    DefaultListModel mdl = new DefaultListModel();

    public ContrMahasiswa(Mahasiswa mhs) {
        this.model = new Aplikasi();
        view = new VMahasiswa();
        view.setVisible(true);
        view.addListener(this);
        
        view.getTblTingkat1().removeAll();
        showListTingkat(model.loadMataKuliah(1),view.getTblTingkat1());
        showListTingkat(model.loadMataKuliah(2), view.getTblTingkat2());
        showListTingkat(model.loadMataKuliah(3), view.getTblTingkat3());
        showListTingkat(model.loadMataKuliah(4), view.getTblTingkat4());    
        
        /*Tab Cetak KSM*/
        view.setTxtCKNama(mhs.getNama());
        view.setTxtCKNim(Long.toString(mhs.getNim()));
       // view.setTxtCKDoswal(mhs.getDosenWali().getNama());
        //view.setTxtCKStatusReg();
        
        /*Tab Profil*/
        view.setTxtName(mhs.getNama());
        view.setTxtNIM(Long.toString(mhs.getNim()));
        view.setTxtTptLahir(mhs.getTempatLahir());
        view.setTxtTglLahir(mhs.getTanggalLahir().toString());
        view.setTxtNoHp(Long.toString(mhs.getNoHp()));
        view.setTxtEmail(mhs.getEmail());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnAddT1())) {
            String temp = view.getTblTingkat1().getValueAt(view.getTblTingkat1().getSelectedRow(), 0).toString();
            //System.out.println(view.getTblTingkat2().getValueAt(view.getTblTingkat1().getSelectedRow(), 2));
          //  JumlahSks +=Integer.parseInt(temp.substring((temp.length()-2),(temp.length()-1)));
             mdl.addElement(view.getTblTingkat1().getValueAt(view.getTblTingkat1().getSelectedRow(), 0).toString());
            view.getListRegMatkulPilihan().setModel(mdl);
            view.getListAccMatkulPilihan().setModel(mdl);
         //   System.out.println(view.getListTingkat1().getSelectedIndex());
          //  showListRegistrasi(daftarRegMatkul, view.getListRegMatkulPilihan());
        } else if (source.equals(view.getBtnAddT2())) {
            System.out.println("2");
           // String temp = view.getListTingkat2().getSelectedValue().toString();
            //this.JumlahSks += Integer.parseInt(temp.substring((temp.length()-2),(temp.length()-1)));
            //mdl.addElement(view.getListTingkat2().getSelectedValue().toString());
           // view.getListRegMatkulPilihan().setModel(mdl);
           // view.getListAccMatkulPilihan().setModel(mdl);
           // System.out.println(view.getListTingkat1().getSelectedIndex());
          //  showListRegistrasi(daftarRegMatkul, view.getListRegMatkulPilihan());
        } else if (source.equals(view.getBtnAddT3())){          
        //    String temp = view.getListTingkat3().getSelectedValue().toString();
         //   this.JumlahSks += Integer.parseInt(temp.substring((temp.length()-2),(temp.length()-1)));
          //  mdl.addElement(view.getListTingkat3().getSelectedValue().toString());
           // view.getListRegMatkulPilihan().setModel(mdl);
           // view.getListAccMatkulPilihan().setModel(mdl);
           // showListRegistrasi(daftarRegMatkul, view.getListRegMatkulPilihan());
        } else if(source.equals(view.getBtnAddT4())){
           // String temp = view.getListTingkat4().getSelectedValue().toString();
           // this.JumlahSks += Integer.parseInt(temp.substring((temp.length()-2),(temp.length()-1)));
           // DefaultListModel mdl = new DefaultListModel();
           // mdl.addElement(view.getListTingkat4().getSelectedValue().toString());
           // view.getListRegMatkulPilihan().setModel(mdl);
            //view.getListAccMatkulPilihan().setModel(mdl);
            //showListRegistrasi(daftarRegMatkul, view.getListRegMatkulPilihan());
        } else if(source.equals(view.getBtnRemove())){
            String temp = view.getListRegMatkulPilihan().getSelectedValue().toString();
           // this.JumlahSks -= Integer.parseInt(temp.substring((temp.length()-2),(temp.length()-1)));
            mdl.remove(view.getListRegMatkulPilihan().getSelectedIndex());
            view.getListRegMatkulPilihan().setModel(mdl);
            view.getListAccMatkulPilihan().setModel(mdl);
         
        }
//        view.setTxtTotSKS(Integer.toString(JumlahSks));
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showListTingkat(ArrayList<MataKuliah> arrMK,JTable tabeltingkat) {
       //tabeltingkat.removeAll();
//list.removeAll()       
       String[] columnNames = {"Shift",
                        "Ruangan",
                        "Kode Mata Kuliah",
                        "Nama Mata Kuliah",
                        "Kelas"}; 
       Object[][] data = new Object [arrMK.size()][5];
       int i = 0;
        for (MataKuliah matkul : arrMK) {
            String[] arrData = {matkul.getNamaMk(),
                Integer.toString(matkul.getKodeMk()),
               // matkul.getDosen().getNama(),
                Integer.toString(matkul.getSKS()),
                matkul.getNamaMk()};
                data[i] = arrData;
            }
        DefaultTableModel tabel = new DefaultTableModel(data, columnNames);
        tabeltingkat.setModel(tabel);

            
           // tabeltingkat.setModel(model);
          //  dataList[i] = matkul.getKodeMk() + ":" + matkul.getNamaMk() + " (" + matkul.getSKS() + ")";
          //  list.setListData(dataList);

        }
       
    
    
    public void showMahasiswa(){
         //bingung
         
    }
}
