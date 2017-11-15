/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vebbyclrs
 */
public class DatabaseConnection {
    private Connection conn;
    private Statement sta;
    
    public void connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_tubes_impal", "root", "");
            sta = conn.createStatement();
        } catch (Exception ex)
        {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public void disconnect()
    {
        try
        {
            conn.close();
            sta.close();
        } catch (SQLException ex)
        {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public boolean manipulate(String query)
    {
        boolean berhasil = false;
        try
        {
            int rows = sta.executeUpdate(query);
            if (rows > 0)
            {
                berhasil = true;
            }

        } catch (Exception ex)
        {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return berhasil;

    }

    public ResultSet getData(String query)
    {
        ResultSet rs = null;
        try
        {
            rs = sta.executeQuery(query);
        } catch (Exception ex)
        {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    public boolean saveMahasiswa (Mahasiswa m) {
        boolean berhasil = false;
        try {
            String query = "insert into Mahasiswa ( NIM,ID_DOSEN,NAMA,IS_MALE,TANGGAL_LAHIR,TEMPAT_LAHIR,ALAMAT,NO_HP,ANGKATAN,STATUS_PEMBAYARAN,TOTAL_SKS from mahasiswa)"
                    + "values ('"+ m.getNim()+"','"
                    + m.getDosenWali().getKode() + "','"
                    + m.getNama()+"','"
                    + m.IsMale()+"','"
                    + m.getTanggalLahir()+"','"
                    + m.getTempatLahir()+"','"
                    + m.getAlamat()+"','"
                    + m.getNoHp()+"','"
                    + m.getAngkatan() +"','"
                    + m.isStatusPembayaran()+"','"
                    + m.getTotalSKS()+"');";
            sta.execute(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = sta.getGeneratedKeys();
            if (rs.next()) {
                int generatedId = rs.getInt(1);
                m.setNim(1301100000+generatedId);
                berhasil = true;
                
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Terjadi kesalahan saat save mahasiswa");
        }
        return berhasil;
    }
    public boolean saveDosen (Dosen d) {
        //ON WORKING-VEB
        boolean berhasil = false;
        try {
            String query = "insert into DOSEN (ID_DOSEN,NAMA,TANGGAL_LAHIR,TEMPAT_LAHIR,ALAMAT,ISMALE,NO_HP) values ('"
                    +d.getKode()+ "','"
                    +d.getNama()+"','"
                    +d.getTglLahir()+"','"
                    +d.getTempatLahir()+"','"
                    +d.getAlamat()+"','"
                    +d.isIsMale()+"','"
                    +d.getNoHp()+"');";
            berhasil = manipulate(query);
            if (! berhasil) {
                throw new IllegalArgumentException("Error save Dosen ke DB");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return berhasil;
    }
}
   
    
    

