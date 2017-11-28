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

    public ContrMahasiswa1() {
        
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
        this.view = new VMahasiswa();
        view.setVisible(true);
        view.addListener(this);
        
        view.getTblTingkat1().removeAll();
        addMatkulToTableMatkul(model.loadMatkulTingkat(1), view.getTblTingkat1());
        addMatkulToTableMatkul(model.loadMatkulTingkat(2), view.getTblTingkat2());
        addMatkulToTableMatkul(model.loadMatkulTingkat(3), view.getTblTingkat3());
        addMatkulToTableMatkul(model.loadMatkulTingkat(4), view.getTblTingkat4());
        
        
        
    }
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
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
            System.out.println(s[0]);
            t.addRow(s);
        }
    }
    
    private void refreshAllTableMatkul(){
        addMatkulToTableMatkul(model.loadDaftarMatkulAllTingkattttt().get(0), view.getTblTingkat1());
        addMatkulToTableMatkul(model.loadDaftarMatkulAllTingkattttt().get(1), view.getTblTingkat2());
        addMatkulToTableMatkul(model.loadDaftarMatkulAllTingkattttt().get(2), view.getTblTingkat3());
        addMatkulToTableMatkul(model.loadDaftarMatkulAllTingkattttt().get(3), view.getTblTingkat4());
    }
        
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
