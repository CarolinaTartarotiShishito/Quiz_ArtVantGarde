/**
 *
 * @author carol
 */
public class TelaVanguardasAluno extends javax.swing.JFrame {
    static int idLogin;
    /**
     * Creates new form TelaVanguardasAluno
     */
    public TelaVanguardasAluno(int idLogin) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
    }
                       
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        selecionarVanguardaLabel = new javax.swing.JLabel();
        cubismoButton = new javax.swing.JButton();
        dadaismoButton = new javax.swing.JButton();
        expressionismoButton = new javax.swing.JButton();
        fauvismoButton = new javax.swing.JButton();
        futurismoButton = new javax.swing.JButton();
        surrealismoButton = new javax.swing.JButton();
        voltarMenuPrincipalButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(222, 209, 193));
        jPanel3.setPreferredSize(new java.awt.Dimension(1390, 770));

        logoLabel.setIcon(new javax.swing.ImageIcon("D:\\PII\\logo.png")); // NOI18N
        logoLabel.setText("jLabel1");

        selecionarVanguardaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        selecionarVanguardaLabel.setText("Você deseja acessar o resumo de qual Vanguarda Artística Europeia?");

        cubismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        cubismoButton.setText("Cubismo");
        cubismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubismoButtonActionPerformed(evt);
            }
        });

        dadaismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        dadaismoButton.setText("Dadaísmo");
        dadaismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadaismoButtonActionPerformed(evt);
            }
        });

        expressionismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        expressionismoButton.setText("Expressionismo");
        expressionismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expressionismoButtonActionPerformed(evt);
            }
        });

        fauvismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        fauvismoButton.setText("Fauvismo");
        fauvismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fauvismoButtonActionPerformed(evt);
            }
        });

        futurismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        futurismoButton.setText("Futurismo");
        futurismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                futurismoButtonActionPerformed(evt);
            }
        });

        surrealismoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        surrealismoButton.setText("Surrealismo");
        surrealismoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surrealismoButtonActionPerformed(evt);
            }
        });

        voltarMenuPrincipalButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        voltarMenuPrincipalButton.setText("Voltar ao Menu Principal");
        voltarMenuPrincipalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuPrincipalButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selecionarVanguardaLabel)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarMenuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(542, 542, 542))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cubismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(expressionismoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dadaismoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fauvismoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(futurismoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(surrealismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(selecionarVanguardaLabel)
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cubismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fauvismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(surrealismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dadaismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(futurismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(expressionismoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(voltarMenuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void cubismoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int idVanguarda = 1;
        TelaResumoAluno frame = new TelaResumoAluno(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }                                             

    private void dadaismoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        int idVanguarda = 2;
        TelaResumoAluno frame = new TelaResumoAluno(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }                                              

    private void expressionismoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        int idVanguarda = 3;
        TelaResumoAluno frame = new TelaResumoAluno(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }                                                    

    private void fauvismoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        int idVanguarda = 4;
        TelaResumoAluno frame = new TelaResumoAluno(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }                                              

    private void futurismoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        int idVanguarda = 5;
        TelaResumoAluno frame = new TelaResumoAluno(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }                                               

    private void surrealismoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        int idVanguarda = 6;
        TelaResumoAluno frame = new TelaResumoAluno(idLogin, idVanguarda);
        this.dispose();
        frame.setVisible(true);
    }                                                 

    private void voltarMenuPrincipalButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        TelaMenuPrincipalAluno frame = new TelaMenuPrincipalAluno(idLogin);
        this.dispose();
        frame.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaVanguardasAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVanguardasAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVanguardasAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVanguardasAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVanguardasAluno(idLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cubismoButton;
    private javax.swing.JButton dadaismoButton;
    private javax.swing.JButton expressionismoButton;
    private javax.swing.JButton fauvismoButton;
    private javax.swing.JButton futurismoButton;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel selecionarVanguardaLabel;
    private javax.swing.JButton surrealismoButton;
    private javax.swing.JButton voltarMenuPrincipalButton;
    // End of variables declaration                   
}
