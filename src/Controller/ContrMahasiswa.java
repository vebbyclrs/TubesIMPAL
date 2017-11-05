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

    public ContrMahasiswa() {
        this.model = new Aplikasi();
        view = new VMahasiswa();
        view.setVisible(true);
        view.addListener(this);
        showListTingkat(model.loadMataKuliah(1), view.getListTingkat1());
        showListTingkat(model.loadMataKuliah(2), view.getListTingkat2());
        showListTingkat(model.loadMataKuliah(3), view.getListTingkat3());
        showListTingkat(model.loadMataKuliah(4), view.getListTingkat4());
        
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnAddT1())) {
            String temp = view.getListTingkat1().getSelectedValue().toString();
            JumlahSks +=Integer.parseInt(temp.substring((temp.length()-2),(temp.length()-1)));
            mdl.addElement(view.getListTingkat1().getSelectedValue().toString());
            view.getListRegMatkulPilihan().setModel(mdl);
            view.getListAccMatkulPilihan().setModel(mdl);
            System.out.println(view.getListTingkat1().getSelectedIndex());
          //  showListRegistrasi(daftarRegMatkul, view.getListRegMatkulPilihan());
        } else if (source.equals(view.getBtnAddT2())) {
            String temp = view.getListTingkat2().getSelectedValue().toString();
            this.JumlahSks += Integer.parseInt(temp.substring((temp.length()-2),(temp.length()-1)));
            mdl.addElement(view.getListTingkat2().getSelectedValue().toString());
            view.getListRegMatkulPilihan().setModel(mdl);
            view.getListAccMatkulPilihan().setModel(mdl);
            System.out.println(view.getListTingkat1().getSelectedIndex());
          //  showListRegistrasi(daftarRegMatkul, view.getListRegMatkulPilihan());
        } else if (source.equals(view.getBtnAddT3())){          
            String temp = view.getListTingkat3().getSelectedValue().toString();
            this.JumlahSks += Integer.parseInt(temp.substring((temp.length()-2),(temp.length()-1)));
            mdl.addElement(view.getListTingkat3().getSelectedValue().toString());
            view.getListRegMatkulPilihan().setModel(mdl);
            view.getListAccMatkulPilihan().setModel(mdl);
           // showListRegistrasi(daftarRegMatkul, view.getListRegMatkulPilihan());
        } else if(source.equals(view.getBtnAddT4())){
            String temp = view.getListTingkat4().getSelectedValue().toString();
            this.JumlahSks += Integer.parseInt(temp.substring((temp.length()-2),(temp.length()-1)));
            DefaultListModel mdl = new DefaultListModel();
            mdl.addElement(view.getListTingkat4().getSelectedValue().toString());
            view.getListRegMatkulPilihan().setModel(mdl);
            view.getListAccMatkulPilihan().setModel(mdl);
            //showListRegistrasi(daftarRegMatkul, view.getListRegMatkulPilihan());
        } else if(source.equals(view.getBtnRemove())){
            String temp = view.getListRegMatkulPilihan().getSelectedValue().toString();
            this.JumlahSks -= Integer.parseInt(temp.substring((temp.length()-2),(temp.length()-1)));
            mdl.remove(view.getListRegMatkulPilihan().getSelectedIndex());
            view.getListRegMatkulPilihan().setModel(mdl);
            view.getListAccMatkulPilihan().setModel(mdl);
            
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

    public void showListTingkat(ArrayList<MataKuliah> arrMK, JList list) {
        list.removeAll();
        String[] dataList = new String[arrMK.size()];
        for (int i = 0; i < arrMK.size(); i++) {
            MataKuliah matkul = arrMK.get(i);
            dataList[i] = matkul.getKodeMk() + ":" + matkul.getNamaMk() + " (" + matkul.getSKS() + ")";
            list.setListData(dataList);
        }
       
    }
    
    public void showMahasiswa(){
         //bingung
         
    }
}
