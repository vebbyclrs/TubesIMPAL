/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ENDRIAWAN
 */
public class MataKuliah {
    private  int kodeMk;
    private String namaMk;
    private int SKS;
    private Dosen dosen; //ga usah array, soalnya di satu jadwal cuma ada 1 mahasiswa dengan 1 dosen

    public MataKuliah(int kodeMk, String namaMk, int SKS) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.SKS = SKS;
    }

    public MataKuliah(int kodeMk, String namaMk, int SKS, Dosen dosen) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.SKS = SKS;
        this.dosen = dosen;
    }
    
    public int getKodeMk() {
        return kodeMk;
    }

    public void setKodeMk(int kodeMk) {
        this.kodeMk = kodeMk;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public void setNamaMk(String namaMk) {
        this.namaMk = namaMk;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public Dosen getDosen() {
        return dosen;
    }
    
    
}
