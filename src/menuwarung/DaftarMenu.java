/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuwarung;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author asus PC
 */
public class DaftarMenu extends javax.swing.JFrame {
    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql = "";
    /**
     * Creates new form DaftarMenu
     */
    public DaftarMenu() {
        initComponents();
        KoneksiDatabase();
    }
    private void KoneksiDatabase() {    
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_warungmakan", "root", "");
            JOptionPane.showMessageDialog(null, "koneksi berhasil");
        } catch (Exception e){
        System.out.println("koneksi gagal" + e.getMessage());
    }
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxnasigoreng = new javax.swing.JCheckBox();
        cbxayambakar = new javax.swing.JCheckBox();
        cbxsateayam = new javax.swing.JCheckBox();
        cbxtehmanis = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cbxmiegoreng = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtjumlah2 = new javax.swing.JTextField();
        txtjumlah3 = new javax.swing.JTextField();
        txtjumlah1 = new javax.swing.JTextField();
        txtjumlah4 = new javax.swing.JTextField();
        cbxjusjeruk = new javax.swing.JCheckBox();
        cbxairmineral = new javax.swing.JCheckBox();
        cbxkopihitam = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtjumlah8 = new javax.swing.JTextField();
        txtjumlah6 = new javax.swing.JTextField();
        txtjumlah5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txapesan = new javax.swing.JTextArea();
        btnreset = new javax.swing.JButton();
        txtjumlah7 = new javax.swing.JTextField();
        btnkeluar = new javax.swing.JButton();
        btnpesan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Warung Eyang Siti");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Harga :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu Makanan :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Menu Minuman :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jumlah :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Harga :");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jumlah :");

        cbxnasigoreng.setText("Nasi Goreng");
        cbxnasigoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxnasigorengActionPerformed(evt);
            }
        });

        cbxayambakar.setText("Ayam Bakar");
        cbxayambakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxayambakarActionPerformed(evt);
            }
        });

        cbxsateayam.setText("Sate Ayam");
        cbxsateayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsateayamActionPerformed(evt);
            }
        });

        cbxtehmanis.setText("Teh Manis");
        cbxtehmanis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxtehmanisActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Rp. 12.000,00");

        cbxmiegoreng.setText("Mie Goreng");
        cbxmiegoreng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmiegorengActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rp. 20.000,00");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rp. 15.000,00");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rp. 18.000,00");

        cbxjusjeruk.setText("Jus Jeruk");
        cbxjusjeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxjusjerukActionPerformed(evt);
            }
        });

        cbxairmineral.setText("Air Mineral");
        cbxairmineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxairmineralActionPerformed(evt);
            }
        });

        cbxkopihitam.setText("Kopi Hitam");
        cbxkopihitam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxkopihitamActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Rp. 5.000,00");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Rp. 7.000,00");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Rp. 7.000,00");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Rp. 3.000,00");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Menu Yang Dipesan");

        txapesan.setColumns(20);
        txapesan.setRows(5);
        jScrollPane1.setViewportView(txapesan);

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        btnpesan.setText("Pesan");
        btnpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtjumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(48, 48, 48)
                                            .addComponent(cbxtehmanis))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(54, 54, 54)
                                            .addComponent(jLabel4)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtjumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(cbxjusjeruk))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtjumlah4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(cbxairmineral))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtjumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(cbxkopihitam)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxmiegoreng)
                            .addComponent(cbxayambakar)
                            .addComponent(cbxsateayam)
                            .addComponent(cbxnasigoreng))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtjumlah5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtjumlah8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjumlah6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjumlah7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnpesan)
                        .addGap(82, 82, 82)
                        .addComponent(btnreset)
                        .addGap(95, 95, 95)
                        .addComponent(btnkeluar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel3)
                    .addContainerGap(791, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxnasigoreng)
                        .addComponent(cbxtehmanis)
                        .addComponent(jLabel10)
                        .addComponent(txtjumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtjumlah5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxmiegoreng)
                    .addComponent(jLabel8)
                    .addComponent(txtjumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxkopihitam)
                    .addComponent(jLabel14)
                    .addComponent(txtjumlah6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxayambakar)
                    .addComponent(jLabel9)
                    .addComponent(txtjumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxjusjeruk)
                    .addComponent(jLabel13)
                    .addComponent(txtjumlah7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxsateayam)
                    .addComponent(jLabel11)
                    .addComponent(txtjumlah4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxairmineral)
                    .addComponent(jLabel15)
                    .addComponent(txtjumlah8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreset)
                    .addComponent(btnkeluar)
                    .addComponent(btnpesan))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jLabel3)
                    .addContainerGap(447, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxnasigorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxnasigorengActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxnasigorengActionPerformed

    private void cbxayambakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxayambakarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxayambakarActionPerformed

    private void cbxsateayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsateayamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsateayamActionPerformed

    private void cbxtehmanisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxtehmanisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxtehmanisActionPerformed

    private void cbxmiegorengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmiegorengActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxmiegorengActionPerformed

    private void cbxjusjerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxjusjerukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxjusjerukActionPerformed

    private void cbxairmineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxairmineralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxairmineralActionPerformed

    private void cbxkopihitamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxkopihitamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxkopihitamActionPerformed

    private void btnpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesanActionPerformed
        // TODO add your handling code here:
        String tampil;
        tampil = "";
        int bayar = 0;
        if(cbxnasigoreng.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah1.getText());
            int total;
            total=jumlah*15000;
            bayar=bayar+total;
            tampil +=cbxnasigoreng.getText()+"Rp.15.000,00"+" x "+jumlah+" = "+total+"\n";                            
        }
        if(cbxmiegoreng.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah2.getText());
            int total;
            total=jumlah*12000;
            bayar=bayar+total;
            tampil +=cbxmiegoreng.getText()+"Rp.12.000,00"+" x "+jumlah+" = "+total+"\n";
        }
        if(cbxayambakar.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah3.getText());
            int total;
            total=jumlah*20000;
            bayar=bayar+total;
            tampil +=cbxayambakar.getText()+"Rp.20.000,00"+" x "+jumlah+" = "+total+"\n";
        }
        if(cbxsateayam.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah4.getText());
            int total;
            total=jumlah*18000;
            bayar=bayar+total;
            tampil +=cbxsateayam.getText()+"Rp.18.000,00"+" x "+jumlah+" = "+total+"\n";
        }
        if(cbxtehmanis.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah5.getText());
            int total;
            total=jumlah*5000;
            bayar=bayar+total;
            tampil +=cbxtehmanis.getText()+"Rp.5.000,00"+" x "+jumlah+" = "+total+"\n";
        }
        if(cbxkopihitam.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah6.getText());
            int total;
            total=jumlah*7000;
            bayar=bayar+total;
            tampil +=cbxkopihitam.getText()+"Rp.7.000,00"+" x "+jumlah+" = "+total+"\n";
        }
        if(cbxjusjeruk.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah7.getText());
            int total;
            total=jumlah*10000;
            bayar=bayar+total;
            tampil +=cbxjusjeruk.getText()+"Rp.10.000,00"+" x "+jumlah+" = "+total+"\n";
        }
        if(cbxairmineral.isSelected()){
            int jumlah=Integer.parseInt(txtjumlah8.getText());
            int total;
            total=jumlah*3000;
            bayar=bayar+total;
            tampil +=cbxairmineral.getText()+"Rp.3.000,00"+" x "+jumlah+" = "+total+"\n";
        }
        txapesan.setText(tampil+"===================="+"\n"+"ATotal Bayar ="+bayar);
    }//GEN-LAST:event_btnpesanActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txtjumlah1.setText("");
        txtjumlah2.setText("");
        txtjumlah3.setText(""); 
        txtjumlah4.setText("");
        txtjumlah5.setText("");
        txtjumlah6.setText("");
        txtjumlah7.setText("");
        txtjumlah8.setText("");
        txapesan.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnpesan;
    private javax.swing.JButton btnreset;
    private javax.swing.JCheckBox cbxairmineral;
    private javax.swing.JCheckBox cbxayambakar;
    private javax.swing.JCheckBox cbxjusjeruk;
    private javax.swing.JCheckBox cbxkopihitam;
    private javax.swing.JCheckBox cbxmiegoreng;
    private javax.swing.JCheckBox cbxnasigoreng;
    private javax.swing.JCheckBox cbxsateayam;
    private javax.swing.JCheckBox cbxtehmanis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txapesan;
    private javax.swing.JTextField txtjumlah1;
    private javax.swing.JTextField txtjumlah2;
    private javax.swing.JTextField txtjumlah3;
    private javax.swing.JTextField txtjumlah4;
    private javax.swing.JTextField txtjumlah5;
    private javax.swing.JTextField txtjumlah6;
    private javax.swing.JTextField txtjumlah7;
    private javax.swing.JTextField txtjumlah8;
    // End of variables declaration//GEN-END:variables
}
