/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author vebbyclrs
 */
public class Aplikasi {

    ArrayList<Mahasiswa> daftarMahasiswa;
    ArrayList<Dosen> daftarDosen;
    ArrayList<MataKuliah> daftarMatkul;
    ArrayList<Jadwal> daftarJadwal;
    DatabaseConnection db;
    
    
    public Aplikasi() {
        db = new DatabaseConnection();
        //load semua array
    }
    public ArrayList<Mahasiswa> loadMahasiswa() {
        daftarMahasiswa = new ArrayList<Mahasiswa>();
        db.connect();
        
        String query = "select NIM,ID_DOSEN,NAMA,IS_MALE,TANGGAL_LAHIR,TEMPAT_LAHIR,ALAMAT,NO_HP,ANGKATAN,STATUS_PEMBAYARAN,TOTAL_SKS from mahasiswa";
        ResultSet rs = db.getData(query);
        try {
            while (rs.next()) {
                //getgetgetget
                
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load penyedia");
        }
        db.disconnect();
        return daftarMahasiswa;
    }
    
    public boolean addDosen(Dosen d){
        //on working-VEB
        db.connect();
        boolean berhasil = db.
//        db.disconnect();
        return berhasil;
    }
            
    
    public Mahasiswa getMahasiswaByEmail(String email) {
        Mahasiswa ret;
        db.connect();
        if (! daftarMahasiswa.isEmpty()) {
            for (Mahasiswa mahasiswa : daftarMahasiswa) {
                if (email.equals(mahasiswa.getEmail())) {
                    return mahasiswa;
                }
            }            
        }
        db.disconnect();
        return null;
    }
//    public Dosen getDosenByEmail(String email) {
//        Dosen ret;
//        
//    }
    
}
