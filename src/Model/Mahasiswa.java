/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import java.util.ArrayList;


/**
 *
 * @author Vebby Clarissa 1301150439
 */
public class Mahasiswa {
    private static int totalMahasiswa;
    private int totalSKS; //di awal di set 0
    private long nim;
    private String nama;
    private int isMale;
    private Date tanggalLahir;
    private String tempatLahir;
    private String alamat;
//    private float ipk;
    private long noHp;
    private int angkatan;
    private int statusPembayaran;
    private Dosen dosenWali;
    private ArrayList<Jadwal> jadwal;
    private String username;
    private String password;

    public Mahasiswa() {
    }

    public Mahasiswa(long nim, String nama, int isMale, Date tanggalLahir, String tempatLahir, String alamat, long noHp, int angkatan, Dosen dosenWali, String username, String password) {
        this.nim = nim;
        this.nama = nama;
        this.isMale = isMale;
        this.tanggalLahir = tanggalLahir;
        this.tempatLahir = tempatLahir;
        this.alamat = alamat;
        this.noHp = noHp;
        this.angkatan = angkatan;
        this.dosenWali = dosenWali;
        this.username = username;
        this.password = password;
    }

    public Mahasiswa(long nim, String nama, int isMale, 
            Date tanggalLahir, String tempatLahir, String alamat, 
            long noHp, int angkatan, int statusPembayaran,
            int totalSKS,  int dosenWali, String username, 
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
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    public static void setTotalMahasiswa(int totalMahasiswa) {
        Mahasiswa.totalMahasiswa = totalMahasiswa;
    }

    public ArrayList<Jadwal> getJadwal() {
        return jadwal;
    }
    
    public void setJadwal(ArrayList<Jadwal> jadwal) {
        this.jadwal = jadwal;
    }
    
    
    
    public String username() {
        return username;
    }

    public void username(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public int isIsMale() {
        return isMale;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setNim(long nim) {
        this.nim = nim;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
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

    public int IsMale() {
        return isMale;
    }

    public void setIsMale(int isMale) {
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

    public int isStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(int statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
}
