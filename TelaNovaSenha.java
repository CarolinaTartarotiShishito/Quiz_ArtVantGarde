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
public class TelaNovaSenha extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaNovaSenha
     */
    public TelaNovaSenha() {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
        esconderSenhaLabel.setVisible(false);
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
        logoLabel1 = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        senhaLabel = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        verSenhaLabel = new javax.swing.JLabel();
        esconderSenhaLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        senhaLabel1 = new javax.swing.JLabel();
        senhaConfirmaPasswordField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        novaSenhaButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 209, 193));

        logoLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.imgur.com/mf4A0bx.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        loginLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        loginLabel.setText("Alterar Senha");

        jPanel2.setBackground(new java.awt.Color(234, 229, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 92, 147), 3));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setText("Insira seu Email:");

        emailTextField.setBackground(new java.awt.Color(238, 238, 238));
        emailTextField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N

        senhaPasswordField.setBackground(new java.awt.Color(238, 238, 238));
        senhaPasswordField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N

        senhaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        senhaLabel.setText("Insira a senha nova:");

        verSenhaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        verSenhaLabel.setText("Ver Senha");
        verSenhaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 92, 147), 3));
        verSenhaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verSenhaLabelMouseClicked(evt);
            }
        });

        esconderSenhaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        esconderSenhaLabel.setText("Esconder Senha");
        esconderSenhaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 92, 147), 3));
        esconderSenhaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esconderSenhaLabelMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(verSenhaLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(esconderSenhaLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(verSenhaLabel)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(esconderSenhaLabel)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verSenhaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(esconderSenhaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel3.setText("Nome Completo:");

        nomeTextField.setBackground(new java.awt.Color(238, 238, 238));
        nomeTextField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N

        senhaLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        senhaLabel1.setText("Confirme sua senha:");

        senhaConfirmaPasswordField.setBackground(new java.awt.Color(238, 238, 238));
        senhaConfirmaPasswordField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaLabel1)
                            .addComponent(senhaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                            .addComponent(senhaConfirmaPasswordField))
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeTextField)
                            .addComponent(emailTextField))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senhaLabel)
                            .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senhaLabel1)
                            .addComponent(senhaConfirmaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        jPanel3.setBackground(new java.awt.Color(234, 229, 222));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 92, 147), 3));

        novaSenhaButton.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        novaSenhaButton.setText("Alterar senha");
        novaSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaSenhaButtonActionPerformed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        loginButton.setText("Voltar");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(novaSenhaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaSenhaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(logoLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(558, 558, 558)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 226, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(659, 659, 659)
                        .addComponent(loginLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novaSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaSenhaButtonActionPerformed
        DAO dao = new DAO();
        
        String email = emailTextField.getText();
        String nomeCompleto = nomeTextField.getText();
        String senha = new String(senhaPasswordField.getPassword());
        String senhaConfirma = new String(senhaConfirmaPasswordField.getPassword());
        
        if(email.isBlank() || nomeCompleto.isBlank() || senha.isBlank() || senhaConfirma.isBlank() ){
            JOptionPane.showMessageDialog(null, "É preciso preencher todos os campos!", "Quiz ArtVantGarde", 0);
        }else{
            try{
                if(dao.existeLogin(email, nomeCompleto)){
                    if(senha.equals(senhaConfirma)){
                        dao.alterarCadastro(email, senha);
                        JOptionPane.showMessageDialog(null, "Sua senha foi alterada!\nRetorne à tela de login para entrar em sua conta!",
                                "Quiz ArtVantGarde", 1);
                    }else{
                        JOptionPane.showMessageDialog(null, "As senhas inseridas são diferentes!",                         "Quiz ArtVantGarde", 1);
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, 
                            "O cadastro informado não existe!\nVerifique se você inseriu as informações\ncorretamente ou crie uma conta nova",
                            "Quiz ArtVantGarde", 1);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!");
            }
        }
    }//GEN-LAST:event_novaSenhaButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       TelaFazerLogin frame = new TelaFazerLogin();
       this.dispose();
       frame.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void esconderSenhaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esconderSenhaLabelMouseClicked
        verSenhaLabel.setVisible(true);
        esconderSenhaLabel.setVisible(false);
        senhaPasswordField.setEchoChar('*');
        senhaConfirmaPasswordField.setEchoChar('*');
    }//GEN-LAST:event_esconderSenhaLabelMouseClicked

    private void verSenhaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verSenhaLabelMouseClicked
        verSenhaLabel.setVisible(false);
        esconderSenhaLabel.setVisible(true);
        senhaPasswordField.setEchoChar((char)0);
        senhaConfirmaPasswordField.setEchoChar((char)0);
    }//GEN-LAST:event_verSenhaLabelMouseClicked

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
            java.util.logging.Logger.getLogger(TelaNovaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovaSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel esconderSenhaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton novaSenhaButton;
    private javax.swing.JPasswordField senhaConfirmaPasswordField;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JLabel senhaLabel1;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JLabel verSenhaLabel;
    // End of variables declaration//GEN-END:variables
}
