import javax.swing.JOptionPane;

/**
 *
 * @author monic
 */
public class TelaConfiguracoes extends javax.swing.JFrame {
    static int idLogin;
    /**
     * Creates new form TelaConfiguracoes
     */
    public TelaConfiguracoes(int idLogin) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
    }

                        
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        ajusteAudioButton = new javax.swing.JButton();
        alterarCadastroButton = new javax.swing.JButton();
        voltarMenuPrincipalButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        menuPrincipalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(222, 209, 193));

        ajusteAudioButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        ajusteAudioButton.setText("Ajuste de Áudio");
        ajusteAudioButton.setBorder(null);
        ajusteAudioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajusteAudioButtonActionPerformed(evt);
            }
        });

        alterarCadastroButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        alterarCadastroButton.setText("Alterar Cadastro");
        alterarCadastroButton.setBorder(null);
        alterarCadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCadastroButtonActionPerformed(evt);
            }
        });

        voltarMenuPrincipalButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        voltarMenuPrincipalButton.setText("Voltar ao Menu Principal");
        voltarMenuPrincipalButton.setBorder(null);
        voltarMenuPrincipalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuPrincipalButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon("D:\\PII\\logo.png")); // NOI18N
        logoLabel.setText("jLabel1");

        menuPrincipalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        menuPrincipalLabel.setText("Configurações");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 354, 354))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(menuPrincipalLabel)
                        .addGap(621, 621, 621))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ajusteAudioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alterarCadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(590, 590, 590))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(voltarMenuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(menuPrincipalLabel)
                .addGap(60, 60, 60)
                .addComponent(ajusteAudioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(alterarCadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(voltarMenuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ajusteAudioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        TelaAudio frame = new TelaAudio(idLogin);
        this.dispose();
        frame.setVisible(true);
    }                                                 

    private void alterarCadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        TelaAlterarCadastro frame = new TelaAlterarCadastro(idLogin);
        this.dispose();
        frame.setVisible(true);
    }                                                     

    private void voltarMenuPrincipalButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        DAO dao = new DAO();
        try{
            if(dao.existeProfessor(idLogin) == false){
                TelaMenuPrincipalProfessor frame = new TelaMenuPrincipalProfessor(idLogin);
                this.dispose();
                frame.setVisible(true);
            }else{
                TelaMenuPrincipalAluno frame = new TelaMenuPrincipalAluno(idLogin);
                this.dispose();
                frame.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos");
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
            java.util.logging.Logger.getLogger(TelaConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfiguracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfiguracoes(idLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ajusteAudioButton;
    private javax.swing.JButton alterarCadastroButton;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel menuPrincipalLabel;
    private javax.swing.JButton voltarMenuPrincipalButton;
    // End of variables declaration                   
}