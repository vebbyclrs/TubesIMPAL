/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import View.VAdmin;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

/**
 *
 * @author VebbyClrs
 */
public class Test implements ActionListener {

    static VAdmin view = new VAdmin();
    static Aplikasi apk = new Aplikasi();
    

    
    public static void main(String[] args) {
//        view.getBtnDsnAdd().addActionListener(this);
        view.setVisible(true);
        Dosen d = new Dosen();
        d.setNama("Vebby Clarissa");
        d.setKode(45555);
        d.setIsMale(1);
        Date dv = new Date(1997, 7, 15);
//        m.addListener(view, this);
        String query = "insert into DOSEN (ID_DOSEN,NAMA,TANGGAL_LAHIR,TEMPAT_LAHIR,ALAMAT,ISMALE,NO_HP) values ('"
                    +d.getKode()+ "','"
                    +d.getNama()+"','"
                    +dv+"','"
                    +d.getTempatLahir()+"','"
                    +d.getAlamat()+"','"
                    +0+"','"
                    +d.getNoHp()+"');";
        DatabaseConnection db = new DatabaseConnection();
        db.connect();
        boolean b = db.manipulate(query);
        System.out.println(b);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getBtnDsnAdd())) {

        }
    }
}
