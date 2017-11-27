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
    public static long nextNIM;
    
    
    public Aplikasi() {
        db = new DatabaseConnection();
        daftarAdmin = loadAdmin();
        daftarDosen = loadDosen();
        daftarMahasiswa = loadMahasiswa();
        daftarMatkul = loadMatkul();
        System.out.println(daftarMahasiswa.get(daftarMahasiswa.size()-1));
        
        //load semua array
    }
    public ArrayList<Mahasiswa> loadMahasiswa() /*DONE*/ {
        daftarMahasiswa = new ArrayList<Mahasiswa>();
        db.connect();
        
        String query = "select * from mahasiswa";
        ResultSet rs = db.getData(query);
        try {
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(rs.getLong("NIM"), rs.getString("NAMA"), rs.getInt("IS_MALE"),
                        rs.getTimestamp("TANGGAL_LAHIR"), rs.getString("TEMPAT_LAHIR"), rs.getString("alamat"),
                        rs.getLong("NO_HP"), rs.getInt("ANGKATAN"), rs.getInt("STATUS_PEMBAYARAN"),
                        rs.getInt("TOTAL_sKS"), rs.getInt("ID_DOSEN"), rs.getString("EMAIL"),
                        rs.getString("password"));
                daftarMahasiswa.add(m);
            }
            nextNIM = (daftarMahasiswa.get(daftarMahasiswa.size()-1).getNim())+1;
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("terjadi kesalahan saat load mahasiswa");
        }
        db.disconnect();
        return daftarMahasiswa;
    }
    public  ArrayList<Admin> loadAdmin() /*DONE*/ {
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
    
    public  ArrayList<Dosen> loadDosen() /*DONE*/ {
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
    
    public ArrayList<MataKuliah> loadMatkul() /*DONE*/ {
        db.connect();
        daftarMatkul = new ArrayList<MataKuliah>(); 
        
        String query = "select * from mata_kuliah;";
        ResultSet rs = db.getData(query);
        try {
            while (rs.next()) {                
                MataKuliah matkul = new MataKuliah(
                        rs.getInt("ID_MATKUL"), 
                        rs.getString("NAMA_MATKUL"),
                        rs.getInt("SKS"), 
                        rs.getInt("TINGKAT"));
                matkul.setDosen(getDosenByKode(rs.getInt("ID_DOSEN")));
                daftarMatkul.add(matkul);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        daftarMatkul = getMatkulFromRS(rs);
        db.disconnect();
        return daftarMatkul;
    }
    public Dosen getDosenByKode(int kodeDosen)/*DONE*/ {
        Dosen d = null;
        for (Dosen dosen : daftarDosen) {
            if (dosen.getKode() == kodeDosen) {
                d = dosen;
                break;
            }
        }
        return d;
        
    }
    
    public boolean addDosen(Dosen d) /*DONE*/{
        //on working-VEB
        db.connect();
        boolean berhasil = db.saveDosen(d);
        daftarDosen.add(d);
        db.disconnect();
        return berhasil;
    }
    
    public boolean addMatkul(MataKuliah matkul) /*DONE*/{
        boolean berhasil = false;
        try {
            db.connect();
            berhasil = db.saveMatkul(matkul);
            System.out.println("addMatkul "+berhasil);
            daftarMatkul.add(matkul);
            db.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return berhasil;
        
    }
    public boolean addMahasiswa (Mahasiswa m)/*DONE*/ {
          boolean berhasil = false;
//          try {
            db.connect();
            berhasil = db.saveMahasiswa(m);
            daftarMahasiswa.add(m);
            db.disconnect();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
          return berhasil;
      }    
    public Admin getAdminByUsername(String username)/*DONE*/ {
//        db.connect();
        for (Admin adm : daftarAdmin) {
            if (username.equals(adm.getUsername())) {
                return adm;
            }
        }
//        db.disconnect();
        return null;
        
    }
    
    public ArrayList<MataKuliah> loadMataKuliah(int tingkat) /*DONE*/ {
        daftarMatkul = new ArrayList<MataKuliah>();
        db.connect();
        
        String query = "select ID_MATKUL,ID_DOSEN,NAMA_MATKUL,SKS,Tingkat from mata_kuliah where tingkat ='"+tingkat+"';";
        ResultSet rs = db.getData(query);
        daftarMatkul = getMatkulFromRS(rs);
        db.disconnect();
        return daftarMatkul;
    }
    

private  ArrayList<MataKuliah> getMatkulFromRS(ResultSet rs){
        try {   
            while (rs.next()) {
                    MataKuliah matkul = new MataKuliah(
                            rs.getInt("ID_MATKUL"), 
                            rs.getString("NAMA_MATKUL"),
                            rs.getInt("SKS"), 
                            rs.getInt("TINGKAT")
                    );
                    Dosen dosen = getDosenByKode(rs.getInt("ID_DOSEN"));
                    matkul.setDosen(dosen);
                    daftarMatkul.add(matkul);
            }
            return daftarMatkul;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan   load MataKuliah");
        }
    }
    public Mahasiswa getMahasiswaByUsername (String username) {
        Mahasiswa d = null;
        for (Mahasiswa ma : daftarMahasiswa) {
            if (ma.getUsername().equals(username)) {
                d= ma;
            }
        }
        return d;
    }
    public Dosen getDosenByUsername(String username) {
        Dosen d = null;
        for (Dosen dosen : daftarDosen) {
            if (dosen.getUsername().equals(username)) {
                d= dosen;
            }
        }
        return d;
    }
}
