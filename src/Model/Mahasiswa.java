/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vebby Clarissa 1301150439
 */
public class Mahasiswa {
    private static int totalMahasiswa;
    private int totalSKS; //di awal di set 0
    private long nim;
    private String nama;
    private boolean isMale;
    private Date tanggalLahir;
    private String tempatLahir;
    private String alamat;
//    private float ipk;
    private long noHp;
    private int angkatan;
    private boolean statusPembayaran;
    private Dosen dosenWali;
    private ArrayList<Jadwal> jadwal;
    private String email;
    private String password;

    public Mahasiswa(String nama, boolean isMale, int tglLahir, int bulanLahir, int tahunLahir, String tempatLahir) {
        this.nim = ++totalMahasiswa;
        this.nama = nama;
        this.isMale = isMale;
        setTanggalLahir(tglLahir, bulanLahir, tahunLahir);
        this.tempatLahir = tempatLahir;
        this.totalSKS = 0;
        jadwal = new ArrayList<>();
    }

    public Mahasiswa(long nim, String nama, boolean isMale, 
            Date tanggalLahir, String tempatLahir, String alamat, 
            long noHp, int angkatan, boolean statusPembayaran,
            int totalSKS,  int dosenWali, String email, 
            String password) {
        this.totalSKS = totalSKS;
        this.nim = nim;
        this.nama = nama;
        this.isMale = isMale;
        this.tanggalLahir = tanggalLahir;
        this.tempatLahir = tempatLahir;
        this.alamat = alamat;
        this.noHp = noHp;
        this.angkatan = angkatan;
        this.statusPembayaran = statusPembayaran;
//        this.dosenWali.setKode(dosenWali);
        this.email = email;
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setNim(long nim) {
        this.nim = nim;
    }
    
    public ArrayList<Jadwal> getAllJadwal () {
        return this.jadwal;
    }

    public final void setTanggalLahir(int tanggal, int bulan, int tahun) {
        this.tanggalLahir = new Date(tahun-1900,bulan-1,tanggal);
    }
    public Date getTanggalLahir () {
        return tanggalLahir;
    }

    public int getTotalSKS() {
        return totalSKS;
    }
    
    public void setDosenWali(Dosen d) {
        this.dosenWali = d;
    }
    public Dosen getDosenWali () {
        return this.dosenWali;
    }
    
    public boolean addJadwal(Jadwal j) {
        if (totalSKS + j.getMatkul().getSKS() <= 24) {
            this.totalSKS += j.getMatkul().getSKS();
            this.jadwal.add(j);
            return true;
        } else {
            return false;
        }
    }
    public Jadwal getJadwalByIdx (int i) {
        return this.jadwal.get(i);
    }
    
    public long getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean IsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }
    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public long getNoHp() {
        return noHp;
    }

    public void setNoHp(long noHp) {
        this.noHp = noHp;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(boolean statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
}
