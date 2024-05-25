/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.quizartvantgarde;

import javax.swing.JOptionPane;

/**
 *
 * @author louis
 */
public class TelaModoDeJogo extends javax.swing.JFrame {
    static int idLogin;
    static int idVanguarda;
    /**
     * Creates new form TelaModoDeJogo
     */
    public TelaModoDeJogo(int idLogin, int idVanguarda) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
        this.idLogin = idLogin;
        this.idVanguarda = idVanguarda;
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
        nomeCompletoLabel = new javax.swing.JLabel();
        grupoButton = new javax.swing.JButton();
        salaLabel = new javax.swing.JLabel();
        individualButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 209, 193));
        jPanel1.setPreferredSize(new java.awt.Dimension(1596, 848));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\louis\\OneDrive\\Imagens\\ArtVantGarde_logo.png")); // NOI18N
        jLabel1.setText("jLabel1");

        nomeCompletoLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        nomeCompletoLabel.setText("Jogue em grupo de até 4 pessoas");

        grupoButton.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        grupoButton.setText("Jogo em Grupo");
        grupoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoButtonActionPerformed(evt);
            }
        });

        salaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        salaLabel.setText("Jogue sozinho");

        individualButton.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        individualButton.setText("Jogo Individual");
        individualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                individualButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setText("Modo de Jogo");

        voltarButton.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nomeCompletoLabel)
                .addGap(652, 652, 652))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(673, 673, 673))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarButton)
                        .addGap(741, 741, 741))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salaLabel)
                        .addGap(728, 728, 728))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(grupoButton)
                        .addGap(695, 695, 695))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(individualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(686, 686, 686))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(grupoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCompletoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(individualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaLabel)
                .addGap(27, 27, 27)
                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grupoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoButtonActionPerformed
        String nomeGrupo = JOptionPane.showInputDialog(null, "Dê um nome ao grupo: ", "Quiz ArtVantGarde",  1);
        DAO dao = new DAO();
        Boolean dadosOk = false;
        try{
            dao.cadastroGrupo(nomeGrupo);
            int jogadores = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de jogadores por grupo: ", "Quiz ArtVantGarde", 3));
            int idGrupo = dao.pegarIdGrupo(nomeGrupo);
            for(int i = 1; i <= jogadores; i++){
                while(! dadosOk){
                    String nome = JOptionPane.showInputDialog(null, "Insira o nome completo do " + i + "º integrante: ", "Quiz ArtVantGarde", 3);
                    String serie = JOptionPane.showInputDialog(null, "Insira a série do integrante: ", "Quiz ArtVantGarde", 3);
                    if(dao.existeAluno(nome, serie)){
                       dao.cadastroIntegrantesGrupo(idGrupo, idLogin);
                       dadosOk = true;
                    }else{
                        JOptionPane.showMessageDialog(null, "O usuario inserido não existe! Certifique-se de que você digitou os dados corretamente e tente novamente", "Quiz ArtVantGarde", 3);
                    }
                }
                JOptionPane.showMessageDialog(null, "Integrante cadastrado com sucesso!");
            }    
            JOptionPane.showMessageDialog(null, "Grupo registrado!", "Quiz ArtVantGarde", 1);
        TelaJogo frame = new TelaJogo(idLogin, idGrupo, idVanguarda);
        this.dispose();
        frame.setVisible(true);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!");
        }
    }//GEN-LAST:event_grupoButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        TelaMenuPrincipalAluno frame = new TelaMenuPrincipalAluno(idLogin);
        this.dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void individualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_individualButtonActionPerformed
        String nomeGrupo = JOptionPane.showInputDialog(null, "Crie um apelido: ", "Quiz ArtVantGarde",  1);
        DAO dao = new DAO();
        try {
            dao.cadastroGrupo(nomeGrupo);  
            int idGrupo = dao.pegarIdGrupo(nomeGrupo);
            dao.cadastroIntegrantesGrupo(idGrupo, idLogin);
            TelaNivel frame = new TelaNivel(idLogin);
            this.dispose();
            frame.setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!");
        }
        
    }//GEN-LAST:event_individualButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaModoDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaModoDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaModoDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaModoDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaModoDeJogo(idLogin, idVanguarda).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton grupoButton;
    private javax.swing.JButton individualButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeCompletoLabel;
    private javax.swing.JLabel salaLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
