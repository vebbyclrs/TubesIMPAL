/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Yoga Widi Pamungkas
 */
public class Jadwal {
    private int idJadwal;
    private MataKuliah matkul; 
    /**
     * matkul Bukan array, karena  yang jadi array harusnya si jadwal itu sendiri,
     * Jadi misal ada jadwal1 : Kalkulus jam 9.30 - 11.30 hari selasa, kan matakuliah dalam 1 jadwal cuma 1.
     */
    private Time pukul;
    private String hari;
    
    public Jadwal(int idJadwal, MataKuliah matkul, int jam, int menit, String hari) {
        this.idJadwal = idJadwal;
        this.matkul = matkul;
        this.pukul = new Time(jam, menit, 0);
        this.hari = hari;
    }
    
    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }
    
    public void setPukul(int jam, int menit, int detik) {
        pukul = new Time(jam, menit, detik);
    }
    
    public Time getPukul() {
        return pukul;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }
    
}
