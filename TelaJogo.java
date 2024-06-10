import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author louis
 */
public class TelaJogo extends javax.swing.JFrame {
    static int idLogin;
    static int idGrupo;
    static int idVanguarda;
    static Musica musica;
    public int inicio;
    public int tempoTotal = 0;
    public ArrayList<Integer> numeroQuestoes = new ArrayList<>();
    public int idQuestao;
    public Collection<String> alternativas = new ArrayList<>();
    public int respostaAluno;
    public int acertos = 0;
    public int erros = 0;
    public DAO dao = new DAO();
    public Random gerador = new Random();
    
 
    
    /**
     * Creates new form TelaCubismo
     */
    public TelaJogo(int idLogin, int idGrupo, int idVanguarda, Musica musica) {
        super("Quiz ArtVantGarde");
        initComponents();
        this.setLocationRelativeTo(null);
        this.musica = musica;
        
        //início do timer 1
        inicio = (int) new Date().getTime();
        
        this.idLogin = idLogin;
        this.idGrupo = idGrupo;
        this.idVanguarda = idVanguarda;
        DAO dao = new DAO();
        try {
            numeroQuestoes = dao.obterNumeroQuestoes(idVanguarda);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!!(┬┬﹏┬┬)");
        }
        cantoEsqInfLabel.setVisible(false);
        cantoInfDirLabel.setVisible(false);
        cantoSupDirLabel.setVisible(false);
        cantoSupEsqLabel.setVisible(false);
        meioSupEsqLabel.setVisible(false);
        meioEsqInfLabel.setVisible(false);
        meioSupDirLabel.setVisible(false);
        meioEsqInfLabel.setVisible(false);
        meioInfDirLabel.setVisible(false);
        perguntaCantoInfEsqPanel.setVisible(false);
        respostaCantoInfEsqPanel.setVisible(false);
        perguntaCantoSupEsqPanel.setVisible(false);
        respostaCantoSupEsqPanel.setVisible(false);
        perguntaCantoInfDirPanel.setVisible(false);
        respostaCantoInfDirPanel.setVisible(false);
        perguntaCantoSupDirPanel.setVisible(false);
        respostaCantoSupDirPanel.setVisible(false);
        perguntaMeioEsqInfPanel.setVisible(false);
        respostaMeioEsqInfPanel.setVisible(false);
        perguntaMeioSupEsqPanel.setVisible(false);
        respostaMeioSupEsqPanel.setVisible(false);
        perguntaMeioInfDirPanel.setVisible(false);
        respostaMeioInfDirPanel.setVisible(false);
        perguntaMeioSupDirPanel.setVisible(false);
        respostaMeioSupDirPanel.setVisible(false);
        ultimaPerguntaPanel.setVisible(false);
        mensagemFimPanel.setVisible(false);
        vanguardaErradaPanel.setVisible(false);
        vanguardaCertaPanel.setVisible(false);
        perdeuPanel.setVisible(false);
        
        //Colocar imagem na peça cantoInfEsq
        cantoEsqInfLabel.setText("");
        //Inserindo a imagem da peça na label
        cantoEsqInfLabel.setIcon(new javax.swing.JLabel(){
            public javax.swing.Icon getIcon() {
                try{
                    return new javax.swing.ImageIcon(
                        new java.net.URL(dao.pegarUrlPeca(idVanguarda, "cantoInfEsq")));
                }catch (java.net.MalformedURLException e){
                    JOptionPane.showMessageDialog(null, "url");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problemas dao url");
                }
                return null;
            }
        }.getIcon());
        
        //Colocar imagem na peça meioInfEsq
        meioEsqInfLabel.setText("");
        //Inserindo a imagem da peça na label
        meioEsqInfLabel.setIcon(new javax.swing.JLabel(){
            public javax.swing.Icon getIcon() {
                try{
                    return new javax.swing.ImageIcon(
                        new java.net.URL(dao.pegarUrlPeca(idVanguarda, "meioInfEsq")));
                }catch (java.net.MalformedURLException e){
                    JOptionPane.showMessageDialog(null, "url");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problemas dao url");
                }
                return null;
            }
        }.getIcon());

        //Colocar imagem na peça cantoSupEsq
        cantoSupEsqLabel.setText("");
        //Inserindo a imagem da peça na label
        cantoSupEsqLabel.setIcon(new javax.swing.JLabel(){
            public javax.swing.Icon getIcon() {
                try{
                    return new javax.swing.ImageIcon(
                        new java.net.URL(dao.pegarUrlPeca(idVanguarda, "cantoSupEsq")));
                }catch (java.net.MalformedURLException e){
                    JOptionPane.showMessageDialog(null, "url");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problemas dao url");
                }
                return null;
            }
        }.getIcon());
        
        //Colocar imagem na peça meioSupDir
        meioSupDirLabel.setText("");
        //Inserindo a imagem da peça na label
        meioSupDirLabel.setIcon(new javax.swing.JLabel(){
            public javax.swing.Icon getIcon() {
                try{
                    return new javax.swing.ImageIcon(
                        new java.net.URL(dao.pegarUrlPeca(idVanguarda, "meioSupDir")));
                }catch (java.net.MalformedURLException e){
                    JOptionPane.showMessageDialog(null, "url");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problemas dao url");
                }
                return null;
            }
        }.getIcon());
        
        //Colocar imagem na peça meioInfDir
        meioInfDirLabel.setText("");
        //Inserindo a imagem da peça na label
        meioInfDirLabel.setIcon(new javax.swing.JLabel(){
            public javax.swing.Icon getIcon() {
                try{
                    return new javax.swing.ImageIcon(
                        new java.net.URL(dao.pegarUrlPeca(idVanguarda, "meioInfDir")));
                }catch (java.net.MalformedURLException e){
                    JOptionPane.showMessageDialog(null, "url");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problemas dao url");
                }
                return null;
            }
        }.getIcon());
        
        //Colocar imagem na peça cantoInfDir
        cantoInfDirLabel.setText("");
        //Inserindo a imagem da peça na label
        cantoInfDirLabel.setIcon(new javax.swing.JLabel(){
            public javax.swing.Icon getIcon() {
                try{
                    return new javax.swing.ImageIcon(
                        new java.net.URL(dao.pegarUrlPeca(idVanguarda, "cantoInfDir")));
                }catch (java.net.MalformedURLException e){
                    JOptionPane.showMessageDialog(null, "url");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problemas dao url");
                }
                return null;
            }
        }.getIcon());
        
        //Colocar imagem na peça cantoSupDir
        cantoSupDirLabel.setText("");
        //Inserindo a imagem da peça na label
        cantoSupDirLabel.setIcon(new javax.swing.JLabel(){
            public javax.swing.Icon getIcon() {
                try{
                    return new javax.swing.ImageIcon(
                        new java.net.URL(dao.pegarUrlPeca(idVanguarda, "cantoSupDir")));
                }catch (java.net.MalformedURLException e){
                    JOptionPane.showMessageDialog(null, "url");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problemas dao url");
                }
                return null;
            }
        }.getIcon());
        
        //Colocar imagem na peça meioSupEsq
        meioSupEsqLabel.setText("");
        //Inserindo a imagem da peça na label
        meioSupEsqLabel.setIcon(new javax.swing.JLabel(){
            public javax.swing.Icon getIcon() {
                try{
                    return new javax.swing.ImageIcon(
                        new java.net.URL(dao.pegarUrlPeca(idVanguarda, "meioSupEsq")));
                }catch (java.net.MalformedURLException e){
                    JOptionPane.showMessageDialog(null, "url");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problemas dao url");
                }
                return null;
            }
        }.getIcon());
        
        //Colocar imagem final
        imagemFinalLabel.setText("");
        //Inserindo a imagem da peça na label
        imagemFinalLabel.setIcon(new javax.swing.JLabel(){
            public javax.swing.Icon getIcon() {
                try{
                    return new javax.swing.ImageIcon(
                        new java.net.URL(dao.pegarUrlPeca(idVanguarda, "imagemFinal")));
                }catch (java.net.MalformedURLException e){
                    JOptionPane.showMessageDialog(null, "url");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problemas dao url");
                }
                return null;
            }
        }.getIcon());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jogoPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        cantoInfEsqPanel = new javax.swing.JLayeredPane();
        cantoEsqInfButtonPanel = new javax.swing.JPanel();
        cantoEsqInfButton = new javax.swing.JButton();
        labelCantoEsq2Pannel = new javax.swing.JPanel();
        cantoEsqInfLabel = new javax.swing.JLabel();
        meioInfEsqPanel = new javax.swing.JLayeredPane();
        meioInfEsqButtonPanel = new javax.swing.JPanel();
        meioEsqInfButton = new javax.swing.JButton();
        labelMeioEsqInfPannel = new javax.swing.JPanel();
        meioEsqInfLabel = new javax.swing.JLabel();
        cantoSupEsqPanel = new javax.swing.JLayeredPane();
        cantoSupEsqButtonPanel = new javax.swing.JPanel();
        cantoSupEsqButton = new javax.swing.JButton();
        labelCantoSupEsqPannel1 = new javax.swing.JPanel();
        cantoSupEsqLabel = new javax.swing.JLabel();
        meioSupDirPanel = new javax.swing.JLayeredPane();
        meioSupDirButtonPanel = new javax.swing.JPanel();
        meioSupDirButton = new javax.swing.JButton();
        meioSupDirLabelPanel = new javax.swing.JPanel();
        meioSupDirLabel = new javax.swing.JLabel();
        meioInfDirPanel = new javax.swing.JLayeredPane();
        meioInfDirButtonPanel = new javax.swing.JPanel();
        meioInfDirButton = new javax.swing.JButton();
        meioInfDirLabelPanel = new javax.swing.JPanel();
        meioInfDirLabel = new javax.swing.JLabel();
        cantoInfDirPanel = new javax.swing.JLayeredPane();
        cantoInfDirButtonPanel = new javax.swing.JPanel();
        cantoInfDirButton = new javax.swing.JButton();
        cantoInfDirLabelPanel = new javax.swing.JPanel();
        cantoInfDirLabel = new javax.swing.JLabel();
        cantoSupDirPanel = new javax.swing.JLayeredPane();
        cantoSupDirButtonPanel = new javax.swing.JPanel();
        cantoSupDirButton = new javax.swing.JButton();
        cantoSupDirLabelPanel = new javax.swing.JPanel();
        cantoSupDirLabel = new javax.swing.JLabel();
        meioSupEsqPanel = new javax.swing.JLayeredPane();
        meioSupEsqButtonPanel = new javax.swing.JPanel();
        meioSupEsqButton = new javax.swing.JButton();
        meioEsqSupLabelPanel = new javax.swing.JPanel();
        meioSupEsqLabel = new javax.swing.JLabel();
        perguntaCantoSupEsqPanel = new javax.swing.JPanel();
        imagemCantoSupEsqPerguntaLabel = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        perguntaCantoSupEsqTextArea = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        alternativasCantoSupEsqTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        respostaCantoSupEsqTextField = new javax.swing.JTextField();
        responderCantoSupEsqButton = new javax.swing.JButton();
        respostaCantoSupEsqPanel = new javax.swing.JPanel();
        respostaAlunoCantoSupEsqRespostaLabel = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        alternativasCantoSupEsqTextArea1 = new javax.swing.JTextArea();
        respostaTextField4 = new javax.swing.JTextField();
        imagemCantoSupEsqRespostaLabel = new javax.swing.JLabel();
        continuarCantoSupEsqButton = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        perguntaCantoSupEsqTextArea2 = new javax.swing.JTextArea();
        perguntaCantoInfEsqPanel = new javax.swing.JPanel();
        imagemCantoEsqInfPerguntaLabel = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        perguntaCantoEsqInfTextArea = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        alternativasCantoEsqInfTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        respostaCantoEsqInfTextField = new javax.swing.JTextField();
        responderCantoEsqInfButton = new javax.swing.JButton();
        respostaCantoInfEsqPanel = new javax.swing.JPanel();
        respostaAlunoCantoEsqInfRespostaLabel = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        alternativasCantoEsqInfTextArea1 = new javax.swing.JTextArea();
        respostaCantoEsqInfRespostaTextField = new javax.swing.JTextField();
        imagemCantoEsqInfRespostaLabel = new javax.swing.JLabel();
        continuarCantoEsqInfButton = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        perguntaCantoEsqInfTextArea1 = new javax.swing.JTextArea();
        perguntaMeioEsqInfPanel = new javax.swing.JPanel();
        imagemMeioEsqInfPerguntaLabel = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        perguntaMeioEsqInfTextArea = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        alternativasMeioEsqInfTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        respostaMeioEsqInfTextField = new javax.swing.JTextField();
        responderMeioEsqInfButton = new javax.swing.JButton();
        respostaMeioEsqInfPanel = new javax.swing.JPanel();
        respostaAlunoMeioEsqInfRespostaLabel = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        alternativasMeioEsqInfTextArea1 = new javax.swing.JTextArea();
        respostaMeioEsqInfRespostaTextField = new javax.swing.JTextField();
        imagemMeioEsqInfRespostaLabel = new javax.swing.JLabel();
        continuarMeioEsqInfButton = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        perguntaMeioEsqInfTextArea1 = new javax.swing.JTextArea();
        perguntaMeioSupEsqPanel = new javax.swing.JPanel();
        imagemMeioSupEsqPerguntaLabel = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        perguntaMeioSupEsqTextArea = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        alternativasMeioSupEsqTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        respostaMeioSupEsqTextField = new javax.swing.JTextField();
        responderMeioSupEsqButton1 = new javax.swing.JButton();
        respostaMeioSupEsqPanel = new javax.swing.JPanel();
        respostaAlunoMeioSupEsqRespostaLabel = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        alternativasMeioSupEsqTextArea1 = new javax.swing.JTextArea();
        respostaMeioSupEsqRespostaTextField = new javax.swing.JTextField();
        imagemMeioSupEsqRespostaLabel = new javax.swing.JLabel();
        continuarMeioSupEsqButton = new javax.swing.JButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        perguntaMeioSupEsqTextArea1 = new javax.swing.JTextArea();
        perguntaMeioInfDirPanel = new javax.swing.JPanel();
        imagemMeioInfDirPerguntaLabel = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        perguntaMeioInfDirTextArea = new javax.swing.JTextArea();
        jScrollPane26 = new javax.swing.JScrollPane();
        alternativasMeioInfDirTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        respostaMeioInfDirTextField = new javax.swing.JTextField();
        responderMeioInfDirButton = new javax.swing.JButton();
        respostaMeioInfDirPanel = new javax.swing.JPanel();
        respostaAlunoMeioInfDirRespostaLabel = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        alternativasMeioInfDirTextArea1 = new javax.swing.JTextArea();
        respostaMeioInfDirRespostaTextField = new javax.swing.JTextField();
        imagemMeioInfDirRespostaLabel = new javax.swing.JLabel();
        continuarMeioInfDirButton = new javax.swing.JButton();
        jScrollPane28 = new javax.swing.JScrollPane();
        perguntaMeioInfDirTextArea1 = new javax.swing.JTextArea();
        perguntaMeioSupDirPanel = new javax.swing.JPanel();
        imagemMeioSupDirPerguntaLabel = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        perguntaMeioSupDirTextArea = new javax.swing.JTextArea();
        jScrollPane30 = new javax.swing.JScrollPane();
        alternativasMeioSupDirTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        respostaMeioSupDirTextField = new javax.swing.JTextField();
        responderMeioSupDirButton = new javax.swing.JButton();
        respostaMeioSupDirPanel = new javax.swing.JPanel();
        respostaAlunoMeioSupDirRespostaLabel = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        alternativasMeioSupDirTextArea1 = new javax.swing.JTextArea();
        respostaMeioSupDirRespostaTextField = new javax.swing.JTextField();
        imagemMeioSupDirRespostaLabel = new javax.swing.JLabel();
        continuarMeioSupDirButton = new javax.swing.JButton();
        jScrollPane32 = new javax.swing.JScrollPane();
        perguntaMeioSupDirTextArea1 = new javax.swing.JTextArea();
        perguntaCantoInfDirPanel = new javax.swing.JPanel();
        imagemCantoInfDirPerguntaLabel = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        perguntaCantoInfDirTextArea = new javax.swing.JTextArea();
        jScrollPane34 = new javax.swing.JScrollPane();
        alternativasCantoInfDirTextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        respostaCantoInfDirTextField = new javax.swing.JTextField();
        responderCantoInfDirButton1 = new javax.swing.JButton();
        respostaCantoInfDirPanel = new javax.swing.JPanel();
        respostaAlunoCantoInfDirRespostaLabel = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        alternativasCantoInfDirTextArea1 = new javax.swing.JTextArea();
        respostaCantoInfDirRespostaTextField = new javax.swing.JTextField();
        imagemCantoInfDirRespostaLabel = new javax.swing.JLabel();
        continuarCantoInfDirButton = new javax.swing.JButton();
        jScrollPane36 = new javax.swing.JScrollPane();
        perguntaCantoInfDirTextArea1 = new javax.swing.JTextArea();
        perguntaCantoSupDirPanel = new javax.swing.JPanel();
        imagemCantoSupDirPerguntaLabel = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        perguntaCantoSupDirTextArea = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        alternativasCantoSupDirTextArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        respostaCantoSupDirTextField = new javax.swing.JTextField();
        responderCantoSupDirButton = new javax.swing.JButton();
        respostaCantoSupDirPanel = new javax.swing.JPanel();
        respostaAlunoCantoSupDirRespostaLabel = new javax.swing.JLabel();
        jScrollPane39 = new javax.swing.JScrollPane();
        alternativasCantoSupDirTextArea1 = new javax.swing.JTextArea();
        respostaCantoSupDirRespostaTextField = new javax.swing.JTextField();
        imagemCantoSupDirRespostaLabel = new javax.swing.JLabel();
        continuarCantoSupDirButton1 = new javax.swing.JButton();
        jScrollPane40 = new javax.swing.JScrollPane();
        perguntaCantoSupDirTextArea1 = new javax.swing.JTextArea();
        ultimaPerguntaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        ultimaPerguntaPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        imagemFinalLabel = new javax.swing.JLabel();
        inserirVanguardaTextField = new javax.swing.JTextField();
        responderVanguardaButton = new javax.swing.JButton();
        mensagemFimPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        rankingButton = new javax.swing.JButton();
        menuPrincipalButton = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        vanguardaErradaPanel = new javax.swing.JPanel();
        acertosFimLabel1 = new javax.swing.JLabel();
        totalQuestoesLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        errosFimLabel1 = new javax.swing.JLabel();
        nomeVanguardaLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        vanguardaCertaPanel = new javax.swing.JPanel();
        acertosFimLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        totalQuestoesLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        errosFimLabel = new javax.swing.JLabel();
        perdeuPanel = new javax.swing.JPanel();
        acertosFimLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        totalQuestoesLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        errosFimLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jogoPanel.setBackground(new java.awt.Color(222, 209, 193));
        jogoPanel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jogoPanel.setPreferredSize(new java.awt.Dimension(1596, 848));

        jLabel6.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.imgur.com/h2iNDe1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        cantoEsqInfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantoEsqInfButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cantoEsqInfButtonPanelLayout = new javax.swing.GroupLayout(cantoEsqInfButtonPanel);
        cantoEsqInfButtonPanel.setLayout(cantoEsqInfButtonPanelLayout);
        cantoEsqInfButtonPanelLayout.setHorizontalGroup(
            cantoEsqInfButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoEsqInfButton, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        cantoEsqInfButtonPanelLayout.setVerticalGroup(
            cantoEsqInfButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoEsqInfButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        labelCantoEsq2Pannel.setBackground(new java.awt.Color(222, 209, 193));

        cantoEsqInfLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        cantoEsqInfLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout labelCantoEsq2PannelLayout = new javax.swing.GroupLayout(labelCantoEsq2Pannel);
        labelCantoEsq2Pannel.setLayout(labelCantoEsq2PannelLayout);
        labelCantoEsq2PannelLayout.setHorizontalGroup(
            labelCantoEsq2PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoEsqInfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        labelCantoEsq2PannelLayout.setVerticalGroup(
            labelCantoEsq2PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoEsqInfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cantoInfEsqPanel.setLayer(cantoEsqInfButtonPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        cantoInfEsqPanel.setLayer(labelCantoEsq2Pannel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout cantoInfEsqPanelLayout = new javax.swing.GroupLayout(cantoInfEsqPanel);
        cantoInfEsqPanel.setLayout(cantoInfEsqPanelLayout);
        cantoInfEsqPanelLayout.setHorizontalGroup(
            cantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoEsqInfButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cantoInfEsqPanelLayout.createSequentialGroup()
                    .addComponent(labelCantoEsq2Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        cantoInfEsqPanelLayout.setVerticalGroup(
            cantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantoInfEsqPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cantoEsqInfButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cantoInfEsqPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelCantoEsq2Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        meioEsqInfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meioEsqInfButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout meioInfEsqButtonPanelLayout = new javax.swing.GroupLayout(meioInfEsqButtonPanel);
        meioInfEsqButtonPanel.setLayout(meioInfEsqButtonPanelLayout);
        meioInfEsqButtonPanelLayout.setHorizontalGroup(
            meioInfEsqButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioEsqInfButton, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        meioInfEsqButtonPanelLayout.setVerticalGroup(
            meioInfEsqButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioEsqInfButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        labelMeioEsqInfPannel.setBackground(new java.awt.Color(222, 209, 193));

        meioEsqInfLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        meioEsqInfLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout labelMeioEsqInfPannelLayout = new javax.swing.GroupLayout(labelMeioEsqInfPannel);
        labelMeioEsqInfPannel.setLayout(labelMeioEsqInfPannelLayout);
        labelMeioEsqInfPannelLayout.setHorizontalGroup(
            labelMeioEsqInfPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioEsqInfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        labelMeioEsqInfPannelLayout.setVerticalGroup(
            labelMeioEsqInfPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioEsqInfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        meioInfEsqPanel.setLayer(meioInfEsqButtonPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        meioInfEsqPanel.setLayer(labelMeioEsqInfPannel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout meioInfEsqPanelLayout = new javax.swing.GroupLayout(meioInfEsqPanel);
        meioInfEsqPanel.setLayout(meioInfEsqPanelLayout);
        meioInfEsqPanelLayout.setHorizontalGroup(
            meioInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioInfEsqButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(meioInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(meioInfEsqPanelLayout.createSequentialGroup()
                    .addComponent(labelMeioEsqInfPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        meioInfEsqPanelLayout.setVerticalGroup(
            meioInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(meioInfEsqPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meioInfEsqButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(meioInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(meioInfEsqPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelMeioEsqInfPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cantoSupEsqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantoSupEsqButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cantoSupEsqButtonPanelLayout = new javax.swing.GroupLayout(cantoSupEsqButtonPanel);
        cantoSupEsqButtonPanel.setLayout(cantoSupEsqButtonPanelLayout);
        cantoSupEsqButtonPanelLayout.setHorizontalGroup(
            cantoSupEsqButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoSupEsqButton, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        cantoSupEsqButtonPanelLayout.setVerticalGroup(
            cantoSupEsqButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoSupEsqButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        labelCantoSupEsqPannel1.setBackground(new java.awt.Color(222, 209, 193));

        cantoSupEsqLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        cantoSupEsqLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout labelCantoSupEsqPannel1Layout = new javax.swing.GroupLayout(labelCantoSupEsqPannel1);
        labelCantoSupEsqPannel1.setLayout(labelCantoSupEsqPannel1Layout);
        labelCantoSupEsqPannel1Layout.setHorizontalGroup(
            labelCantoSupEsqPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoSupEsqLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        labelCantoSupEsqPannel1Layout.setVerticalGroup(
            labelCantoSupEsqPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoSupEsqLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cantoSupEsqPanel.setLayer(cantoSupEsqButtonPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        cantoSupEsqPanel.setLayer(labelCantoSupEsqPannel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout cantoSupEsqPanelLayout = new javax.swing.GroupLayout(cantoSupEsqPanel);
        cantoSupEsqPanel.setLayout(cantoSupEsqPanelLayout);
        cantoSupEsqPanelLayout.setHorizontalGroup(
            cantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoSupEsqButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cantoSupEsqPanelLayout.createSequentialGroup()
                    .addComponent(labelCantoSupEsqPannel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        cantoSupEsqPanelLayout.setVerticalGroup(
            cantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantoSupEsqPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cantoSupEsqButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cantoSupEsqPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelCantoSupEsqPannel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        meioSupDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meioSupDirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout meioSupDirButtonPanelLayout = new javax.swing.GroupLayout(meioSupDirButtonPanel);
        meioSupDirButtonPanel.setLayout(meioSupDirButtonPanelLayout);
        meioSupDirButtonPanelLayout.setHorizontalGroup(
            meioSupDirButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioSupDirButton, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        meioSupDirButtonPanelLayout.setVerticalGroup(
            meioSupDirButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioSupDirButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        meioSupDirLabelPanel.setBackground(new java.awt.Color(222, 209, 193));

        meioSupDirLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        meioSupDirLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout meioSupDirLabelPanelLayout = new javax.swing.GroupLayout(meioSupDirLabelPanel);
        meioSupDirLabelPanel.setLayout(meioSupDirLabelPanelLayout);
        meioSupDirLabelPanelLayout.setHorizontalGroup(
            meioSupDirLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioSupDirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        meioSupDirLabelPanelLayout.setVerticalGroup(
            meioSupDirLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioSupDirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        meioSupDirPanel.setLayer(meioSupDirButtonPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        meioSupDirPanel.setLayer(meioSupDirLabelPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout meioSupDirPanelLayout = new javax.swing.GroupLayout(meioSupDirPanel);
        meioSupDirPanel.setLayout(meioSupDirPanelLayout);
        meioSupDirPanelLayout.setHorizontalGroup(
            meioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioSupDirButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(meioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(meioSupDirPanelLayout.createSequentialGroup()
                    .addComponent(meioSupDirLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        meioSupDirPanelLayout.setVerticalGroup(
            meioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meioSupDirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meioSupDirButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(meioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(meioSupDirPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(meioSupDirLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        meioInfDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meioInfDirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout meioInfDirButtonPanelLayout = new javax.swing.GroupLayout(meioInfDirButtonPanel);
        meioInfDirButtonPanel.setLayout(meioInfDirButtonPanelLayout);
        meioInfDirButtonPanelLayout.setHorizontalGroup(
            meioInfDirButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioInfDirButton, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        meioInfDirButtonPanelLayout.setVerticalGroup(
            meioInfDirButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioInfDirButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        meioInfDirLabelPanel.setBackground(new java.awt.Color(222, 209, 193));

        meioInfDirLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        meioInfDirLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout meioInfDirLabelPanelLayout = new javax.swing.GroupLayout(meioInfDirLabelPanel);
        meioInfDirLabelPanel.setLayout(meioInfDirLabelPanelLayout);
        meioInfDirLabelPanelLayout.setHorizontalGroup(
            meioInfDirLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioInfDirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        meioInfDirLabelPanelLayout.setVerticalGroup(
            meioInfDirLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioInfDirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        meioInfDirPanel.setLayer(meioInfDirButtonPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        meioInfDirPanel.setLayer(meioInfDirLabelPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout meioInfDirPanelLayout = new javax.swing.GroupLayout(meioInfDirPanel);
        meioInfDirPanel.setLayout(meioInfDirPanelLayout);
        meioInfDirPanelLayout.setHorizontalGroup(
            meioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioInfDirButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(meioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(meioInfDirPanelLayout.createSequentialGroup()
                    .addComponent(meioInfDirLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        meioInfDirPanelLayout.setVerticalGroup(
            meioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meioInfDirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meioInfDirButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(meioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(meioInfDirPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(meioInfDirLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cantoInfDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantoInfDirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cantoInfDirButtonPanelLayout = new javax.swing.GroupLayout(cantoInfDirButtonPanel);
        cantoInfDirButtonPanel.setLayout(cantoInfDirButtonPanelLayout);
        cantoInfDirButtonPanelLayout.setHorizontalGroup(
            cantoInfDirButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoInfDirButton, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        cantoInfDirButtonPanelLayout.setVerticalGroup(
            cantoInfDirButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoInfDirButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        cantoInfDirLabelPanel.setBackground(new java.awt.Color(222, 209, 193));

        cantoInfDirLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        cantoInfDirLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout cantoInfDirLabelPanelLayout = new javax.swing.GroupLayout(cantoInfDirLabelPanel);
        cantoInfDirLabelPanel.setLayout(cantoInfDirLabelPanelLayout);
        cantoInfDirLabelPanelLayout.setHorizontalGroup(
            cantoInfDirLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoInfDirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        cantoInfDirLabelPanelLayout.setVerticalGroup(
            cantoInfDirLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoInfDirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cantoInfDirPanel.setLayer(cantoInfDirButtonPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        cantoInfDirPanel.setLayer(cantoInfDirLabelPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout cantoInfDirPanelLayout = new javax.swing.GroupLayout(cantoInfDirPanel);
        cantoInfDirPanel.setLayout(cantoInfDirPanelLayout);
        cantoInfDirPanelLayout.setHorizontalGroup(
            cantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoInfDirButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cantoInfDirPanelLayout.createSequentialGroup()
                    .addComponent(cantoInfDirLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        cantoInfDirPanelLayout.setVerticalGroup(
            cantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantoInfDirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cantoInfDirButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cantoInfDirPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cantoInfDirLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cantoSupDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantoSupDirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cantoSupDirButtonPanelLayout = new javax.swing.GroupLayout(cantoSupDirButtonPanel);
        cantoSupDirButtonPanel.setLayout(cantoSupDirButtonPanelLayout);
        cantoSupDirButtonPanelLayout.setHorizontalGroup(
            cantoSupDirButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoSupDirButton, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        cantoSupDirButtonPanelLayout.setVerticalGroup(
            cantoSupDirButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoSupDirButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        cantoSupDirLabelPanel.setBackground(new java.awt.Color(222, 209, 193));

        cantoSupDirLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        cantoSupDirLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout cantoSupDirLabelPanelLayout = new javax.swing.GroupLayout(cantoSupDirLabelPanel);
        cantoSupDirLabelPanel.setLayout(cantoSupDirLabelPanelLayout);
        cantoSupDirLabelPanelLayout.setHorizontalGroup(
            cantoSupDirLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoSupDirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        cantoSupDirLabelPanelLayout.setVerticalGroup(
            cantoSupDirLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoSupDirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cantoSupDirPanel.setLayer(cantoSupDirButtonPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        cantoSupDirPanel.setLayer(cantoSupDirLabelPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout cantoSupDirPanelLayout = new javax.swing.GroupLayout(cantoSupDirPanel);
        cantoSupDirPanel.setLayout(cantoSupDirPanelLayout);
        cantoSupDirPanelLayout.setHorizontalGroup(
            cantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantoSupDirButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cantoSupDirPanelLayout.createSequentialGroup()
                    .addComponent(cantoSupDirLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        cantoSupDirPanelLayout.setVerticalGroup(
            cantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cantoSupDirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cantoSupDirButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cantoSupDirPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cantoSupDirLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        meioSupEsqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meioSupEsqButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout meioSupEsqButtonPanelLayout = new javax.swing.GroupLayout(meioSupEsqButtonPanel);
        meioSupEsqButtonPanel.setLayout(meioSupEsqButtonPanelLayout);
        meioSupEsqButtonPanelLayout.setHorizontalGroup(
            meioSupEsqButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioSupEsqButton, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );
        meioSupEsqButtonPanelLayout.setVerticalGroup(
            meioSupEsqButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioSupEsqButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        meioEsqSupLabelPanel.setBackground(new java.awt.Color(222, 209, 193));

        meioSupEsqLabel.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        meioSupEsqLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout meioEsqSupLabelPanelLayout = new javax.swing.GroupLayout(meioEsqSupLabelPanel);
        meioEsqSupLabelPanel.setLayout(meioEsqSupLabelPanelLayout);
        meioEsqSupLabelPanelLayout.setHorizontalGroup(
            meioEsqSupLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioSupEsqLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        meioEsqSupLabelPanelLayout.setVerticalGroup(
            meioEsqSupLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioSupEsqLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        meioSupEsqPanel.setLayer(meioSupEsqButtonPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        meioSupEsqPanel.setLayer(meioEsqSupLabelPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout meioSupEsqPanelLayout = new javax.swing.GroupLayout(meioSupEsqPanel);
        meioSupEsqPanel.setLayout(meioSupEsqPanelLayout);
        meioSupEsqPanelLayout.setHorizontalGroup(
            meioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(meioSupEsqButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(meioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(meioSupEsqPanelLayout.createSequentialGroup()
                    .addComponent(meioEsqSupLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        meioSupEsqPanelLayout.setVerticalGroup(
            meioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, meioSupEsqPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meioSupEsqButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(meioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(meioSupEsqPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(meioEsqSupLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLayeredPane1.setLayer(cantoInfEsqPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(meioInfEsqPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cantoSupEsqPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(meioSupDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(meioInfDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cantoInfDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cantoSupDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(meioSupEsqPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cantoSupEsqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantoInfEsqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(meioInfEsqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meioInfDirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantoInfDirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(meioSupEsqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meioSupDirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantoSupDirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantoSupEsqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meioSupDirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meioSupEsqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantoSupDirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meioInfEsqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantoInfEsqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meioInfDirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantoInfDirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jogoPanelLayout = new javax.swing.GroupLayout(jogoPanel);
        jogoPanel.setLayout(jogoPanelLayout);
        jogoPanelLayout.setHorizontalGroup(
            jogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogoPanelLayout.createSequentialGroup()
                .addGroup(jogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jogoPanelLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jogoPanelLayout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel6)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jogoPanelLayout.setVerticalGroup(
            jogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        perguntaCantoSupEsqPanel.setBackground(new java.awt.Color(222, 209, 193));

        imagemCantoSupEsqPerguntaLabel.setText("jLabel1");

        perguntaCantoSupEsqTextArea.setEditable(false);
        perguntaCantoSupEsqTextArea.setBackground(new java.awt.Color(222, 209, 193));
        perguntaCantoSupEsqTextArea.setColumns(20);
        perguntaCantoSupEsqTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaCantoSupEsqTextArea.setRows(5);
        jScrollPane9.setViewportView(perguntaCantoSupEsqTextArea);

        alternativasCantoSupEsqTextArea.setEditable(false);
        alternativasCantoSupEsqTextArea.setBackground(new java.awt.Color(222, 209, 193));
        alternativasCantoSupEsqTextArea.setColumns(20);
        alternativasCantoSupEsqTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasCantoSupEsqTextArea.setRows(5);
        jScrollPane10.setViewportView(alternativasCantoSupEsqTextArea);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel3.setText("Insira sua resposta:");

        respostaCantoSupEsqTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaCantoSupEsqTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        responderCantoSupEsqButton.setBackground(new java.awt.Color(238, 238, 238));
        responderCantoSupEsqButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        responderCantoSupEsqButton.setText("Responder");
        responderCantoSupEsqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderCantoSupEsqButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout perguntaCantoSupEsqPanelLayout = new javax.swing.GroupLayout(perguntaCantoSupEsqPanel);
        perguntaCantoSupEsqPanel.setLayout(perguntaCantoSupEsqPanelLayout);
        perguntaCantoSupEsqPanelLayout.setHorizontalGroup(
            perguntaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perguntaCantoSupEsqPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(perguntaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perguntaCantoSupEsqPanelLayout.createSequentialGroup()
                        .addGroup(perguntaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemCantoSupEsqPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(perguntaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(perguntaCantoSupEsqPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3))
                            .addComponent(respostaCantoSupEsqTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(perguntaCantoSupEsqPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(responderCantoSupEsqButton)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        perguntaCantoSupEsqPanelLayout.setVerticalGroup(
            perguntaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perguntaCantoSupEsqPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCantoSupEsqPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(perguntaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perguntaCantoSupEsqPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaCantoSupEsqTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(responderCantoSupEsqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(perguntaCantoSupEsqPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        respostaCantoSupEsqPanel.setBackground(new java.awt.Color(222, 209, 193));

        respostaAlunoCantoSupEsqRespostaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        respostaAlunoCantoSupEsqRespostaLabel.setText("Resposta assinalada:");

        alternativasCantoSupEsqTextArea1.setEditable(false);
        alternativasCantoSupEsqTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        alternativasCantoSupEsqTextArea1.setColumns(20);
        alternativasCantoSupEsqTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasCantoSupEsqTextArea1.setRows(5);
        jScrollPane11.setViewportView(alternativasCantoSupEsqTextArea1);

        respostaTextField4.setEditable(false);
        respostaTextField4.setBackground(new java.awt.Color(238, 238, 238));
        respostaTextField4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        imagemCantoSupEsqRespostaLabel.setText("jLabel1");

        continuarCantoSupEsqButton.setBackground(new java.awt.Color(238, 238, 238));
        continuarCantoSupEsqButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        continuarCantoSupEsqButton.setText("Continuar");
        continuarCantoSupEsqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarCantoSupEsqButtonActionPerformed(evt);
            }
        });

        perguntaCantoSupEsqTextArea2.setEditable(false);
        perguntaCantoSupEsqTextArea2.setBackground(new java.awt.Color(222, 209, 193));
        perguntaCantoSupEsqTextArea2.setColumns(20);
        perguntaCantoSupEsqTextArea2.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaCantoSupEsqTextArea2.setRows(5);
        jScrollPane12.setViewportView(perguntaCantoSupEsqTextArea2);

        javax.swing.GroupLayout respostaCantoSupEsqPanelLayout = new javax.swing.GroupLayout(respostaCantoSupEsqPanel);
        respostaCantoSupEsqPanel.setLayout(respostaCantoSupEsqPanelLayout);
        respostaCantoSupEsqPanelLayout.setHorizontalGroup(
            respostaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaCantoSupEsqPanelLayout.createSequentialGroup()
                .addGroup(respostaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaCantoSupEsqPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(respostaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(respostaCantoSupEsqPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(respostaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(respostaCantoSupEsqPanelLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(respostaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respostaAlunoCantoSupEsqRespostaLabel)
                                            .addComponent(respostaTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(respostaCantoSupEsqPanelLayout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(continuarCantoSupEsqButton))))))
                    .addGroup(respostaCantoSupEsqPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(imagemCantoSupEsqRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        respostaCantoSupEsqPanelLayout.setVerticalGroup(
            respostaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaCantoSupEsqPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCantoSupEsqRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(respostaCantoSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaCantoSupEsqPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, respostaCantoSupEsqPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(respostaAlunoCantoSupEsqRespostaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(continuarCantoSupEsqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );

        perguntaCantoInfEsqPanel.setBackground(new java.awt.Color(222, 209, 193));

        imagemCantoEsqInfPerguntaLabel.setText("jLabel1");

        perguntaCantoEsqInfTextArea.setEditable(false);
        perguntaCantoEsqInfTextArea.setBackground(new java.awt.Color(222, 209, 193));
        perguntaCantoEsqInfTextArea.setColumns(20);
        perguntaCantoEsqInfTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaCantoEsqInfTextArea.setRows(5);
        jScrollPane13.setViewportView(perguntaCantoEsqInfTextArea);

        alternativasCantoEsqInfTextArea.setEditable(false);
        alternativasCantoEsqInfTextArea.setBackground(new java.awt.Color(222, 209, 193));
        alternativasCantoEsqInfTextArea.setColumns(20);
        alternativasCantoEsqInfTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasCantoEsqInfTextArea.setRows(5);
        jScrollPane14.setViewportView(alternativasCantoEsqInfTextArea);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel4.setText("Insira sua resposta:");

        respostaCantoEsqInfTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaCantoEsqInfTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        responderCantoEsqInfButton.setBackground(new java.awt.Color(238, 238, 238));
        responderCantoEsqInfButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        responderCantoEsqInfButton.setText("Responder");
        responderCantoEsqInfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderCantoEsqInfButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout perguntaCantoInfEsqPanelLayout = new javax.swing.GroupLayout(perguntaCantoInfEsqPanel);
        perguntaCantoInfEsqPanel.setLayout(perguntaCantoInfEsqPanelLayout);
        perguntaCantoInfEsqPanelLayout.setHorizontalGroup(
            perguntaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perguntaCantoInfEsqPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(perguntaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perguntaCantoInfEsqPanelLayout.createSequentialGroup()
                        .addGroup(perguntaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemCantoEsqInfPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(perguntaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(perguntaCantoInfEsqPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4))
                            .addComponent(respostaCantoEsqInfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(perguntaCantoInfEsqPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(responderCantoEsqInfButton)))))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        perguntaCantoInfEsqPanelLayout.setVerticalGroup(
            perguntaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perguntaCantoInfEsqPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCantoEsqInfPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(perguntaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perguntaCantoInfEsqPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(perguntaCantoInfEsqPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaCantoEsqInfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(responderCantoEsqInfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        respostaCantoInfEsqPanel.setBackground(new java.awt.Color(222, 209, 193));

        respostaAlunoCantoEsqInfRespostaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        respostaAlunoCantoEsqInfRespostaLabel.setText("Resposta assinalada:");

        alternativasCantoEsqInfTextArea1.setEditable(false);
        alternativasCantoEsqInfTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        alternativasCantoEsqInfTextArea1.setColumns(20);
        alternativasCantoEsqInfTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasCantoEsqInfTextArea1.setRows(5);
        jScrollPane15.setViewportView(alternativasCantoEsqInfTextArea1);

        respostaCantoEsqInfRespostaTextField.setEditable(false);
        respostaCantoEsqInfRespostaTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaCantoEsqInfRespostaTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        imagemCantoEsqInfRespostaLabel.setText("jLabel1");

        continuarCantoEsqInfButton.setBackground(new java.awt.Color(238, 238, 238));
        continuarCantoEsqInfButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        continuarCantoEsqInfButton.setText("Continuar");
        continuarCantoEsqInfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarCantoEsqInfButtonActionPerformed(evt);
            }
        });

        perguntaCantoEsqInfTextArea1.setEditable(false);
        perguntaCantoEsqInfTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        perguntaCantoEsqInfTextArea1.setColumns(20);
        perguntaCantoEsqInfTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaCantoEsqInfTextArea1.setRows(5);
        jScrollPane16.setViewportView(perguntaCantoEsqInfTextArea1);

        javax.swing.GroupLayout respostaCantoInfEsqPanelLayout = new javax.swing.GroupLayout(respostaCantoInfEsqPanel);
        respostaCantoInfEsqPanel.setLayout(respostaCantoInfEsqPanelLayout);
        respostaCantoInfEsqPanelLayout.setHorizontalGroup(
            respostaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaCantoInfEsqPanelLayout.createSequentialGroup()
                .addGroup(respostaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaCantoInfEsqPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(respostaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(respostaCantoInfEsqPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(respostaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(respostaCantoInfEsqPanelLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(respostaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respostaAlunoCantoEsqInfRespostaLabel)
                                            .addComponent(respostaCantoEsqInfRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(respostaCantoInfEsqPanelLayout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(continuarCantoEsqInfButton))))))
                    .addGroup(respostaCantoInfEsqPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(imagemCantoEsqInfRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        respostaCantoInfEsqPanelLayout.setVerticalGroup(
            respostaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaCantoInfEsqPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCantoEsqInfRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(respostaCantoInfEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaCantoInfEsqPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(respostaAlunoCantoEsqInfRespostaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaCantoEsqInfRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(continuarCantoEsqInfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(respostaCantoInfEsqPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        perguntaMeioEsqInfPanel.setBackground(new java.awt.Color(222, 209, 193));

        imagemMeioEsqInfPerguntaLabel.setText("jLabel1");

        perguntaMeioEsqInfTextArea.setEditable(false);
        perguntaMeioEsqInfTextArea.setBackground(new java.awt.Color(222, 209, 193));
        perguntaMeioEsqInfTextArea.setColumns(20);
        perguntaMeioEsqInfTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaMeioEsqInfTextArea.setRows(5);
        jScrollPane17.setViewportView(perguntaMeioEsqInfTextArea);

        alternativasMeioEsqInfTextArea.setEditable(false);
        alternativasMeioEsqInfTextArea.setBackground(new java.awt.Color(222, 209, 193));
        alternativasMeioEsqInfTextArea.setColumns(20);
        alternativasMeioEsqInfTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasMeioEsqInfTextArea.setRows(5);
        jScrollPane18.setViewportView(alternativasMeioEsqInfTextArea);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel5.setText("Insira sua resposta:");

        respostaMeioEsqInfTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaMeioEsqInfTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        responderMeioEsqInfButton.setBackground(new java.awt.Color(238, 238, 238));
        responderMeioEsqInfButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        responderMeioEsqInfButton.setText("Responder");
        responderMeioEsqInfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderMeioEsqInfButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout perguntaMeioEsqInfPanelLayout = new javax.swing.GroupLayout(perguntaMeioEsqInfPanel);
        perguntaMeioEsqInfPanel.setLayout(perguntaMeioEsqInfPanelLayout);
        perguntaMeioEsqInfPanelLayout.setHorizontalGroup(
            perguntaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perguntaMeioEsqInfPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(perguntaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perguntaMeioEsqInfPanelLayout.createSequentialGroup()
                        .addGroup(perguntaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemMeioEsqInfPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(perguntaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(perguntaMeioEsqInfPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5))
                            .addComponent(respostaMeioEsqInfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(perguntaMeioEsqInfPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(responderMeioEsqInfButton)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        perguntaMeioEsqInfPanelLayout.setVerticalGroup(
            perguntaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perguntaMeioEsqInfPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemMeioEsqInfPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(perguntaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perguntaMeioEsqInfPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(perguntaMeioEsqInfPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaMeioEsqInfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(responderMeioEsqInfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        respostaMeioEsqInfPanel.setBackground(new java.awt.Color(222, 209, 193));

        respostaAlunoMeioEsqInfRespostaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        respostaAlunoMeioEsqInfRespostaLabel.setText("Resposta assinalada:");

        alternativasMeioEsqInfTextArea1.setEditable(false);
        alternativasMeioEsqInfTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        alternativasMeioEsqInfTextArea1.setColumns(20);
        alternativasMeioEsqInfTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasMeioEsqInfTextArea1.setRows(5);
        jScrollPane19.setViewportView(alternativasMeioEsqInfTextArea1);

        respostaMeioEsqInfRespostaTextField.setEditable(false);
        respostaMeioEsqInfRespostaTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaMeioEsqInfRespostaTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        imagemMeioEsqInfRespostaLabel.setText("jLabel1");

        continuarMeioEsqInfButton.setBackground(new java.awt.Color(238, 238, 238));
        continuarMeioEsqInfButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        continuarMeioEsqInfButton.setText("Continuar");
        continuarMeioEsqInfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarMeioEsqInfButtonActionPerformed(evt);
            }
        });

        perguntaMeioEsqInfTextArea1.setEditable(false);
        perguntaMeioEsqInfTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        perguntaMeioEsqInfTextArea1.setColumns(20);
        perguntaMeioEsqInfTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaMeioEsqInfTextArea1.setRows(5);
        jScrollPane20.setViewportView(perguntaMeioEsqInfTextArea1);

        javax.swing.GroupLayout respostaMeioEsqInfPanelLayout = new javax.swing.GroupLayout(respostaMeioEsqInfPanel);
        respostaMeioEsqInfPanel.setLayout(respostaMeioEsqInfPanelLayout);
        respostaMeioEsqInfPanelLayout.setHorizontalGroup(
            respostaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaMeioEsqInfPanelLayout.createSequentialGroup()
                .addGroup(respostaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaMeioEsqInfPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(respostaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(respostaMeioEsqInfPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(respostaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(respostaMeioEsqInfPanelLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(respostaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respostaAlunoMeioEsqInfRespostaLabel)
                                            .addComponent(respostaMeioEsqInfRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(respostaMeioEsqInfPanelLayout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(continuarMeioEsqInfButton))))))
                    .addGroup(respostaMeioEsqInfPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(imagemMeioEsqInfRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        respostaMeioEsqInfPanelLayout.setVerticalGroup(
            respostaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaMeioEsqInfPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemMeioEsqInfRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(respostaMeioEsqInfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaMeioEsqInfPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(respostaAlunoMeioEsqInfRespostaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaMeioEsqInfRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(continuarMeioEsqInfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(respostaMeioEsqInfPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        perguntaMeioSupEsqPanel.setBackground(new java.awt.Color(222, 209, 193));

        imagemMeioSupEsqPerguntaLabel.setText("jLabel1");

        perguntaMeioSupEsqTextArea.setEditable(false);
        perguntaMeioSupEsqTextArea.setBackground(new java.awt.Color(222, 209, 193));
        perguntaMeioSupEsqTextArea.setColumns(20);
        perguntaMeioSupEsqTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaMeioSupEsqTextArea.setRows(5);
        jScrollPane21.setViewportView(perguntaMeioSupEsqTextArea);

        alternativasMeioSupEsqTextArea.setEditable(false);
        alternativasMeioSupEsqTextArea.setBackground(new java.awt.Color(222, 209, 193));
        alternativasMeioSupEsqTextArea.setColumns(20);
        alternativasMeioSupEsqTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasMeioSupEsqTextArea.setRows(5);
        jScrollPane22.setViewportView(alternativasMeioSupEsqTextArea);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel7.setText("Insira sua resposta:");

        respostaMeioSupEsqTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaMeioSupEsqTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        responderMeioSupEsqButton1.setBackground(new java.awt.Color(238, 238, 238));
        responderMeioSupEsqButton1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        responderMeioSupEsqButton1.setText("Responder");
        responderMeioSupEsqButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderMeioSupEsqButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout perguntaMeioSupEsqPanelLayout = new javax.swing.GroupLayout(perguntaMeioSupEsqPanel);
        perguntaMeioSupEsqPanel.setLayout(perguntaMeioSupEsqPanelLayout);
        perguntaMeioSupEsqPanelLayout.setHorizontalGroup(
            perguntaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perguntaMeioSupEsqPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(perguntaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perguntaMeioSupEsqPanelLayout.createSequentialGroup()
                        .addGroup(perguntaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemMeioSupEsqPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(perguntaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(perguntaMeioSupEsqPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7))
                            .addComponent(respostaMeioSupEsqTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(perguntaMeioSupEsqPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(responderMeioSupEsqButton1)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        perguntaMeioSupEsqPanelLayout.setVerticalGroup(
            perguntaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perguntaMeioSupEsqPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemMeioSupEsqPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(perguntaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perguntaMeioSupEsqPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(perguntaMeioSupEsqPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaMeioSupEsqTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(responderMeioSupEsqButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        respostaMeioSupEsqPanel.setBackground(new java.awt.Color(222, 209, 193));

        respostaAlunoMeioSupEsqRespostaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        respostaAlunoMeioSupEsqRespostaLabel.setText("Resposta assinalada:");

        alternativasMeioSupEsqTextArea1.setEditable(false);
        alternativasMeioSupEsqTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        alternativasMeioSupEsqTextArea1.setColumns(20);
        alternativasMeioSupEsqTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasMeioSupEsqTextArea1.setRows(5);
        jScrollPane23.setViewportView(alternativasMeioSupEsqTextArea1);

        respostaMeioSupEsqRespostaTextField.setEditable(false);
        respostaMeioSupEsqRespostaTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaMeioSupEsqRespostaTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        imagemMeioSupEsqRespostaLabel.setText("jLabel1");

        continuarMeioSupEsqButton.setBackground(new java.awt.Color(238, 238, 238));
        continuarMeioSupEsqButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        continuarMeioSupEsqButton.setText("Continuar");
        continuarMeioSupEsqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarMeioSupEsqButtonActionPerformed(evt);
            }
        });

        perguntaMeioSupEsqTextArea1.setEditable(false);
        perguntaMeioSupEsqTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        perguntaMeioSupEsqTextArea1.setColumns(20);
        perguntaMeioSupEsqTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaMeioSupEsqTextArea1.setRows(5);
        jScrollPane24.setViewportView(perguntaMeioSupEsqTextArea1);

        javax.swing.GroupLayout respostaMeioSupEsqPanelLayout = new javax.swing.GroupLayout(respostaMeioSupEsqPanel);
        respostaMeioSupEsqPanel.setLayout(respostaMeioSupEsqPanelLayout);
        respostaMeioSupEsqPanelLayout.setHorizontalGroup(
            respostaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaMeioSupEsqPanelLayout.createSequentialGroup()
                .addGroup(respostaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaMeioSupEsqPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(respostaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(respostaMeioSupEsqPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(respostaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(respostaMeioSupEsqPanelLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(respostaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respostaAlunoMeioSupEsqRespostaLabel)
                                            .addComponent(respostaMeioSupEsqRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(respostaMeioSupEsqPanelLayout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(continuarMeioSupEsqButton))))))
                    .addGroup(respostaMeioSupEsqPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(imagemMeioSupEsqRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        respostaMeioSupEsqPanelLayout.setVerticalGroup(
            respostaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaMeioSupEsqPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemMeioSupEsqRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(respostaMeioSupEsqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaMeioSupEsqPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(respostaAlunoMeioSupEsqRespostaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaMeioSupEsqRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(continuarMeioSupEsqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(respostaMeioSupEsqPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        perguntaMeioInfDirPanel.setBackground(new java.awt.Color(222, 209, 193));

        imagemMeioInfDirPerguntaLabel.setText("jLabel1");

        perguntaMeioInfDirTextArea.setEditable(false);
        perguntaMeioInfDirTextArea.setBackground(new java.awt.Color(222, 209, 193));
        perguntaMeioInfDirTextArea.setColumns(20);
        perguntaMeioInfDirTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaMeioInfDirTextArea.setRows(5);
        jScrollPane25.setViewportView(perguntaMeioInfDirTextArea);

        alternativasMeioInfDirTextArea.setEditable(false);
        alternativasMeioInfDirTextArea.setBackground(new java.awt.Color(222, 209, 193));
        alternativasMeioInfDirTextArea.setColumns(20);
        alternativasMeioInfDirTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasMeioInfDirTextArea.setRows(5);
        jScrollPane26.setViewportView(alternativasMeioInfDirTextArea);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel8.setText("Insira sua resposta:");

        respostaMeioInfDirTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaMeioInfDirTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        responderMeioInfDirButton.setBackground(new java.awt.Color(238, 238, 238));
        responderMeioInfDirButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        responderMeioInfDirButton.setText("Responder");
        responderMeioInfDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderMeioInfDirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout perguntaMeioInfDirPanelLayout = new javax.swing.GroupLayout(perguntaMeioInfDirPanel);
        perguntaMeioInfDirPanel.setLayout(perguntaMeioInfDirPanelLayout);
        perguntaMeioInfDirPanelLayout.setHorizontalGroup(
            perguntaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perguntaMeioInfDirPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(perguntaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perguntaMeioInfDirPanelLayout.createSequentialGroup()
                        .addGroup(perguntaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemMeioInfDirPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(perguntaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(perguntaMeioInfDirPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8))
                            .addComponent(respostaMeioInfDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(perguntaMeioInfDirPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(responderMeioInfDirButton)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        perguntaMeioInfDirPanelLayout.setVerticalGroup(
            perguntaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perguntaMeioInfDirPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemMeioInfDirPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(perguntaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perguntaMeioInfDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(perguntaMeioInfDirPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaMeioInfDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(responderMeioInfDirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        respostaMeioInfDirPanel.setBackground(new java.awt.Color(222, 209, 193));

        respostaAlunoMeioInfDirRespostaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        respostaAlunoMeioInfDirRespostaLabel.setText("Resposta assinalada:");

        alternativasMeioInfDirTextArea1.setEditable(false);
        alternativasMeioInfDirTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        alternativasMeioInfDirTextArea1.setColumns(20);
        alternativasMeioInfDirTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasMeioInfDirTextArea1.setRows(5);
        jScrollPane27.setViewportView(alternativasMeioInfDirTextArea1);

        respostaMeioInfDirRespostaTextField.setEditable(false);
        respostaMeioInfDirRespostaTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaMeioInfDirRespostaTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        imagemMeioInfDirRespostaLabel.setText("jLabel1");

        continuarMeioInfDirButton.setBackground(new java.awt.Color(238, 238, 238));
        continuarMeioInfDirButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        continuarMeioInfDirButton.setText("Continuar");
        continuarMeioInfDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarMeioInfDirButtonActionPerformed(evt);
            }
        });

        perguntaMeioInfDirTextArea1.setEditable(false);
        perguntaMeioInfDirTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        perguntaMeioInfDirTextArea1.setColumns(20);
        perguntaMeioInfDirTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaMeioInfDirTextArea1.setRows(5);
        jScrollPane28.setViewportView(perguntaMeioInfDirTextArea1);

        javax.swing.GroupLayout respostaMeioInfDirPanelLayout = new javax.swing.GroupLayout(respostaMeioInfDirPanel);
        respostaMeioInfDirPanel.setLayout(respostaMeioInfDirPanelLayout);
        respostaMeioInfDirPanelLayout.setHorizontalGroup(
            respostaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaMeioInfDirPanelLayout.createSequentialGroup()
                .addGroup(respostaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaMeioInfDirPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(respostaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(respostaMeioInfDirPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(respostaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(respostaMeioInfDirPanelLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(respostaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respostaAlunoMeioInfDirRespostaLabel)
                                            .addComponent(respostaMeioInfDirRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(respostaMeioInfDirPanelLayout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(continuarMeioInfDirButton))))))
                    .addGroup(respostaMeioInfDirPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(imagemMeioInfDirRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        respostaMeioInfDirPanelLayout.setVerticalGroup(
            respostaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaMeioInfDirPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemMeioInfDirRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(respostaMeioInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaMeioInfDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(respostaAlunoMeioInfDirRespostaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaMeioInfDirRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(continuarMeioInfDirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(respostaMeioInfDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        perguntaMeioSupDirPanel.setBackground(new java.awt.Color(222, 209, 193));

        imagemMeioSupDirPerguntaLabel.setText("jLabel1");

        perguntaMeioSupDirTextArea.setEditable(false);
        perguntaMeioSupDirTextArea.setBackground(new java.awt.Color(222, 209, 193));
        perguntaMeioSupDirTextArea.setColumns(20);
        perguntaMeioSupDirTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaMeioSupDirTextArea.setRows(5);
        jScrollPane29.setViewportView(perguntaMeioSupDirTextArea);

        alternativasMeioSupDirTextArea.setEditable(false);
        alternativasMeioSupDirTextArea.setBackground(new java.awt.Color(222, 209, 193));
        alternativasMeioSupDirTextArea.setColumns(20);
        alternativasMeioSupDirTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasMeioSupDirTextArea.setRows(5);
        jScrollPane30.setViewportView(alternativasMeioSupDirTextArea);

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel9.setText("Insira sua resposta:");

        respostaMeioSupDirTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaMeioSupDirTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        responderMeioSupDirButton.setBackground(new java.awt.Color(238, 238, 238));
        responderMeioSupDirButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        responderMeioSupDirButton.setText("Responder");
        responderMeioSupDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderMeioSupDirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout perguntaMeioSupDirPanelLayout = new javax.swing.GroupLayout(perguntaMeioSupDirPanel);
        perguntaMeioSupDirPanel.setLayout(perguntaMeioSupDirPanelLayout);
        perguntaMeioSupDirPanelLayout.setHorizontalGroup(
            perguntaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perguntaMeioSupDirPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(perguntaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perguntaMeioSupDirPanelLayout.createSequentialGroup()
                        .addGroup(perguntaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemMeioSupDirPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(perguntaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(perguntaMeioSupDirPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9))
                            .addComponent(respostaMeioSupDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(perguntaMeioSupDirPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(responderMeioSupDirButton)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        perguntaMeioSupDirPanelLayout.setVerticalGroup(
            perguntaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perguntaMeioSupDirPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemMeioSupDirPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(perguntaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perguntaMeioSupDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(perguntaMeioSupDirPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaMeioSupDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(responderMeioSupDirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        respostaMeioSupDirPanel.setBackground(new java.awt.Color(222, 209, 193));

        respostaAlunoMeioSupDirRespostaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        respostaAlunoMeioSupDirRespostaLabel.setText("Resposta assinalada:");

        alternativasMeioSupDirTextArea1.setEditable(false);
        alternativasMeioSupDirTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        alternativasMeioSupDirTextArea1.setColumns(20);
        alternativasMeioSupDirTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasMeioSupDirTextArea1.setRows(5);
        jScrollPane31.setViewportView(alternativasMeioSupDirTextArea1);

        respostaMeioSupDirRespostaTextField.setEditable(false);
        respostaMeioSupDirRespostaTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaMeioSupDirRespostaTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        imagemMeioSupDirRespostaLabel.setText("jLabel1");

        continuarMeioSupDirButton.setBackground(new java.awt.Color(238, 238, 238));
        continuarMeioSupDirButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        continuarMeioSupDirButton.setText("Continuar");
        continuarMeioSupDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarMeioSupDirButtonActionPerformed(evt);
            }
        });

        perguntaMeioSupDirTextArea1.setEditable(false);
        perguntaMeioSupDirTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        perguntaMeioSupDirTextArea1.setColumns(20);
        perguntaMeioSupDirTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaMeioSupDirTextArea1.setRows(5);
        jScrollPane32.setViewportView(perguntaMeioSupDirTextArea1);

        javax.swing.GroupLayout respostaMeioSupDirPanelLayout = new javax.swing.GroupLayout(respostaMeioSupDirPanel);
        respostaMeioSupDirPanel.setLayout(respostaMeioSupDirPanelLayout);
        respostaMeioSupDirPanelLayout.setHorizontalGroup(
            respostaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaMeioSupDirPanelLayout.createSequentialGroup()
                .addGroup(respostaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaMeioSupDirPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(respostaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(respostaMeioSupDirPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(respostaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(respostaAlunoMeioSupDirRespostaLabel)
                                    .addComponent(respostaMeioSupDirRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(respostaMeioSupDirPanelLayout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(continuarMeioSupDirButton))))))
                    .addGroup(respostaMeioSupDirPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(imagemMeioSupDirRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        respostaMeioSupDirPanelLayout.setVerticalGroup(
            respostaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaMeioSupDirPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemMeioSupDirRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(respostaMeioSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaMeioSupDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, respostaMeioSupDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(respostaAlunoMeioSupDirRespostaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaMeioSupDirRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(continuarMeioSupDirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );

        perguntaCantoInfDirPanel.setBackground(new java.awt.Color(222, 209, 193));

        imagemCantoInfDirPerguntaLabel.setText("jLabel1");

        perguntaCantoInfDirTextArea.setEditable(false);
        perguntaCantoInfDirTextArea.setBackground(new java.awt.Color(222, 209, 193));
        perguntaCantoInfDirTextArea.setColumns(20);
        perguntaCantoInfDirTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaCantoInfDirTextArea.setRows(5);
        jScrollPane33.setViewportView(perguntaCantoInfDirTextArea);

        alternativasCantoInfDirTextArea.setEditable(false);
        alternativasCantoInfDirTextArea.setBackground(new java.awt.Color(222, 209, 193));
        alternativasCantoInfDirTextArea.setColumns(20);
        alternativasCantoInfDirTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasCantoInfDirTextArea.setRows(5);
        jScrollPane34.setViewportView(alternativasCantoInfDirTextArea);

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel10.setText("Insira sua resposta:");

        respostaCantoInfDirTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaCantoInfDirTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        responderCantoInfDirButton1.setBackground(new java.awt.Color(238, 238, 238));
        responderCantoInfDirButton1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        responderCantoInfDirButton1.setText("Responder");
        responderCantoInfDirButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderCantoInfDirButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout perguntaCantoInfDirPanelLayout = new javax.swing.GroupLayout(perguntaCantoInfDirPanel);
        perguntaCantoInfDirPanel.setLayout(perguntaCantoInfDirPanelLayout);
        perguntaCantoInfDirPanelLayout.setHorizontalGroup(
            perguntaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perguntaCantoInfDirPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(perguntaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perguntaCantoInfDirPanelLayout.createSequentialGroup()
                        .addGroup(perguntaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemCantoInfDirPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(perguntaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(perguntaCantoInfDirPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel10))
                            .addComponent(respostaCantoInfDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(perguntaCantoInfDirPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(responderCantoInfDirButton1)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        perguntaCantoInfDirPanelLayout.setVerticalGroup(
            perguntaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perguntaCantoInfDirPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCantoInfDirPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(perguntaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perguntaCantoInfDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(perguntaCantoInfDirPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaCantoInfDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(responderCantoInfDirButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        respostaCantoInfDirPanel.setBackground(new java.awt.Color(222, 209, 193));

        respostaAlunoCantoInfDirRespostaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        respostaAlunoCantoInfDirRespostaLabel.setText("Resposta assinalada:");

        alternativasCantoInfDirTextArea1.setEditable(false);
        alternativasCantoInfDirTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        alternativasCantoInfDirTextArea1.setColumns(20);
        alternativasCantoInfDirTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasCantoInfDirTextArea1.setRows(5);
        jScrollPane35.setViewportView(alternativasCantoInfDirTextArea1);

        respostaCantoInfDirRespostaTextField.setEditable(false);
        respostaCantoInfDirRespostaTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaCantoInfDirRespostaTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        imagemCantoInfDirRespostaLabel.setText("jLabel1");

        continuarCantoInfDirButton.setBackground(new java.awt.Color(238, 238, 238));
        continuarCantoInfDirButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        continuarCantoInfDirButton.setText("Continuar");
        continuarCantoInfDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarCantoInfDirButtonActionPerformed(evt);
            }
        });

        perguntaCantoInfDirTextArea1.setEditable(false);
        perguntaCantoInfDirTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        perguntaCantoInfDirTextArea1.setColumns(20);
        perguntaCantoInfDirTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaCantoInfDirTextArea1.setRows(5);
        jScrollPane36.setViewportView(perguntaCantoInfDirTextArea1);

        javax.swing.GroupLayout respostaCantoInfDirPanelLayout = new javax.swing.GroupLayout(respostaCantoInfDirPanel);
        respostaCantoInfDirPanel.setLayout(respostaCantoInfDirPanelLayout);
        respostaCantoInfDirPanelLayout.setHorizontalGroup(
            respostaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaCantoInfDirPanelLayout.createSequentialGroup()
                .addGroup(respostaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaCantoInfDirPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(respostaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(respostaCantoInfDirPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(respostaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(respostaCantoInfDirPanelLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(respostaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respostaAlunoCantoInfDirRespostaLabel)
                                            .addComponent(respostaCantoInfDirRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(respostaCantoInfDirPanelLayout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(continuarCantoInfDirButton))))))
                    .addGroup(respostaCantoInfDirPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(imagemCantoInfDirRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        respostaCantoInfDirPanelLayout.setVerticalGroup(
            respostaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaCantoInfDirPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCantoInfDirRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(respostaCantoInfDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaCantoInfDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(respostaAlunoCantoInfDirRespostaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaCantoInfDirRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(continuarCantoInfDirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(respostaCantoInfDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        perguntaCantoSupDirPanel.setBackground(new java.awt.Color(222, 209, 193));

        imagemCantoSupDirPerguntaLabel.setText("jLabel1");

        perguntaCantoSupDirTextArea.setEditable(false);
        perguntaCantoSupDirTextArea.setBackground(new java.awt.Color(222, 209, 193));
        perguntaCantoSupDirTextArea.setColumns(20);
        perguntaCantoSupDirTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaCantoSupDirTextArea.setRows(5);
        jScrollPane37.setViewportView(perguntaCantoSupDirTextArea);

        alternativasCantoSupDirTextArea.setEditable(false);
        alternativasCantoSupDirTextArea.setBackground(new java.awt.Color(222, 209, 193));
        alternativasCantoSupDirTextArea.setColumns(20);
        alternativasCantoSupDirTextArea.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasCantoSupDirTextArea.setRows(5);
        jScrollPane38.setViewportView(alternativasCantoSupDirTextArea);

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        jLabel11.setText("Insira sua resposta:");

        respostaCantoSupDirTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaCantoSupDirTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        responderCantoSupDirButton.setBackground(new java.awt.Color(238, 238, 238));
        responderCantoSupDirButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        responderCantoSupDirButton.setText("Responder");
        responderCantoSupDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderCantoSupDirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout perguntaCantoSupDirPanelLayout = new javax.swing.GroupLayout(perguntaCantoSupDirPanel);
        perguntaCantoSupDirPanel.setLayout(perguntaCantoSupDirPanelLayout);
        perguntaCantoSupDirPanelLayout.setHorizontalGroup(
            perguntaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perguntaCantoSupDirPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(perguntaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perguntaCantoSupDirPanelLayout.createSequentialGroup()
                        .addGroup(perguntaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemCantoSupDirPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(perguntaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(perguntaCantoSupDirPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel11))
                            .addComponent(respostaCantoSupDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(perguntaCantoSupDirPanelLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(responderCantoSupDirButton)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        perguntaCantoSupDirPanelLayout.setVerticalGroup(
            perguntaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perguntaCantoSupDirPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCantoSupDirPerguntaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(perguntaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perguntaCantoSupDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(perguntaCantoSupDirPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaCantoSupDirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(responderCantoSupDirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        respostaCantoSupDirPanel.setBackground(new java.awt.Color(222, 209, 193));

        respostaAlunoCantoSupDirRespostaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        respostaAlunoCantoSupDirRespostaLabel.setText("Resposta assinalada:");

        alternativasCantoSupDirTextArea1.setEditable(false);
        alternativasCantoSupDirTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        alternativasCantoSupDirTextArea1.setColumns(20);
        alternativasCantoSupDirTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        alternativasCantoSupDirTextArea1.setRows(5);
        jScrollPane39.setViewportView(alternativasCantoSupDirTextArea1);

        respostaCantoSupDirRespostaTextField.setEditable(false);
        respostaCantoSupDirRespostaTextField.setBackground(new java.awt.Color(238, 238, 238));
        respostaCantoSupDirRespostaTextField.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N

        imagemCantoSupDirRespostaLabel.setText("jLabel1");

        continuarCantoSupDirButton1.setBackground(new java.awt.Color(238, 238, 238));
        continuarCantoSupDirButton1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        continuarCantoSupDirButton1.setText("Continuar");
        continuarCantoSupDirButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarCantoSupDirButton1ActionPerformed(evt);
            }
        });

        perguntaCantoSupDirTextArea1.setEditable(false);
        perguntaCantoSupDirTextArea1.setBackground(new java.awt.Color(222, 209, 193));
        perguntaCantoSupDirTextArea1.setColumns(20);
        perguntaCantoSupDirTextArea1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        perguntaCantoSupDirTextArea1.setRows(5);
        jScrollPane40.setViewportView(perguntaCantoSupDirTextArea1);

        javax.swing.GroupLayout respostaCantoSupDirPanelLayout = new javax.swing.GroupLayout(respostaCantoSupDirPanel);
        respostaCantoSupDirPanel.setLayout(respostaCantoSupDirPanelLayout);
        respostaCantoSupDirPanelLayout.setHorizontalGroup(
            respostaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaCantoSupDirPanelLayout.createSequentialGroup()
                .addGroup(respostaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaCantoSupDirPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(respostaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 1421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(respostaCantoSupDirPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(respostaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(respostaCantoSupDirPanelLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(respostaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(respostaAlunoCantoSupDirRespostaLabel)
                                            .addComponent(respostaCantoSupDirRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(respostaCantoSupDirPanelLayout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(continuarCantoSupDirButton1))))))
                    .addGroup(respostaCantoSupDirPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(imagemCantoSupDirRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        respostaCantoSupDirPanelLayout.setVerticalGroup(
            respostaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respostaCantoSupDirPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagemCantoSupDirRespostaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(respostaCantoSupDirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respostaCantoSupDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(respostaAlunoCantoSupDirRespostaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respostaCantoSupDirRespostaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(continuarCantoSupDirButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(respostaCantoSupDirPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        ultimaPerguntaPanel.setBackground(new java.awt.Color(222, 209, 193));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 28)); // NOI18N
        jLabel2.setText("O quadro abaixo pertence a qual vanguarda?");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel12.setText("(Use as perguntas respondidas anteriormente e analise");

        ultimaPerguntaPanel1.setBackground(new java.awt.Color(222, 209, 193));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel13.setText("as características do quadro para responder a questão)");

        jLayeredPane3.setLayer(imagemFinalLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(imagemFinalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                    .addComponent(imagemFinalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        inserirVanguardaTextField.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        inserirVanguardaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inserirVanguardaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirVanguardaTextFieldActionPerformed(evt);
            }
        });

        responderVanguardaButton.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        responderVanguardaButton.setText("Responder");
        responderVanguardaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderVanguardaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ultimaPerguntaPanel1Layout = new javax.swing.GroupLayout(ultimaPerguntaPanel1);
        ultimaPerguntaPanel1.setLayout(ultimaPerguntaPanel1Layout);
        ultimaPerguntaPanel1Layout.setHorizontalGroup(
            ultimaPerguntaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ultimaPerguntaPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ultimaPerguntaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ultimaPerguntaPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel13))
                    .addGroup(ultimaPerguntaPanel1Layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(responderVanguardaButton))
                    .addGroup(ultimaPerguntaPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(inserirVanguardaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        ultimaPerguntaPanel1Layout.setVerticalGroup(
            ultimaPerguntaPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ultimaPerguntaPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inserirVanguardaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(responderVanguardaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mensagemFimPanel.setBackground(new java.awt.Color(222, 209, 193));
        mensagemFimPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(81, 92, 147), 3));

        jLabel14.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.imgur.com/h2iNDe1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        rankingButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        rankingButton.setText("Ranking");
        rankingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingButtonActionPerformed(evt);
            }
        });

        menuPrincipalButton.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        menuPrincipalButton.setText("Menu Principal");
        menuPrincipalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalButtonActionPerformed(evt);
            }
        });

        vanguardaErradaPanel.setBackground(new java.awt.Color(222, 209, 193));

        acertosFimLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        acertosFimLabel1.setText("Você acertou _ questões");

        totalQuestoesLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        totalQuestoesLabel1.setText("Você respondeu _ questões");

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel22.setText("Você terminou o jogo mas não acertou a pergunta final!");

        errosFimLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        errosFimLabel1.setText("Você errou _ questões");

        nomeVanguardaLabel.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        nomeVanguardaLabel.setText("A resposta era _________________");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel15.setText("Parabéns!!!!");

        javax.swing.GroupLayout vanguardaErradaPanelLayout = new javax.swing.GroupLayout(vanguardaErradaPanel);
        vanguardaErradaPanel.setLayout(vanguardaErradaPanelLayout);
        vanguardaErradaPanelLayout.setHorizontalGroup(
            vanguardaErradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vanguardaErradaPanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel15)
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(vanguardaErradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vanguardaErradaPanelLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(vanguardaErradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vanguardaErradaPanelLayout.createSequentialGroup()
                            .addComponent(acertosFimLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(errosFimLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vanguardaErradaPanelLayout.createSequentialGroup()
                            .addComponent(totalQuestoesLabel1)
                            .addGap(159, 159, 159))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vanguardaErradaPanelLayout.createSequentialGroup()
                            .addComponent(nomeVanguardaLabel)
                            .addGap(129, 129, 129))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vanguardaErradaPanelLayout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addGap(8, 8, 8)))
                    .addGap(9, 9, 9)))
        );
        vanguardaErradaPanelLayout.setVerticalGroup(
            vanguardaErradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vanguardaErradaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(vanguardaErradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vanguardaErradaPanelLayout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel22)
                    .addGap(4, 4, 4)
                    .addComponent(nomeVanguardaLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(totalQuestoesLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(vanguardaErradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(acertosFimLabel1)
                        .addComponent(errosFimLabel1))
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        vanguardaCertaPanel.setBackground(new java.awt.Color(222, 209, 193));

        acertosFimLabel.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        acertosFimLabel.setText("Você acertou _ questões");

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel18.setText("Parabéns!!!!");

        totalQuestoesLabel.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        totalQuestoesLabel.setText("Você respondeu _ questões");

        jLabel20.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel20.setText("Você terminou o jogo e acertou a pergunta final!");

        errosFimLabel.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        errosFimLabel.setText("Você errou _ questões");

        javax.swing.GroupLayout vanguardaCertaPanelLayout = new javax.swing.GroupLayout(vanguardaCertaPanel);
        vanguardaCertaPanel.setLayout(vanguardaCertaPanelLayout);
        vanguardaCertaPanelLayout.setHorizontalGroup(
            vanguardaCertaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vanguardaCertaPanelLayout.createSequentialGroup()
                .addGroup(vanguardaCertaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vanguardaCertaPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(acertosFimLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errosFimLabel))
                    .addGroup(vanguardaCertaPanelLayout.createSequentialGroup()
                        .addGroup(vanguardaCertaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vanguardaCertaPanelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel20))
                            .addGroup(vanguardaCertaPanelLayout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jLabel18)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vanguardaCertaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalQuestoesLabel)
                .addGap(168, 168, 168))
        );
        vanguardaCertaPanelLayout.setVerticalGroup(
            vanguardaCertaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vanguardaCertaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalQuestoesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(vanguardaCertaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acertosFimLabel)
                    .addComponent(errosFimLabel))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        perdeuPanel.setBackground(new java.awt.Color(222, 209, 193));

        acertosFimLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        acertosFimLabel2.setText("Você acertou _ questões");

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel21.setText("Oh não! Você perdeu!");

        totalQuestoesLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        totalQuestoesLabel2.setText("Você respondeu _ questões");

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel23.setText("Você terminou o jogo e acertou a pergunta final!");

        errosFimLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        errosFimLabel2.setText("Você errou _ questões");

        javax.swing.GroupLayout perdeuPanelLayout = new javax.swing.GroupLayout(perdeuPanel);
        perdeuPanel.setLayout(perdeuPanelLayout);
        perdeuPanelLayout.setHorizontalGroup(
            perdeuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perdeuPanelLayout.createSequentialGroup()
                .addGap(0, 74, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(33, 33, 33))
            .addGroup(perdeuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(perdeuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perdeuPanelLayout.createSequentialGroup()
                        .addComponent(acertosFimLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errosFimLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perdeuPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(perdeuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perdeuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(132, 132, 132))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perdeuPanelLayout.createSequentialGroup()
                                .addComponent(totalQuestoesLabel2)
                                .addGap(164, 164, 164))))))
        );
        perdeuPanelLayout.setVerticalGroup(
            perdeuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perdeuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalQuestoesLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(perdeuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acertosFimLabel2)
                    .addComponent(errosFimLabel2))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLayeredPane4.setLayer(vanguardaErradaPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(vanguardaCertaPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(perdeuPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vanguardaErradaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(vanguardaCertaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(perdeuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vanguardaErradaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(vanguardaCertaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(perdeuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout mensagemFimPanelLayout = new javax.swing.GroupLayout(mensagemFimPanel);
        mensagemFimPanel.setLayout(mensagemFimPanelLayout);
        mensagemFimPanelLayout.setHorizontalGroup(
            mensagemFimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mensagemFimPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mensagemFimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mensagemFimPanelLayout.createSequentialGroup()
                        .addComponent(rankingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuPrincipalButton)))
                .addGap(269, 269, 269))
            .addGroup(mensagemFimPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel14)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        mensagemFimPanelLayout.setVerticalGroup(
            mensagemFimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mensagemFimPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(mensagemFimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPrincipalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jLayeredPane5.setLayer(ultimaPerguntaPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(mensagemFimPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensagemFimPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(ultimaPerguntaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensagemFimPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(ultimaPerguntaPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ultimaPerguntaPanelLayout = new javax.swing.GroupLayout(ultimaPerguntaPanel);
        ultimaPerguntaPanel.setLayout(ultimaPerguntaPanelLayout);
        ultimaPerguntaPanelLayout.setHorizontalGroup(
            ultimaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ultimaPerguntaPanelLayout.createSequentialGroup()
                .addGap(518, 518, 518)
                .addGroup(ultimaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(ultimaPerguntaPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12)))
                .addContainerGap(588, Short.MAX_VALUE))
            .addGroup(ultimaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ultimaPerguntaPanelLayout.createSequentialGroup()
                    .addGap(255, 255, 255)
                    .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );
        ultimaPerguntaPanelLayout.setVerticalGroup(
            ultimaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ultimaPerguntaPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(713, Short.MAX_VALUE))
            .addGroup(ultimaPerguntaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ultimaPerguntaPanelLayout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        jLayeredPane2.setLayer(jogoPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(perguntaCantoSupEsqPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(respostaCantoSupEsqPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(perguntaCantoInfEsqPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(respostaCantoInfEsqPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(perguntaMeioEsqInfPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(respostaMeioEsqInfPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(perguntaMeioSupEsqPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(respostaMeioSupEsqPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(perguntaMeioInfDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(respostaMeioInfDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(perguntaMeioSupDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(respostaMeioSupDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(perguntaCantoInfDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(respostaCantoInfDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(perguntaCantoSupDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(respostaCantoSupDirPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(ultimaPerguntaPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1664, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaCantoSupEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaCantoSupEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaCantoInfEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaCantoInfEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaMeioEsqInfPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaMeioEsqInfPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaMeioSupEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaMeioSupEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaMeioInfDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaMeioInfDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaMeioSupDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaMeioSupDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaCantoInfDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaCantoInfDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaCantoSupDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaCantoSupDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ultimaPerguntaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jogoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaCantoSupEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaCantoSupEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaCantoInfEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaCantoInfEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaMeioEsqInfPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaMeioEsqInfPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaMeioSupEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaMeioSupEsqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaMeioInfDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaMeioInfDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaMeioSupDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaMeioSupDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaCantoInfDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaCantoInfDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(perguntaCantoSupDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(respostaCantoSupDirPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ultimaPerguntaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void cantoEsqInfButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        JOptionPane.showMessageDialog(null, "Escolhendo questão... ヾ(⌐■_■)ノ♪", "Quiz ArtVantGarde", 1);

        //Verificação da quantidade de questões
        if(numeroQuestoes.isEmpty()){
            try {
                numeroQuestoes = dao.obterNumeroQuestoes(idVanguarda);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!!(┬┬﹏┬┬)");
            }
        }
        
        //ID mínimo e máximo das questões
        int n = numeroQuestoes.size();
        //Sorteio da questão
        int indexQuestao = gerador.nextInt(n);
        idQuestao = numeroQuestoes.get(indexQuestao);
            
        //Ajustes da área em que a pergunta aparece
        perguntaCantoEsqInfTextArea.setLineWrap(true);
        perguntaCantoEsqInfTextArea.setWrapStyleWord(true);
        alternativasCantoEsqInfTextArea.setLineWrap(true);
        alternativasCantoEsqInfTextArea.setWrapStyleWord(true);
        
        try{
            //Pegar e mostrar a pergunta
            perguntaCantoEsqInfTextArea.setText(dao.pegarPergunta(idVanguarda, idQuestao));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
        try{
            //Checando se a questão possui uma imagem
            if(dao.possuiImagem(idQuestao) == false){
                imagemCantoEsqInfPerguntaLabel.setText("");
                //Inserindo a imagem da questão na label
                imagemCantoEsqInfPerguntaLabel.setIcon(new javax.swing.JLabel(){
                    public javax.swing.Icon getIcon() {
                        try{
                            return new javax.swing.ImageIcon(
                                new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                        }catch (java.net.MalformedURLException e){
                            JOptionPane.showMessageDialog(null, "url");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Problemas dao url");
                        }
                        return null;
                    }
                }.getIcon());  
            }else{
                imagemCantoEsqInfPerguntaLabel.setText(" ");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
        }
        try{
            //Pegando as alternativas da questão
            alternativas = dao.pegarAlternativas(idQuestao);
            System.out.println("oi");
            //Embaralhamento das alternativas
            Collections.shuffle((ArrayList<String>)alternativas);
            System.out.println();
            //Texto padrão da label de alternativas
            alternativasCantoEsqInfTextArea.setText("");
            
            //Mostrar as alternativas na tela
            for(int i = 0; i < alternativas.size(); i++){
                String alternativa = alternativasCantoEsqInfTextArea.getText();
                alternativasCantoEsqInfTextArea.setText(alternativa + "[" + i + "] " + ((ArrayList<String>)alternativas).get(i) + "\n\n");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! OwO");
        }
        perguntaCantoInfEsqPanel.setVisible(true);
        jogoPanel.setVisible(false);
        int indexIdQuestao = numeroQuestoes.indexOf(idQuestao);
        numeroQuestoes.remove(indexIdQuestao);
    }                                                 

    private void meioEsqInfButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        JOptionPane.showMessageDialog(null, "Escolhendo questão... ヾ(⌐■_■)ノ♪", "Quiz ArtVantGarde", 1);

        //Verificação da quantidade de questões
        if(numeroQuestoes.isEmpty()){
            try {
                numeroQuestoes = dao.obterNumeroQuestoes(idVanguarda);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!!(┬┬﹏┬┬)");
            }
        }
        
        //ID mínimo e máximo das questões
        int n = numeroQuestoes.size();
        //Sorteio da questão
        int indexQuestao = gerador.nextInt(n);
        idQuestao = numeroQuestoes.get(indexQuestao);
            
        //Ajustes da área em que a pergunta aparece
        perguntaMeioEsqInfTextArea.setLineWrap(true);
        perguntaMeioEsqInfTextArea.setWrapStyleWord(true);
        alternativasMeioEsqInfTextArea.setLineWrap(true);
        alternativasMeioEsqInfTextArea.setWrapStyleWord(true);
        
        try{
            //Pegar e mostrar a pergunta
            perguntaMeioEsqInfTextArea.setText(dao.pegarPergunta(idVanguarda, idQuestao));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
        try{
            //Checando se a questão possui uma imagem
            if(dao.possuiImagem(idQuestao) == false){
                imagemMeioEsqInfPerguntaLabel.setText("");
                //Inserindo a imagem da questão na label
                imagemMeioEsqInfPerguntaLabel.setIcon(new javax.swing.JLabel(){
                    public javax.swing.Icon getIcon() {
                        try{
                            return new javax.swing.ImageIcon(
                                new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                        }catch (java.net.MalformedURLException e){
                            JOptionPane.showMessageDialog(null, "url");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Problemas dao url");
                        }
                        return null;
                    }
                }.getIcon());  
            }else{
                imagemMeioEsqInfPerguntaLabel.setText(" ");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
        }
        try{
            //Pegando as alternativas da questão
            alternativas = dao.pegarAlternativas(idQuestao);
            System.out.println("oi");
            //Embaralhamento das alternativas
            Collections.shuffle((ArrayList<String>)alternativas);
            System.out.println();
            //Texto padrão da label de alternativas
            alternativasMeioEsqInfTextArea.setText("");
            
            //Mostrar as alternativas na tela
            for(int i = 0; i < alternativas.size(); i++){
                String alternativa = alternativasMeioEsqInfTextArea.getText();
                alternativasMeioEsqInfTextArea.setText(alternativa + "[" + i + "]" + ((ArrayList<String>)alternativas).get(i) + "\n\n");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! OwO");
        }
        perguntaMeioEsqInfPanel.setVisible(true);
        jogoPanel.setVisible(false);
        int indexIdQuestao = numeroQuestoes.indexOf(idQuestao);
        numeroQuestoes.remove(indexIdQuestao);
    }                                                

    private void cantoSupEsqButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        JOptionPane.showMessageDialog(null, "Escolhendo questão... ヾ(⌐■_■)ノ♪", "Quiz ArtVantGarde", 1);

        //Verificação da quantidade de questões
        if(numeroQuestoes.isEmpty()){
            try {
                numeroQuestoes = dao.obterNumeroQuestoes(idVanguarda);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!!(┬┬﹏┬┬)");
            }
        }
        
        //ID mínimo e máximo das questões
        int n = numeroQuestoes.size();
        //Sorteio da questão
        int indexQuestao = gerador.nextInt(n);
        idQuestao = numeroQuestoes.get(indexQuestao);
            
        //Ajustes da área em que a pergunta aparece
        perguntaCantoSupEsqTextArea.setLineWrap(true);
        perguntaCantoSupEsqTextArea.setWrapStyleWord(true);
        alternativasCantoSupEsqTextArea.setLineWrap(true);
        alternativasCantoSupEsqTextArea.setWrapStyleWord(true);
        
        try{
            //Pegar e mostrar a pergunta
            perguntaCantoSupEsqTextArea.setText(dao.pegarPergunta(idVanguarda, idQuestao));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
        try{
            //Checando se a questão possui uma imagem
            if(dao.possuiImagem(idQuestao) == false){
                imagemCantoSupEsqPerguntaLabel.setText("");
                //Inserindo a imagem da questão na label
                imagemCantoSupEsqPerguntaLabel.setIcon(new javax.swing.JLabel(){
                    public javax.swing.Icon getIcon() {
                        try{
                            return new javax.swing.ImageIcon(
                                new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                        }catch (java.net.MalformedURLException e){
                            JOptionPane.showMessageDialog(null, "url");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Problemas dao url");
                        }
                        return null;
                    }
                }.getIcon());  
            }else{
                imagemCantoSupEsqPerguntaLabel.setText(" ");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
        }
        try{
            //Pegando as alternativas da questão
            alternativas = dao.pegarAlternativas(idQuestao);
            System.out.println("oi");
            //Embaralhamento das alternativas
            Collections.shuffle((ArrayList<String>)alternativas);
            System.out.println();
            //Texto padrão da label de alternativas
            alternativasCantoSupEsqTextArea.setText("");
            
            //Mostrar as alternativas na tela
            for(int i = 0; i < alternativas.size(); i++){
                String alternativa = alternativasCantoSupEsqTextArea.getText();
                alternativasCantoSupEsqTextArea.setText(alternativa + "[" + i + "] " + ((ArrayList<String>)alternativas).get(i) + "\n\n");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! OwO");
        }
        perguntaCantoSupEsqPanel.setVisible(true);
        jogoPanel.setVisible(false);
        int indexIdQuestao = numeroQuestoes.indexOf(idQuestao);
        numeroQuestoes.remove(indexIdQuestao);
    }                                                 

    private void meioSupDirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        JOptionPane.showMessageDialog(null, "Escolhendo questão... ヾ(⌐■_■)ノ♪", "Quiz ArtVantGarde", 1);

        //Verificação da quantidade de questões
        if(numeroQuestoes.isEmpty()){
            try {
                numeroQuestoes = dao.obterNumeroQuestoes(idVanguarda);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!!(┬┬﹏┬┬)");
            }
        }
        
        //ID mínimo e máximo das questões
        int n = numeroQuestoes.size();
        //Sorteio da questão
        int indexQuestao = gerador.nextInt(n);
        idQuestao = numeroQuestoes.get(indexQuestao);
            
        //Ajustes da área em que a pergunta aparece
        perguntaMeioSupDirTextArea.setLineWrap(true);
        perguntaMeioSupDirTextArea.setWrapStyleWord(true);
        alternativasMeioSupDirTextArea.setLineWrap(true);
        alternativasMeioSupDirTextArea.setWrapStyleWord(true);
        
        try{
            //Pegar e mostrar a pergunta
            perguntaMeioSupDirTextArea.setText(dao.pegarPergunta(idVanguarda, idQuestao));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
        try{
            //Checando se a questão possui uma imagem
            if(dao.possuiImagem(idQuestao) == false){
                imagemMeioSupDirPerguntaLabel.setText("");
                //Inserindo a imagem da questão na label
                imagemMeioSupDirPerguntaLabel.setIcon(new javax.swing.JLabel(){
                    public javax.swing.Icon getIcon() {
                        try{
                            return new javax.swing.ImageIcon(
                                new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                        }catch (java.net.MalformedURLException e){
                            JOptionPane.showMessageDialog(null, "url");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Problemas dao url");
                        }
                        return null;
                    }
                }.getIcon());  
            }else{
                imagemMeioSupDirPerguntaLabel.setText(" ");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
        }
        try{
            //Pegando as alternativas da questão
            alternativas = dao.pegarAlternativas(idQuestao);
            System.out.println("oi");
            //Embaralhamento das alternativas
            Collections.shuffle((ArrayList<String>)alternativas);
            System.out.println();
            //Texto padrão da label de alternativas
            alternativasMeioSupDirTextArea.setText("");
            
            //Mostrar as alternativas na tela
            for(int i = 0; i < alternativas.size(); i++){
                String alternativa = alternativasMeioSupDirTextArea.getText();
                alternativasMeioSupDirTextArea.setText(alternativa + "[" + i + "]" + ((ArrayList<String>)alternativas).get(i) + "\n\n");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! OwO");
        }
        perguntaMeioSupDirPanel.setVisible(true);
        jogoPanel.setVisible(false);
        int indexIdQuestao = numeroQuestoes.indexOf(idQuestao);
        numeroQuestoes.remove(indexIdQuestao);
    }                                                

    private void meioSupEsqButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        JOptionPane.showMessageDialog(null, "Escolhendo questão... ヾ(⌐■_■)ノ♪", "Quiz ArtVantGarde", 1);

        //Verificação da quantidade de questões
        if(numeroQuestoes.isEmpty()){
            try {
                numeroQuestoes = dao.obterNumeroQuestoes(idVanguarda);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!!(┬┬﹏┬┬)");
            }
        }
        
        //ID mínimo e máximo das questões
        int n = numeroQuestoes.size();
        //Sorteio da questão
        int indexQuestao = gerador.nextInt(n);
        idQuestao = numeroQuestoes.get(indexQuestao);
            
        //Ajustes da área em que a pergunta aparece
        perguntaMeioSupEsqTextArea.setLineWrap(true);
        perguntaMeioSupEsqTextArea.setWrapStyleWord(true);
        alternativasMeioSupEsqTextArea.setLineWrap(true);
        alternativasMeioSupEsqTextArea.setWrapStyleWord(true);
        
        try{
            //Pegar e mostrar a pergunta
            perguntaMeioSupEsqTextArea.setText(dao.pegarPergunta(idVanguarda, idQuestao));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
        try{
            //Checando se a questão possui uma imagem
            if(dao.possuiImagem(idQuestao) == false){
                imagemMeioSupEsqPerguntaLabel.setText("");
                //Inserindo a imagem da questão na label
                imagemMeioSupEsqPerguntaLabel.setIcon(new javax.swing.JLabel(){
                    public javax.swing.Icon getIcon() {
                        try{
                            return new javax.swing.ImageIcon(
                                new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                        }catch (java.net.MalformedURLException e){
                            JOptionPane.showMessageDialog(null, "url");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Problemas dao url");
                        }
                        return null;
                    }
                }.getIcon());  
            }else{
                imagemMeioSupEsqPerguntaLabel.setText(" ");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
        }
        try{
            //Pegando as alternativas da questão
            alternativas = dao.pegarAlternativas(idQuestao);
            System.out.println("oi");
            //Embaralhamento das alternativas
            Collections.shuffle((ArrayList<String>)alternativas);
            System.out.println();
            //Texto padrão da label de alternativas
            alternativasMeioSupEsqTextArea.setText("");
            
            //Mostrar as alternativas na tela
            for(int i = 0; i < alternativas.size(); i++){
                String alternativa = alternativasMeioSupEsqTextArea.getText();
                alternativasMeioSupEsqTextArea.setText(alternativa + "[" + i + "]" + ((ArrayList<String>)alternativas).get(i) + "\n\n");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! OwO");
        }
        perguntaMeioSupEsqPanel.setVisible(true);
        jogoPanel.setVisible(false);
        int indexIdQuestao = numeroQuestoes.indexOf(idQuestao);
        numeroQuestoes.remove(indexIdQuestao);
    }                                                

    private void meioInfDirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        JOptionPane.showMessageDialog(null, "Escolhendo questão... ヾ(⌐■_■)ノ♪", "Quiz ArtVantGarde", 1);

        //Verificação da quantidade de questões
        if(numeroQuestoes.isEmpty()){
            try {
                numeroQuestoes = dao.obterNumeroQuestoes(idVanguarda);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!!(┬┬﹏┬┬)");
            }
        }
        
        //ID mínimo e máximo das questões
        int n = numeroQuestoes.size();
        //Sorteio da questão
        int indexQuestao = gerador.nextInt(n);
        idQuestao = numeroQuestoes.get(indexQuestao);
            
        //Ajustes da área em que a pergunta aparece
        perguntaMeioInfDirTextArea.setLineWrap(true);
        perguntaMeioInfDirTextArea.setWrapStyleWord(true);
        alternativasMeioInfDirTextArea.setLineWrap(true);
        alternativasMeioInfDirTextArea.setWrapStyleWord(true);
        
        try{
            //Pegar e mostrar a pergunta
            perguntaMeioInfDirTextArea.setText(dao.pegarPergunta(idVanguarda, idQuestao));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
        try{
            //Checando se a questão possui uma imagem
            if(dao.possuiImagem(idQuestao) == false){
                imagemMeioInfDirPerguntaLabel.setText("");
                //Inserindo a imagem da questão na label
                imagemMeioInfDirPerguntaLabel.setIcon(new javax.swing.JLabel(){
                    public javax.swing.Icon getIcon() {
                        try{
                            return new javax.swing.ImageIcon(
                                new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                        }catch (java.net.MalformedURLException e){
                            JOptionPane.showMessageDialog(null, "url");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Problemas dao url");
                        }
                        return null;
                    }
                }.getIcon());  
            }else{
                imagemMeioInfDirPerguntaLabel.setText(" ");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
        }
        try{
            //Pegando as alternativas da questão
            alternativas = dao.pegarAlternativas(idQuestao);
            System.out.println("oi");
            //Embaralhamento das alternativas
            Collections.shuffle((ArrayList<String>)alternativas);
            System.out.println();
            //Texto padrão da label de alternativas
            alternativasMeioInfDirTextArea.setText("");
            
            //Mostrar as alternativas na tela
            for(int i = 0; i < alternativas.size(); i++){
                String alternativa = alternativasMeioInfDirTextArea.getText();
                alternativasMeioInfDirTextArea.setText(alternativa + "[" + i + "]" + ((ArrayList<String>)alternativas).get(i) + "\n\n");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! OwO");
        }
        perguntaMeioInfDirPanel.setVisible(true);
        jogoPanel.setVisible(false);
        int indexIdQuestao = numeroQuestoes.indexOf(idQuestao);
        numeroQuestoes.remove(indexIdQuestao);
    }                                                

    private void cantoInfDirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        JOptionPane.showMessageDialog(null, "Escolhendo questão... ヾ(⌐■_■)ノ♪", "Quiz ArtVantGarde", 1);

        //Verificação da quantidade de questões
        if(numeroQuestoes.isEmpty()){
            try {
                numeroQuestoes = dao.obterNumeroQuestoes(idVanguarda);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!!(┬┬﹏┬┬)");
            }
        }
        
        //ID mínimo e máximo das questões
        int n = numeroQuestoes.size();
        //Sorteio da questão
        int indexQuestao = gerador.nextInt(n);
        idQuestao = numeroQuestoes.get(indexQuestao);
            
        //Ajustes da área em que a pergunta aparece
        perguntaCantoInfDirTextArea.setLineWrap(true);
        perguntaCantoInfDirTextArea.setWrapStyleWord(true);
        alternativasCantoInfDirTextArea.setLineWrap(true);
        alternativasCantoInfDirTextArea.setWrapStyleWord(true);
        
        try{
            //Pegar e mostrar a pergunta
            perguntaCantoInfDirTextArea.setText(dao.pegarPergunta(idVanguarda, idQuestao));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
        try{
            //Checando se a questão possui uma imagem
            if(dao.possuiImagem(idQuestao) == false){
                imagemCantoInfDirPerguntaLabel.setText("");
                //Inserindo a imagem da questão na label
                imagemCantoInfDirPerguntaLabel.setIcon(new javax.swing.JLabel(){
                    public javax.swing.Icon getIcon() {
                        try{
                            return new javax.swing.ImageIcon(
                                new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                        }catch (java.net.MalformedURLException e){
                            JOptionPane.showMessageDialog(null, "url");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Problemas dao url");
                        }
                        return null;
                    }
                }.getIcon());  
            }else{
                imagemCantoInfDirPerguntaLabel.setText(" ");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
        }
        try{
            //Pegando as alternativas da questão
            alternativas = dao.pegarAlternativas(idQuestao);
            System.out.println("oi");
            //Embaralhamento das alternativas
            Collections.shuffle((ArrayList<String>)alternativas);
            System.out.println();
            //Texto padrão da label de alternativas
            alternativasCantoInfDirTextArea.setText("");
            
            //Mostrar as alternativas na tela
            for(int i = 0; i < alternativas.size(); i++){
                String alternativa = alternativasCantoInfDirTextArea.getText();
                alternativasCantoInfDirTextArea.setText(alternativa + "[" + i + "] " + ((ArrayList<String>)alternativas).get(i) + "\n\n");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! OwO");
        }
        perguntaCantoInfDirPanel.setVisible(true);
        jogoPanel.setVisible(false);
        int indexIdQuestao = numeroQuestoes.indexOf(idQuestao);
        numeroQuestoes.remove(indexIdQuestao);
    }                                                 

    private void cantoSupDirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        JOptionPane.showMessageDialog(null, "Escolhendo questão... ヾ(⌐■_■)ノ♪", "Quiz ArtVantGarde", 1);

        //Verificação da quantidade de questões
        if(numeroQuestoes.isEmpty()){
            try {
                numeroQuestoes = dao.obterNumeroQuestoes(idVanguarda);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!!(┬┬﹏┬┬)");
            }
        }
        
        //ID mínimo e máximo das questões
        int n = numeroQuestoes.size();
        //Sorteio da questão
        int indexQuestao = gerador.nextInt(n);
        idQuestao = numeroQuestoes.get(indexQuestao);
            
        //Ajustes da área em que a pergunta aparece
        perguntaCantoSupDirTextArea.setLineWrap(true);
        perguntaCantoSupDirTextArea.setWrapStyleWord(true);
        alternativasCantoSupDirTextArea.setLineWrap(true);
        alternativasCantoSupDirTextArea.setWrapStyleWord(true);
        
        try{
            //Pegar e mostrar a pergunta
            perguntaCantoSupDirTextArea.setText(dao.pegarPergunta(idVanguarda, idQuestao));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
        try{
            //Checando se a questão possui uma imagem
            if(dao.possuiImagem(idQuestao) == false){
                imagemCantoSupDirPerguntaLabel.setText("");
                //Inserindo a imagem da questão na label
                imagemCantoSupDirPerguntaLabel.setIcon(new javax.swing.JLabel(){
                    public javax.swing.Icon getIcon() {
                        try{
                            return new javax.swing.ImageIcon(
                                new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                        }catch (java.net.MalformedURLException e){
                            JOptionPane.showMessageDialog(null, "url");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Problemas dao url");
                        }
                        return null;
                    }
                }.getIcon());  
            }else{
                imagemCantoSupDirPerguntaLabel.setText(" ");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
        }
        try{
            //Pegando as alternativas da questão
            alternativas = dao.pegarAlternativas(idQuestao);
            System.out.println("oi");
            //Embaralhamento das alternativas
            Collections.shuffle((ArrayList<String>)alternativas);
            System.out.println();
            //Texto padrão da label de alternativas
            alternativasCantoSupDirTextArea.setText("");
            
            //Mostrar as alternativas na tela
            for(int i = 0; i < alternativas.size(); i++){
                String alternativa = alternativasCantoSupDirTextArea.getText();
                alternativasCantoSupDirTextArea.setText(alternativa + "[" + i + "] " + ((ArrayList<String>)alternativas).get(i) + "\n\n");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! OwO");
        }
        perguntaCantoSupDirPanel.setVisible(true);
        jogoPanel.setVisible(false);
        int indexIdQuestao = numeroQuestoes.indexOf(idQuestao);
        numeroQuestoes.remove(indexIdQuestao);
    }                                                 

    private void responderCantoSupEsqButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);

        //Ajustes das áreas em que a pergunta e a resposta aparecem
        perguntaCantoSupEsqTextArea2.setLineWrap(true);
        perguntaCantoSupEsqTextArea2.setWrapStyleWord(true);
        alternativasCantoSupEsqTextArea1.setLineWrap(true);
        alternativasCantoSupEsqTextArea1.setWrapStyleWord(true);
       
        try {
            //Pegar a alternativa correta no bd
            String respostaCorreta = dao.pegarRespostaCorreta(idQuestao);
            //Transformar a resposta em um inteiro
            int respostaCorretaInt = ((ArrayList<String>)alternativas).indexOf(respostaCorreta);
            
            //Pegar resposta do aluno
            respostaAluno = Integer.parseInt(respostaCantoSupEsqTextField.getText());
            
            //Comparar a resposta do aluno com a resposta correta
            if(respostaAluno == respostaCorretaInt){
                cantoSupEsqButtonPanel.setVisible(false);
                cantoSupEsqButton.setVisible(false);
                cantoSupEsqLabel.setVisible(true);
                perguntaCantoSupEsqPanel.setVisible(false);
                respostaCantoSupEsqPanel.setVisible(true);
                acertos++;
                dao.contabilizarAcertos(idQuestao, idVanguarda);
                
            }else{
                cantoSupEsqButtonPanel.setVisible(true);
                cantoSupEsqButton.setVisible(true);
                perguntaCantoSupEsqPanel.setVisible(false);
                respostaCantoSupEsqPanel.setVisible(true);
                erros++;
                dao.contabilizarErros(idQuestao, idVanguarda);
            }
            
            try{
            //Pegar e mostrar a pergunta
                perguntaCantoSupEsqTextArea2.setText(dao.pegarPergunta(idVanguarda, idQuestao));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
            //Inserindo imagem na aba de resposta
            try{
            //Checando se a questão possui uma imagem
                if(dao.possuiImagem(idQuestao) == false){
                    imagemCantoSupEsqRespostaLabel.setText("");
                    //Inserindo a imagem da questão na label
                    imagemCantoSupEsqRespostaLabel.setIcon(new javax.swing.JLabel(){
                        public javax.swing.Icon getIcon() {
                            try{
                                return new javax.swing.ImageIcon(
                                    new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                            }catch (java.net.MalformedURLException e){
                                JOptionPane.showMessageDialog(null, "url");
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Problemas dao url");
                            }
                            return null;
                        }
                    }.getIcon());  
                }else{
                    imagemCantoSupEsqRespostaLabel.setText(" ");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
            }
            try{                
                // Mostrar a resposta correta e a assinalada pelo aluno
                alternativasCantoSupEsqTextArea1.setText("Resposta correta: " + respostaCorreta + "\n\nResposta assinalada: " + ((ArrayList<String>)alternativas).get(respostaAluno));
                respostaTextField4.setText(Integer.toString(respostaAluno));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! UwU");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! (┬┬﹏┬┬)");
        }
        
        //Remover o texto da área de inserir resposta
        respostaCantoSupEsqTextField.setText("");
                
        perguntaCantoSupEsqPanel.setVisible(false);
        respostaCantoSupEsqPanel.setVisible(true);
    }                                                          

    private void continuarCantoSupEsqButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // Código para ganhar
        if(cantoEsqInfLabel.isVisible() == true && meioEsqInfLabel.isVisible() == true && cantoSupEsqLabel.isVisible() == true && meioSupDirLabel.isVisible() == true && meioInfDirLabel.isVisible() == true && cantoInfDirLabel.isVisible() == true && cantoSupDirLabel.isVisible() == true && meioSupEsqLabel.isVisible() ==  true){
            respostaCantoSupEsqPanel.setVisible(false);
            ultimaPerguntaPanel.setVisible(true);
            
            // Registrar acertos e erros do grupo
            try{
                dao.contabilizarAcertosErros(idGrupo, acertos, erros, idVanguarda);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Problemas técnicos!! @-@");
            }
        }else{
            jogoPanel.setVisible(true);
            respostaCantoSupEsqPanel.setVisible(false); 
            if(erros == 16){
                int total = acertos + erros;
                acertosFimLabel2.setText("Você acertou " + acertos + " questões");
                errosFimLabel2.setText("Você errou " + erros + " questões");
                totalQuestoesLabel2.setText("Você respondeu " + total + "questões");
                perdeuPanel.setVisible(true);
                mensagemFimPanel.setVisible(true);
            }
            
            //Remover o texto da área de inserir resposta
            respostaTextField4.setText("");
        } 
    }                                                          

    private void responderCantoEsqInfButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);

        //Ajustes das áreas em que a pergunta e a resposta aparecem
        perguntaCantoEsqInfTextArea1.setLineWrap(true);
        perguntaCantoEsqInfTextArea1.setWrapStyleWord(true);
        alternativasCantoEsqInfTextArea1.setLineWrap(true);
        alternativasCantoEsqInfTextArea1.setWrapStyleWord(true);
       
        try {
            //Pegar a alternativa correta no bd
            String respostaCorreta = dao.pegarRespostaCorreta(idQuestao);
            //Transformar a resposta em um inteiro
            int respostaCorretaInt = ((ArrayList<String>)alternativas).indexOf(respostaCorreta);
            
            //Pegar resposta do aluno
            respostaAluno = Integer.parseInt(respostaCantoEsqInfTextField.getText());
            
            //Comparar a resposta do aluno com a resposta correta
            if(respostaAluno == respostaCorretaInt){
                cantoEsqInfButtonPanel.setVisible(false);
                cantoEsqInfButton.setVisible(false);
                cantoEsqInfLabel.setVisible(true);
                perguntaCantoInfEsqPanel.setVisible(false);
                respostaCantoInfEsqPanel.setVisible(true);
                                
                //Contabilizar os acertos
                acertos++;
                dao.contabilizarAcertos(idQuestao, idVanguarda);
            }else{
                cantoEsqInfButtonPanel.setVisible(true);
                cantoEsqInfButton.setVisible(true);
                perguntaCantoInfEsqPanel.setVisible(false);
                respostaCantoInfEsqPanel.setVisible(true);
                
                // Contabilizar os erros
                erros++;
                dao.contabilizarErros(idQuestao, idVanguarda);
            }
            
            try{
            //Pegar e mostrar a pergunta
                perguntaCantoEsqInfTextArea1.setText(dao.pegarPergunta(idVanguarda, idQuestao));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
            //Inserindo imagem na aba de resposta
            try{
            //Checando se a questão possui uma imagem
                if(dao.possuiImagem(idQuestao) == false){
                    imagemCantoEsqInfRespostaLabel.setText("");
                    //Inserindo a imagem da questão na label
                    imagemCantoEsqInfRespostaLabel.setIcon(new javax.swing.JLabel(){
                        public javax.swing.Icon getIcon() {
                            try{
                                return new javax.swing.ImageIcon(
                                    new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                            }catch (java.net.MalformedURLException e){
                                JOptionPane.showMessageDialog(null, "url");
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Problemas dao url");
                            }
                            return null;
                        }
                    }.getIcon());  
                }else{
                    imagemCantoEsqInfRespostaLabel.setText(" ");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
            }
            try{                
                // Mostrar a resposta correta e a assinalada pelo aluno
                alternativasCantoEsqInfTextArea1.setText("Resposta correta: " + respostaCorreta + "\n\nResposta assinalada: " + ((ArrayList<String>)alternativas).get(respostaAluno));
                respostaCantoEsqInfRespostaTextField.setText(Integer.toString(respostaAluno));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! UwU");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! (┬┬﹏┬┬)");
        }
        
        //Remover o texto da área de inserir resposta
        respostaCantoEsqInfTextField.setText("");
        
        perguntaCantoInfEsqPanel.setVisible(false);
        respostaCantoInfEsqPanel.setVisible(true);
    }                                                          

    private void continuarCantoEsqInfButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);

        // Código para ganhar
        if(cantoEsqInfLabel.isVisible() == true && meioEsqInfLabel.isVisible() == true && cantoSupEsqLabel.isVisible() == true && meioSupDirLabel.isVisible() == true && meioInfDirLabel.isVisible() == true && cantoInfDirLabel.isVisible() == true && cantoSupDirLabel.isVisible() == true && meioSupEsqLabel.isVisible() ==  true){
            respostaCantoInfEsqPanel.setVisible(false);
            ultimaPerguntaPanel.setVisible(true);
        }else{
            jogoPanel.setVisible(true);
            respostaCantoInfEsqPanel.setVisible(false);
            if(erros == 16){
                int total = acertos + erros;
                acertosFimLabel2.setText("Você acertou " + acertos + " questões");
                errosFimLabel2.setText("Você errou " + erros + " questões");
                totalQuestoesLabel2.setText("Você respondeu " + total + "questões");
                perdeuPanel.setVisible(true);
                mensagemFimPanel.setVisible(true);
                try{
                    dao.contabilizarAcertosErros(idGrupo, acertos, erros, idVanguarda);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Problemas técnicos!! @-@");
                }
            }
            //Remover o texto da área de mostrar a resposta inserid pelo jogador
            respostaCantoEsqInfRespostaTextField.setText("");
        }
    }                                                          

    private void responderMeioEsqInfButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);

        //Ajustes das áreas em que a pergunta e a resposta aparecem
        perguntaMeioEsqInfTextArea1.setLineWrap(true);
        perguntaMeioEsqInfTextArea1.setWrapStyleWord(true);
        alternativasMeioEsqInfTextArea1.setLineWrap(true);
        alternativasMeioEsqInfTextArea1.setWrapStyleWord(true);
       
        try {
            //Pegar a alternativa correta no bd
            String respostaCorreta = dao.pegarRespostaCorreta(idQuestao);
            //Transformar a resposta em um inteiro
            int respostaCorretaInt = ((ArrayList<String>)alternativas).indexOf(respostaCorreta);
            
            //Pegar resposta do aluno
            respostaAluno = Integer.parseInt(respostaMeioEsqInfTextField.getText());
            
            //Comparar a resposta do aluno com a resposta correta
            if(respostaAluno == respostaCorretaInt){
                meioInfEsqButtonPanel.setVisible(false);
                meioEsqInfButton.setVisible(false);
                meioEsqInfLabel.setVisible(true);
                perguntaMeioEsqInfPanel.setVisible(false);
                respostaMeioEsqInfPanel.setVisible(true);
                
                //Contabilizar os acertos
                acertos++;
                dao.contabilizarAcertos(idQuestao, idVanguarda);
                
            }else{
                meioInfEsqButtonPanel.setVisible(true);
                meioEsqInfButton.setVisible(true);
                perguntaMeioEsqInfPanel.setVisible(false);
                respostaMeioEsqInfPanel.setVisible(true);
                
                //Contabilizar e registrar os erros
                erros++;
                dao.contabilizarErros(idQuestao, idVanguarda);
            }
            
            try{
            //Pegar e mostrar a pergunta
                perguntaMeioEsqInfTextArea1.setText(dao.pegarPergunta(idVanguarda, idQuestao));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
            //Inserindo imagem na aba de resposta
            try{
            //Checando se a questão possui uma imagem
                if(dao.possuiImagem(idQuestao) == false){
                    imagemMeioEsqInfRespostaLabel.setText("");
                    //Inserindo a imagem da questão na label
                    imagemMeioEsqInfRespostaLabel.setIcon(new javax.swing.JLabel(){
                        public javax.swing.Icon getIcon() {
                            try{
                                return new javax.swing.ImageIcon(
                                    new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                            }catch (java.net.MalformedURLException e){
                                JOptionPane.showMessageDialog(null, "url");
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Problemas dao url");
                            }
                            return null;
                        }
                    }.getIcon());  
                }else{
                    imagemMeioEsqInfRespostaLabel.setText(" ");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
            }
            try{                
                // Mostrar a resposta correta e a assinalada pelo aluno
                alternativasMeioEsqInfTextArea1.setText("Resposta correta: " + respostaCorreta + "\n\nResposta assinalada: " + ((ArrayList<String>)alternativas).get(respostaAluno));
                respostaMeioEsqInfRespostaTextField.setText(Integer.toString(respostaAluno));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! UwU");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! (┬┬﹏┬┬)");
        }
        
        //Remover o texto da área de inserir resposta
        respostaMeioEsqInfTextField.setText("");
        
        perguntaMeioEsqInfPanel.setVisible(false);
        respostaMeioEsqInfPanel.setVisible(true);
    }                                                         

    private void continuarMeioEsqInfButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // Código para ganhar
        if(cantoEsqInfLabel.isVisible() == true && meioEsqInfLabel.isVisible() == true && cantoSupEsqLabel.isVisible() == true && meioSupDirLabel.isVisible() == true && meioInfDirLabel.isVisible() == true && cantoInfDirLabel.isVisible() == true && cantoSupDirLabel.isVisible() == true && meioSupEsqLabel.isVisible() ==  true){
            respostaMeioEsqInfPanel.setVisible(false);
            ultimaPerguntaPanel.setVisible(true);   
        }else{
            jogoPanel.setVisible(true);
            respostaMeioEsqInfPanel.setVisible(false);
            if(erros == 16){
                int total = acertos + erros;
                acertosFimLabel2.setText("Você acertou " + acertos + " questões");
                errosFimLabel2.setText("Você errou " + erros + " questões");
                totalQuestoesLabel2.setText("Você respondeu " + total + "questões");
                perdeuPanel.setVisible(true);
                mensagemFimPanel.setVisible(true);
                try{
                    dao.contabilizarAcertosErros(idGrupo, acertos, erros, idVanguarda);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Problemas técnicos!! @-@");
                }
            }
            //Remover o texto na área de exibir a resposta inserida pelo jogador
            respostaMeioEsqInfRespostaTextField.setText("");
        }
    }                                                         

    private void responderMeioSupEsqButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);

        //Ajustes das áreas em que a pergunta e a resposta aparecem
        perguntaMeioSupEsqTextArea1.setLineWrap(true);
        perguntaMeioSupEsqTextArea1.setWrapStyleWord(true);
        alternativasMeioSupEsqTextArea1.setLineWrap(true);
        alternativasMeioSupEsqTextArea1.setWrapStyleWord(true);
       
        try {
            //Pegar a alternativa correta no bd
            String respostaCorreta = dao.pegarRespostaCorreta(idQuestao);
            //Transformar a resposta em um inteiro
            int respostaCorretaInt = ((ArrayList<String>)alternativas).indexOf(respostaCorreta);
            
            //Pegar resposta do aluno
            respostaAluno = Integer.parseInt(respostaMeioSupEsqTextField.getText());
            
            //Comparar a resposta do aluno com a resposta correta
            if(respostaAluno == respostaCorretaInt){
                meioSupEsqButtonPanel.setVisible(false);
                meioSupEsqButton.setVisible(false);
                meioSupEsqLabel.setVisible(true);
                perguntaMeioSupEsqPanel.setVisible(false);
                respostaMeioSupEsqPanel.setVisible(true);
                acertos++;
                dao.contabilizarAcertos(idQuestao, idVanguarda);
            }else{
                meioSupEsqButtonPanel.setVisible(true);
                meioSupEsqButton.setVisible(true);
                perguntaMeioSupEsqPanel.setVisible(false);
                respostaMeioSupEsqPanel.setVisible(true);
                erros++;
                dao.contabilizarErros(idQuestao, idVanguarda);
            }
            
            try{
            //Pegar e mostrar a pergunta
                perguntaMeioSupEsqTextArea1.setText(dao.pegarPergunta(idVanguarda, idQuestao));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
            //Inserindo imagem na aba de resposta
            try{
            //Checando se a questão possui uma imagem
                if(dao.possuiImagem(idQuestao) == false){
                    imagemMeioSupEsqRespostaLabel.setText("");
                    //Inserindo a imagem da questão na label
                    imagemMeioSupEsqRespostaLabel.setIcon(new javax.swing.JLabel(){
                        public javax.swing.Icon getIcon() {
                            try{
                                return new javax.swing.ImageIcon(
                                    new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                            }catch (java.net.MalformedURLException e){
                                JOptionPane.showMessageDialog(null, "url");
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Problemas dao url");
                            }
                            return null;
                        }
                    }.getIcon());  
                }else{
                    imagemMeioSupEsqRespostaLabel.setText(" ");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
            }
            try{                
                // Mostrar a resposta correta e a assinalada pelo aluno
                alternativasMeioSupEsqTextArea1.setText("Resposta correta: " + respostaCorreta + "\n\nResposta assinalada: " + ((ArrayList<String>)alternativas).get(respostaAluno));
                respostaMeioSupEsqRespostaTextField.setText(Integer.toString(respostaAluno));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! UwU");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! (┬┬﹏┬┬)");
        }
        
        //Remover o texto da área de inserir resposta
        respostaMeioSupEsqTextField.setText("");
        
        perguntaMeioSupEsqPanel.setVisible(false);
        respostaMeioSupEsqPanel.setVisible(true);
    }                                                          

    private void continuarMeioSupEsqButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);

        // Código para ganhar
        if(cantoEsqInfLabel.isVisible() == true && meioEsqInfLabel.isVisible() == true && cantoSupEsqLabel.isVisible() == true && meioSupDirLabel.isVisible() == true && meioInfDirLabel.isVisible() == true && cantoInfDirLabel.isVisible() == true && cantoSupDirLabel.isVisible() == true && meioSupEsqLabel.isVisible() ==  true){
            respostaMeioSupEsqPanel.setVisible(false);
            ultimaPerguntaPanel.setVisible(true);
        }else{
            jogoPanel.setVisible(true);
            respostaMeioSupEsqPanel.setVisible(false); 
            if(erros == 16){
                int total = acertos + erros;
                acertosFimLabel2.setText("Você acertou " + acertos + " questões");
                errosFimLabel2.setText("Você errou " + erros + " questões");
                totalQuestoesLabel2.setText("Você respondeu " + total + "questões");
                perdeuPanel.setVisible(true);
                mensagemFimPanel.setVisible(true);
                try{
                    dao.contabilizarAcertosErros(idGrupo, acertos, erros, idVanguarda);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Problemas técnicos!! @-@");
                }
            }
            //Remover o texto da área de exibir a resposta inserida pelo jogador
            respostaMeioSupEsqRespostaTextField.setText("");
        }
    }                                                         

    private void responderMeioInfDirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);

        //Ajustes das áreas em que a pergunta e a resposta aparecem
        perguntaMeioInfDirTextArea1.setLineWrap(true);
        perguntaMeioInfDirTextArea1.setWrapStyleWord(true);
        alternativasMeioInfDirTextArea1.setLineWrap(true);
        alternativasMeioInfDirTextArea1.setWrapStyleWord(true);
       
        try {
            //Pegar a alternativa correta no bd
            String respostaCorreta = dao.pegarRespostaCorreta(idQuestao);
            //Transformar a resposta em um inteiro
            int respostaCorretaInt = ((ArrayList<String>)alternativas).indexOf(respostaCorreta);
            
            //Pegar resposta do aluno
            respostaAluno = Integer.parseInt(respostaMeioInfDirTextField.getText());
            
            //Comparar a resposta do aluno com a resposta correta
            if(respostaAluno == respostaCorretaInt){
                meioInfDirButtonPanel.setVisible(false);
                meioInfDirButton.setVisible(false);
                meioInfDirLabel.setVisible(true);
                perguntaMeioInfDirPanel.setVisible(false);
                respostaMeioInfDirPanel.setVisible(true);
                acertos++;
                dao.contabilizarAcertos(idQuestao, idVanguarda);
            }else{
                meioInfDirButtonPanel.setVisible(true);
                meioInfDirButton.setVisible(true);
                perguntaMeioInfDirPanel.setVisible(false);
                respostaMeioInfDirPanel.setVisible(true);
                erros++;
                dao.contabilizarErros(idQuestao, idVanguarda);
            }
            
            try{
            //Pegar e mostrar a pergunta
                perguntaMeioInfDirTextArea1.setText(dao.pegarPergunta(idVanguarda, idQuestao));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
            //Inserindo imagem na aba de resposta
            try{
            //Checando se a questão possui uma imagem
                if(dao.possuiImagem(idQuestao) == false){
                    imagemMeioInfDirRespostaLabel.setText("");
                    //Inserindo a imagem da questão na label
                    imagemMeioInfDirRespostaLabel.setIcon(new javax.swing.JLabel(){
                        public javax.swing.Icon getIcon() {
                            try{
                                return new javax.swing.ImageIcon(
                                    new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                            }catch (java.net.MalformedURLException e){
                                JOptionPane.showMessageDialog(null, "url");
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Problemas dao url");
                            }
                            return null;
                        }
                    }.getIcon());  
                }else{
                    imagemMeioInfDirRespostaLabel.setText(" ");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
            }
            try{                
                // Mostrar a resposta correta e a assinalada pelo aluno
                alternativasMeioInfDirTextArea1.setText("Resposta correta: " + respostaCorreta + "\n\nResposta assinalada: " + ((ArrayList<String>)alternativas).get(respostaAluno));
                respostaMeioInfDirRespostaTextField.setText(Integer.toString(respostaAluno));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! UwU");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! (┬┬﹏┬┬)");
        }
        
        //Remover o texto da área de inserir resposta
        respostaMeioInfDirTextField.setText("");
                
        perguntaMeioInfDirPanel.setVisible(false);
        respostaMeioInfDirPanel.setVisible(true);
    }                                                         

    private void continuarMeioInfDirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // Código para ganhar
        if(cantoEsqInfLabel.isVisible() == true && meioEsqInfLabel.isVisible() == true && cantoSupEsqLabel.isVisible() == true && meioSupDirLabel.isVisible() == true && meioInfDirLabel.isVisible() == true && cantoInfDirLabel.isVisible() == true && cantoSupDirLabel.isVisible() == true && meioSupEsqLabel.isVisible() ==  true){
            respostaMeioInfDirPanel.setVisible(false); 
            ultimaPerguntaPanel.setVisible(true);
        }else{
            jogoPanel.setVisible(true);
            respostaMeioInfDirPanel.setVisible(false); 
            if(erros == 16){
                int total = acertos + erros;
                acertosFimLabel2.setText("Você acertou " + acertos + " questões");
                errosFimLabel2.setText("Você errou " + erros + " questões");
                totalQuestoesLabel2.setText("Você respondeu " + total + "questões");
                perdeuPanel.setVisible(true);
                mensagemFimPanel.setVisible(true);
                try{
                    dao.contabilizarAcertosErros(idGrupo, acertos, erros, idVanguarda);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Problemas técnicos!! @-@");
                }
            }
            //Remover o texto da área de exibir a resposta inserida pelo jogador
            respostaMeioInfDirRespostaTextField.setText("");
        }
    }                                                         

    private void responderMeioSupDirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);
        
        //Ajustes das áreas em que a pergunta e a resposta aparecem
        perguntaMeioSupDirTextArea1.setLineWrap(true);
        perguntaMeioSupDirTextArea1.setWrapStyleWord(true);
        alternativasMeioSupDirTextArea1.setLineWrap(true);
        alternativasMeioSupDirTextArea1.setWrapStyleWord(true);
       
        try {
            //Pegar a alternativa correta no bd
            String respostaCorreta = dao.pegarRespostaCorreta(idQuestao);
            //Transformar a resposta em um inteiro
            int respostaCorretaInt = ((ArrayList<String>)alternativas).indexOf(respostaCorreta);
            
            //Pegar resposta do aluno
            respostaAluno = Integer.parseInt(respostaMeioSupDirTextField.getText());
            
            //Comparar a resposta do aluno com a resposta correta
            if(respostaAluno == respostaCorretaInt){
                meioSupDirButtonPanel.setVisible(false);
                meioSupDirButton.setVisible(false);
                meioSupDirLabel.setVisible(true);
                perguntaMeioSupDirPanel.setVisible(false);
                respostaMeioSupDirPanel.setVisible(true);
                acertos++;
                dao.contabilizarAcertos(idQuestao, idVanguarda);
            }else{
                meioSupDirButtonPanel.setVisible(true);
                meioSupDirButton.setVisible(true);
                perguntaMeioSupDirPanel.setVisible(false);
                respostaMeioSupDirPanel.setVisible(true);
                erros++;
                dao.contabilizarErros(idQuestao, idVanguarda);
            }
            
            try{
            //Pegar e mostrar a pergunta
                perguntaMeioSupDirTextArea1.setText(dao.pegarPergunta(idVanguarda, idQuestao));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
            //Inserindo imagem na aba de resposta
            try{
            //Checando se a questão possui uma imagem
                if(dao.possuiImagem(idQuestao) == false){
                    imagemMeioSupDirRespostaLabel.setText("");
                    //Inserindo a imagem da questão na label
                    imagemMeioSupDirRespostaLabel.setIcon(new javax.swing.JLabel(){
                        public javax.swing.Icon getIcon() {
                            try{
                                return new javax.swing.ImageIcon(
                                    new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                            }catch (java.net.MalformedURLException e){
                                JOptionPane.showMessageDialog(null, "url");
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Problemas dao url");
                            }
                            return null;
                        }
                    }.getIcon());  
                }else{
                    imagemMeioSupDirRespostaLabel.setText(" ");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
            }
            try{                
                // Mostrar a resposta correta e a assinalada pelo aluno
                alternativasMeioSupDirTextArea1.setText("Resposta correta: " + respostaCorreta + "\n\nResposta assinalada: " + ((ArrayList<String>)alternativas).get(respostaAluno));
                respostaMeioSupDirRespostaTextField.setText(Integer.toString(respostaAluno));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! UwU");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! (┬┬﹏┬┬)");
        }
        
        //Remover o texto da área de inserir resposta
        respostaMeioSupDirTextField.setText("");
                
        perguntaMeioSupDirPanel.setVisible(false);
        respostaMeioSupDirPanel.setVisible(true);
    }                                                         

    private void continuarMeioSupDirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // Código para ganhar
        if(cantoEsqInfLabel.isVisible() == true && meioEsqInfLabel.isVisible() == true && cantoSupEsqLabel.isVisible() == true && meioSupDirLabel.isVisible() == true && meioInfDirLabel.isVisible() == true && cantoInfDirLabel.isVisible() == true && cantoSupDirLabel.isVisible() == true && meioSupEsqLabel.isVisible() ==  true){
            respostaMeioSupDirPanel.setVisible(false);
            ultimaPerguntaPanel.setVisible(true);
        }else{
            jogoPanel.setVisible(true);
            respostaMeioSupDirPanel.setVisible(false); 
            if(erros == 16){
                int total = acertos + erros;
                acertosFimLabel2.setText("Você acertou " + acertos + " questões");
                errosFimLabel2.setText("Você errou " + erros + " questões");
                totalQuestoesLabel2.setText("Você respondeu " + total + "questões");
                perdeuPanel.setVisible(true);
                mensagemFimPanel.setVisible(true);
                try{
                    dao.contabilizarAcertosErros(idGrupo, acertos, erros, idVanguarda);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Problemas técnicos!! @-@");
                }
            }
            //Remover o texto da área de exibir a resposta inserida pelo jogador
            respostaMeioSupDirRespostaTextField.setText("");
        }
    }                                                         

    private void responderCantoInfDirButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);

        //Ajustes das áreas em que a pergunta e a resposta aparecem
        perguntaCantoInfDirTextArea1.setLineWrap(true);
        perguntaCantoInfDirTextArea1.setWrapStyleWord(true);
        alternativasCantoInfDirTextArea1.setLineWrap(true);
        alternativasCantoInfDirTextArea1.setWrapStyleWord(true);
       
        try {
            //Pegar a alternativa correta no bd
            String respostaCorreta = dao.pegarRespostaCorreta(idQuestao);
            //Transformar a resposta em um inteiro
            int respostaCorretaInt = ((ArrayList<String>)alternativas).indexOf(respostaCorreta);
            
            //Pegar resposta do aluno
            respostaAluno = Integer.parseInt(respostaCantoInfDirTextField.getText());
            
            //Comparar a resposta do aluno com a resposta correta
            if(respostaAluno == respostaCorretaInt){
                cantoInfDirButtonPanel.setVisible(false);
                cantoInfDirButton.setVisible(false);
                cantoInfDirLabel.setVisible(true);
                perguntaCantoInfDirPanel.setVisible(false);
                respostaCantoInfDirPanel.setVisible(true);
                acertos++;
                dao.contabilizarAcertos(idQuestao, idVanguarda);
            }else{
                cantoInfDirButtonPanel.setVisible(true);
                cantoInfDirButton.setVisible(true);
                perguntaCantoInfDirPanel.setVisible(false);
                respostaCantoInfDirPanel.setVisible(true);
                erros++;
                dao.contabilizarErros(idQuestao, idVanguarda);
            }
            
            try{
            //Pegar e mostrar a pergunta
                perguntaCantoInfDirTextArea1.setText(dao.pegarPergunta(idVanguarda, idQuestao));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
            //Inserindo imagem na aba de resposta
            try{
            //Checando se a questão possui uma imagem
                if(dao.possuiImagem(idQuestao) == false){
                    imagemCantoInfDirRespostaLabel.setText("");
                    //Inserindo a imagem da questão na label
                    imagemCantoInfDirRespostaLabel.setIcon(new javax.swing.JLabel(){
                        public javax.swing.Icon getIcon() {
                            try{
                                return new javax.swing.ImageIcon(
                                    new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                            }catch (java.net.MalformedURLException e){
                                JOptionPane.showMessageDialog(null, "url");
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Problemas dao url");
                            }
                            return null;
                        }
                    }.getIcon());  
                }else{
                    imagemCantoInfDirRespostaLabel.setText(" ");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
            }
            try{                
                // Mostrar a resposta correta e a assinalada pelo aluno
                alternativasCantoInfDirTextArea1.setText("Resposta correta: " + respostaCorreta + "\n\nResposta assinalada: " + ((ArrayList<String>)alternativas).get(respostaAluno));
                respostaCantoInfDirRespostaTextField.setText(Integer.toString(respostaAluno));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! UwU");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! (┬┬﹏┬┬)");
        }
        
        //Remover o texto da área de inserir resposta
        respostaCantoInfDirTextField.setText("");
                
        perguntaCantoInfDirPanel.setVisible(false);
        respostaCantoInfDirPanel.setVisible(true);
    }                                                           

    private void continuarCantoInfDirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // Código para ganhar
        if(cantoEsqInfLabel.isVisible() == true && meioEsqInfLabel.isVisible() == true && cantoSupEsqLabel.isVisible() == true && meioSupDirLabel.isVisible() == true && meioInfDirLabel.isVisible() == true && cantoInfDirLabel.isVisible() == true && cantoSupDirLabel.isVisible() == true && meioSupEsqLabel.isVisible() ==  true){
            respostaCantoInfDirPanel.setVisible(false);
            ultimaPerguntaPanel.setVisible(true);
        }else{
            jogoPanel.setVisible(true);
            respostaCantoInfDirPanel.setVisible(false); 
            if(erros == 16){
                int total = acertos + erros;
                acertosFimLabel2.setText("Você acertou " + acertos + " questões");
                errosFimLabel2.setText("Você errou " + erros + " questões");
                totalQuestoesLabel2.setText("Você respondeu " + total + "questões");
                perdeuPanel.setVisible(true);
                mensagemFimPanel.setVisible(true);
                try{
                    dao.contabilizarAcertosErros(idGrupo, acertos, erros, idVanguarda);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Problemas técnicos!! @-@");
                }
            }
            //Remover o texto da área de exibir a resposta inserida pelo aluno
            respostaCantoInfDirRespostaTextField.setText("");
            
        }
    }                                                          

    private void responderCantoSupDirButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);

        //Ajustes das áreas em que a pergunta e a resposta aparecem
        perguntaCantoSupDirTextArea1.setLineWrap(true);
        perguntaCantoSupDirTextArea1.setWrapStyleWord(true);
        alternativasCantoSupDirTextArea1.setLineWrap(true);
        alternativasCantoSupDirTextArea1.setWrapStyleWord(true);
       
        try {
            //Pegar a alternativa correta no bd
            String respostaCorreta = dao.pegarRespostaCorreta(idQuestao);
            //Transformar a resposta em um inteiro
            int respostaCorretaInt = ((ArrayList<String>)alternativas).indexOf(respostaCorreta);
            
            //Pegar resposta do aluno
            respostaAluno = Integer.parseInt(respostaCantoSupDirTextField.getText());
            
            //Comparar a resposta do aluno com a resposta correta
            if(respostaAluno == respostaCorretaInt){
                cantoSupDirButtonPanel.setVisible(false);
                cantoSupDirButton.setVisible(false);
                cantoSupDirLabel.setVisible(true);
                perguntaCantoSupDirPanel.setVisible(false);
                respostaCantoSupDirPanel.setVisible(true);
                acertos++;
                System.out.println(acertos);
                System.out.println(erros);
                dao.contabilizarAcertos(idQuestao, idVanguarda);
                
            }else{
                cantoSupDirButtonPanel.setVisible(true);
                cantoSupDirButton.setVisible(true);
                perguntaCantoSupDirPanel.setVisible(false);
                respostaCantoSupDirPanel.setVisible(true);
                erros++;
                System.out.println(acertos);
                System.out.println(erros);
                dao.contabilizarErros(idQuestao, idVanguarda);
            }
            
            try{
            //Pegar e mostrar a pergunta
                perguntaCantoSupDirTextArea1.setText(dao.pegarPergunta(idVanguarda, idQuestao));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :D");
        }
            //Inserindo imagem na aba de resposta
            try{
            //Checando se a questão possui uma imagem
                if(dao.possuiImagem(idQuestao) == false){
                    imagemCantoSupDirRespostaLabel.setText("");
                    //Inserindo a imagem da questão na label
                    imagemCantoSupDirRespostaLabel.setIcon(new javax.swing.JLabel(){
                        public javax.swing.Icon getIcon() {
                            try{
                                return new javax.swing.ImageIcon(
                                    new java.net.URL(dao.pegarUrlImagem(idQuestao)));
                            }catch (java.net.MalformedURLException e){
                                JOptionPane.showMessageDialog(null, "url");
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Problemas dao url");
                            }
                            return null;
                        }
                    }.getIcon());  
                }else{
                    imagemCantoSupDirRespostaLabel.setText(" ");
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! :>");
            }
            try{                
                // Mostrar a resposta correta e a assinalada pelo aluno
                alternativasCantoSupDirTextArea1.setText("Resposta correta: " + respostaCorreta + "\n\nResposta assinalada: " + ((ArrayList<String>)alternativas).get(respostaAluno));
                respostaCantoSupDirRespostaTextField.setText(Integer.toString(respostaAluno));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Problemas Técnicos!! UwU");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas Técnicos!! (┬┬﹏┬┬)");
        }
        
        //Remover o texto da área de inserir resposta
        respostaCantoSupDirTextField.setText("");
                
        perguntaCantoSupDirPanel.setVisible(false);
        respostaCantoSupDirPanel.setVisible(true);
    }                                                          

    private void continuarCantoSupDirButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        JOptionPane.showMessageDialog(null, "Corrigindo... ＼（〇_ｏ）／", "Quiz ArtVantGarde", 1);

        // Código para ganhar
        if(cantoEsqInfLabel.isVisible() == true && meioEsqInfLabel.isVisible() == true && cantoSupEsqLabel.isVisible() == true && meioSupDirLabel.isVisible() == true && meioInfDirLabel.isVisible() == true && cantoInfDirLabel.isVisible() == true && cantoSupDirLabel.isVisible() == true && meioSupEsqLabel.isVisible() ==  true){
            respostaCantoSupDirPanel.setVisible(false);
            ultimaPerguntaPanel.setVisible(true);
       
        }else{
            jogoPanel.setVisible(true);
            respostaCantoSupDirPanel.setVisible(false);
            if(erros == 16){
                    int total = acertos + erros;
                    acertosFimLabel2.setText("Você acertou " + acertos + " questões");
                    errosFimLabel2.setText("Você errou " + erros + " questões");
                    totalQuestoesLabel2.setText("Você respondeu " + total + "questões");
                    perdeuPanel.setVisible(true);
                    ultimaPerguntaPanel1.setVisible(false);
                    jLabel2.setVisible(false);
                    jLabel12.setVisible(false);
                    ultimaPerguntaPanel.setVisible(true);
                    mensagemFimPanel.setVisible(true);
            }
            //Remover o texto da área de exibir a resposta inserida pelo aluno
            respostaCantoSupDirRespostaTextField.setText("");
        }
    }                                                           

    private void inserirVanguardaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void responderVanguardaButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        //Fim do timer 7
        int fim = (int) new Date().getTime();
        int tempoTotal = (fim-inicio);
        try{
            String nomeVanguarda = dao.pegarNomeVanguarda(idVanguarda);
            String respostaAluno = inserirVanguardaTextField.getText();
            if((respostaAluno.toLowerCase()).equals(nomeVanguarda.toLowerCase())){
                acertos++;
                int total = acertos + erros;
                acertosFimLabel.setText("Você acertou " + acertos + " questões");
                errosFimLabel.setText("Você errou " + erros + " questões");
                totalQuestoesLabel.setText("Você respondeu " + total + " questões");
                ultimaPerguntaPanel1.setVisible(false);
                mensagemFimPanel.setVisible(true);
                vanguardaCertaPanel.setVisible(true);
            }else{
                erros++;
                int total = acertos + erros;
                nomeVanguardaLabel.setText("A resposta certa era " + nomeVanguarda);
                acertosFimLabel1.setText("Você acertou " + acertos + " questões");
                errosFimLabel1.setText("Você errou " + erros + " questões");
                totalQuestoesLabel1.setText("Você respondeu " + total + " questões");
                ultimaPerguntaPanel1.setVisible(false);
                mensagemFimPanel.setVisible(true);
                vanguardaErradaPanel.setVisible(true);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos!!");
        }

        // Registrar acertos e erros do grupo
        try{
            dao.contabilizarAcertosErros(idGrupo, acertos, erros, idVanguarda);
            dao.contabilizarTempo(idGrupo, tempoTotal);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos!! @-@");
        }
    }                                                        

    private void rankingButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        TelaRanking frame = new TelaRanking(idLogin, idVanguarda, musica);
        this.dispose();
        frame.setVisible(true);
    }                                             

    private void menuPrincipalButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        try{
            if(dao.existeProfessor(idLogin)){
                TelaMenuPrincipalProfessor frame = new TelaMenuPrincipalProfessor(idLogin, musica);
                this.dispose();
                frame.setVisible(true);
            }else if(dao.existeAluno(idLogin)){
                TelaMenuPrincipalAluno frame = new TelaMenuPrincipalAluno(idLogin, musica);
                this.dispose();
                frame.setVisible(true);
            }else{
                TelaMenuPrincipalAdmin frame = new TelaMenuPrincipalAdmin(idLogin, musica);
                this.dispose();
                frame.setVisible(true);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problemas técnicos!!");
        }
    }                                                   


    // Variables declaration - do not modify                     
    private javax.swing.JLabel acertosFimLabel;
    private javax.swing.JLabel acertosFimLabel1;
    private javax.swing.JLabel acertosFimLabel2;
    private javax.swing.JTextArea alternativasCantoEsqInfTextArea;
    private javax.swing.JTextArea alternativasCantoEsqInfTextArea1;
    private javax.swing.JTextArea alternativasCantoInfDirTextArea;
    private javax.swing.JTextArea alternativasCantoInfDirTextArea1;
    private javax.swing.JTextArea alternativasCantoSupDirTextArea;
    private javax.swing.JTextArea alternativasCantoSupDirTextArea1;
    private javax.swing.JTextArea alternativasCantoSupEsqTextArea;
    private javax.swing.JTextArea alternativasCantoSupEsqTextArea1;
    private javax.swing.JTextArea alternativasMeioEsqInfTextArea;
    private javax.swing.JTextArea alternativasMeioEsqInfTextArea1;
    private javax.swing.JTextArea alternativasMeioInfDirTextArea;
    private javax.swing.JTextArea alternativasMeioInfDirTextArea1;
    private javax.swing.JTextArea alternativasMeioSupDirTextArea;
    private javax.swing.JTextArea alternativasMeioSupDirTextArea1;
    private javax.swing.JTextArea alternativasMeioSupEsqTextArea;
    private javax.swing.JTextArea alternativasMeioSupEsqTextArea1;
    private javax.swing.JButton cantoEsqInfButton;
    private javax.swing.JPanel cantoEsqInfButtonPanel;
    private javax.swing.JLabel cantoEsqInfLabel;
    private javax.swing.JButton cantoInfDirButton;
    private javax.swing.JPanel cantoInfDirButtonPanel;
    private javax.swing.JLabel cantoInfDirLabel;
    private javax.swing.JPanel cantoInfDirLabelPanel;
    private javax.swing.JLayeredPane cantoInfDirPanel;
    private javax.swing.JLayeredPane cantoInfEsqPanel;
    private javax.swing.JButton cantoSupDirButton;
    private javax.swing.JPanel cantoSupDirButtonPanel;
    private javax.swing.JLabel cantoSupDirLabel;
    private javax.swing.JPanel cantoSupDirLabelPanel;
    private javax.swing.JLayeredPane cantoSupDirPanel;
    private javax.swing.JButton cantoSupEsqButton;
    private javax.swing.JPanel cantoSupEsqButtonPanel;
    private javax.swing.JLabel cantoSupEsqLabel;
    private javax.swing.JLayeredPane cantoSupEsqPanel;
    private javax.swing.JButton continuarCantoEsqInfButton;
    private javax.swing.JButton continuarCantoInfDirButton;
    private javax.swing.JButton continuarCantoSupDirButton1;
    private javax.swing.JButton continuarCantoSupEsqButton;
    private javax.swing.JButton continuarMeioEsqInfButton;
    private javax.swing.JButton continuarMeioInfDirButton;
    private javax.swing.JButton continuarMeioSupDirButton;
    private javax.swing.JButton continuarMeioSupEsqButton;
    private javax.swing.JLabel errosFimLabel;
    private javax.swing.JLabel errosFimLabel1;
    private javax.swing.JLabel errosFimLabel2;
    private javax.swing.JLabel imagemCantoEsqInfPerguntaLabel;
    private javax.swing.JLabel imagemCantoEsqInfRespostaLabel;
    private javax.swing.JLabel imagemCantoInfDirPerguntaLabel;
    private javax.swing.JLabel imagemCantoInfDirRespostaLabel;
    private javax.swing.JLabel imagemCantoSupDirPerguntaLabel;
    private javax.swing.JLabel imagemCantoSupDirRespostaLabel;
    private javax.swing.JLabel imagemCantoSupEsqPerguntaLabel;
    private javax.swing.JLabel imagemCantoSupEsqRespostaLabel;
    private javax.swing.JLabel imagemFinalLabel;
    private javax.swing.JLabel imagemMeioEsqInfPerguntaLabel;
    private javax.swing.JLabel imagemMeioEsqInfRespostaLabel;
    private javax.swing.JLabel imagemMeioInfDirPerguntaLabel;
    private javax.swing.JLabel imagemMeioInfDirRespostaLabel;
    private javax.swing.JLabel imagemMeioSupDirPerguntaLabel;
    private javax.swing.JLabel imagemMeioSupDirRespostaLabel;
    private javax.swing.JLabel imagemMeioSupEsqPerguntaLabel;
    private javax.swing.JLabel imagemMeioSupEsqRespostaLabel;
    private javax.swing.JTextField inserirVanguardaTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel jogoPanel;
    private javax.swing.JPanel labelCantoEsq2Pannel;
    private javax.swing.JPanel labelCantoSupEsqPannel1;
    private javax.swing.JPanel labelMeioEsqInfPannel;
    private javax.swing.JButton meioEsqInfButton;
    private javax.swing.JLabel meioEsqInfLabel;
    private javax.swing.JPanel meioEsqSupLabelPanel;
    private javax.swing.JButton meioInfDirButton;
    private javax.swing.JPanel meioInfDirButtonPanel;
    private javax.swing.JLabel meioInfDirLabel;
    private javax.swing.JPanel meioInfDirLabelPanel;
    private javax.swing.JLayeredPane meioInfDirPanel;
    private javax.swing.JPanel meioInfEsqButtonPanel;
    private javax.swing.JLayeredPane meioInfEsqPanel;
    private javax.swing.JButton meioSupDirButton;
    private javax.swing.JPanel meioSupDirButtonPanel;
    private javax.swing.JLabel meioSupDirLabel;
    private javax.swing.JPanel meioSupDirLabelPanel;
    private javax.swing.JLayeredPane meioSupDirPanel;
    private javax.swing.JButton meioSupEsqButton;
    private javax.swing.JPanel meioSupEsqButtonPanel;
    private javax.swing.JLabel meioSupEsqLabel;
    private javax.swing.JLayeredPane meioSupEsqPanel;
    private javax.swing.JPanel mensagemFimPanel;
    private javax.swing.JButton menuPrincipalButton;
    private javax.swing.JLabel nomeVanguardaLabel;
    private javax.swing.JPanel perdeuPanel;
    private javax.swing.JTextArea perguntaCantoEsqInfTextArea;
    private javax.swing.JTextArea perguntaCantoEsqInfTextArea1;
    private javax.swing.JPanel perguntaCantoInfDirPanel;
    private javax.swing.JTextArea perguntaCantoInfDirTextArea;
    private javax.swing.JTextArea perguntaCantoInfDirTextArea1;
    private javax.swing.JPanel perguntaCantoInfEsqPanel;
    private javax.swing.JPanel perguntaCantoSupDirPanel;
    private javax.swing.JTextArea perguntaCantoSupDirTextArea;
    private javax.swing.JTextArea perguntaCantoSupDirTextArea1;
    private javax.swing.JPanel perguntaCantoSupEsqPanel;
    private javax.swing.JTextArea perguntaCantoSupEsqTextArea;
    private javax.swing.JTextArea perguntaCantoSupEsqTextArea2;
    private javax.swing.JPanel perguntaMeioEsqInfPanel;
    private javax.swing.JTextArea perguntaMeioEsqInfTextArea;
    private javax.swing.JTextArea perguntaMeioEsqInfTextArea1;
    private javax.swing.JPanel perguntaMeioInfDirPanel;
    private javax.swing.JTextArea perguntaMeioInfDirTextArea;
    private javax.swing.JTextArea perguntaMeioInfDirTextArea1;
    private javax.swing.JPanel perguntaMeioSupDirPanel;
    private javax.swing.JTextArea perguntaMeioSupDirTextArea;
    private javax.swing.JTextArea perguntaMeioSupDirTextArea1;
    private javax.swing.JPanel perguntaMeioSupEsqPanel;
    private javax.swing.JTextArea perguntaMeioSupEsqTextArea;
    private javax.swing.JTextArea perguntaMeioSupEsqTextArea1;
    private javax.swing.JButton rankingButton;
    private javax.swing.JButton responderCantoEsqInfButton;
    private javax.swing.JButton responderCantoInfDirButton1;
    private javax.swing.JButton responderCantoSupDirButton;
    private javax.swing.JButton responderCantoSupEsqButton;
    private javax.swing.JButton responderMeioEsqInfButton;
    private javax.swing.JButton responderMeioInfDirButton;
    private javax.swing.JButton responderMeioSupDirButton;
    private javax.swing.JButton responderMeioSupEsqButton1;
    private javax.swing.JButton responderVanguardaButton;
    private javax.swing.JLabel respostaAlunoCantoEsqInfRespostaLabel;
    private javax.swing.JLabel respostaAlunoCantoInfDirRespostaLabel;
    private javax.swing.JLabel respostaAlunoCantoSupDirRespostaLabel;
    private javax.swing.JLabel respostaAlunoCantoSupEsqRespostaLabel;
    private javax.swing.JLabel respostaAlunoMeioEsqInfRespostaLabel;
    private javax.swing.JLabel respostaAlunoMeioInfDirRespostaLabel;
    private javax.swing.JLabel respostaAlunoMeioSupDirRespostaLabel;
    private javax.swing.JLabel respostaAlunoMeioSupEsqRespostaLabel;
    private javax.swing.JTextField respostaCantoEsqInfRespostaTextField;
    private javax.swing.JTextField respostaCantoEsqInfTextField;
    private javax.swing.JPanel respostaCantoInfDirPanel;
    private javax.swing.JTextField respostaCantoInfDirRespostaTextField;
    private javax.swing.JTextField respostaCantoInfDirTextField;
    private javax.swing.JPanel respostaCantoInfEsqPanel;
    private javax.swing.JPanel respostaCantoSupDirPanel;
    private javax.swing.JTextField respostaCantoSupDirRespostaTextField;
    private javax.swing.JTextField respostaCantoSupDirTextField;
    private javax.swing.JPanel respostaCantoSupEsqPanel;
    private javax.swing.JTextField respostaCantoSupEsqTextField;
    private javax.swing.JPanel respostaMeioEsqInfPanel;
    private javax.swing.JTextField respostaMeioEsqInfRespostaTextField;
    private javax.swing.JTextField respostaMeioEsqInfTextField;
    private javax.swing.JPanel respostaMeioInfDirPanel;
    private javax.swing.JTextField respostaMeioInfDirRespostaTextField;
    private javax.swing.JTextField respostaMeioInfDirTextField;
    private javax.swing.JPanel respostaMeioSupDirPanel;
    private javax.swing.JTextField respostaMeioSupDirRespostaTextField;
    private javax.swing.JTextField respostaMeioSupDirTextField;
    private javax.swing.JPanel respostaMeioSupEsqPanel;
    private javax.swing.JTextField respostaMeioSupEsqRespostaTextField;
    private javax.swing.JTextField respostaMeioSupEsqTextField;
    private javax.swing.JTextField respostaTextField4;
    private javax.swing.JLabel totalQuestoesLabel;
    private javax.swing.JLabel totalQuestoesLabel1;
    private javax.swing.JLabel totalQuestoesLabel2;
    private javax.swing.JPanel ultimaPerguntaPanel;
    private javax.swing.JPanel ultimaPerguntaPanel1;
    private javax.swing.JPanel vanguardaCertaPanel;
    private javax.swing.JPanel vanguardaErradaPanel;
    // End of variables declaration                   
}
