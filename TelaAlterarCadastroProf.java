import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class TelaAlterarCadastroProf extends javax.swing.JFrame {
    static int idLogin;
    static String filePathField;
    /**
     * Creates new form TelaAlterarCadastroConf
     */
    public TelaAlterarCadastroProf(int idLogin, String filePathField) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
        this.idLogin = idLogin;
        this.filePathField = filePathField;
        esconderSenhaLabel.setVisible(false);
        alterarCadastro.setVisible(false);
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
        logoLabel = new javax.swing.JLabel();
        menuPrincipalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        emailTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        materiaTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        nomeTextArea = new javax.swing.JTextArea();
        materiaLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        senhaLabel1 = new javax.swing.JLabel();
        nomeLabel1 = new javax.swing.JLabel();
        senhaPasswordField = new javax.swing.JPasswordField();
        verSenhaLabel = new javax.swing.JLabel();
        esconderSenhaLabel = new javax.swing.JLabel();
        mostrarConfiguracoes = new javax.swing.JLayeredPane();
        alterarCadastroButton1 = new javax.swing.JButton();
        voltarMenuPrincipalButton = new javax.swing.JButton();
        voltarMenuPrincipalButton1 = new javax.swing.JButton();
        alterarCadastro = new javax.swing.JLayeredPane();
        alterarCadastroButton2 = new javax.swing.JButton();
        cancelarAlterarCadastroButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(222, 209, 193));

        logoLabel.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://lh3.googleusercontent.com/pw/AP1GczNQh9GqrlXaFDJPUmV2LaMuHTV_pW6s6MpJhf6No34ZF2L_Yoa9QO2TkpDpGJ6VoS3jChnUhrrW3o8ik_G6xsJ5cgwW6YshSyeuWSq2VzMi6Gua7fnegmlKhrHLuNMm1Tf_qKKjQLQwWObCFfW4HKzrSh0Ti3zXoofJ26rGSmX9rcRl3RwUI3ps8OYw5YiJ-w1Bo0jRzI8q4Sg7L284Ix0t74lAN7SDy29-0n0kAMxsbxq1EdPhanjCYQv36R8ZamU039JgGTvKnxf8Jqfo730P-SEivjflU2AM5ZD8KkfzHmOIlcUuk58RrJhJIvUameLE5Y-bTR0rzVrnUdGFLEySN22s812gXiD5DJLw98jzjWjEQeXKBW8rBcbmns8WghHLHI5kkEPkFaT-65HwYI4vsiM6QMWjFYNxkalzpb0u1cR5BIEFWZ5a9AYA8tfapwSBz7IOaQY5Srbc2prK8chtzXYWNgZYcJ5Rmlt6-TDx8qakg6e82F6POESA-sij8QJ3bhTX5vljTHfyAdm_Y5ndNK8GBObDKEwTFDZpO0Zyi6SYT2KvGw3-A6ctXMvVkXTUHI6atpblMayHcNegXvxFhvmuRSLtpkA8nuSc6OaU5ZoXvAQbu9P7OfaBMRVF86A0fuyELCGPNs--P-n8ngIKyCSuMcdMrZHQklsRq7moYgLFGsHXW0pM0HvUdMPBKbXuLVZS7ZH0t19f-RmVKQko5T9nhlChHMRBBR1duIPaOLZZWEn_3hW4ehM-03xinUqAHWBl2S8L-Jg8qL9k4hnhcOrEW0bgteh_NX1r5ffEsEtK-JSjf0pjCwFz_KmdZrQwSLKbpvW6Wa4E9jPJ_S9RYMc6Y1ljJ5mEeY8Rv5jT7RLTtRRomMJE8BzqBhkCVN0FfdcvpQPyTzwM1RRPkY4=w688-h217-s-no-gm?authuser=0")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        logoLabel.setText("jLabel1");

        menuPrincipalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        menuPrincipalLabel.setText("Configurações");

        emailTextArea.setBackground(new java.awt.Color(222, 209, 193));
        emailTextArea.setColumns(20);
        emailTextArea.setRows(5);
        emailTextArea.setEnabled(false);
        jScrollPane2.setViewportView(emailTextArea);

        materiaTextArea.setBackground(new java.awt.Color(222, 209, 193));
        materiaTextArea.setColumns(20);
        materiaTextArea.setRows(5);
        materiaTextArea.setEnabled(false);
        jScrollPane3.setViewportView(materiaTextArea);

        nomeTextArea.setBackground(new java.awt.Color(222, 209, 193));
        nomeTextArea.setColumns(20);
        nomeTextArea.setRows(5);
        nomeTextArea.setEnabled(false);
        jScrollPane4.setViewportView(nomeTextArea);

        materiaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        materiaLabel.setText("Matéria Lecionada:");

        emailLabel.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        emailLabel.setText("E-mail:");

        senhaLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        senhaLabel1.setText("Senha:");

        nomeLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        nomeLabel1.setText("Nome Completo:");

        senhaPasswordField.setBackground(new java.awt.Color(222, 209, 193));
        senhaPasswordField.setEnabled(false);

        verSenhaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        verSenhaLabel.setText("Ver Senha");
        verSenhaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 93, 137), 2));
        verSenhaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verSenhaLabelMousePressed(evt);
            }
        });

        esconderSenhaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        esconderSenhaLabel.setText("Esconder Senha");
        esconderSenhaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 93, 137), 2));
        esconderSenhaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                esconderSenhaLabelMousePressed(evt);
            }
        });

        mostrarConfiguracoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 93, 137), 3));

        alterarCadastroButton1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        alterarCadastroButton1.setText("Alterar Cadastro");
        alterarCadastroButton1.setBorder(null);
        alterarCadastroButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCadastroButton1ActionPerformed(evt);
            }
        });

        voltarMenuPrincipalButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        voltarMenuPrincipalButton.setText("Voltar");
        voltarMenuPrincipalButton.setBorder(null);
        voltarMenuPrincipalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuPrincipalButtonActionPerformed(evt);
            }
        });

        voltarMenuPrincipalButton1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        voltarMenuPrincipalButton1.setText("Menu Principal");
        voltarMenuPrincipalButton1.setBorder(null);
        voltarMenuPrincipalButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuPrincipalButton1ActionPerformed(evt);
            }
        });

        mostrarConfiguracoes.setLayer(alterarCadastroButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mostrarConfiguracoes.setLayer(voltarMenuPrincipalButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mostrarConfiguracoes.setLayer(voltarMenuPrincipalButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mostrarConfiguracoesLayout = new javax.swing.GroupLayout(mostrarConfiguracoes);
        mostrarConfiguracoes.setLayout(mostrarConfiguracoesLayout);
        mostrarConfiguracoesLayout.setHorizontalGroup(
            mostrarConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarConfiguracoesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(alterarCadastroButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(voltarMenuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(voltarMenuPrincipalButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        mostrarConfiguracoesLayout.setVerticalGroup(
            mostrarConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarConfiguracoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mostrarConfiguracoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterarCadastroButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarMenuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarMenuPrincipalButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        alterarCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 93, 137), 3));

        alterarCadastroButton2.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        alterarCadastroButton2.setText("Alterar Cadastro");
        alterarCadastroButton2.setBorder(null);
        alterarCadastroButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCadastroButton2ActionPerformed(evt);
            }
        });

        cancelarAlterarCadastroButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        cancelarAlterarCadastroButton.setText("Cancelar");
        cancelarAlterarCadastroButton.setBorder(null);
        cancelarAlterarCadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAlterarCadastroButtonActionPerformed(evt);
            }
        });

        alterarCadastro.setLayer(alterarCadastroButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        alterarCadastro.setLayer(cancelarAlterarCadastroButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout alterarCadastroLayout = new javax.swing.GroupLayout(alterarCadastro);
        alterarCadastro.setLayout(alterarCadastroLayout);
        alterarCadastroLayout.setHorizontalGroup(
            alterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterarCadastroLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(alterarCadastroButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(cancelarAlterarCadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        alterarCadastroLayout.setVerticalGroup(
            alterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alterarCadastroLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(alterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterarCadastroButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarAlterarCadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(menuPrincipalLabel)
                        .addGap(728, 728, 728))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(senhaPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(verSenhaLabel)))
                        .addGap(469, 469, 469))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(762, 762, 762))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(nomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(705, 705, 705))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(materiaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(694, 694, 694))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(763, 763, 763)
                .addComponent(senhaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 763, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(1022, Short.MAX_VALUE)
                    .addComponent(esconderSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(402, 402, 402)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(421, Short.MAX_VALUE)
                    .addComponent(mostrarConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(378, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(417, Short.MAX_VALUE)
                    .addComponent(alterarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(375, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(menuPrincipalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(senhaLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nomeLabel1)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(materiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(401, Short.MAX_VALUE)
                    .addComponent(esconderSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(365, 365, 365)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(654, Short.MAX_VALUE)
                    .addComponent(mostrarConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(650, Short.MAX_VALUE)
                    .addComponent(alterarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
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

    private void voltarMenuPrincipalButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        DAO dao = new DAO();
        try{
            if(dao.existeProfessor(idLogin) == true){
                TelaMenuPrincipalProfessor frame = new TelaMenuPrincipalProfessor(idLogin, filePathField);
                this.dispose();
                frame.setVisible(true);
            }else{
                TelaMenuPrincipalAluno frame = new TelaMenuPrincipalAluno(idLogin, filePathField);
                this.dispose();
                frame.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos");
        }
    }                                                         

    private void alterarCadastroButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        mostrarConfiguracoes.setVisible(false);
        alterarCadastro.setVisible(true);
        emailTextArea.setEnabled(true);
        senhaPasswordField.setEnabled(true);
        nomeTextArea.setEnabled(true);
        materiaTextArea.setEnabled(true);
    }                                                      

    private void verSenhaLabelMousePressed(java.awt.event.MouseEvent evt) {                                           
        verSenhaLabel.setVisible(false);
        esconderSenhaLabel.setVisible(true);
        senhaPasswordField.setEchoChar((char)0);
    }                                          

    private void esconderSenhaLabelMousePressed(java.awt.event.MouseEvent evt) {                                                
        esconderSenhaLabel.setVisible(false);
        verSenhaLabel.setVisible(true);
        senhaPasswordField.setEchoChar('*');
    }                                               

    private void voltarMenuPrincipalButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // TODO add your handling code here:
    }                                                          

    private void alterarCadastroButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void cancelarAlterarCadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TelaAlterarCadastroProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarCadastroProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarCadastroProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarCadastroProf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarCadastroProf(idLogin, filePathField).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLayeredPane alterarCadastro;
    private javax.swing.JButton alterarCadastroButton1;
    private javax.swing.JButton alterarCadastroButton2;
    private javax.swing.JButton cancelarAlterarCadastroButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextArea emailTextArea;
    private javax.swing.JLabel esconderSenhaLabel;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel materiaLabel;
    private javax.swing.JTextArea materiaTextArea;
    private javax.swing.JLabel menuPrincipalLabel;
    private javax.swing.JLayeredPane mostrarConfiguracoes;
    private javax.swing.JLabel nomeLabel1;
    private javax.swing.JTextArea nomeTextArea;
    private javax.swing.JLabel senhaLabel1;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JLabel verSenhaLabel;
    private javax.swing.JButton voltarMenuPrincipalButton;
    private javax.swing.JButton voltarMenuPrincipalButton1;
    // End of variables declaration                   
}