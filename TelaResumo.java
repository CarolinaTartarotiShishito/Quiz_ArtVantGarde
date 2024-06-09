import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class TelaResumo extends javax.swing.JFrame {
    static int idLogin;
    static int idVanguarda;
    public Resumo resumo;
    /**
     * Creates new form TelaResumo
     */
    public TelaResumo(int idLogin, int idVanguarda) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
        resumoTextArea.setLineWrap(true);
        resumoTextArea.setWrapStyleWord(true);
        resumoTextArea2.setLineWrap(true);
        resumoTextArea2.setWrapStyleWord(true);
        adicionarResumo.setVisible(false);
        alterarResumo.setVisible(false);
        resumo2.setVisible(false);
        this.idLogin = idLogin;
        this.idVanguarda = idVanguarda;
        DAO dao = new DAO();
        try{
            if(dao.existeResumo(idVanguarda) == false){
                resumo = new Resumo(this.idVanguarda, dao.pegarResumo(this.idVanguarda));
                resumoTextArea.setText(resumo.getResumo());
            }else{
                resumoTextArea.setText(" ");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel17 = new javax.swing.JPanel();
        logoLabel14 = new javax.swing.JLabel();
        resumo1 = new javax.swing.JScrollPane();
        resumoTextArea = new javax.swing.JTextArea();
        mostrarResumo = new javax.swing.JLayeredPane();
        voltarSelecaoVanguardasButton = new javax.swing.JButton();
        voltarMenuPrincipalButton = new javax.swing.JButton();
        alterarResumoButton = new javax.swing.JButton();
        removerResumoButton = new javax.swing.JButton();
        adicionarResumoButton1 = new javax.swing.JButton();
        adicionarResumo = new javax.swing.JLayeredPane();
        cancelarAdicionarButton = new javax.swing.JButton();
        adicionarResumoButton2 = new javax.swing.JButton();
        resumo2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumoTextArea2 = new javax.swing.JTextArea();
        alterarResumo = new javax.swing.JLayeredPane();
        alterarResumoButton2 = new javax.swing.JButton();
        cancelarButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel17.setBackground(new java.awt.Color(222, 209, 193));
        jPanel17.setPreferredSize(new java.awt.Dimension(1390, 700));

        logoLabel14.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://lh3.googleusercontent.com/pw/AP1GczNTskyX3pnzPWqR12TotbiExPo1oqQ9cwpy-UG_ZvmN4yB1VV6bCibQzFheqBitE37iPWLLl0pXW5j6Fck1n9sSV1eFCBIT6gfheZ2hepnQH7ohSQdPYfuoSP4s-gSvy6Uqi8QugzTBcpfLrqO9wDZw0fBlg8WvEn7Co_s3o08G8vHt6UDn7RLaVZ7CWwvTYlEu2XwxZZFDUm9lKMgrAuEvCY8q9Nsr_Pgg6e-YAfEO__aN9osxWwEa-gsYG3vJNoJU4lt7ckBxJcK35IiJGvzW09OkiPc7ekaKC08xpFPfiUxQ55dQWQ_WKVl25aYwx1NX08N3qBT0cJ2TQC_3TX_6--BTB5iV6sW-xysyZ-h5SYkkfiCPxDgEf0jGyHO5eAa83xMbJ53qNIe6FJKQJBxLKUN6stRD41aRMBD1pKyCHzxHCXj3XO4wZ9qYvepkX-rWnvHekq0vCxbL07bIFpAvjMYigq_krtbcbVp2qy4rxzCjj3rN4hP4I-QJN6F9kmfNqjwZlUNa7ILj0f8Z7rl93v8QRaFAvy2Omp-fq78HTLHXo4yQ5G9MCw3AHoBxjs5851KnZIoY0Z1IlahIrFOKibaX5xEPMZoSpTwsG3KaKeMelkuBsq8H5gzRsf6WCoxaY7yOBz9fuI578TRDdEbq-rfNBTfY2RFRgfTB8U0iBgTSIlKZY5fvMNUg9jdZICiaAdDzbZh2CbcBjsM5sHE9YlrXN8DzqPZP3XZIC1wiMQUSwwh3ikOQfZnXXEkK8BpkklAbDIHSCxCEBFxFGt56i_CNOAjN-Ynt_iFBEPUWrlDb6h9ofBboo7r2zj7r3P-_A56Yv8wuURzftgPp57anrjG9h_KH39nyDIamHEKS_mibGduG6GRRO3ATrjrcKjzGLf6_j2K5mJXDXDQOj_WNU_kPxKy-wO21t1ZLkkKOBSMahCSRi_rXRRRxUg=w688-h217-s-no-gm?authuser=0")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        logoLabel14.setText("jLabel1");

        resumo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 93, 137), 3));

        resumoTextArea.setEditable(false);
        resumoTextArea.setBackground(new java.awt.Color(222, 209, 193));
        resumoTextArea.setColumns(20);
        resumoTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        resumoTextArea.setRows(5);
        resumoTextArea.setBorder(null);
        resumo1.setViewportView(resumoTextArea);

        mostrarResumo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 93, 137), 3));

        voltarSelecaoVanguardasButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        voltarSelecaoVanguardasButton.setText("Voltar");
        voltarSelecaoVanguardasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarSelecaoVanguardasButtonActionPerformed(evt);
            }
        });

        voltarMenuPrincipalButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        voltarMenuPrincipalButton.setText("Menu Principal");
        voltarMenuPrincipalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuPrincipalButtonActionPerformed(evt);
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

        adicionarResumoButton1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        adicionarResumoButton1.setText("Adicionar Resumo");
        adicionarResumoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarResumoButton1ActionPerformed(evt);
            }
        });

        mostrarResumo.setLayer(voltarSelecaoVanguardasButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mostrarResumo.setLayer(voltarMenuPrincipalButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mostrarResumo.setLayer(alterarResumoButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mostrarResumo.setLayer(removerResumoButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mostrarResumo.setLayer(adicionarResumoButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mostrarResumoLayout = new javax.swing.GroupLayout(mostrarResumo);
        mostrarResumo.setLayout(mostrarResumoLayout);
        mostrarResumoLayout.setHorizontalGroup(
            mostrarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarResumoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(adicionarResumoButton1)
                .addGap(50, 50, 50)
                .addComponent(alterarResumoButton)
                .addGap(50, 50, 50)
                .addComponent(removerResumoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(voltarSelecaoVanguardasButton)
                .addGap(50, 50, 50)
                .addComponent(voltarMenuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        mostrarResumoLayout.setVerticalGroup(
            mostrarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostrarResumoLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(mostrarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarMenuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarSelecaoVanguardasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarResumoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerResumoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarResumoButton1))
                .addContainerGap())
        );

        adicionarResumo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 93, 137), 3));

        cancelarAdicionarButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        cancelarAdicionarButton.setText("Cancelar");
        cancelarAdicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAdicionarButtonActionPerformed(evt);
            }
        });

        adicionarResumoButton2.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        adicionarResumoButton2.setText("Adicionar Resumo");
        adicionarResumoButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarResumoButton2ActionPerformed(evt);
            }
        });

        adicionarResumo.setLayer(cancelarAdicionarButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        adicionarResumo.setLayer(adicionarResumoButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout adicionarResumoLayout = new javax.swing.GroupLayout(adicionarResumo);
        adicionarResumo.setLayout(adicionarResumoLayout);
        adicionarResumoLayout.setHorizontalGroup(
            adicionarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adicionarResumoLayout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(adicionarResumoButton2)
                .addGap(69, 69, 69)
                .addComponent(cancelarAdicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        adicionarResumoLayout.setVerticalGroup(
            adicionarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adicionarResumoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(adicionarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarAdicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicionarResumoButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resumo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 93, 137), 3));

        jScrollPane1.setBackground(new java.awt.Color(222, 209, 193));

        resumoTextArea2.setBackground(new java.awt.Color(222, 209, 193));
        resumoTextArea2.setColumns(20);
        resumoTextArea2.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        resumoTextArea2.setRows(5);
        resumoTextArea2.setBorder(null);
        jScrollPane1.setViewportView(resumoTextArea2);

        resumo2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout resumo2Layout = new javax.swing.GroupLayout(resumo2);
        resumo2.setLayout(resumo2Layout);
        resumo2Layout.setHorizontalGroup(
            resumo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
        );
        resumo2Layout.setVerticalGroup(
            resumo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        alterarResumo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 93, 137), 3));

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

        alterarResumo.setLayer(alterarResumoButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        alterarResumo.setLayer(cancelarButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout alterarResumoLayout = new javax.swing.GroupLayout(alterarResumo);
        alterarResumo.setLayout(alterarResumoLayout);
        alterarResumoLayout.setHorizontalGroup(
            alterarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alterarResumoLayout.createSequentialGroup()
                .addContainerGap(456, Short.MAX_VALUE)
                .addComponent(alterarResumoButton2)
                .addGap(69, 69, 69)
                .addComponent(cancelarButton2)
                .addGap(361, 361, 361))
        );
        alterarResumoLayout.setVerticalGroup(
            alterarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alterarResumoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(alterarResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterarResumoButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(457, 457, 457)
                        .addComponent(logoLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(resumo1, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(188, Short.MAX_VALUE)
                    .addComponent(mostrarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(187, Short.MAX_VALUE)
                    .addComponent(adicionarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resumo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(212, 212, 212)))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(187, Short.MAX_VALUE)
                    .addComponent(alterarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(214, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resumo1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(675, Short.MAX_VALUE)
                    .addComponent(mostrarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(75, Short.MAX_VALUE)))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(677, Short.MAX_VALUE)
                    .addComponent(adicionarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(156, Short.MAX_VALUE)
                    .addComponent(resumo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(94, Short.MAX_VALUE)))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(677, Short.MAX_VALUE)
                    .addComponent(alterarResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 1596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void voltarSelecaoVanguardasButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        TelaVanguardas frame = new TelaVanguardas(idLogin);
        this.dispose();
        frame.setVisible(true);
    }                                                             

    private void voltarMenuPrincipalButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        DAO dao = new DAO();
        try{
            if(dao.existeProfessor(idLogin) == true){
                TelaMenuPrincipalProfessor frame = new TelaMenuPrincipalProfessor(idLogin);
                this.dispose();
                frame.setVisible(true);
            }else{
                TelaMenuPrincipalAdmin frame = new TelaMenuPrincipalAdmin(idLogin);
                this.dispose();
                frame.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos");
        }
    }                                                         

    private void alterarResumoButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        DAO dao = new DAO();
        try{
            if(dao.existeResumo(idVanguarda) == false){
                mostrarResumo.setVisible(false);
                alterarResumo.setVisible(true);
                resumoTextArea.setVisible(false);
                resumo2.setVisible(true);
                resumoTextArea2.setText(dao.pegarResumo(idVanguarda));
                resumo1.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Não é possível alterar o resumo da vanguarda\nselecionada porque ele não existe!", "Quiz ArtVantGarde", 2);
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
                if (dao.existeResumo(idVanguarda) == true){
                JOptionPane.showMessageDialog (null, "Não é possível remover um resumo que não existe!", "Quiz ArtVantGarde", 2);
                }else{
                    dao.removerResumo(resumo);
                    JOptionPane.showMessageDialog(null, "Resumo removido com sucesso", "Quiz ArtVantGarde", 1);
                    resumoTextArea.setText(dao.pegarResumo(idVanguarda));
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Problemas técnicos");
            }
        }
    }                                                   

    private void adicionarResumoButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        DAO dao = new DAO();
        try{
            if(dao.existeResumo(idVanguarda) == true){
                mostrarResumo.setVisible(false);
                adicionarResumo.setVisible(true);
                resumoTextArea.setVisible(false);
                resumo2.setVisible(true);
                resumo1.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Não é possível adicionar o resumo da vanguarda\nselecionada porque ele já existe!", "Quiz ArtVantGarde", 2);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problema adicionarResumoButton1");
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
        resumoTextArea.setVisible(true);
        resumo1.setVisible(true);
    }                                                       

    private void adicionarResumoButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        DAO dao = new DAO();
        try{
            if ((resumoTextArea2.getText()).length() == 0){
                JOptionPane.showMessageDialog (null, "Preencha o espaço em branco para adicionar um resumo", "Quiz ArtVantGarde", 2);
            }else{
                Resumo resumoNovo = new Resumo(idVanguarda, resumoTextArea2.getText());
                dao.adicionarResumo(resumoNovo);
                JOptionPane.showMessageDialog(null, "Resumo adicionado com sucesso!", "Quiz ArtVantGarde", 1);
                adicionarResumo.setVisible(false);
                mostrarResumo.setVisible(true);
                resumo2.setVisible(false);
                resumoTextArea.setText(dao.pegarResumo(idVanguarda));
                resumo1.setVisible(true);
                resumoTextArea.setVisible(true);
                }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problema adicionarResumoButton2");
        }
    }                                                      

    private void alterarResumoButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        DAO dao = new DAO();
        try{
            if ((resumoTextArea2.getText()).length() == 0){
                JOptionPane.showMessageDialog (null, "Preencha o espaço em branco para alterar o resumo", "Quiz ArtVantGarde", 2);
            }else{
                Resumo resumoNovo = new Resumo(idVanguarda, resumoTextArea2.getText());
                dao.alterarResumo(resumoNovo);
                JOptionPane.showMessageDialog(null, "Resumo alterado com sucesso!", "Quiz ArtVantGarde", 1);
                alterarResumo.setVisible(false);
                mostrarResumo.setVisible(true);
                resumo2.setVisible(false);
                resumoTextArea.setText(dao.pegarResumo(idVanguarda));
                resumo1.setVisible(true);
                resumoTextArea.setVisible(true);
                }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problema adicionarResumoButton2");
        }
    }                                                    

    private void cancelarButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                                
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
        alterarResumo.setVisible(false);
        mostrarResumo.setVisible(true);
        resumo1.setVisible(true);
        resumoTextArea.setVisible(true);
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
    private javax.swing.JLayeredPane adicionarResumo;
    private javax.swing.JButton adicionarResumoButton1;
    private javax.swing.JButton adicionarResumoButton2;
    private javax.swing.JLayeredPane alterarResumo;
    private javax.swing.JButton alterarResumoButton;
    private javax.swing.JButton alterarResumoButton2;
    private javax.swing.JButton cancelarAdicionarButton;
    private javax.swing.JButton cancelarButton2;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel14;
    private javax.swing.JLayeredPane mostrarResumo;
    private javax.swing.JButton removerResumoButton;
    private javax.swing.JScrollPane resumo1;
    private javax.swing.JLayeredPane resumo2;
    private javax.swing.JTextArea resumoTextArea;
    private javax.swing.JTextArea resumoTextArea2;
    private javax.swing.JButton voltarMenuPrincipalButton;
    private javax.swing.JButton voltarSelecaoVanguardasButton;
    // End of variables declaration                   
}