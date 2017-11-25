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
    ArrayList<Admin> daftarAdmin;
    DatabaseConnection db;
    
    
    public Aplikasi() {
        db = new DatabaseConnection();
        daftarAdmin = loadAdmin();
        daftarDosen = loadDosen();
        
        //load semua array
    }
    public ArrayList<Mahasiswa> loadMahasiswa() {
        daftarMahasiswa = new ArrayList<Mahasiswa>();
        db.connect();
        
        String query = "select NIM,ID_DOSEN,NAMA,"
                + "IS_MALE,TANGGAL_LAHIR,TEMPAT_LAHIR,"
                + "ALAMAT,NO_HP,ANGKATAN,"
                + "STATUS_PEMBAYARAN,TOTAL_SKS "
                + "from mahasiswa";
        ResultSet rs = db.getData(query);
        try {
            while (rs.next()) {
                boolean jk = false;
                if (rs.getString("IS_MALE").equals("1")) {
                    jk = true;
                }
//                (long nim, String nama, boolean isMale, 
//            Date tanggalLahir, String tempatLahir, String alamat, 
//            long noHp, int angkatan, boolean statusPembayaran,
//            int totalSKS,  int dosenWali, String email, 
//            String password) {
                Mahasiswa m = new Mahasiswa(rs.getLong("NIM"), rs.getString("NAMA"), rs.getBoolean("IS_MALE"),
                        rs.getDate("TANGGAL_LAHIR"), rs.getString("TEMPAT_LAHIR"), rs.getString("alamat"),
                        rs.getLong("NO_HP"), rs.getInt("ANGKATAN"), rs.getBoolean("STATUS_PEMBAYARAN"),
                        rs.getInt("TOTAL_sKS"), rs.getInt("ID_DOSEN"), rs.getString("EMAIL"), rs.getString("password"));
                /**
                 * 
                 * EMAIL SAMA PASSWORD BUAT MAHASISWA BLM ADA DI TABEL DATABASE
                 *                
                */
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load penyedia");
        }
        db.disconnect();
        return daftarMahasiswa;
    }
    public  ArrayList<Admin> loadAdmin() {
        db.connect();
        daftarAdmin = new ArrayList<>();
        ResultSet rs = db.getData("select ID,NAMA,USERNAME,PASSWORD from ADMIN");
        try {
            while (rs.next()){
                Admin adm = new Admin(rs.getString("ID"),
                        rs.getString("NAMA"),
                        rs.getString("USERNAME"),
                        rs.getString("PASSWORD"));
                daftarAdmin.add(adm);
            }
        } catch (Exception e) {
        }
        
        db.disconnect();
        return daftarAdmin;
    }
    
    public  ArrayList<Dosen> loadDosen() {
        db.connect();
        daftarDosen = new ArrayList<>();
        ResultSet rs = db.getData("select ID_DOSEN,NAMA,TANGGAL_LAHIR,TEMPAT_LAHIR,ALAMAT,ISMALE,NO_HP from DOSEN");
        try {
            while (rs.next()){
//                java.util.Date date = new java.util.Date();
                Dosen d = new Dosen(rs.getInt("ID_DOSEN"),
                        rs.getString("NAMA"),
                        rs.getTimestamp("TANGGAL_LAHIR"),
                        rs.getString("TEMPAT_LAHIR"),
                        rs.getString("ALAMAT"),
                        rs.getInt("ISMALE"),
                        rs.getLong("NO_HP"));
                daftarDosen.add(d);
            }
        } catch (Exception e) {
        }
        db.disconnect();
        return daftarDosen;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Dosen getDosenByKode(int kodeDosen) {
        Dosen d = null;
        for (Dosen dosen : daftarDosen) {
            if (dosen.getKode() == kodeDosen) {
                d = dosen;
                break;
            }
        }
        return d;
        
    }
    
    public boolean addDosen(Dosen d){
        //on working-VEB
        db.connect();
        boolean berhasil = db.saveDosen(d);
        daftarDosen.add(d);
        db.disconnect();
        return berhasil;
    }
    
    public boolean addMatkul(MataKuliah matkul) {
        boolean berhasil = false;
        try {
            db.connect();
            berhasil = db.saveMatkul(matkul);
            daftarMatkul.add(matkul);
            db.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return berhasil;
        
    }
    public boolean addMahasiswa (Mahasiswa m) {
          boolean berhasil = false;
          try {
            db.connect();
            berhasil = db.saveMahasiswa(m);
            daftarMahasiswa.add(m);
            db.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
          
          
          
          return berhasil;
      }    
    public Admin getAdminByUsername(String username) {
        db.connect();
        for (Admin adm : daftarAdmin) {
            if (username.equals(adm.getUsername())) {
                return adm;
            }
        }
        db.disconnect();
        return null;
        
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
      public ArrayList<MataKuliah> loadMataKuliah(int tingkat) {
        daftarMatkul = new ArrayList<MataKuliah>();
        db.connect();
        
        String query = "select ID_MATKUL,ID_DOSEN,NAMA_MATKUL,SKS,Tingkat from mata_kuliah where tingkat ="+tingkat+";";
        ResultSet rs = db.getData(query);
        try {
            while (rs.next()) {
                MataKuliah matkul = new MataKuliah(rs.getInt("ID_MATKUL"),rs.getString("NAMA_MATKUL"),
                        rs.getInt("SKS"));
                daftarMatkul.add(matkul);

            }
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan   load MataKuliah");
        }
        db.disconnect();
        return daftarMatkul;
    }
      
      
//    public Dosen getDosenByEmail(String email) {
//        Dosen ret;
//        
//    }
}
