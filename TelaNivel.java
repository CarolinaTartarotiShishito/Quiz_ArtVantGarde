/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quizartvantgarde;

/**
 *
 * @author louis
 */
public class TelaNivel extends javax.swing.JFrame {
    static int idLogin;
    /**
     * Creates new form TelaNivel
     */
    public TelaNivel(int idLogin) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
        this.idLogin = idLogin;
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
        dadaismoButton = new javax.swing.JButton();
        cubismoButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fauvismoButton = new javax.swing.JButton();
        expressionismoButton = new javax.swing.JButton();
        futurismoButton = new javax.swing.JButton();
        surrealismoButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 209, 193));
        jPanel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1596, 848));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\louis\\OneDrive\\Imagens\\ArtVantGarde_logo.png")); // NOI18N
        jLabel1.setText("jLabel1");

        dadaismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        dadaismoButton.setText("Vanguarda 1");
        dadaismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadaismoButtonActionPerformed(evt);
            }
        });

        cubismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        cubismoButton.setText("Vanguarda 2");
        cubismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubismoButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setText("Níveis");

        fauvismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        fauvismoButton.setText("Vanguarda 3");
        fauvismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fauvismoButtonActionPerformed(evt);
            }
        });

        expressionismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        expressionismoButton.setText("Vanguarda 4");
        expressionismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expressionismoButtonActionPerformed(evt);
            }
        });

        futurismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        futurismoButton.setText("Vanguarda 5");
        futurismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                futurismoButtonActionPerformed(evt);
            }
        });

        surrealismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        surrealismoButton.setText("Vanguarda 6");
        surrealismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surrealismoButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar ao Menu Principal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cubismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dadaismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fauvismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(expressionismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surrealismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(futurismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(477, 477, 477))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(731, 731, 731))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(704, 704, 704))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadaismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expressionismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cubismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(futurismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fauvismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surrealismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dadaismoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadaismoButtonActionPerformed
        int idVanguarda = 2;
        TelaModoDeJogo frame = new TelaModoDeJogo(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_dadaismoButtonActionPerformed

    private void cubismoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubismoButtonActionPerformed
        int idVanguarda = 1;
        TelaModoDeJogo frame = new TelaModoDeJogo(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_cubismoButtonActionPerformed

    private void fauvismoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fauvismoButtonActionPerformed
        int idVanguarda = 4;
        TelaModoDeJogo frame = new TelaModoDeJogo(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_fauvismoButtonActionPerformed

    private void futurismoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_futurismoButtonActionPerformed
        int idVanguarda = 5;
        TelaModoDeJogo frame = new TelaModoDeJogo(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_futurismoButtonActionPerformed

    private void expressionismoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expressionismoButtonActionPerformed
        int idVanguarda = 3;
        TelaModoDeJogo frame = new TelaModoDeJogo(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_expressionismoButtonActionPerformed

    private void surrealismoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surrealismoButtonActionPerformed
        int idVanguarda = 6;
        TelaModoDeJogo frame = new TelaModoDeJogo(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_surrealismoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNivel(idLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cubismoButton;
    private javax.swing.JButton dadaismoButton;
    private javax.swing.JButton expressionismoButton;
    private javax.swing.JButton fauvismoButton;
    private javax.swing.JButton futurismoButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton surrealismoButton;
    // End of variables declaration//GEN-END:variables
}
