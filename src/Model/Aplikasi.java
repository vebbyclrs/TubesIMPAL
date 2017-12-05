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
    ArrayList<ArrayList<Jadwal>> daftarJadwalAllTingkat;
    DatabaseConnection db;
    public static long nextNIM;

    public static long nextIDJad;
    

    public Aplikasi() {
        db = new DatabaseConnection();
        daftarAdmin = loadAdmin();
        daftarDosen = loadDosen();
        daftarMahasiswa = loadMahasiswa();
        daftarMatkul = loadMatkul();

        daftarJadwal = loadJadwal();
//        daftarJadwalAllTingkat();
        /**
         * LOAD DULU SI daftarJadwalAllTingkat
         */
        //        System.out.println(daftarMahasiswa.get(daftarMahasiswa.size()-1))
        
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

            if (daftarMahasiswa.size()!=0) {
                nextNIM = (daftarMahasiswa.get(daftarMahasiswa.size()-1).getNim())+1;
            } else {
                nextNIM =0;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("terjadi kesalahan saat load mahasiswa");
        }
        db.disconnect();
        return daftarMahasiswa;
    }

    public ArrayList<Admin> loadAdmin() /*DONE*/ {
        db.connect();
        daftarAdmin = new ArrayList<>();
        ResultSet rs = db.getData("select ID,NAMA,USERNAME,PASSWORD from ADMIN");
        try {
            while (rs.next()) {
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
    public Jadwal getJadwalById(int id) {
        Jadwal j = new Jadwal();
        for (Jadwal jadwal : daftarJadwal) {
            if (jadwal.getIdJadwal() == id) {
                return j;
            }
        }
        return j;
    }

    public ArrayList<Dosen> loadDosen() /*DONE*/ {
        db.connect();

        daftarDosen = new ArrayList<Dosen>();

        ResultSet rs = db.getData("select * from DOSEN");
        try {
            while (rs.next()) {
//                java.util.Date date = new java.util.Date();
                Dosen d = new Dosen(rs.getInt("ID_DOSEN"),
                        rs.getString("NAMA"),
                        rs.getTimestamp("TANGGAL_LAHIR"),
                        rs.getString("TEMPAT_LAHIR"),
                        rs.getString("ALAMAT"),
                        rs.getInt("ISMALE"),
                        rs.getLong("NO_HP"),
                        rs.getString("EMAIL"),
                        rs.getString("PASSWORD"));

                daftarDosen.add(d);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error loadDosen()");
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
//        daftarMatkul = getMatkulFromRS(rs);
        db.disconnect();
        return daftarMatkul;
    }

    public ArrayList<Jadwal> loadJadwal() {
        db.connect();
        daftarJadwal = new ArrayList<>();
        String query = "Select * from JADWAL;";
        try {
            ResultSet rs = db.getData(query);
            while (rs.next()) {
                MataKuliah m = getMatkulById(rs.getInt("ID_MATKUL"));
                Jadwal jd = new Jadwal(
                        rs.getInt("IDJADWAL"), 
                        m, 
                        rs.getTime("PUKUL"), 
                        rs.getString("HARI"));
                daftarJadwal.add(jd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        db.disconnect();
        if (daftarJadwal.size()!=0) {
            nextIDJad = (daftarJadwal.get(daftarJadwal.size()-1).getIdJadwal())+1;    
        } else {
            nextNIM =0;
        }
        return daftarJadwal;
    }
    public ArrayList<ArrayList<Jadwal>> loadJadwalAllTingkat() {
        db.connect();
        daftarJadwalAllTingkat = new ArrayList<>();
        daftarJadwalAllTingkat.add(new ArrayList<>());
        daftarJadwalAllTingkat.add(new ArrayList<>());
        daftarJadwalAllTingkat.add(new ArrayList<>());
        daftarJadwalAllTingkat.add(new ArrayList<>());
        
        daftarJadwalAllTingkat.set(0, loadJadwalTingkat(1));
        daftarJadwalAllTingkat.set(1, loadJadwalTingkat(2));
        daftarJadwalAllTingkat.set(2, loadJadwalTingkat(3));
        daftarJadwalAllTingkat.set(3, loadJadwalTingkat(4));
        
        db.disconnect();
        return daftarJadwalAllTingkat;
        
    }
    
    public ArrayList<Jadwal> loadJadwalTingkat(int tingkat) {
        ArrayList<Jadwal> tmp = new ArrayList<>();
        for (Jadwal jd : daftarJadwal) {
            if (jd.getMatkul().getTingkat() == tingkat) {
                tmp.add(jd);
            }
        }
        return tmp;
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

    public MataKuliah getMatkulById(int kode) {
        MataKuliah m = null;
        for (MataKuliah mm : daftarMatkul) {
            if (mm.getKodeMk() == kode) {
                m = mm;
            }
        }
        return m;
    }
    public boolean addDosen(Dosen d) /*DONE*/{
        //on working-VEB
        db.connect();
        boolean berhasil = db.saveDosen(d);
        daftarDosen.add(d);
        db.disconnect();
        return berhasil;
    }

    public boolean addMatkul(MataKuliah matkul) /*DONE*/ {
        boolean berhasil = false;
        try {
            db.connect();
            berhasil = db.saveMatkul(matkul);
            System.out.println("addMatkul " + berhasil);
            daftarMatkul.add(matkul);
            db.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return berhasil;

    }

    public boolean addJadwal(Jadwal j) {
        boolean berhasil = false;
        try {
            db.connect();
            berhasil = db.saveJadwal(j);
            System.out.println("addJadwal" + berhasil);
            daftarJadwal.add(j);
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

    
    public  ArrayList<MataKuliah> loadMatkulTingkat(int tingkat) /*DONE*/ {
        daftarMatkul = new ArrayList<MataKuliah>();
        db.connect();
        try {
            String query = "select * from mata_kuliah where tingkat ='"+tingkat+"';";
            ResultSet rs = db.getData(query);
            daftarMatkul = getMatkulFromRS(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        db.disconnect();
        return daftarMatkul;
    }
  
    public ArrayList<MataKuliah> loadMataKuliah(int tingkat) /*DONE*/ {
        daftarMatkul = new ArrayList<MataKuliah>();
        db.connect();
        String query = "select ID_MATKUL,ID_DOSEN,NAMA_MATKUL,SKS,Tingkat from mata_kuliah where tingkat ='" + tingkat + "';";
        ResultSet rs = db.getData(query);
        daftarMatkul = getMatkulFromRS(rs);
      return daftarMatkul;
    }
//    
//    public ArrayList<ArrayList<MataKuliah>> loadDaftarMatkulAllTingkattttt() {
//        daftarMatkulAllTingkat = new ArrayList<>();
//        daftarMatkulAllTingkat.add(new ArrayList<>());
//        daftarMatkulAllTingkat.add(new ArrayList<>());
//        daftarMatkulAllTingkat.add(new ArrayList<>());
//        daftarMatkulAllTingkat.add(new ArrayList<>());
//        
//        daftarMatkulAllTingkat.set(0, loadMatkulTingkat(0));
//        daftarMatkulAllTingkat.set(1, loadMatkulTingkat(1));
//        daftarMatkulAllTingkat.set(2, loadMatkulTingkat(2));
//        daftarMatkulAllTingkat.set(3, loadMatkulTingkat(3));
//        return daftarMatkulAllTingkat;
//    }


    /*public ArrayList<ArrayList<MataKuliah>> loadDaftarMatkulAllTingkattttt() {
        daftarMatkulAllTingkat = new ArrayList<>();
        daftarMatkulAllTingkat.add(new ArrayList<>());
        daftarMatkulAllTingkat.add(new ArrayList<>());
        daftarMatkulAllTingkat.add(new ArrayList<>());
        daftarMatkulAllTingkat.add(new ArrayList<>());
        
        daftarMatkulAllTingkat.set(0, loadMatkulTingkat(0));
        daftarMatkulAllTingkat.set(1, loadMatkulTingkat(1));
        daftarMatkulAllTingkat.set(2, loadMatkulTingkat(2));
        daftarMatkulAllTingkat.set(3, loadMatkulTingkat(3));
        return daftarMatkulAllTingkat;
    }*/


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

    public Mahasiswa getMahasiswaByUsername(String username) {
        Mahasiswa d = null;
        for (Mahasiswa ma : daftarMahasiswa) {
            if (ma.getUsername().equals(username)) {
                d = ma;
            }
        }
        return d;
    }

    public Dosen getDosenByUsername(String username) {
        
        Dosen d = null;
//        System.out.println(daftarDosen);
        for (Dosen dosen : daftarDosen) {
            if (dosen.getEmail().equals(username) ) {
                d=dosen;
                System.out.println("masukDosenUsername");
            }
        }
//        System.out.println(d.getNama()+d.getUsername());
        return d;
    }

    public int getSksFromIdMatkul(Object o) {
        int sks = 0;
        try {
            db.connect();
            String query = "SELECT `SKS` FROM `mata_kuliah` WHERE `ID_MATKUL`=" + o;
            ResultSet rs = db.getData(query);
            while (rs.next()) {
                sks = rs.getInt("SKS");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("gagal getSKSFromIdMatkul");
        }
        return sks;
    }

    public ArrayList<Jadwal> loadJadwalObject() {
        daftarMatkul = loadMatkul();
        db.connect();
        daftarJadwal = new ArrayList<Jadwal>();
        try {
            for (MataKuliah matakuliah : daftarMatkul) {
                
                String query = "select * from jadwal where id_matkul=" + matakuliah.getKodeMk() + ";";
                ResultSet rs = db.getData(query);

                while (rs.next()) {
                    String hari = rs.getString("HARI");
                    int id = rs.getInt("IDJADWAL");
                    int jam = Integer.parseInt(rs.getString("PUKUL").substring(0, 2));
                    int menit = Integer.parseInt(rs.getString("PUKUL").substring(3, 5));
                    Jadwal jadwal = new Jadwal(id, matakuliah,rs.getTime("PUKUL"), hari);
                    daftarJadwal.add(jadwal);
                }
            }

        } catch (Exception e) {
            throw new IllegalArgumentException("Gagal loadMatkul");
        }
        return daftarJadwal;
    }
    public Jadwal getJadwal(int id_matkul){
        Jadwal jdwl = null ; 
        try {
            daftarJadwal = loadJadwal();
            for (Jadwal jadwal : daftarJadwal) {
                if (jadwal.getMatkul().getKodeMk() == id_matkul){
                    jdwl = jadwal;
                }
                jadwal.getIdJadwal();
                
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("gagal getJadwal");
        }
        
        return jdwl;
    }
    public boolean saveJadwalTaken(ArrayList<Jadwal> jadwal, long nim){
        boolean berhasil = false;
        berhasil = db.saveJadwalDiambil(jadwal, nim);
        return berhasil;
    }
    public boolean updateMahasiswaTempatLahir(Mahasiswa mhs,String tempatLahir){
        boolean berhasil = false;
        try {
            db.connect();
            String query = "UPDATE `mahasiswa` SET `TEMPAT_LAHIR`="+tempatLahir+" WHERE `NIM`="+Long.toString(mhs.getNim())+";";
            berhasil = db.manipulate(query);
            System.out.println(berhasil);
        } catch (Exception e) {
            throw new IllegalArgumentException("gagal Update UpdateMahasiswaTempatLahir");
        }
        return berhasil;
        
    }
    public boolean updateMahasiswaNoHP(Mahasiswa mhs,String nomor){
         db.connect();
            boolean berhasil = false;
        try {
            db.connect();
            String query = "UPDATE `mahasiswa` SET `NO_HP`="+nomor+" WHERE `NIM`="+Long.toString(mhs.getNim())+";";
            berhasil = db.manipulate(query);
            System.out.println(berhasil);
        } catch (Exception e) {
            throw new IllegalArgumentException("gagal Update UpdateMahasiswaNoHP");
        }
        return berhasil;
}
    public boolean updateMahasiswaEmail(Mahasiswa mhs,String email){
        boolean berhasil = false;
        try {
            db.connect();
            String query = "UPDATE `mahasiswa` SET `EMAIL`='"+email+"' WHERE `NIM`="+Long.toString(mhs.getNim())+" ;";
            berhasil = db.manipulate(query);
            System.out.println(berhasil);
        } catch (Exception e) {
            throw new IllegalArgumentException("gagal Update UpdateMahasiswaEmail");
        }
        return berhasil;
}       
    public void updateMahasiswaSKS(Mahasiswa mhs,int SKS){
         db.connect();
            boolean berhasil = false;
        try {
            db.connect();
            String query = "UPDATE `mahasiswa` SET `TOTAL_SKS`="+SKS+" WHERE `NIM`="+Long.toString(mhs.getNim())+";";
            berhasil = db.manipulate(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("gagal Update UpdateMahasiswaNoHP");
        }
   
        
}
    public void updateProfilDosen(Dosen dosen){
        db.connect();
        try {
            String query = "UPDATE `dosen` SET `ALAMAT`='"+dosen.getAlamat()+
                    "' , `NO_HP`='"+dosen.getNoHp()+
                    "' , `EMAIL`='"+dosen.getEmail()+
                    "' WHERE `ID_DOSEN` ="+dosen.getKode()+";";
            db.manipulate(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("gagal updateProfilDosen");
        }
    }
}