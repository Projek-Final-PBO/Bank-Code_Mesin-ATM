/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author taraa
 */
public class setorTunai extends javax.swing.JFrame {
    private static String norek;
    /**
     * Creates new form tariktunai
     */
    public setorTunai(String norek) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        kembaliBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        setorBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Code - Tarik Tunai");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Saldo Anda :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 38));

        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        jPanel1.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 207, 36));

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
        jPanel1.add(kembaliBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 66, -1));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PIN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 38));

        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel1.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 207, 36));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_BANK-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Jumlah yang ingin disetor :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, 38));

        setorBtn.setBackground(new java.awt.Color(0, 153, 153));
        setorBtn.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        setorBtn.setForeground(new java.awt.Color(255, 255, 255));
        setorBtn.setText("Setor");
        setorBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        setorBtn.setBorderPainted(false);
        setorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorBtnActionPerformed(evt);
            }
        });
        jPanel1.add(setorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 66, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 460));

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

    private void kembaliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliBtnActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoActionPerformed

    private void setorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(setorTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setorTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setorTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setorTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setorTunai(norek).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kembaliBtn;
    private javax.swing.JTextField pin;
    private javax.swing.JTextField saldo;
    private javax.swing.JButton setorBtn;
    // End of variables declaration//GEN-END:variables
}
