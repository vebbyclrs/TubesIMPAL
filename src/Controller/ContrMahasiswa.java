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
import javax.swing.JOptionPane;
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
    ArrayList<Jadwal> daftarJadwal = new ArrayList<Jadwal>();
    DefaultListModel mdl = new DefaultListModel();

    public ContrMahasiswa() {
        
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
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
        view = new VMahasiswa();
        view.setVisible(true);
        view.addListener(this);
        
        view.getTblTingkat1().removeAll();
        showListTingkat();
          
        
        /*Tab Cetak KSM*/
//        view.setTxtCKNama(mhs.getNama());
//        view.setTxtCKNim(Long.toString(mhs.getNim()));
       // view.setTxtCKDoswal(mhs.getDosenWali().getNama());
        //view.setTxtCKStatusReg();
        
        /*Tab Profil*/
//        view.setTxtName(mhs.getNama());
//        view.setTxtNIM(Long.toString(mhs.getNim()));
//        view.setTxtTptLahir(mhs.getTempatLahir());
//        view.setTxtTglLahir(mhs.getTanggalLahir().toString());
//        view.setTxtNoHp(Long.toString(mhs.getNoHp()));
//        view.setTxtEmail(mhs.getEmail());
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnAddT1())) {
            String kodeMK = view.getTblTingkat1().getValueAt(view.getTblTingkat1().getSelectedRow(), 2).toString();      
            JumlahSks +=getJumlahSKS(kodeMK);
            String namaMK = view.getTblTingkat1().getValueAt(view.getTblTingkat1().getSelectedRow(), 3).toString();
            String shift = view.getTblTingkat1().getValueAt(view.getTblTingkat1().getSelectedRow(), 0).toString();           
            int sks = getJumlahSKS(kodeMK);           
             addList(namaMK+"("+shift+")" + " :" +sks +" sks , kode : "+kodeMK );
             System.out.println(model.getJadwal(1).getMatkul().getNamaMk());
            daftarJadwal.add(model.getJadwal(Integer.parseInt(kodeMK)));
             //System.out.println(daftarJadwal.get(1));
         //   System.out.println(view.getListTingkat1().getSelectedIndex());
          //  showListRegistrasi(daftarRegMatkul, view.getListRegMatkulPilihan());
        } else if (source.equals(view.getBtnAddT2())) {
          String kodeMK = view.getTblTingkat2().getValueAt(view.getTblTingkat2().getSelectedRow(), 2).toString();      
            JumlahSks +=getJumlahSKS(kodeMK);
            String namaMK = view.getTblTingkat2().getValueAt(view.getTblTingkat1().getSelectedRow(), 3).toString();
            String shift = view.getTblTingkat2().getValueAt(view.getTblTingkat1().getSelectedRow(), 0).toString();           
            int sks = getJumlahSKS(kodeMK);           
             addList(namaMK+"("+shift+")" + " :" +sks +" sks , kode : "+kodeMK );
             System.out.println(model.getJadwal(2).getMatkul().getNamaMk());
             daftarJadwal.add(model.getJadwal(Integer.parseInt(kodeMK)));  System.out.println("2");
             
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
           
           int index = view.getListRegMatkulPilihan().getSelectedIndex();
           this.JumlahSks -= daftarJadwal.get(index).getMatkul().getSKS();
           mdl.remove(view.getListRegMatkulPilihan().getSelectedIndex());
           
           
            view.getListRegMatkulPilihan().setModel(mdl);
            view.getListAccMatkulPilihan().setModel(mdl); 
            removeDaftarJadwal(index);
            
            //System.out.println(daftarJadwal.size());
            
        }else if (source.equals(view.getBtnRequestACC())){
            System.out.println("acc");
            model.saveJadwalTaken(daftarJadwal, 123);
        }
        else if (e.getSource().equals(view.getBtnLogout())) {
            view.setVisible(false);
            ContrLoginMahasiswa login = new ContrLoginMahasiswa();
        }
        view.setTxtTotSKS(Integer.toString(JumlahSks));
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
        try {
            
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
                Integer.toString(matkul.getKodeMk()),
                matkul.getNamaMk()};
                data[i] = arrData;
            }
        DefaultTableModel tabel = new DefaultTableModel(data, columnNames);
        tabeltingkat.setModel(tabel);

            
           // tabeltingkat.setModel(model);
          //  dataList[i] = matkul.getKodeMk() + ":" + matkul.getNamaMk() + " (" + matkul.getSKS() + ")";
          //  list.setListData(dataList);

        } catch (Exception e) {
            JOptionPane.showMessageDialog( null,"Belum terdapat mata kuliah pada DB","Null database", 1);
        }
        }
       
    public void addList(String s){
        mdl.addElement(s);
        view.getListAccMatkulPilihan().setModel(mdl);
        view.getListRegMatkulPilihan().setModel(mdl);
}
    public int getJumlahSKS(Object o){
        int jmlh;
        jmlh = model.getSksFromIdMatkul(o);
        
        return jmlh;
    } 
    void removeDaftarJadwal(int index){
        System.out.println(daftarJadwal.get(index).getMatkul().getNamaMk());
        daftarJadwal.remove(index);
        System.out.println(daftarJadwal.size());
    }
    
 public void showListTingkat() {
       ArrayList<Jadwal> daftarJadwalFull = new ArrayList<>();
       daftarJadwalFull = model.loadJadwal();
        try {
            
       String[] columnNames = {"Hari",
                        "Pukul",
                        "Kode Mata Kuliah",
                        "Nama Mata Kuliah"
                        }; 
       
       
       int intTingkat1 = 0;
       int intTingkat2 = 0;
       int intTingkat3 = 0;
       int intTingkat4 = 0;
       
       int counter1 = 0;
       int counter2 = 0;
       int counter3 = 0;
       int counter4 = 0;
            for (Jadwal jadwal : daftarJadwalFull) {
                if(jadwal.getMatkul().getTingkat()==1){
                    counter1++;
                }else if (jadwal.getMatkul().getTingkat()==2){
                    counter2++;
                }else if (jadwal.getMatkul().getTingkat()==3){
                    counter3++;
                }else if (jadwal.getMatkul().getTingkat()==4){
                    counter4++;
                }
                
            }
                    
       Object[][] data1 = new Object [counter1][4];
       Object[][] data2 = new Object [counter2][4];
       Object[][] data3 = new Object [counter3][4];
       Object[][] data4 = new Object [counter4][4];
       
        for (Jadwal jadwal : daftarJadwalFull) {
                if(jadwal.getMatkul().getTingkat()==1){
                    String[] arrData = {jadwal.getHari(),
                    jadwal.getPukul().toString(),
                    Integer.toString(jadwal.getMatkul().getKodeMk()),
                    jadwal.getMatkul().getNamaMk(),};
                    data1[intTingkat1] = arrData;
                    intTingkat1++;
                }else if (jadwal.getMatkul().getTingkat()==2){
                    String[] arrData = {jadwal.getHari(),
                    jadwal.getPukul().toString(),
                    Integer.toString(jadwal.getMatkul().getKodeMk()),
                    jadwal.getMatkul().getNamaMk(),};
                    data2[intTingkat2] = arrData;
                    intTingkat2++;
                }else if (jadwal.getMatkul().getTingkat()==3){
                    String[] arrData = {jadwal.getHari(),
                    jadwal.getPukul().toString(),
                    Integer.toString(jadwal.getMatkul().getKodeMk()),
                    jadwal.getMatkul().getNamaMk(),};
                    data3[intTingkat3] = arrData;
                    intTingkat3++;
                }else if (jadwal.getMatkul().getTingkat()==4){
                    String[] arrData = {jadwal.getHari(),
                    jadwal.getPukul().toString(),
                    Integer.toString(jadwal.getMatkul().getKodeMk()),
                    jadwal.getMatkul().getNamaMk(),};
                    data4[intTingkat4] = arrData;
                    intTingkat4++;
                }
            }
        DefaultTableModel tabel1 = new DefaultTableModel(data1, columnNames);
        DefaultTableModel tabel2 = new DefaultTableModel(data2, columnNames);
        DefaultTableModel tabel3 = new DefaultTableModel(data3, columnNames);
        DefaultTableModel tabel4 = new DefaultTableModel(data4, columnNames);
        view.getTblTingkat1().setModel(tabel1);
        view.getTblTingkat2().setModel(tabel2);
        view.getTblTingkat3().setModel(tabel3);
        view.getTblTingkat4().setModel(tabel4);

            
           // tabeltingkat.setModel(model);
          //  dataList[i] = matkul.getKodeMk() + ":" + matkul.getNamaMk() + " (" + matkul.getSKS() + ")";
          //  list.setListData(dataList);

        } catch (Exception e) {
            JOptionPane.showMessageDialog( null,"Belum terdapat mata kuliah pada DB","Null database", 1);
        }
        }
}
