/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ContrMahasiswa;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author vebbyclrs
 */
public class VMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form Mahasiswa
     */
    public VMahasiswa() {
        initComponents();
    }

    
    public void addListener(ActionListener e) {
        btnAddT1.addActionListener(e);
        btnAddT2.addActionListener(e);
        btnAddT3.addActionListener(e);
        btnAddT4.addActionListener(e);
        btnRemove.addActionListener(e);
        btnCetakKSM.addActionListener(e);
        btnEmail.addActionListener(e);
        btnNoHp.addActionListener(e);
        btnRequestACC.addActionListener(e);
        btnTglLahir.addActionListener(e);
        btnTptLahir.addActionListener(e);
        btnLogout.addActionListener(e);
    }
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null,message);
    }
    public JButton getBtnAddT1() {
        return btnAddT1;
    }

    public JButton getBtnLogout() {
        return btnLogout;
    }

    public void setBtnLogout(JButton btnLogout) {
        this.btnLogout = btnLogout;
    }

    
    
    public void setBtnAddT1(JButton btnAddT1) {
        this.btnAddT1 = btnAddT1;
    }

    public JButton getBtnAddT2() {
        return btnAddT2;
    }

    public void setBtnAddT2(JButton btnAddT2) {
        this.btnAddT1 = btnAddT2;
    }

    public JButton getBtnAddT3() {
        return btnAddT3;
    }

    public void setBtnAddT3(JButton btnAddT3) {
        this.btnAddT3 = btnAddT3;
    }

    public JButton getBtnAddT4() {
        return btnAddT4;
    }

    public void setBtnAddT4(JButton btnAddT4) {
        this.btnAddT4 = btnAddT4;
    }

    public JButton getBtnCetakKSM() {
        return btnCetakKSM;
    }

    public void setBtnCetakKSM(JButton btnCetakKSM) {
        this.btnCetakKSM = btnCetakKSM;
    }

    public JButton getBtnEmail() {
        return btnEmail;
    }

    public void setBtnEmail(JButton btnEmail) {
        this.btnEmail = btnEmail;
    }

    public JButton getBtnNoHp() {
        return btnNoHp;
    }

    public void setBtnNoHp(JButton btnNoHp) {
        this.btnNoHp = btnNoHp;
    }

    public JButton getBtnRemove() {
        return btnRemove;
    }

    public void setBtnRemove(JButton btnRemove) {
        this.btnRemove = btnRemove;
    }

    public JButton getBtnRequestACC() {
        return btnRequestACC;
    }

    public void setBtnRequestACC(JButton btnRequestACC) {
        this.btnRequestACC = btnRequestACC;
    }

    public JButton getBtnTglLahir() {
        return btnTglLahir;
    }

    public void setBtnTglLahir(JButton btnTglLahir) {
        this.btnTglLahir = btnTglLahir;
    }

    public JButton getBtnTptLahir() {
        return btnTptLahir;
    }

    public void setBtnTptLahir(JButton btnTptLahir) {
        this.btnTptLahir = btnTptLahir;
    }

    public JTextField getTfJK() {
        return tfJK;
    }

    public void setTfJK(JTextField tfJK) {
        this.tfJK = tfJK;
    }

    

    public JList<String> getListAccMatkulPilihan() {
        return listAccMatkulPilihan;
    }

    public void setListAccMatkulPilihan(JList<String> listAccMatkulPilihan) {
        this.listAccMatkulPilihan = listAccMatkulPilihan;
    }

    public JList<String> getListRegMatkulPilihan() {
        return listRegMatkulPilihan;
    }

    public void setListRegMatkulPilihan(JList<String> listRegMatkulPilihan) {
        this.listRegMatkulPilihan = listRegMatkulPilihan;
    }

    public JTable getTblTingkat1() {
        return tblTingkat1;
    }

    public void setTblTingkat1(JTable tblTingkat1) {
        this.tblTingkat1 = tblTingkat1;
    }

    public JTable getTblTingkat2() {
        return tblTingkat2;
    }

    public void setTblTingkat2(JTable tblTingkat2) {
        this.tblTingkat2 = tblTingkat2;
    }

    public JTable getTblTingkat3() {
        return tblTingkat3;
    }

    public void setTblTingkat3(JTable tblTingkat3) {
        this.tblTingkat3 = tblTingkat3;
    }

    public JTable getTblTingkat4() {
        return tblTingkat4;
    }

    public void setTblTingkat4(JTable tblTingkat4) {
        this.tblTingkat4 = tblTingkat4;
    }


    public String getTxtCKDoswal() {
        return txtCKDoswal.getText();
    }

    public void setTxtCKDoswal(String txtCKDoswal) {
        this.txtCKDoswal.setText(txtCKDoswal);
    }

    public String getTxtCKNama() {
        return txtCKNama.getText();
    }

    public void setTxtCKNama(String txtCKNama) {
        this.txtCKNama.setText(txtCKNama);
    }

    public String getTxtCKNim() {
        return txtCKNim.getText();
    }

    public void setTxtCKNim(String txtCKNim) {
        this.txtCKNim.setText(txtCKNim);
    }

    public String getTxtCKStatusReg() {
        return txtCKStatusReg.getText();
    }

    public void setTxtCKStatusReg(String txtCKStatusReg) {
        this.txtCKStatusReg.setText(txtCKStatusReg);
    }

    public String getTxtEmail() {
        return txtEmail.getText();
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail.setText(txtEmail);
    }

    public String getTxtNIM() {
        return txtNIM.getText();
    }

    public void setTxtNIM(String txtNIM) {
        this.txtNIM.setText(txtNIM);
    }

    public String getTxtName() {
        return txtName.getText();
    }

    public void setTxtName(String txtName) {
        this.txtName.setText(txtName);
    }

    public String getTxtNoHp() {
        return txtNoHp.getText();
    }

    public void setTxtNoHp(String txtNoHp) {
        this.txtNoHp.setText(txtNoHp);
    }

    public String getTxtTglLahir() {
        return txtTglLahir.getText();
    }

    public void setTxtTglLahir(String txtTglLahir) {
        this.txtTglLahir.setText(txtTglLahir);
    }

    public String getTxtTotSKS() {
        return txtTotSKS.getText();
    }

    public void setTxtTotSKS(String txtTotSKS) {
        this.txtTotSKS.setText(txtTotSKS);
    }

    public String getTxtTptLahir() {
        return txtTptLahir.getText();
    }

    public void setTxtTptLahir(String txtTptLahir) {
        this.txtTptLahir.setText(txtTptLahir);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        RegMatkul = new javax.swing.JPanel();
        tabTingkat1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblTingkat1 = new javax.swing.JTable();
        btnAddT1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblTingkat2 = new javax.swing.JTable();
        btnAddT2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblTingkat3 = new javax.swing.JTable();
        btnAddT3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblTingkat4 = new javax.swing.JTable();
        btnAddT4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listRegMatkulPilihan = new javax.swing.JList<>();
        btnRemove = new javax.swing.JButton();
        RequestACC = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        listAccMatkulPilihan = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        txtTotSKS = new javax.swing.JTextField();
        btnRequestACC = new javax.swing.JButton();
        CetakKSM = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCKStatusReg = new javax.swing.JTextField();
        txtCKNama = new javax.swing.JTextField();
        txtCKNim = new javax.swing.JTextField();
        txtCKDoswal = new javax.swing.JTextField();
        btnCetakKSM = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Profil = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNIM = new javax.swing.JTextField();
        txtTptLahir = new javax.swing.JTextField();
        txtTglLahir = new javax.swing.JTextField();
        btnTptLahir = new javax.swing.JButton();
        btnTglLahir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtNoHp = new javax.swing.JTextField();
        btnNoHp = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnEmail = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tfJK = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTingkat1.setForeground(new java.awt.Color(255, 255, 255));
        tblTingkat1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Jadwal", "Shift", "Kode Mata Kuliah", "Nama Mata Kuliah", "Dosen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tblTingkat1);
        if (tblTingkat1.getColumnModel().getColumnCount() > 0) {
            tblTingkat1.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnAddT1.setText("Add");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddT1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddT1)
                .addContainerGap())
        );

        tabTingkat1.addTab("Tingkat 1", jPanel1);

        tblTingkat2.setForeground(new java.awt.Color(255, 255, 255));
        tblTingkat2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Jadwal", "Shift", "Kode Mata Kuliah", "Nama Mata Kuliah", "Dosen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tblTingkat2);
        if (tblTingkat2.getColumnModel().getColumnCount() > 0) {
            tblTingkat2.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnAddT2.setText("Add");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddT2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddT2)
                .addContainerGap())
        );

        tabTingkat1.addTab("Tingkat 2", jPanel5);

        tblTingkat3.setForeground(new java.awt.Color(255, 255, 255));
        tblTingkat3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Jadwal", "Shift", "Kode Mata Kuliah", "Nama Mata Kuliah", "Dosen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tblTingkat3);
        if (tblTingkat3.getColumnModel().getColumnCount() > 0) {
            tblTingkat3.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnAddT3.setText("Add");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddT3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddT3)
                .addContainerGap())
        );

        tabTingkat1.addTab("Tingkat 3", jPanel2);

        tblTingkat4.setForeground(new java.awt.Color(255, 255, 255));
        tblTingkat4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDJadwal", "Shift", "Kode Mata Kuliah", "Nama Mata Kuliah", "Dosen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tblTingkat4);
        if (tblTingkat4.getColumnModel().getColumnCount() > 0) {
            tblTingkat4.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnAddT4.setText("Add");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddT4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddT4)
                .addContainerGap())
        );

        tabTingkat1.addTab("Tingkat 4", jPanel3);

        jScrollPane3.setViewportView(listRegMatkulPilihan);

        btnRemove.setText("Remove");

        javax.swing.GroupLayout RegMatkulLayout = new javax.swing.GroupLayout(RegMatkul);
        RegMatkul.setLayout(RegMatkulLayout);
        RegMatkulLayout.setHorizontalGroup(
            RegMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegMatkulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabTingkat1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegMatkulLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRemove)))
                .addContainerGap())
        );
        RegMatkulLayout.setVerticalGroup(
            RegMatkulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegMatkulLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(tabTingkat1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Registrasi Matakuliah", RegMatkul);

        jLabel13.setText("Mata kuliah pilihan");

        jScrollPane7.setViewportView(listAccMatkulPilihan);

        jLabel14.setText("Total SKS pilihan");

        txtTotSKS.setEditable(false);
        txtTotSKS.setText("totalSKS");

        btnRequestACC.setText("Ajukan ACC Dosen Wali");

        javax.swing.GroupLayout RequestACCLayout = new javax.swing.GroupLayout(RequestACC);
        RequestACC.setLayout(RequestACCLayout);
        RequestACCLayout.setHorizontalGroup(
            RequestACCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestACCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RequestACCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(RequestACCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addGroup(RequestACCLayout.createSequentialGroup()
                        .addGroup(RequestACCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotSKS, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRequestACC, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RequestACCLayout.setVerticalGroup(
            RequestACCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestACCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RequestACCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RequestACCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTotSKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnRequestACC)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Request ACC", RequestACC);

        jLabel1.setText("Arsip Kartu Studi Mahasiswa (KSM)");

        jLabel2.setText("Nama Mahasiswa :");

        jLabel3.setText("NIM Mahasiswa   :");

        jLabel4.setText("Dosen Wali          : ");

        txtCKStatusReg.setEditable(false);
        txtCKStatusReg.setText("Status Registrasi");
        txtCKStatusReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCKStatusRegActionPerformed(evt);
            }
        });

        txtCKNama.setEditable(false);
        txtCKNama.setText("YourName");
        txtCKNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCKNamaActionPerformed(evt);
            }
        });

        txtCKNim.setEditable(false);
        txtCKNim.setText("YourNIM");

        txtCKDoswal.setEditable(false);
        txtCKDoswal.setText("YourDosWal");

        btnCetakKSM.setText("Cetak KSM");
        btnCetakKSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakKSMActionPerformed(evt);
            }
        });

        jLabel12.setText("Status Registrasi:");

        javax.swing.GroupLayout CetakKSMLayout = new javax.swing.GroupLayout(CetakKSM);
        CetakKSM.setLayout(CetakKSMLayout);
        CetakKSMLayout.setHorizontalGroup(
            CetakKSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CetakKSMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CetakKSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CetakKSMLayout.createSequentialGroup()
                        .addGroup(CetakKSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CetakKSMLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCKDoswal, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CetakKSMLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(CetakKSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CetakKSMLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1))
                                    .addGroup(CetakKSMLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(txtCKNama, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CetakKSMLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCKNim, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CetakKSMLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CetakKSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CetakKSMLayout.createSequentialGroup()
                                .addComponent(btnCetakKSM)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCKStatusReg))))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        CetakKSMLayout.setVerticalGroup(
            CetakKSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CetakKSMLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(CetakKSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCKNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CetakKSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCKNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CetakKSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCKDoswal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(CetakKSMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCKStatusReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCetakKSM)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cetak KSM", CetakKSM);

        jLabel5.setText("Nama");

        jLabel6.setText("NIM");

        jLabel7.setText("Jenis Kelamin");

        jLabel8.setText("Tempat lahir");

        jLabel9.setText("Tanggal lahir");

        txtName.setEditable(false);
        txtName.setText("YourName");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtNIM.setEditable(false);
        txtNIM.setText("YourName");
        txtNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIMActionPerformed(evt);
            }
        });

        txtTptLahir.setEditable(false);
        txtTptLahir.setText("Your Birthplace");

        txtTglLahir.setEditable(false);
        txtTglLahir.setText("Your Birthday");

        btnTptLahir.setText("Ganti");

        btnTglLahir.setText("Ganti");

        jLabel10.setText("No HP");

        txtNoHp.setText("Your Phone Number");
        txtNoHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoHpActionPerformed(evt);
            }
        });

        btnNoHp.setText("Ganti");

        jLabel11.setText("Email");

        txtEmail.setText("Your Email");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnEmail.setText("Ganti");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("Ingin keluar?");

        tfJK.setEditable(false);
        tfJK.setText("Your Sex");

        javax.swing.GroupLayout ProfilLayout = new javax.swing.GroupLayout(Profil);
        Profil.setLayout(ProfilLayout);
        ProfilLayout.setHorizontalGroup(
            ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilLayout.createSequentialGroup()
                .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(79, 79, 79)
                        .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtName)
                            .addComponent(txtNIM, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtTptLahir)
                            .addComponent(txtTglLahir)
                            .addComponent(txtNoHp)
                            .addComponent(tfJK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTptLahir)
                            .addComponent(btnTglLahir)
                            .addComponent(btnNoHp)
                            .addComponent(btnEmail)))
                    .addGroup(ProfilLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(btnLogout))))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        ProfilLayout.setVerticalGroup(
            ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTptLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnTptLahir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnTglLahir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoHp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmail))
                .addGap(81, 81, 81)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Profil", Profil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCKStatusRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCKStatusRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCKStatusRegActionPerformed

    private void btnCetakKSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakKSMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCetakKSMActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIMActionPerformed

    private void txtNoHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoHpActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCKNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCKNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCKNamaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CetakKSM;
    private javax.swing.JPanel Profil;
    private javax.swing.JPanel RegMatkul;
    private javax.swing.JPanel RequestACC;
    private javax.swing.JButton btnAddT1;
    private javax.swing.JButton btnAddT2;
    private javax.swing.JButton btnAddT3;
    private javax.swing.JButton btnAddT4;
    private javax.swing.JButton btnCetakKSM;
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNoHp;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnRequestACC;
    private javax.swing.JButton btnTglLahir;
    private javax.swing.JButton btnTptLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JList<String> listAccMatkulPilihan;
    private javax.swing.JList<String> listRegMatkulPilihan;
    private javax.swing.JTabbedPane tabTingkat1;
    private javax.swing.JTable tblTingkat1;
    private javax.swing.JTable tblTingkat2;
    private javax.swing.JTable tblTingkat3;
    private javax.swing.JTable tblTingkat4;
    private javax.swing.JTextField tfJK;
    private javax.swing.JTextField txtCKDoswal;
    private javax.swing.JTextField txtCKNama;
    private javax.swing.JTextField txtCKNim;
    private javax.swing.JTextField txtCKStatusReg;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNoHp;
    private javax.swing.JTextField txtTglLahir;
    private javax.swing.JTextField txtTotSKS;
    private javax.swing.JTextField txtTptLahir;
    // End of variables declaration//GEN-END:variables

    
}
