/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.VAdmin;

/**
 *
 * @author VebbyClrs
 */
public class Cek {
    private  VAdmin viAdmin = new VAdmin();
    
    public boolean vAdmin_Mahasiswa() {
        /**
         * mereturn nilai true jika terdapat field kosong di subtab Mahasiswa
         */
        boolean full = false;
        if ((viAdmin.getTfMhsNama().equals(""))||
                viAdmin.getTfMhsAlamat().equals("") ||
                viAdmin.getTfMhsBirthplace().equals("")||
                viAdmin.getCboxMhsKodeDoswal().getSelectedIndex() == 0 ||
                viAdmin.getCboxMhsJK().getSelectedIndex() == 0) {
            full = true;
        }
        return full;
    }
    public boolean vAdmin_Dosen() {
        /**
         * mereturn nilai true jika terdapat field kosong di subtab Dosen
         */
        boolean full = false;
        if ((viAdmin.getTfDsnKode().equals(""))||
                viAdmin.getTfDsnNama().equals("") ||
                viAdmin.getTfDsnBirthplace().equals("") ||
                viAdmin.getTfDsnAlamat().equals("")||
                viAdmin.getTfDsnNoHp().equals("")||
                viAdmin.getCboxDsnJK().getSelectedIndex() == 0) {
            full = true;
        }
        return full;
    }
    public boolean vAdmin_MataKuliah() {
        /**
         * mereturn nilai true jika terdapat field kosong di subtab Dosen
         */
        boolean full = false;
        if ((viAdmin.getTfMatkulKode().equals(""))||
                viAdmin.getTfMatkulNama().equals("") ||
                viAdmin.getCboxMatkulSKS().getSelectedIndex() == 0 ||
                viAdmin.getCboxMatkulKodeDosen().getSelectedIndex() == 0 ||
                viAdmin.getCboxMatkulTingkat().getSelectedIndex() == 0) {
            full = true;
        }
        return full;
    }
}
