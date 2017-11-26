/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author vebbyclrs
 */
public class VAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public VAdmin() {
        initComponents();
    }
    
    public void setActionListener (ActionListener e) {
        btnAddMatkul.addActionListener(e);
        btnDsnAdd.addActionListener(e);
        btnMhsAdd.addActionListener(e);
    }

    public void setCboxMhsJKIndex(int idx) {
        this.cboxMhsJK.setSelectedIndex(idx); 
    }

    public void setCboxMhsKodeDoswal(int idx) {
        this.cboxMhsKodeDoswal.setSelectedIndex(idx); 
    }

    public void setTfMhsAlamat(String tfIsi) {
        this.tfMhsAlamat.setText(tfIsi);
    }

    public void setDateMhsBirthday(JDateChooser dateMhsBirthday) {
        this.dateMhsBirthday.resetKeyboardActions();
    }

    public String getTfMatkulKode() {
        return tfMatkulKode.getText();
    }

    public String getTfMatkulNama() {
        return tfMatkulNama.getText();
    }

    public JComboBox<String> getCboxMatkulKodeDosen() {
        return cboxMatkulKodeDosen;
    }

    public JComboBox<String> getCboxMatkulSKS() {
        return cboxMatkulSKS;
    }

    
    
    public void reset() {
        setTfDsnBirthplace("");
        setTfDsnKode("");
        setTfDsnNama("");
        setTfKodeMatkul("");
        setTfMhsBirthplace("");
//        setTfMhsNIM("");
        setTfMhsNama("");
        setTfNamaMatkul("");
        setTfDsnAlamat("");
        setTfDsnNoHp("");
        setTfMhsAlamat("");
        setCboxMhsJKIndex(0);
        setCboxMhsKodeDoswal(0);
        setDateMhsBirthday(getDateMhsBirthday());
        
//        setTfMhsNIM(ContrAdmin.nextNIM);
    }

    public String getTfDsnAlamat() {
        return tfDsnAlamat.getText();
    }

    public void setTfDsnAlamat(String text) {
        this.tfDsnAlamat.setText(text);
    }

    public String getTfDsnNoHp() {
        return tfDsnNoHp.getText();
    }

    public void setTfDsnNoHp(String text) {
        this.tfDsnNoHp.setText(text);
    }
    
    
    
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    public void showMessageFieldKosong() {
        JOptionPane.showMessageDialog(null, "Silahkan lengkapi semua field untuk melanjutkan");
    }
    public JButton getBtnAddMatkul() {
        return btnAddMatkul;
    }

    public String getTfMhsAlamat() {
        return tfMhsAlamat.getText();
    }

    public JTable getTblDosen() {
        return tblDosen;
    }

    public JButton getBtnDsnAdd() {
        return btnDsnAdd;
    }


    public JButton getBtnMhsAdd() {
        return btnMhsAdd;
    }

    public JComboBox<String> getCboxDsnJK() {
        return cboxDsnJK;
    }

    public JComboBox<String> getCboxMhsJK() {
        return cboxMhsJK;
    }

    public JComboBox<String> getCboxMhsKodeDoswal() {
        return cboxMhsKodeDoswal;
    }


    public JDateChooser getDateDsnBirthday() {
        return dateDsnBirthday;
    }
    
    public JDateChooser getDateMhsBirthday() {
        return dateMhsBirthday;
    }

    public JTable getTblMahasiswa() {
        return tblMahasiswa;
    }

    public JTable getTblMatkul() {
        return tblMatkul;
    }

    public String getTfDsnBirthplace() {
        return tfDsnBirthplace.getText();
    }

    public String getTfDsnKode() {
        return tfDsnKode.getText();
    }

    public String getTfDsnNama() {
        return tfDsnNama.getText();
    }

    public String getTfKodeMatkul() {
        return tfMatkulKode.getText();
    }

    public String getTfMhsBirthplace() {
        return tfMhsBirthplace.getText();
    }

    public String getTfMhsNIM() {
        return tfMhsNIM.getText();
    }

    public String getTfMhsNama() {
        return tfMhsNama.getText();
    }

    public String getTfNamaMatkul() {
        return tfMatkulNama.getText();
    }

    public void setTfDsnBirthplace(String tfDsnBirthplace) {
        this.tfDsnBirthplace.setText(tfDsnBirthplace);
    }

    public void setTfDsnKode(String tfDsnKode) {
        this.tfDsnKode.setText(tfDsnKode);
    }

    public void setTfDsnNama(String tfDsnNama) {
        this.tfDsnNama.setText(tfDsnNama);
    }

    public void setTfKodeMatkul(String tfKodeMatkul) {
        this.tfMatkulKode.setText(tfKodeMatkul);
    }

    public void setTfMhsBirthplace(String tfMhsBirthplace) {
        this.tfMhsBirthplace.setText(tfMhsBirthplace);
    }

    public JComboBox<String> getCboxMatkulTingkat() {
        return cboxMatkulTingkat;
    }

    public void setCboxMatkulTingkat(JComboBox<String> cboxMatkulTingkat) {
        this.cboxMatkulTingkat = cboxMatkulTingkat;
    }

    
    
    public void setTfMhsNIM(String tfMhsNIM) {
        this.tfMhsNIM.setText(tfMhsNIM);
    }

    public void setTfMhsNama(String tfMhsNama) {
        this.tfMhsNama.setText(tfMhsNama);
    }

    public void setTfNamaMatkul(String tfNamaMatkul) {
        this.tfMatkulNama.setText(tfNamaMatkul);
    }

    

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        Dosen1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfMatkulKode = new javax.swing.JTextField();
        tfMatkulNama = new javax.swing.JTextField();
        cboxMatkulSKS = new javax.swing.JComboBox<>();
        btnAddMatkul = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatkul = new javax.swing.JTable();
        cboxMatkulKodeDosen = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        cboxMatkulTingkat = new javax.swing.JComboBox<>();
        Dosen = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDosen = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        cboxDsnJK = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        btnDsnAdd = new javax.swing.JButton();
        dateDsnBirthday = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        tfDsnBirthplace = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tfDsnNama = new javax.swing.JTextField();
        tfDsnKode = new javax.swing.JTextField();
        tfDsnAlamat = new javax.swing.JTextField();
        tfDsnNoHp = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Mahasiswa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMahasiswa = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfMhsNama = new javax.swing.JTextField();
        tfMhsNIM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dateMhsBirthday = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        tfMhsBirthplace = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cboxMhsKodeDoswal = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cboxMhsJK = new javax.swing.JComboBox<>();
        btnMhsAdd = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        tfMhsAlamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nama Mata Kuliah");

        jLabel3.setText("SKS");

        jLabel4.setText("Dosen");

        cboxMatkulSKS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=SKS=", "1", "2", "3", "4" }));

        btnAddMatkul.setText("Tambah");

        jLabel1.setText("Kode Mata Kuliah (Integer)");

        tblMatkul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Matakuliah", "Judul Mata Kuliah", "SKS", "Dosen", "Tingkat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblMatkul);

        jLabel21.setText("Tingkat");

        cboxMatkulTingkat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=Tingkat=", "1", "2", "3", "4" }));
        cboxMatkulTingkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMatkulTingkatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Dosen1Layout = new javax.swing.GroupLayout(Dosen1);
        Dosen1.setLayout(Dosen1Layout);
        Dosen1Layout.setHorizontalGroup(
            Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(Dosen1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel21))
                .addGap(39, 39, 39)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMatkulKode)
                    .addComponent(tfMatkulNama, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(cboxMatkulKodeDosen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Dosen1Layout.createSequentialGroup()
                        .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddMatkul)
                            .addComponent(cboxMatkulSKS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxMatkulTingkat, 0, 135, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(759, 759, 759))
        );
        Dosen1Layout.setVerticalGroup(
            Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dosen1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMatkulKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMatkulNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboxMatkulSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cboxMatkulTingkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Dosen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboxMatkulKodeDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddMatkul)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Mata Kuliah", Dosen1);

        tblDosen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode ", "Nama", "TTL", "Jenis Kelamin", "Alamat", "No HP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDosen);

        jLabel12.setText("Jenis Kelamin");

        cboxDsnJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jenis Kelamin", "Laki-laki", "Perempuan" }));

        jLabel13.setText("Tanggal Lahir");

        btnDsnAdd.setText("Tambahkan Dosen");

        jLabel14.setText("Tempat lahir");

        jLabel15.setText("Tambah Dosen Baru");

        jLabel16.setText("Nama");

        jLabel18.setText("Kode (Integer)");

        jLabel17.setText("No HP");

        jLabel19.setText("Alamat");

        javax.swing.GroupLayout DosenLayout = new javax.swing.GroupLayout(Dosen);
        Dosen.setLayout(DosenLayout);
        DosenLayout.setHorizontalGroup(
            DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
            .addGroup(DosenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(DosenLayout.createSequentialGroup()
                        .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addGap(115, 115, 115)
                        .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDsnAdd)
                            .addComponent(cboxDsnJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDsnNama)
                            .addComponent(tfDsnKode)
                            .addComponent(dateDsnBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDsnBirthplace, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(tfDsnAlamat)
                            .addComponent(tfDsnNoHp))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DosenLayout.setVerticalGroup(
            DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DosenLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tfDsnNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tfDsnKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(dateDsnBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(tfDsnBirthplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDsnAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDsnNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DosenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(cboxDsnJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDsnAdd)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Dosen", Dosen);

        tblMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama ", "NIM", "Jenis Kelamin", "TTL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMahasiswa.setToolTipText("");
        jScrollPane1.setViewportView(tblMahasiswa);

        jLabel5.setText("Tambah Mahasiswa Baru");

        jLabel6.setText("Nama");

        jLabel7.setText("NIM");

        tfMhsNIM.setEditable(false);

        jLabel8.setText("Tanggal Lahir");

        jLabel9.setText("Tempat lahir");

        jLabel10.setText("Dosen Wali");

        jLabel11.setText("Jenis Kelamin");

        cboxMhsJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jenis Kelamin", "Laki-laki", "Perempuan" }));
        cboxMhsJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxMhsJKActionPerformed(evt);
            }
        });

        btnMhsAdd.setText("Tambahkan Mahasiswa");

        jLabel20.setText("Alamat");

        javax.swing.GroupLayout MahasiswaLayout = new javax.swing.GroupLayout(Mahasiswa);
        Mahasiswa.setLayout(MahasiswaLayout);
        MahasiswaLayout.setHorizontalGroup(
            MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
            .addGroup(MahasiswaLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MahasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel20))
                .addGap(115, 115, 115)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMhsAdd)
                    .addComponent(cboxMhsJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMhsNama)
                    .addComponent(tfMhsNIM, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(cboxMhsKodeDoswal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfMhsBirthplace)
                    .addComponent(dateMhsBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfMhsAlamat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MahasiswaLayout.setVerticalGroup(
            MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MahasiswaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfMhsNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfMhsNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(dateMhsBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(MahasiswaLayout.createSequentialGroup()
                        .addComponent(tfMhsBirthplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMhsAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(cboxMhsKodeDoswal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(cboxMhsJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMhsAdd)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Mahasiswa", Mahasiswa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxMhsJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMhsJKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxMhsJKActionPerformed

    private void cboxMatkulTingkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxMatkulTingkatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxMatkulTingkatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dosen;
    private javax.swing.JPanel Dosen1;
    private javax.swing.JPanel Mahasiswa;
    private javax.swing.JButton btnAddMatkul;
    private javax.swing.JButton btnDsnAdd;
    private javax.swing.JButton btnMhsAdd;
    private javax.swing.JComboBox<String> cboxDsnJK;
    private javax.swing.JComboBox<String> cboxMatkulKodeDosen;
    private javax.swing.JComboBox<String> cboxMatkulSKS;
    private javax.swing.JComboBox<String> cboxMatkulTingkat;
    private javax.swing.JComboBox<String> cboxMhsJK;
    private javax.swing.JComboBox<String> cboxMhsKodeDoswal;
    private com.toedter.calendar.JDateChooser dateDsnBirthday;
    private com.toedter.calendar.JDateChooser dateMhsBirthday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblDosen;
    private javax.swing.JTable tblMahasiswa;
    private javax.swing.JTable tblMatkul;
    private javax.swing.JTextField tfDsnAlamat;
    private javax.swing.JTextField tfDsnBirthplace;
    private javax.swing.JTextField tfDsnKode;
    private javax.swing.JTextField tfDsnNama;
    private javax.swing.JTextField tfDsnNoHp;
    private javax.swing.JTextField tfMatkulKode;
    private javax.swing.JTextField tfMatkulNama;
    private javax.swing.JTextField tfMhsAlamat;
    private javax.swing.JTextField tfMhsBirthplace;
    private javax.swing.JTextField tfMhsNIM;
    private javax.swing.JTextField tfMhsNama;
    // End of variables declaration//GEN-END:variables
}
