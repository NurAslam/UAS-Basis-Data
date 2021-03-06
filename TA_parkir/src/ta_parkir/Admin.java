/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_parkir;
import java.awt.Color;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ta_parkir.Login.Form;
import ta_parkir.Login.Login;
import ta_parkir.Login.Session;
/**
 *
 * @author Assalam
 */
public class Admin extends javax.swing.JFrame {
    koneksi konek = new koneksi();
    DefaultTableModel tabmode;
    Login login = new Login();
    
    /**
     * Creates new form Admin
     */
    public Admin() {
        konek.koneksi();
        if(Session.getStatusLogin() == "AKTIF"){
        initComponents();
        setNama();
         btn_petugas.setBackground(Color.BLACK);
            setLocationRelativeTo(null);
        int tahun = Calendar.getInstance().get(Calendar.YEAR);
        int bulan = Calendar.getInstance().get(Calendar.MONTH);
        for (int i = tahun; i > 2000; i--) {
        cbTahun.addItem(""+i);   
        }
        cbTahun.setSelectedItem(""+tahun);
        cbBulan.setSelectedIndex(bulan);
        String bln = cbBulan.getSelectedItem().toString();
        tampil_harian();
        tampil_bulanan((bulan+1), tahun, bln);
        btnOK.setBackground(Color.cyan);
        btn_cari.setBackground(Color.BLUE);
        }else{
            Form FormLogin = new Form();
            FormLogin.setVisible(true);
            dispose();

        }
        
//        initComponents();
 
    }
    private void setNama(){
        ppp.setText(Session.getNama());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ppp = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelHarian = new javax.swing.JTable();
        txt_cari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        txt_totalHarian = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBulanan = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cbBulan = new javax.swing.JComboBox<>();
        cbTahun = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtTotalBulanan = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btn_petugas = new javax.swing.JButton();
        txt_nama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 456, 127, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 0, -1, -1));

        ppp.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        ppp.setForeground(new java.awt.Color(255, 255, 255));
        ppp.setText("Nama");
        jPanel1.add(ppp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 49, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Pendapatan Hari Ini");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Total Pendapatan Harian:");

        tabelHarian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "Pegawai", "Biaya"
            }
        ));
        jScrollPane1.setViewportView(tabelHarian);

        txt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cariActionPerformed(evt);
            }
        });

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        txt_totalHarian.setBackground(new java.awt.Color(204, 204, 204));
        txt_totalHarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalHarianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_totalHarian, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cari)
                .addGap(18, 18, 18)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_totalHarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Harian", jPanel3);

        tbBulanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "Pegawai", "Biaya"
            }
        ));
        jScrollPane3.setViewportView(tbBulanan);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setText("Pendapatan Bulanan");

        cbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "Septermber", "Oktober", "November", "Desember" }));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Total Pendapatan Bulanan: ");

        txtTotalBulanan.setEditable(false);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(3, 3, 3)
                        .addComponent(txtTotalBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTotalBulanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jTabbedPane1.addTab("Bulanan", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));

        btn_petugas.setText("Petugas");
        btn_petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_petugasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_petugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 11, -1, -1));

        txt_nama.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        txt_nama.setForeground(new java.awt.Color(255, 255, 255));
        txt_nama.setText("Selamat Datang");
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 11, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Assalam\\Downloads\\2927262.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 560, 490));

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        String cari = txt_cari.getText();
        cariData(cari);
    }//GEN-LAST:event_btn_cariActionPerformed

    private void txt_totalHarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalHarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalHarianActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        int bulan = cbBulan.getSelectedIndex()+1;
        String bln = cbBulan.getSelectedItem().toString();
        String th = cbTahun.getSelectedItem().toString();
        int tahun = Integer.parseInt(th);
        resetTable();
        tampil_bulanan(bulan, tahun, bln);
    }//GEN-LAST:event_btnOKActionPerformed

    private void btn_petugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_petugasActionPerformed
        new Form_petugas().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_petugasActionPerformed
    public void resetTable(){
        int rowCount = tabmode.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            tabmode.removeRow(i);
        }
    }  
    public void tampil_harian(){
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        tabmode = (DefaultTableModel) tabelHarian.getModel();
        try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT no_tiket, nama_pegawai, biaya FROM tb_parkir, petugas WHERE tb_parkir.id_pegawai = petugas.id_pegawai  ORDER BY jam_keluar";
            konek.rs = konek.st.executeQuery(query);
            int i = 0;
            while (konek.rs.next()) {
                i++;
                String no_tiket = konek.rs.getString("no_tiket");
                String nama_pegawai = konek.rs.getString("nama_pegawai");
                String biaya = konek.rs.getString("biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_final = (rupiah.format(biaya2));
                
                String [] data = {no_tiket,nama_pegawai,biaya_final};
                tabmode.addRow(data);
            }
            if (i==0) {
                JOptionPane.showMessageDialog(this, "Hari ini belum ada pendapatan masuk");
            }
            
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tabelHarian.setModel(tabmode);
        try{
            konek.st = konek.conn.createStatement();
            String query_total = "SELECT SUM(biaya) total_biaya FROM tb_parkir WHERE tgl_keluar = CURDATE() ORDER BY jam_keluar DESC";
            konek.rs = konek.st.executeQuery(query_total);
            while (konek.rs.next()) {
                String biaya = konek.rs.getString("total_biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_final = (rupiah.format(biaya2));
                txt_totalHarian.setText(biaya_final);
            }
        } catch(Exception ex){
//            JOptionPane.showMessageDialog(this, "Gagal ambil total biaya"+ex);
        }
    }   public ResultSet cariData(String cari){
        int carii = 0 ;
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
//       Object[] baris = {"No Tiket, Nama Pegawai, Biaya"};
//        tabmode = new DefaultTableModel();
//        tabelHarian.setModel(tabmode);
        String query = "select no_tiket, nama_pegawai, biaya from tb_parkir, petugas where tb_parkir.id_pegawai = petugas.id_pegawai and nama_pegawai like'"+cari+"%' "; 
        tabmode = (DefaultTableModel) tabelHarian.getModel();
        tabmode.setRowCount(carii);
        try{
            konek.st = konek.conn.createStatement();
            konek.rs = konek.st.executeQuery(query);
            
            while(konek.rs.next()){
               
                String no_tiket = konek.rs.getString("no_tiket");
                String nama_pegawai = konek.rs.getString("nama_pegawai");
                String biaya = konek.rs.getString("biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_final = (rupiah.format(biaya2));
                
                String [] data = {no_tiket,nama_pegawai,biaya_final};
                tabmode.addRow(data);
            }
        }catch(SQLException e){
            System.out.println("cari ? : " +e);
        }
        return konek.rs;
    }
      public void tampil_bulanan(int bulan, int tahun, String bln) {
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        tabmode = (DefaultTableModel) tbBulanan.getModel();
        try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT no_tiket, nama_pegawai, biaya FROM tb_parkir, petugas WHERE tb_parkir.id_pegawai = petugas.id_pegawai and MONTH(tgl_keluar) = "+bulan+" AND YEAR(tgl_keluar) = "+tahun+" ORDER BY jam_keluar DESC";
            konek.rs = konek.st.executeQuery(query);
            int i = 0;
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String NamaPegawai = konek.rs.getString("nama_pegawai");
                String biaya = konek.rs.getString("biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_final = (rupiah.format(biaya2));
                
                String [] data = {no_tiket, NamaPegawai, biaya, biaya_final};
                tabmode.addRow(data);
                i++;
            }
            if (i==0) {
                txtTotalBulanan.setText("Rp 0,00");
                JOptionPane.showMessageDialog(this, "Data pendapatan bulan "+bln+" tahun "+tahun+" kosong!");
            }
            
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbBulanan.setModel(tabmode);
        try{
            konek.st = konek.conn.createStatement();
            String query_total = "SELECT SUM(biaya) total_biaya FROM tb_parkir WHERE MONTH(tgl_keluar) = "+bulan+" AND YEAR(tgl_keluar) = "+tahun+" ORDER BY jam_keluar DESC";
            konek.rs = konek.st.executeQuery(query_total);
            while (konek.rs.next()) {
                String biaya = konek.rs.getString("total_biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_final = (rupiah.format(biaya2));
                txtTotalBulanan.setText(biaya_final);
            }
        } catch(Exception ex){
//            JOptionPane.showMessageDialog(this, "Gagal ambil total biaya"+ex);
        }
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_petugas;
    private javax.swing.JComboBox<String> cbBulan;
    private javax.swing.JComboBox<String> cbTahun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel ppp;
    private javax.swing.JTable tabelHarian;
    private javax.swing.JTable tbBulanan;
    private javax.swing.JTextField txtTotalBulanan;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JLabel txt_nama;
    private javax.swing.JTextField txt_totalHarian;
    // End of variables declaration//GEN-END:variables
}
