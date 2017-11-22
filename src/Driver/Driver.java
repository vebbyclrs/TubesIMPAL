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
        //new Controller.ContrAdmin();
        Mahasiswa mhs = new Mahasiswa("Vebby Clarissa", false, 16, 8, 1997, "Bukittinggi");
        new Controller.ContrMahasiswa(mhs);
    }
}
