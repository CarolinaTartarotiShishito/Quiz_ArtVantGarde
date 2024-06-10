import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author louis
 */
public class TelaFazerLogin extends javax.swing.JFrame {
    static DAO dao = new DAO();
    static Musica musica = new Musica();
    /**
     * Creates new form TelaFazerLogin
     */
    public TelaFazerLogin() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel1 = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        senhaPasswordField = new javax.swing.JPasswordField();
        senhaLabel = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        verSenhaLabel = new javax.swing.JLabel();
        esconderSenhaLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nãoPossuiCadastroButton = new javax.swing.JButton();
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
        loginLabel.setText("Login");

        jPanel2.setBackground(new java.awt.Color(234, 229, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 92, 147), 3));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setText("Insira seu email:");

        loginTextField.setBackground(new java.awt.Color(238, 238, 238));
        loginTextField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N

        senhaPasswordField.setBackground(new java.awt.Color(238, 238, 238));
        senhaPasswordField.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N

        senhaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        senhaLabel.setText("Insira sua senha:");

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
                .addGap(36, 36, 36)
                .addComponent(verSenhaLabel)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(esconderSenhaLabel)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(verSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(esconderSenhaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(senhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(loginTextField)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhaLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(234, 229, 222));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 92, 147), 3));

        nãoPossuiCadastroButton.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        nãoPossuiCadastroButton.setText("Cadastre-se");
        nãoPossuiCadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nãoPossuiCadastroButtonActionPerformed(evt);
            }
        });

        novaSenhaButton.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        novaSenhaButton.setText("Alterar senha");
        novaSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaSenhaButtonActionPerformed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        loginButton.setText("Login");
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
                .addContainerGap()
                .addComponent(nãoPossuiCadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(novaSenhaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaSenhaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nãoPossuiCadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(756, 756, 756)
                        .addComponent(loginLabel)))
                .addGap(0, 226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(382, 382, 382))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(491, 491, 491))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginLabel)
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
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
    }// </editor-fold>                        

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String email = loginTextField.getText();
        String senha = new String(senhaPasswordField.getPassword());
        Login login = new Login(email, senha);
                
        try{
            if(dao.existeLogin(login)){
                int idLogin = dao.pegarId(login);
                if(email.endsWith("@jpiaget.pro.com.br")){
                    ArrayList<String> usuario = dao.pegarCadastrosProfessores(idLogin);
                    JOptionPane.showMessageDialog(null, "Bem Vindo(a) " + usuario.get(2), "Quiz ArtVantGarde", 1);
                    TelaMenuPrincipalProfessor frame = new TelaMenuPrincipalProfessor(idLogin, musica);
                    this.dispose();
                    frame.setVisible(true);
                    
                    // Para tocar o soundtrack depois de clicar o botão de fazer login
                    musica.playMusic();
                    
                }else if(idLogin == 1){
                    JOptionPane.showMessageDialog(null, "Bem Vindo(a) admin", "Quiz ArtVantGarde", 1);
                    TelaMenuPrincipalAdmin frame = new TelaMenuPrincipalAdmin(idLogin, musica);
                    this.dispose();
                    frame.setVisible(true);

                    // Para tocar o soundtrack depois de clicar o botão de fazer login
                    musica.playMusic();
                    
                }else{
                    ArrayList<String> usuario = dao.pegarCadastrosAlunos(idLogin);
                    JOptionPane.showMessageDialog(null, "Bem Vindo(a) " + usuario.get(2), "Quiz ArtVantGarde", 1);
                    TelaMenuPrincipalAluno frame = new TelaMenuPrincipalAluno(idLogin, musica);
                    this.dispose();
                    frame.setVisible(true);
                    
                    // Para tocar o soundtrack depois de clicar o botão de fazer login
                    musica.playMusic();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Login Inválido! Confira se você digitou seu email e senha corretamente!", "Quiz Art VantGarde", 0);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!");
        }
    }                                           

    private void nãoPossuiCadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        TelaNovoCadastro frame = new TelaNovoCadastro();
        this.dispose();
        frame.setVisible(true);
    }                                                       

    private void verSenhaLabelMouseClicked(java.awt.event.MouseEvent evt) {                                           
        verSenhaLabel.setVisible(false);
        esconderSenhaLabel.setVisible(true);
        senhaPasswordField.setEchoChar((char)0);
    }                                          

    private void esconderSenhaLabelMouseClicked(java.awt.event.MouseEvent evt) {                                                
        verSenhaLabel.setVisible(true);
        esconderSenhaLabel.setVisible(false);
        senhaPasswordField.setEchoChar('*');
    }                                               

    private void novaSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        TelaNovaSenha frame = new TelaNovaSenha();
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
            java.util.logging.Logger.getLogger(TelaFazerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFazerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFazerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFazerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFazerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel esconderSenhaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JButton novaSenhaButton;
    private javax.swing.JButton nãoPossuiCadastroButton;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JLabel verSenhaLabel;
    // End of variables declaration                   
}
