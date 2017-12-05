/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Dosen;
import View.VDosen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 *
 * @author VebbyClrs
 */
public class ContrDosen implements ActionListener{
    Dosen dsn;
    Aplikasi model;
    VDosen view;
    

    public ContrDosen(Dosen dosen) {
        view = new VDosen();
        view.setVisible(true);
        showProfilDosen(dosen);
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
        
        
     
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void showProfilDosen(Dosen dosen){
        view.setTfIdDosen(Integer.toString(dosen.getKode()));
        view.setTfNama(dosen.getNama());
        view.setTfTanggalLahir(dosen.getTglLahir().toString());
        if(dosen.getIsMale()==1){
            view.setTfJenisKelamin("Laki-laki");
        }else{
            view.setTfJenisKelamin("Perempuan");
        }
        view.setTfAlamat(dosen.getAlamat());
        view.setTfNoHp(Long.toString(dosen.getNoHp()));
        view.setTfUsername(dosen.getUsername());
    }
}
