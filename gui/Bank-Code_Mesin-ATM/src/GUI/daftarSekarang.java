/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Class.Akun;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER N
 */
public class daftarSekarang extends javax.swing.JFrame {
    
    static int random = (int) (Math.random() * (1000000 - 100000)) + 100000;
    // convert dia ke string karena data bilangan ini akan di simpan di file database beresktensi .txt
    static String noRek= Integer.toString(random);
    /**
     * Creates new form daftarSekarang
     */
    
    public daftarSekarang() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        saldoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kembaliBtn = new javax.swing.JButton();
        daftarBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nomorHPTxt = new javax.swing.JTextField();
        konfPIN = new javax.swing.JTextField();
        PIN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Code - Daftar");
        setMinimumSize(new java.awt.Dimension(607, 460));
        setSize(new java.awt.Dimension(607, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Daftar Akun");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 40, -1));

        namaTxt.setText("Masukkan Nama");
        namaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTxtActionPerformed(evt);
            }
        });
        getContentPane().add(namaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 146, -1));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        jLabel3.setText("Atur PIN Anda ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 90, -1));

        saldoTxt.setText("Masukkan saldo");
        saldoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(saldoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 150, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel4.setText("Rp");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, 20));

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        jLabel5.setText("Konfirmasi PIN Anda");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 140, -1));

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        jLabel6.setText("Saldo awal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_BANK-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 130));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-user.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        kembaliBtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        kembaliBtn.setText("Kembali");
        kembaliBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliBtnMouseClicked(evt);
            }
        });
        getContentPane().add(kembaliBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 80, 40));

        daftarBtn.setText("Daftar");
        daftarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(daftarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 80, 40));

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        jLabel10.setText("Nomor HP");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 60, -1));

        nomorHPTxt.setText("NomorHp");
        nomorHPTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorHPTxtActionPerformed(evt);
            }
        });
        getContentPane().add(nomorHPTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 150, -1));

        konfPIN.setText("Konfirmasi PIN");
        konfPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konfPINActionPerformed(evt);
            }
        });
        getContentPane().add(konfPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 150, -1));

        PIN.setText("PIN");
        getContentPane().add(PIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 150, -1));

        jLabel11.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 140, -1));

        emailTxt.setText("Masukkan email");
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 150, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel12.setText("minimal 5 angka");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel13.setText("minimal Rp50.000");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTxtActionPerformed

    private void saldoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoTxtActionPerformed

    private void kembaliBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliBtnMouseClicked
        login log = new login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliBtnMouseClicked

    private void daftarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarBtnActionPerformed
//        try{
//            String jdbc = "com.mysql.cj.jdbc.Driver";
//            String url = "jdbc:mysql://localhost:3306//bank-code";
//            String root = "root";
//            String pass = "";
//            
//            Class.forName(jdbc);
//            Connection conn = DriverManager.getConnection(url,root,pass);
//            
//            String nama = namaTxt.getText();
//            String pin = PIN.getText();
//            String konfir = konfPIN.getText();
//            String nohp = nomorHPTxt.getText();
//            String email = emailTxt.getText();
//            
//            String sql = "insert into daftarAkun values (?,?,?,?,?)";
//            
//            
//            PreparedStatement stm = conn.prepareStatement(sql);
//            
//            stm.setString(1,nama);
//            stm.setString(2, pin);
//            stm.setString(3, konfir);
//            stm.setString(4, nohp);
//            stm.setString(5, email);
//            
//            //ResultSet resultset = stm.executeUpdate(sql);
//            
//                JOptionPane.showMessageDialog(null, "Akun berhasil didaftarkan");
//            stm.close();
//            conn.close();
//        }
//        catch(Exception e){  
//        }

        String nama, pin, noHp, email, saldo, konfPin;
        ArrayList<String> dataUser = new ArrayList<>();
        pin = PIN.getText();
        konfPin = konfPIN.getText();
        nama = namaTxt.getText();
        noHp = nomorHPTxt.getText();
        email = emailTxt.getText();
        saldo = saldoTxt.getText();
        double saldoUser = Double.parseDouble(saldo);
        
        if(saldoUser >= 50000 && (pin.equals(konfPin)) && pin.length()==5){
            dataUser.add(pin);
            dataUser.add(nama);
            dataUser.add(noHp);
            dataUser.add(email); 
            dataUser.add(saldo);
        }else {
            if(saldoUser<50000){
                JOptionPane.showMessageDialog(null, "Saldo Anda Kurang");
            }else if(!pin.equals(konfPin)){
                JOptionPane.showMessageDialog(null, "Pin Tidak Sesuai");
            }else if(pin.length()!=5){
                JOptionPane.showMessageDialog(null, "Format Pin Tidak Sesuai");
            }
            namaTxt.setText("");
            nomorHPTxt.setText("");
            emailTxt.setText("");
            saldoTxt.setText("");
            konfPIN.setText("");
            PIN.setText("");
        }
        
        
        try {
            akunBaru(dataUser);
        } catch (IOException e) {  
        }
         JOptionPane.showMessageDialog(this, "No Rek Anda:  " + noRek + "\nPassword Anda " + pin);
         
        
        
    }//GEN-LAST:event_daftarBtnActionPerformed

    private void nomorHPTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorHPTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorHPTxtActionPerformed

    private void konfPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konfPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_konfPINActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    public static void akunBaru(ArrayList<String> dataUser)throws IOException{
        
        Akun akunBaru = new Akun();
        
        FileWriter filewr = new FileWriter("DatabaseBank.txt", true);
        BufferedWriter bufferedWr = new BufferedWriter(filewr);
        
        bufferedWr.write(noRek + "," + dataUser.get(0) + "," + dataUser.get(1) + "," + dataUser.get(2) + "," + dataUser.get(3)+ "," + dataUser.get(4));
        bufferedWr.newLine();
        bufferedWr.flush();
        bufferedWr.close();
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
            java.util.logging.Logger.getLogger(daftarSekarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftarSekarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftarSekarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftarSekarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftarSekarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PIN;
    private javax.swing.JButton daftarBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton kembaliBtn;
    private javax.swing.JTextField konfPIN;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JTextField nomorHPTxt;
    private javax.swing.JTextField saldoTxt;
    // End of variables declaration//GEN-END:variables
}
