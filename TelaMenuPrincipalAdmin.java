public class TelaMenuPrincipalAdmin extends javax.swing.JFrame {
    static int idLogin;
    /**
     * Creates new form TelaMenuPrincipalAdmin
     */
    public TelaMenuPrincipalAdmin(int idLogin) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        estatisticasButton = new javax.swing.JButton();
        jogarButton = new javax.swing.JButton();
        resumosButton = new javax.swing.JButton();
        configuracoesButton = new javax.swing.JButton();
        creditosButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        menuPrincipalLabel = new javax.swing.JLabel();
        perguntasButton = new javax.swing.JButton();
        cadastrosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(222, 209, 193));

        estatisticasButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        estatisticasButton.setText("Estatísticas");
        estatisticasButton.setBorder(null);
        estatisticasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatisticasButtonActionPerformed(evt);
            }
        });

        jogarButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jogarButton.setText("Jogar");
        jogarButton.setBorder(null);
        jogarButton.setMaximumSize(new java.awt.Dimension(56, 35));
        jogarButton.setMinimumSize(new java.awt.Dimension(56, 35));
        jogarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarButtonActionPerformed(evt);
            }
        });

        resumosButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        resumosButton.setText("Resumos");
        resumosButton.setBorder(null);
        resumosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumosButtonActionPerformed(evt);
            }
        });

        configuracoesButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        configuracoesButton.setText("Configurações");
        configuracoesButton.setBorder(null);
        configuracoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracoesButtonActionPerformed(evt);
            }
        });

        creditosButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        creditosButton.setText("Créditos");
        creditosButton.setBorder(null);
        creditosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setBorder(null);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon("D:\\PII\\logo.png")); // NOI18N
        logoLabel.setText("jLabel1");

        menuPrincipalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        menuPrincipalLabel.setText("Menu Principal");

        perguntasButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntasButton.setText("Perguntas");
        perguntasButton.setBorder(null);
        perguntasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perguntasButtonActionPerformed(evt);
            }
        });

        cadastrosButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        cadastrosButton.setText("Cadastros");
        cadastrosButton.setBorder(null);
        cadastrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(608, 608, 608)
                        .addComponent(menuPrincipalLabel))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jogarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estatisticasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perguntasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastrosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(configuracoesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resumosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(469, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(menuPrincipalLabel)
                .addGap(70, 70, 70)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(resumosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(configuracoesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(creditosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jogarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(estatisticasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(perguntasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
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

    private void estatisticasButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        //TelaEstatisticas frame = new TelaEstatisticas();
        //this.dispose();
        //frame.setVisible(true);
    }                                                  

    private void jogarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        TelaNivel frame = new TelaNivel(idLogin);
        this.dispose();
        frame.setVisible(true);
    }                                           

    private void resumosButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        TelaVanguardas frame = new TelaVanguardas(idLogin);
        this.dispose();
        frame.setVisible(true);
    }                                             

    private void configuracoesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        TelaConfiguracoes frame = new TelaConfiguracoes(idLogin);
        this.dispose();
        frame.setVisible(true);
    }                                                   

    private void creditosButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // programar
    }                                              

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        TelaFazerLogin frame = new TelaFazerLogin();
        this.dispose();
        frame.setVisible(true);
    }                                            

    private void perguntasButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // programar
    }                                               

    private void cadastrosButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // programar
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
            java.util.logging.Logger.getLogger(TelaMenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuPrincipalAdmin(idLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cadastrosButton;
    private javax.swing.JButton configuracoesButton;
    private javax.swing.JButton creditosButton;
    private javax.swing.JButton estatisticasButton;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jogarButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel menuPrincipalLabel;
    private javax.swing.JButton perguntasButton;
    private javax.swing.JButton resumosButton;
    // End of variables declaration                   
}
