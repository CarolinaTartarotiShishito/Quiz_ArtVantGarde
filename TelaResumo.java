import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class TelaResumo extends javax.swing.JFrame{
    static int idLogin;
    static int idVanguarda;
    public String resumo;
    
    public TelaResumo(int idLogin, int idVanguarda) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
        resumoTextArea.setLineWrap(true);
        resumoTextArea.setWrapStyleWord(true);
        adicionarResumo.setVisible(false);
        alterarResumo.setVisible(false);
        resumo2.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        resumoTextArea = new javax.swing.JTextArea();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        mostrarResumo = new javax.swing.JPanel();
        adicionarResumoButton1 = new javax.swing.JButton();
        voltarSelecaoVanguardasButton = new javax.swing.JButton();
        alterarResumoButton = new javax.swing.JButton();
        removerResumoButton = new javax.swing.JButton();
        adicionarResumo = new javax.swing.JPanel();
        adicionarResumoButton2 = new javax.swing.JButton();
        cancelarAdicionarButton = new javax.swing.JButton();
        alterarResumo = new javax.swing.JPanel();
        alterarResumoButton2 = new javax.swing.JButton();
        cancelarButton2 = new javax.swing.JButton();
        resumo2 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resumoTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel17.setBackground(new java.awt.Color(222, 209, 193));
        jPanel17.setPreferredSize(new java.awt.Dimension(1390, 700));

        logoLabel14.setIcon(new javax.swing.ImageIcon("D:\\PII\\logo.png")); // NOI18N
        logoLabel14.setText("jLabel1");

        resumoTextArea.setEditable(false);
        resumoTextArea.setBackground(new java.awt.Color(222, 209, 193));
        resumoTextArea.setColumns(20);
        resumoTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        resumoTextArea.setRows(5);
        jScrollPane1.setViewportView(resumoTextArea);

        mostrarResumo.setBackground(new java.awt.Color(222, 209, 193));

        adicionarResumoButton1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        adicionarResumoButton1.setText("Adicionar Resumo");
        adicionarResumoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarResumoButton1ActionPerformed(evt);
            }
        });

        voltarSelecaoVanguardasButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        voltarSelecaoVanguardasButton.setText("Voltar à Seleção de Vanguardas");
        voltarSelecaoVanguardasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarSelecaoVanguardasButtonActionPerformed(evt);
            }
        });

        alterarResumoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        alterarResumoButton.setText("Alterar Resumo");
        alterarResumoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarResumoButtonActionPerformed(evt);
            }
        });

        removerResumoButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        removerResumoButton.setText("Remover Resumo");
        removerResumoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerResumoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mostrarResumoLayout = new javax.swing.GroupLayout(mostrarResumo);
        mostrarResumo.setLayout(mostrarResumoLayout);
        mostrarResumoLayout.setHorizontalGroup(
            mostrarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarResumoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarSelecaoVanguardasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(adicionarResumoButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alterarResumoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removerResumoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mostrarResumoLayout.setVerticalGroup(
            mostrarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarResumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mostrarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarSelecaoVanguardasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarResumoButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarResumoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerResumoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        adicionarResumo.setBackground(new java.awt.Color(222, 209, 193));

        adicionarResumoButton2.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        adicionarResumoButton2.setText("Adicionar Resumo");
        adicionarResumoButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarResumoButton2ActionPerformed(evt);
            }
        });

        cancelarAdicionarButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        cancelarAdicionarButton.setText("Cancelar");
        cancelarAdicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAdicionarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adicionarResumoLayout = new javax.swing.GroupLayout(adicionarResumo);
        adicionarResumo.setLayout(adicionarResumoLayout);
        adicionarResumoLayout.setHorizontalGroup(
            adicionarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adicionarResumoLayout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(adicionarResumoButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(cancelarAdicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
        );
        adicionarResumoLayout.setVerticalGroup(
            adicionarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adicionarResumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adicionarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarResumoButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarAdicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        alterarResumo.setBackground(new java.awt.Color(222, 209, 193));

        alterarResumoButton2.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        alterarResumoButton2.setText("Alterar Resumo");
        alterarResumoButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarResumoButton2ActionPerformed(evt);
            }
        });

        cancelarButton2.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        cancelarButton2.setText("Cancelar");
        cancelarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alterarResumoLayout = new javax.swing.GroupLayout(alterarResumo);
        alterarResumo.setLayout(alterarResumoLayout);
        alterarResumoLayout.setHorizontalGroup(
            alterarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterarResumoLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(alterarResumoButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(cancelarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        alterarResumoLayout.setVerticalGroup(
            alterarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alterarResumoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(alterarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterarResumoButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(mostrarResumo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(adicionarResumo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(alterarResumo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(adicionarResumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(alterarResumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(adicionarResumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(222, 209, 193));

        resumoTextArea2.setBackground(new java.awt.Color(222, 209, 193));
        resumoTextArea2.setColumns(20);
        resumoTextArea2.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        resumoTextArea2.setRows(5);
        jScrollPane2.setViewportView(resumoTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );

        resumo2.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout resumo2Layout = new javax.swing.GroupLayout(resumo2);
        resumo2.setLayout(resumo2Layout);
        resumo2Layout.setHorizontalGroup(
            resumo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1159, Short.MAX_VALUE)
            .addGroup(resumo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(resumo2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        resumo2Layout.setVerticalGroup(
            resumo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(resumo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(0, 114, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(logoLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(91, Short.MAX_VALUE)
                    .addComponent(resumo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(logoLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(227, Short.MAX_VALUE)
                    .addComponent(resumo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(98, Short.MAX_VALUE)))
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
        TelaVanguardas frame = new TelaVanguardas(idLogin);
        this.dispose();
        frame.setVisible(true);
    }                                                             

    private void adicionarResumoButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        DAO dao = new DAO();
        try{
            if(dao.existeResumo(idVanguarda) == false){
                mostrarResumo.setVisible(false);
                adicionarResumo.setVisible(true);
                resumoTextArea.setVisible(false);
                resumo2.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Não é possível adicionar o resumo da vanguarda\nselecionada porque ela já existe!", "Quiz ArtVantGarde", 2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problema adicionarResumoButton1");
        }
    }                                                      

    private void alterarResumoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        DAO dao = new DAO();
        try{
            if(resumo.length() == 0){
                mostrarResumo.setVisible(false);
                alterarResumo.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Não é possível alterar o resumo da vanguarda\nselecionada porque ela não existe!", "Quiz ArtVantGarde", 2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos");
            
        }
    }                                                   

    private void removerResumoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        DAO dao = new DAO();
        Object[] options = {"Sim", "Cancelar"};
        int escolha = JOptionPane.showOptionDialog(null, "Você tem certeza de que deseja remover este resumo?",
        "Quiz ArtVantGarde",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,     //do not use a custom Icon
        options,  //the titles of buttons
        options[0]); //default button title
        if (escolha == JOptionPane.YES_OPTION){
            try{
                dao.removerResumo(idVanguarda, resumo);
                JOptionPane.showMessageDialog(null, "Resumo cadastrado com sucesso", "Quiz ArtVantGarde", 1);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Problemas técnicos");
            }
        }
    }                                                   

    private void adicionarResumoButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        /*try{
            System.out.println("oi");
            DAO dao = new DAO();
            resumo = resumoTextArea2.getText();
            if (resumo.length() == 0){
                System.out.println("oii");
                JOptionPane.showMessageDialog (null, "Preencha o espaço em branco para adicionar um resumo", "Quiz ArtVantGarde", 2);
            }else{
                System.out.println("oiii");
                dao.adicionarResumo(idVanguarda, resumo);
                JOptionPane.showMessageDialog(null, "Resumo removido com sucesso!", "Quiz ArtVantGarde", 1);
                adicionarResumo.setVisible(false);
                mostrarResumo.setVisible(true);
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
                resumo2.setVisible(false);
            }
        }catch (Exception ee){
            JOptionPane.showMessageDialog(null, "Problema adicionarResumoButton2");
        }*/
        resumo = resumoTextArea2.getText();
        Resumo resumo = new Resumo(idVanguarda, this.resumo);
        DAO dao = new DAO();
        try{
            dao.adicionarResumo(idVanguarda, resumo);
            JOptionPane.showMessageDialog(null, "Resumo removido com sucesso!", "Quiz ArtVantGarde", 1);
            adicionarResumo.setVisible(false);
            mostrarResumo.setVisible(true);
            resumo2.setVisible(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos");
        }
    }                                                      

    private void cancelarAdicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        DAO dao = new DAO();
        try{
            if(dao.existeResumo(idVanguarda) == false){
                resumo2.setVisible(false);
            }else{
                resumoTextArea2.setText(" ");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas cancelarAdicionarButton");
        }
        adicionarResumo.setVisible(false);
        mostrarResumo.setVisible(true);
        resumoTextArea.setEditable(false);
        resumoTextArea.setVisible(true);
    }                                                       

    private void alterarResumoButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void cancelarButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                                
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
            java.util.logging.Logger.getLogger(TelaResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaResumo(idLogin, idVanguarda).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel adicionarResumo;
    private javax.swing.JButton adicionarResumoButton1;
    private javax.swing.JButton adicionarResumoButton2;
    private javax.swing.JPanel alterarResumo;
    private javax.swing.JButton alterarResumoButton;
    private javax.swing.JButton alterarResumoButton2;
    private javax.swing.JButton cancelarAdicionarButton;
    private javax.swing.JButton cancelarButton2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoLabel14;
    private javax.swing.JPanel mostrarResumo;
    private javax.swing.JButton removerResumoButton;
    private javax.swing.JLayeredPane resumo2;
    private javax.swing.JTextArea resumoTextArea;
    private javax.swing.JTextArea resumoTextArea2;
    private javax.swing.JButton voltarSelecaoVanguardasButton;
    // End of variables declaration                   
}
