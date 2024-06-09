import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class TelaConfiguracoes extends javax.swing.JFrame {
    static int idLogin;
    static String filePathField;
    /**
     * Creates new form TelaConfiguracoes
     */
    public TelaConfiguracoes(int idLogin) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
        this.idLogin = idLogin;
        this.filePathField = filePathField;
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

        logoLabel.setIcon(new javax.swing.JLabel() {
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

        menuPrincipalLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        menuPrincipalLabel.setText("Configurações");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 199, Short.MAX_VALUE)
                .addComponent(logoLabel)
                .addGap(197, 197, 197))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(662, 662, 662)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voltarMenuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ajusteAudioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alterarCadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(723, 723, 723)
                        .addComponent(menuPrincipalLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(menuPrincipalLabel)
                .addGap(53, 53, 53)
                .addComponent(ajusteAudioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(alterarCadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(voltarMenuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
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
        TelaAudio frame = new TelaAudio(idLogin, filePathField);
        this.dispose();
        frame.setVisible(true);
    }                                                 

    private void alterarCadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        DAO dao = new DAO();
        try{
            if(dao.existeProfessor(idLogin) == true){
                TelaAlterarCadastroProf frame = new TelaAlterarCadastroProf(idLogin, filePathField);
                this.dispose();
                frame.setVisible(true);
            }else{
                TelaAlterarCadastroAluno frame = new TelaAlterarCadastroAluno(idLogin, filePathField);
                this.dispose();
                frame.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos");
        }
    }                                                     

    private void voltarMenuPrincipalButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        DAO dao = new DAO();
        try{
            if(dao.existeProfessor(idLogin) == true){
                TelaMenuPrincipalProfessor frame = new TelaMenuPrincipalProfessor(idLogin, filePathField);
                this.dispose();
                frame.setVisible(true);
            }else if(idLogin == 1){
                TelaMenuPrincipalAdmin frame = new TelaMenuPrincipalAdmin(idLogin, filePathField);
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