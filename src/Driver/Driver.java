/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Model.Aplikasi;
import Model.DatabaseConnection;
import Model.Mahasiswa;
import java.util.Date;

/**
 *
 * @author vebbyclrs
 */
public class Driver {
    public static void main(String[] args) {
//        Mahasiswa mhs = new Mahasiswa("Vebby Clarissa", false, 16, 8, 1997, "Bukittinggi");
//        System.out.println(mhs.getTanggalLahir());
        DatabaseConnection db = new DatabaseConnection();
        db.connect();
        Date date = new Date(1997,8,16);
        Mahasiswa m = new Mahasiswa(12, "Vebby Clarissa", false,
                date, "Bukittinggi", "Padang", 0, 0, true, 0, 0, "Vebby Clarissa", "VEbby Clarissa");
        db.saveMahasiswa(m);
        db.disconnect();
    }
}
