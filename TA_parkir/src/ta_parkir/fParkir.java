/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_parkir;


import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.awt.PrintJob;
import java.awt.Graphics;
import java.awt.Font;

/**
 *
 * @author zurin
 */
public class fParkir extends javax.swing.JFrame {
    DefaultTableModel masuk, keluar;
    koneksi konek = new koneksi();
    /**
     * Creates new form fParkir
     */
    public fParkir(java.awt.Frame parent, boolean modal) {
//        super(parent, modal);
        konek.koneksi();
        initComponents();
        btnSimpan.setBackground(Color.GREEN);
        btnReset.setBackground(Color.red);
        btnCari.setBackground(Color.BLUE);
        btnKeluar.setBackground(Color.BLACK);
//        btnCetak.setBackground(Color.green);
        btnClear.setBackground(Color.RED);
        setLocationRelativeTo(null);
        tampil_masuk();
        tampil_keluar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbiaya = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbKeluar = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtKNoPol = new javax.swing.JTextField();
        txtKNoTiket = new javax.swing.JTextField();
        txtKJenis = new javax.swing.JTextField();
        txtKTglMasuk = new javax.swing.JTextField();
        txtKJamMasuk = new javax.swing.JTextField();
        txtKDurasiH = new javax.swing.JTextField();
        txtKDurasiJ = new javax.swing.JTextField();
        txtKBiaya = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtKBiayaAkhir = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        txt_idPegawai = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNoPol = new javax.swing.JTextField();
        cbJenis = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMasuk = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        txt_idPegawai2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnParkir = new javax.swing.JMenu();
        mnKeluar = new javax.swing.JMenuItem();

        lblbiaya.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Parkir");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbKeluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "Pegawai", "No. Pol", "Jenis", "Tgl Keluar", "Jam Keluar", "Biaya"
            }
        ));
        jScrollPane2.setViewportView(tbKeluar);

        jLabel4.setText("No. Pol");

        jLabel5.setText("No. Tiket");

        jLabel6.setText("Jenis");

        jLabel7.setText("Tgl Masuk");

        jLabel8.setText("Jam Masuk");

        jLabel9.setText("Durasi Hari");

        jLabel10.setText("Durasi Jam");

        jLabel11.setText("Biaya Parkir");

        txtKNoPol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKNoPolKeyTyped(evt);
            }
        });

        txtKNoTiket.setEditable(false);

        txtKJenis.setEditable(false);

        txtKTglMasuk.setEditable(false);

        txtKJamMasuk.setEditable(false);

        txtKDurasiH.setEditable(false);

        txtKDurasiJ.setEditable(false);

        txtKBiaya.setEditable(false);

        btnCari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setIcon(new javax.swing.ImageIcon("F:\\Tugas Kuliah\\BASIS DATA\\UAS Basis Data\\TA_parkir\\cari.png")); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setIcon(new javax.swing.ImageIcon("F:\\Tugas Kuliah\\BASIS DATA\\UAS Basis Data\\TA_parkir\\keluar parkir.png")); // NOI18N
        btnKeluar.setText("Keluar Parkiran");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        txtKBiayaAkhir.setEditable(false);

        jLabel12.setText("Biaya Akhir");

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon("F:\\Tugas Kuliah\\BASIS DATA\\UAS Basis Data\\TA_parkir\\clear.png")); // NOI18N
        btnClear.setText("Bersihkan");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txt_idPegawai.setBackground(new java.awt.Color(240, 240, 240));

        jLabel13.setText("Petugas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9))
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtKTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtKDurasiH)
                                                .addComponent(txtKBiaya))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel8))
                                                .addComponent(jLabel12))
                                            .addGap(12, 12, 12))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtKJenis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                                .addComponent(txtKNoTiket, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtKNoPol, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnKeluar)
                                .addGap(149, 149, 149)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKDurasiJ, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtKJamMasuk, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtKBiayaAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_idPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtKNoPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtKNoTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtKJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(txt_idPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtKTglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKJamMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(txtKDurasiH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKDurasiJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtKBiayaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Parkir Keluar", jPanel1);

        jLabel1.setText("No. Pol");

        jLabel2.setText("Jenis");

        txtNoPol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoPolKeyTyped(evt);
            }
        });

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Jenis Kendaraan-", "Motor", "Mobil" }));

        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setIcon(new javax.swing.ImageIcon("F:\\Tugas Kuliah\\BASIS DATA\\UAS Basis Data\\TA_parkir\\save.png")); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        tbMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "Pegawai", "No. Pol", "Jenis", "Tanggal Masuk", "Jam Masuk"
            }
        ));
        jScrollPane1.setViewportView(tbMasuk);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon("F:\\Tugas Kuliah\\BASIS DATA\\UAS Basis Data\\TA_parkir\\clear.png")); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel14.setText("Kode Petugas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(13, 13, 13)
                .addComponent(txt_idPegawai2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbJenis, 0, 446, Short.MAX_VALUE)
                            .addComponent(txtNoPol))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_idPegawai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Parkir Masuk", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Parkir");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 290, 43));

        mnParkir.setIcon(new javax.swing.ImageIcon("F:\\Tugas Kuliah\\BASIS DATA\\UAS Basis Data\\TA_parkir\\mobil.png")); // NOI18N
        mnParkir.setText("Menu Parkir");

        mnKeluar.setIcon(new javax.swing.ImageIcon("F:\\Tugas Kuliah\\BASIS DATA\\UAS Basis Data\\TA_parkir\\out.png")); // NOI18N
        mnKeluar.setText("Tutup");
        mnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnKeluarActionPerformed(evt);
            }
        });
        mnParkir.add(mnKeluar);

        jMenuBar1.add(mnParkir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mnKeluarActionPerformed

    private void txtNoPolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoPolKeyTyped
        // TODO add your handling code here:
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar())); 
    }//GEN-LAST:event_txtNoPolKeyTyped

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        if (txtNoPol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomor polisi belum diisi!");
        } else if (cbJenis.getSelectedItem().equals("-Pilih Jenis Kendaraan-")) {
            JOptionPane.showMessageDialog(this, "Jenis kendaraan belum dipilih");
        } else {
            String nopol, jenis, sql, pegawai;
            nopol = txtNoPol.getText();
            jenis = cbJenis.getSelectedItem().toString();
            pegawai = txt_idPegawai2.getText();

            int a = Integer.parseInt(pegawai);
            sql = "INSERT INTO tb_parkir(no_pol,id_pegawai,jenis,tgl_masuk,jam_masuk)"
                    + "VALUES('"+nopol+"','"+a+"','"+jenis+"',CURDATE(),CURTIME())";
            try{
                konek.st = konek.conn.createStatement();
                konek.st.execute(sql);
            }
            catch (SQLException e){
//                JOptionPane.showMessageDialog(this, "Data gagal disimpan "+e);
                System.out.println(e);
                return;
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        }
        
        resetAll();
        tampil_masuk();
        tampil_keluar();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtNoPol.setText("");
        cbJenis.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        if(txtKNoPol.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "No. Pol masih kosong!");
        else {
            DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            rupiah.setDecimalFormatSymbols(formatRp);

            String sql = "SELECT *, DATEDIFF(CURDATE(), tgl_masuk) durasi_hari, (TIME_FORMAT(CURTIME(),'%r')-TIME_FORMAT(jam_masuk, '%r')) durasi_jam, nama_pegawai "
                    + "FROM tb_parkir, petugas WHERE  tb_parkir.id_pegawai = petugas.id_pegawai and no_pol='"+txtKNoPol.getText()+"' AND biaya=0";
            try
            {
                konek.st = konek.conn.createStatement();
                konek.rs = konek.st.executeQuery(sql);
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(this, "Kesalahan query"+ex);
            }
            int size=0;
            try {
                while (konek.rs.next()){
                    size++;
                    txtKNoTiket.setText(konek.rs.getString("no_tiket").toString());
                    txtKJenis.setText(konek.rs.getString("jenis").toString());
                    txtKTglMasuk.setText(konek.rs.getString("tgl_masuk").toString());
                    txtKJamMasuk.setText(konek.rs.getString("jam_masuk").toString());
                    txt_idPegawai.setText(konek.rs.getString("id_pegawai").toString());
                    int hari = Integer.parseInt(konek.rs.getString("durasi_hari"));
                    int jam = Integer.parseInt(konek.rs.getString("durasi_jam"));
                    int biaya, biaya_akhir;
                    if(txtKJenis.getText().equals("Mobil")){
                        txtKBiaya.setText(rupiah.format(5000));
                        biaya = 5000;
                    } else {
                        txtKBiaya.setText(rupiah.format(2000));
                        biaya = 2000;
                    }
                    if(hari>0){
                        txtKDurasiH.setText(""+hari+" hari");
                        txtKDurasiJ.setText("-");
                        biaya_akhir = biaya + (50000*hari);
                        txtKBiayaAkhir.setText(rupiah.format(biaya_akhir));
                        lblbiaya.setText(""+biaya_akhir);
                    }
                    else{ 
                        txtKDurasiH.setText("0 hari");
                        txtKDurasiJ.setText(konek.rs.getString("durasi_jam").toString());
                        biaya_akhir = biaya + (1000*jam);
                        txtKBiayaAkhir.setText(rupiah.format(biaya_akhir));
                        lblbiaya.setText(""+biaya_akhir);
                    }

                 }
                if(size==0)
                {
                    JOptionPane.showMessageDialog(this,"Data tidak ditemukan");
                    return;
                }
                konek.rs.close();
                konek.st.close();
            } catch (SQLException ex){
            }
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtKNoPolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKNoPolKeyTyped
        // TODO add your handling code here:
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar())); 
    }//GEN-LAST:event_txtKNoPolKeyTyped

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        if(txtKNoPol.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Data kosong!");
        else {
            int biaya = Integer.parseInt(lblbiaya.getText());
            String sql, notiket;
            notiket = txtKNoTiket.getText();
            
            sql = "UPDATE tb_parkir SET tgl_keluar=CURDATE(), jam_keluar=CURTIME(), biaya='"+biaya+"' "
                    + "WHERE no_tiket='"+notiket+"'";
                try{
                    konek.st = konek.conn.createStatement();
                    konek.st.execute(sql);
                }
                catch (SQLException e){
                    JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
                    return;
                }
                JOptionPane.showMessageDialog(this, "Data berhasil diperbaharui");
            
            resetAll();
            tampil_masuk();
            tampil_keluar();
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtKNoPol.setText("");
        txtKNoTiket.setText("");
        txtKJenis.setText("");
        txtKTglMasuk.setText("");
        txtKJamMasuk.setText("");
        txtKDurasiH.setText("");
        txtKDurasiJ.setText("");
        txtKBiaya.setText("");
        txtKBiayaAkhir.setText("");
    }//GEN-LAST:event_btnClearActionPerformed
    
    public void resetAll(){
        txtNoPol.setText("");
        cbJenis.setSelectedIndex(0);
        masuk = (DefaultTableModel) tbMasuk.getModel();
        keluar = (DefaultTableModel) tbKeluar.getModel();
        int rowCount1 = masuk.getRowCount();
        int rowCount2 = keluar.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount1 - 1; i >= 0; i--) {
            masuk.removeRow(i);
        }
        for (int i = rowCount2 - 1; i >= 0; i--) {
            keluar.removeRow(i);
        }
    }
    
    public void tampil_masuk(){
        masuk = (DefaultTableModel) tbMasuk.getModel();
        try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT no_tiket, nama_pegawai, no_pol, jenis, tgl_masuk, jam_masuk FROM tb_parkir, petugas WHERE tb_parkir.id_pegawai = petugas.id_pegawai and biaya=0 ORDER BY no_tiket DESC LIMIT 25"
                    + "";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String pegawai = konek.rs.getString("nama_pegawai");
                String no_pol = konek.rs.getString("no_pol");
                String jenis = konek.rs.getString("jenis");
                String tgl_masuk = konek.rs.getString("tgl_masuk");
                String jam_masuk = konek.rs.getString("jam_masuk");
                
                String [] data = {no_tiket,pegawai, no_pol, jenis, tgl_masuk, jam_masuk};
                masuk.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbMasuk.setModel(masuk);
    }
    
    public void tampil_keluar(){
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        keluar = (DefaultTableModel) tbKeluar.getModel();
        try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT no_tiket, nama_pegawai, no_pol, jenis, tgl_keluar, jam_keluar, biaya FROM tb_parkir, petugas WHERE tb_parkir.id_pegawai = petugas.id_pegawai and biaya <> 0 ORDER BY tgl_keluar DESC,jam_keluar DESC LIMIT 15";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String pegawai = konek.rs.getString("nama_pegawai");
                String no_pol = konek.rs.getString("no_pol");
                String jenis = konek.rs.getString("jenis");
                String tgl_keluar = konek.rs.getString("tgl_keluar");
                String jam_keluar = konek.rs.getString("jam_keluar");
                String biaya = konek.rs.getString("biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_final = (rupiah.format(biaya2));
                
                String [] data = {no_tiket,pegawai, no_pol, jenis, tgl_keluar, jam_keluar, biaya_final};
                keluar.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbKeluar.setModel(keluar);
    }
    
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
            java.util.logging.Logger.getLogger(fParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fParkir dialog = new fParkir(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblbiaya;
    private javax.swing.JMenuItem mnKeluar;
    private javax.swing.JMenu mnParkir;
    private javax.swing.JTable tbKeluar;
    private javax.swing.JTable tbMasuk;
    private javax.swing.JTextField txtKBiaya;
    private javax.swing.JTextField txtKBiayaAkhir;
    private javax.swing.JTextField txtKDurasiH;
    private javax.swing.JTextField txtKDurasiJ;
    private javax.swing.JTextField txtKJamMasuk;
    private javax.swing.JTextField txtKJenis;
    private javax.swing.JTextField txtKNoPol;
    private javax.swing.JTextField txtKNoTiket;
    private javax.swing.JTextField txtKTglMasuk;
    private javax.swing.JTextField txtNoPol;
    private javax.swing.JTextField txt_idPegawai;
    private javax.swing.JTextField txt_idPegawai2;
    // End of variables declaration//GEN-END:variables
}