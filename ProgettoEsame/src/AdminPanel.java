
public class AdminPanel extends javax.swing.JFrame {

    public AdminPanel() {
        initComponents();
    }

    
    
    
    
    
    
    
    
    
   //init components di netbeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelIcona = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonAssistenza = new javax.swing.JButton();
        btnMagazzino = new javax.swing.JButton();
        btngestione = new javax.swing.JButton();
        jLabelMagazzino = new javax.swing.JLabel();
        jLabelAddDel = new javax.swing.JLabel();
        jLabelAssistenza = new javax.swing.JLabel();
        jLabel_createdby = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin panel");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Empire-Apparell-.png"))); // NOI18N
        jPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 250, 50));

        jLabelIcona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/shop_icona_prima (1) (1).png"))); // NOI18N
        jPanel1.add(jLabelIcona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/exit_icona (1).png"))); // NOI18N
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 90, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 90));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAssistenza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Assistenza (1).png"))); // NOI18N
        jButtonAssistenza.setBorder(null);
        jButtonAssistenza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAssistenzaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAssistenza, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 180, 180));

        btnMagazzino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Magazzino.png"))); // NOI18N
        btnMagazzino.setBorder(null);
        btnMagazzino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMagazzinoActionPerformed(evt);
            }
        });
        jPanel2.add(btnMagazzino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 180, 180));

        btngestione.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/inserisci_prodotto (1).png"))); // NOI18N
        btngestione.setBorder(null);
        btngestione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngestioneActionPerformed(evt);
            }
        });
        jPanel2.add(btngestione, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 190, 180));

        jLabelMagazzino.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabelMagazzino.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMagazzino.setText("MAGAZZINO");
        jPanel2.add(jLabelMagazzino, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, -1));

        jLabelAddDel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabelAddDel.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAddDel.setText("GESTIONE MAGAZZINO");
        jPanel2.add(jLabelAddDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 170, -1));

        jLabelAssistenza.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabelAssistenza.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAssistenza.setText("ASSISTENZA");
        jPanel2.add(jLabelAssistenza, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 110, -1));

        jLabel_createdby.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel_createdby.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_createdby.setText("Created by Domenico Letizia and Andrea Leone");
        jPanel2.add(jLabel_createdby, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 380, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 720, 360));

        setSize(new java.awt.Dimension(705, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    
    private void btnMagazzinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMagazzinoActionPerformed
        
        new Magazzino().setVisible(true);
        this.dispose(); //chiude il jframe
    }//GEN-LAST:event_btnMagazzinoActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonAssistenzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAssistenzaActionPerformed

        new Assistenza().setVisible(true);
    }//GEN-LAST:event_jButtonAssistenzaActionPerformed

    private void btngestioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngestioneActionPerformed
        
        
        new InserisciProdotto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btngestioneActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMagazzino;
    private javax.swing.JButton btngestione;
    private javax.swing.JButton jButtonAssistenza;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelAddDel;
    private javax.swing.JLabel jLabelAssistenza;
    private javax.swing.JLabel jLabelIcona;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMagazzino;
    private javax.swing.JLabel jLabel_createdby;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
