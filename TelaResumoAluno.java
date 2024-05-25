import javax.swing.JOptionPane;

public class TelaResumoAluno extends javax.swing.JFrame {
    static int idLogin;
    static int idVanguarda;
    public String resumo;
    
    public TelaResumoAluno(int idLogin, int idVanguarda) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
        resumoTextArea.setLineWrap(true);
        resumoTextArea.setWrapStyleWord(true);
        DAO dao = new DAO();
        try{
            if(dao.existeResumo(idVanguarda) == false){
                resumo = dao.pegarResumo(idVanguarda);
                resumoTextArea.setText(resumo);
            }else{
                resumoTextArea.setText(" ");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos");
        }
    }
                         
    private void initComponents() {

        jPanel17 = new javax.swing.JPanel();
        logoLabel14 = new javax.swing.JLabel();
        voltarSelecaoVanguardasButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resumoTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel17.setBackground(new java.awt.Color(222, 209, 193));
        jPanel17.setPreferredSize(new java.awt.Dimension(1390, 700));

        logoLabel14.setIcon(new javax.swing.ImageIcon("D:\\PII\\logo.png")); // NOI18N
        logoLabel14.setText("jLabel1");

        voltarSelecaoVanguardasButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        voltarSelecaoVanguardasButton.setText("Voltar à Seleção de Vanguardas");
        voltarSelecaoVanguardasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarSelecaoVanguardasButtonActionPerformed(evt);
            }
        });

        resumoTextArea.setEditable(false);
        resumoTextArea.setBackground(new java.awt.Color(222, 209, 193));
        resumoTextArea.setColumns(20);
        resumoTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        resumoTextArea.setRows(5);
        jScrollPane2.setViewportView(resumoTextArea);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(503, 503, 503)
                        .addComponent(voltarSelecaoVanguardasButton))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(logoLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(voltarSelecaoVanguardasButton)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void voltarSelecaoVanguardasButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        TelaVanguardasAluno frame = new TelaVanguardasAluno(idLogin);
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
            java.util.logging.Logger.getLogger(TelaResumoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaResumoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaResumoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaResumoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaResumoAluno(idLogin, idVanguarda).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoLabel14;
    private javax.swing.JTextArea resumoTextArea;
    private javax.swing.JButton voltarSelecaoVanguardasButton;
    // End of variables declaration                   
}
