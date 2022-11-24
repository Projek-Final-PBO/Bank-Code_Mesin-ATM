/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Class.Akun;
import Class.Transfer;
import javax.swing.JOptionPane;

/**
 *
 * @author taraa
 */
public class transfer extends javax.swing.JFrame {
    private static String norek;
    /**
     * Creates new form transfer
     */
    public transfer(String norek) {
        this.norek = norek;
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        norekpen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        kembaliBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tranferBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("No. Rekening Penerima :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, 38));

        norekpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                norekpenActionPerformed(evt);
            }
        });
        jPanel2.add(norekpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 200, 32));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jumlah :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 38));
        jPanel2.add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 200, 32));

        kembaliBtn.setBackground(new java.awt.Color(0, 153, 153));
        kembaliBtn.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        kembaliBtn.setForeground(new java.awt.Color(255, 255, 255));
        kembaliBtn.setText("Kembali");
        kembaliBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        kembaliBtn.setBorderPainted(false);
        kembaliBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliBtnMouseClicked(evt);
            }
        });
        kembaliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBtnActionPerformed(evt);
            }
        });
        jPanel2.add(kembaliBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 66, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/transfer.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 170, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_BANK-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 170, 170));

        tranferBtn.setBackground(new java.awt.Color(0, 153, 153));
        tranferBtn.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        tranferBtn.setForeground(new java.awt.Color(255, 255, 255));
        tranferBtn.setText("Transfer");
        tranferBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        tranferBtn.setBorderPainted(false);
        tranferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranferBtnActionPerformed(evt);
            }
        });
        jPanel2.add(tranferBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 66, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 600, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliBtnActionPerformed

    private void norekpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_norekpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_norekpenActionPerformed

    private void tranferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranferBtnActionPerformed
        Akun akun = new Akun();
        akun.isiDataAkun(norek);
        int jumlahtf = Integer.parseInt(jumlah.getText());
        int saldo = Integer.parseInt(akun.getSaldo());
        Transfer tf = new Transfer(norek, norekpen.getText());
        if(saldo - jumlahtf >= 0){
           tf.Transfer(jumlahtf);
       } else {
           JOptionPane.showMessageDialog(this, "Saldo Anda kurang!");
       }
        JOptionPane.showMessageDialog(this, "Berhasil transfer");
        norekpen.setText("");
        jumlah.setText("");
    }//GEN-LAST:event_tranferBtnActionPerformed

    private void kembaliBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliBtnMouseClicked
        home hom = new home(norek);
        hom.setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliBtnMouseClicked

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
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transfer(norek).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jumlah;
    private javax.swing.JButton kembaliBtn;
    private javax.swing.JTextField norekpen;
    private javax.swing.JButton tranferBtn;
    // End of variables declaration//GEN-END:variables
}
