import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author louis
 */
public class DAO {
    
    //Métodos da classe Login
        //Consultar login
    public boolean existe(Login login) throws Exception {
        String sql = "SELECT * FROM tbLogins WHERE email = ? AND senha = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, login.getEmail());
            ps.setString(2, login.getSenha());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    public int pegarId (Login login) throws Exception {
        String sql = "SELECT * FROM tbLogins WHERE email = ? and senha = ?";
        try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, login.getEmail());
            ps.setString(2, login.getSenha());
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt("idLogin");
        }
    }
        //Cadastrar login
    public void novoLogin (Login login) throws Exception{
        String sql = "INSERT INTO tbLogins (email, senha) VALUES (?, ?);";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, login.getEmail());
            ps.setString(2, login.getSenha());
            ps.execute();
        }
    }
    
        //Alterar login
    public void alterarCadastro(Login login, int idLogin) throws Exception {
        String sql = "UPDATE tbLogins SET email = ?, senha = ? WHERE idLogin = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, login.getEmail());
            ps.setString(2, login.getSenha());
            ps.setInt(3, idLogin);
            ps.execute();
        }
    }
        //Apagar login
    public void apagarLogin(int idLogin) throws Exception {
        String sql = "DELETE FROM tbLogins WHERE idLogin = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, idLogin);
            ps.execute();
        }
    }
    
    //Métodos da classe Aluno
        //Consultar aluno
    public boolean existeAluno(String nome, String serie) throws Exception {
        String sql = "SELECT * FROM tbAlunos WHERE nomeCompleto = ? AND serie = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nome);
            ps.setString(2, serie);
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    public boolean existeAluno(int idLogin) throws Exception {
        String sql = "SELECT * FROM tbAlunos WHERE idLogin = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idLogin);
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    public int pegarIdLoginAluno(String nome, String serie) throws Exception {
      String sql = "SELECT idLogin FROM tbAlunos WHERE nomeCompleto = ? and serie = ?";
        try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nome);
            ps.setString(2, serie);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt("idLogin");
        }  
    }
        //Cadastrar aluno
    public void cadastroAluno(UsuarioAluno aluno) throws Exception {
        String sql = "INSERT INTO tbAlunos (nomeCompleto, serie, codMatricula, idLogin) VALUES (?, ?, ?, ?)";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getSerie());
            ps.setString(3, aluno.getCodMatricula());
            ps.setInt(4, aluno.getIdLogin());
            ps.execute();
        }
    }
        //Alterar aluno
    public void alterarAluno(UsuarioAluno aluno) throws Exception {
        String sql = "UPDATE tbAlunos SET nomeCompleto = ?, serie = ?, codMatricula = ?, idLogin = ? WHERE idLogin = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getSerie());
            ps.setString(3, aluno.getCodMatricula());
            ps.setInt(4, aluno.getIdLogin());
            ps.setInt(5, aluno.getIdLogin());
            ps.execute();
        }
    }
        //Apagar aluno
    public void apagarAluno(int idLogin) throws Exception {
        String sql = "DELETE FROM tbAlunos WHERE idLogin = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, idLogin);
            ps.execute();
        }
    }
        //Mostrar o cadastro de alunos juntamente com seu login
    public ArrayList<CadastroAluno> pegarCadastrosAlunos() throws Exception {
        String sql = "SELECT l.idLogin, l.email, l.senha, a.idAluno, a.nomeCompleto, a.serie, a.codMatricula FROM tbLogins l JOIN tbAlunos a ON l.idLogin = a.idLogin";
        ArrayList<CadastroAluno> cadastrosAlunos = new ArrayList<>();
        try(Connection conn = ConnectionFactory.obterConexao(); 
                PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
                ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                int idLogin = rs.getInt("l.idLogin");
                int idAluno = rs.getInt("a.idAluno");
                String email = rs.getString("l.email");
                String senha = rs.getString("l.senha");
                String nomeCompleto = rs.getString("a.nomeCompleto");
                String serie = rs.getString("a.serie");
                String codMatricula = rs.getString("a.codMatricula");
                cadastrosAlunos.add(new CadastroAluno (idLogin, idAluno, email, senha, nomeCompleto, serie, codMatricula));
            }
            return cadastrosAlunos;
        }
    }
    
    //Métodos da classe Professor
        //Consultar professor
        public ArrayList<CadastroProfessor> pegarCadastrosProfessores() throws Exception {
        String sql = "SELECT l.idLogin, l.email, l.senha, p.idProfessor, p.nomeCompleto, p.materiaLecionada FROM tbLogins l JOIN tbProfessores p ON l.idLogin = p.idLogin";
        ArrayList<CadastroProfessor> cadastrosProfessores = new ArrayList<>();
        try(Connection conn = ConnectionFactory.obterConexao(); 
                PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
                ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                int idLogin = rs.getInt("l.idLogin");
                int idProf = rs.getInt("p.idProfessor");
                String email = rs.getString("l.email");
                String senha = rs.getString("l.senha");
                String nomeCompleto = rs.getString("p.nomeCompleto");
                String materiaLecionada = rs.getString("p.materiaLecionada");
                cadastrosProfessores.add(new CadastroProfessor(idLogin, idProf, email, senha, nomeCompleto, materiaLecionada));
            }
            return cadastrosProfessores;
        }
    } 
    public boolean existeProfessor(String nome, String materia) throws Exception {
        String sql = "SELECT * FROM tbProfessores WHERE nomeCompleto = ? AND materiaLecionada = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nome);
            ps.setString(2, materia);
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }   
    public int pegarIdLoginProfessor(String nome, String materia) throws Exception {
      String sql = "SELECT idLogin FROM tbProfessores WHERE nomeCompleto = ? and materiaLecionada = ?";
        try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nome);
            ps.setString(2, materia);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt("idLogin");
        }  
    }
        //Cadastrar  professor
    public void cadastroProfessor(UsuarioProfessor prof) throws Exception {
        String sql = "INSERT INTO tbProfessores (nomeCompleto, materiaLecionada, idLogin) VALUES (?, ?, ?)";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, prof.getNomeCompleto());
            ps.setString(2, prof.getMateriaLecionada());
            ps.setInt(3, prof.getIdLogin());
            ps.execute();
        }
    }
        //Alterar professor
    public void alterarProfessor(UsuarioProfessor prof) throws Exception {
        String sql = "UPDATE tbProfessores SET nomeCompleto = ?, materiaLecionada = ?, idLogin = ? WHERE idLogin = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, prof.getNomeCompleto());
            ps.setString(2, prof.getMateriaLecionada());
            ps.setInt(3, prof.getIdLogin());
            ps.setInt(4, prof.getIdLogin());
            ps.execute();
        }
    }
        //Apagar professor
    public void apagarProfessor(int idLogin) throws Exception {
        String sql = "DELETE FROM tbProfessores WHERE idLogin = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, idLogin);
            ps.execute();
        }
    }
    
    //Métodos da classe Grupo
        //Consultar grupo    
    public int pegarIdGrupo (String nomeGrupo) throws Exception {
        String sql = "SELECT idGrupo FROM tbGrupos WHERE nomeGrupo = ?";
        try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nomeGrupo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt("idGrupo");
        }
    }    
        //Cadastrar grupo
    public void cadastroGrupo(String nomeGrupo) throws Exception {
        String sql = "INSERT INTO tbGrupos(nomeGrupo) VALUES (?)";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nomeGrupo);
            ps.execute();
        }
    }   
    public void cadastroIntegrantesGrupo(IntegranteGrupo ig) throws Exception {
        String sql = "INSERT INTO integrantesGrupo(idLogin, idGrupo) VALUES (?, ?)";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, ig.getIdLogin());
            ps.setInt(2, ig.getIdGrupo());
            ps.execute();
        }
    }
        //Contabilizar acertos e erros do grupo
    public void contabilizarAcertosErros(int idGrupo, int acertos, int erros, int idVanguarda) throws Exception {
        String sql = "UPDATE tbGrupos SET qtdeAcertos = ?, qtdeErros = ?, idVanguarda = ? WHERE idGrupo = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, acertos);
            ps.setInt(2, erros);
            ps.setInt(3, idVanguarda);
            ps.setInt(4, idGrupo);
            ps.execute();
        }
    }
        //Contabilizar o tempo que o grupo levou para terminar a vanguarda
    public void contabilizarTempo(int idGrupo, int tempo) throws Exception {
        String sql = "UPDATE tbGrupos SET tempoResolucaoVanguarda = ? WHERE idGrupo = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, tempo);
            ps.setInt(2, idGrupo);
            ps.execute();
        }
    }
    
    //Métodos da classe Questão
        //Consultar questão
    public boolean existeQuestao(Questao questao) throws Exception {
        String sql = "SELECT * FROM tbQuestoes WHERE pergunta = ? and urlImagem = ?"
                + " and respostaCorreta = ? and respostaIncorreta1 = ? and "
                + "respostaIncorreta2 = ? and respostaIncorreta3 = ? or codQuestao = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, questao.getPergunta());
            ps.setString(2, questao.getUrlImagem());
            ps.setString(3, questao.getRespostaCorreta());
            ps.setString(4, questao.getRespostaIncorreta1());
            ps.setString(5, questao.getRespostaIncorreta2());
            ps.setString(6, questao.getRespostaIncorreta3());
            ps.setInt(7, questao.getCodQuestao());
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    } 
    public ArrayList<Integer> obterNumeroQuestoes(int idVanguarda) throws Exception{
        String sql =  "SELECT codQuestao FROM tbQuestoes where idVanguarda = ? ORDER BY codQuestao";
        try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
            ps.setInt(1, idVanguarda);
            ResultSet rs = ps.executeQuery();
            ArrayList<Integer> numeroQuestoes = new ArrayList<>();
            int totalDeCursos = rs.last()?rs.getRow():0;
            System.out.println("total:" + totalDeCursos);
            rs.beforeFirst();
            while(rs.next()){
                int codQuestao = rs.getInt("codQuestao");
                numeroQuestoes.add(codQuestao);
            }
            return numeroQuestoes;
        }
    }
            //Consultar questões
        public ArrayList<Questao> pegarQuestoes(int idVanguarda) throws Exception {
        String sql = "SELECT codQuestao, pergunta, urlImagem, respostaCorreta, respostaIncorreta1, respostaIncorreta2, respostaIncorreta3,"
                + " qtdeAcertos, qtdeErros FROM tbQuestoes WHERE idVanguarda = ?";
        ArrayList<Questao> questoes = new ArrayList<>();
        try(Connection conn = ConnectionFactory.obterConexao(); 
                PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
            ps.setInt(1, idVanguarda);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                questoes.add(new Questao (rs.getInt("codQuestao"), rs.getString("pergunta"), rs.getString("urlImagem"), 
                        rs.getString("respostaCorreta"), rs.getString("respostaIncorreta1"), rs.getString("respostaIncorreta2"), 
                        rs.getString("respostaIncorreta3"), rs.getInt("qtdeAcertos"), rs.getInt("QtdeErros"), idVanguarda));
            }
            return questoes;
        }
    }
            //Consultar imagem
    public boolean possuiImagem(int idQuestao) throws Exception{
        String sql = "SELECT urlImagem FROM tbQuestoes WHERE codQuestao = ? and urlImagem IS NULL";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idQuestao);
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }    
    public String pegarUrlImagem(int idQuestao) throws Exception {
        String sql = "SELECT urlImagem from tbQuestoes WHERE codQuestao = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idQuestao);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString("urlImagem");
        }
    }
            //consultar pergunta
    public String pegarPergunta(int idVanguarda, int idQuestao) throws Exception {
        String sql = "SELECT pergunta FROM tbQuestoes WHERE idVanguarda = ? and codQuestao = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idVanguarda);
            ps.setInt(2, idQuestao);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString("pergunta");
        }
    }
            //Consultar alternativas
    public ArrayList<String> pegarAlternativas(int idQuestao) throws Exception{
        String sql = "SELECT respostaCorreta, respostaIncorreta1, respostaIncorreta2, respostaIncorreta3 FROM tbQuestoes WHERE codQuestao = ?";
        try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
            ps.setInt(1, idQuestao);
            ResultSet rs = ps.executeQuery();
            rs.next();
            ArrayList<String> alternativas = new ArrayList<>();
            String respostaCorreta = rs.getString("respostaCorreta");
            alternativas.add(respostaCorreta);
            String respostaIncorreta1 = rs.getString("respostaIncorreta1");
            alternativas.add(respostaIncorreta1);
            String respostaIncorreta2 = rs.getString("respostaIncorreta2");
            alternativas.add(respostaIncorreta2);
            String respostaIncorreta3 = rs.getString("respostaIncorreta3");
            alternativas.add(respostaIncorreta3);
            System.out.println(alternativas);
            return alternativas;
        } 
    }
                //Resposta correta
    public String pegarRespostaCorreta(int idQuestao) throws Exception {
        String sql = "SELECT respostaCorreta FROM tbQuestoes WHERE codQuestao = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idQuestao);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString("respostaCorreta");
        }
    } 

        //Cadastrar questão
    public void cadastrarQuestao(Questao questao) throws Exception{
        String sql = "INSERT INTO tbQuestoes (pergunta, respostaCorreta, respostaIncorreta1, respostaIncorreta2, "
                + "respostaIncorreta3, idVanguarda) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, questao.getPergunta());
            ps.setString(2, questao.getRespostaCorreta());
            ps.setString(3, questao.getRespostaIncorreta1());
            ps.setString(4, questao.getRespostaIncorreta2());
            ps.setString(5, questao.getRespostaIncorreta3());
            ps.setInt(6, questao.getIdVanguarda());
            ps.execute();
        }
    }
        //Alterar questao
    public void alterarQuestao(Questao questao) throws Exception {
        String sql = "UPDATE tbQuestoes SET pergunta = ?, urlImagem = ?, respostaCorreta = ?, respostaIncorreta1 = ?, "
                + "respostaIncorreta2 = ?, respostaIncorreta3 = ?, idVanguarda = ? WHERE codQuestao = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, questao.getPergunta());
            ps.setString(2, questao.getUrlImagem());
            ps.setString(3, questao.getRespostaCorreta());
            ps.setString(4, questao.getRespostaIncorreta1());
            ps.setString(5, questao.getRespostaIncorreta2());
            ps.setString(6, questao.getRespostaIncorreta3());
            ps.setInt(7, questao.getIdVanguarda());
            ps.setInt(8, questao.getCodQuestao());
            ps.execute();
        }
    }
        //Apagar questão
    public void apagarQuestao(int codQuestao) throws Exception {
        String sql = "DELETE FROM tbQuestoes WHERE codQuestao = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, codQuestao);
            ps.execute();
        }
    }
        //Contabilizar acertos
    public void contabilizarAcertos(int codQuestao, int idVanguarda) throws Exception{
        String sql = "UPDATE tbQuestoes SET qtdeAcertos = 1 WHERE codQuestao = ? and idVanguarda = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, codQuestao);
            ps.setInt(2, idVanguarda);
            ps.execute();
        }
    }
        //Contabilizar erros
    public void contabilizarErros(int codQuestao, int idVanguarda) throws Exception{
        String sql = "UPDATE tbQuestoes SET qtdeErros = 1 WHERE codQuestao = ? and idVanguarda = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setInt(1, codQuestao);
            ps.setInt(2, idVanguarda);
            ps.execute();
        }
    }

    //Métodos da classe Resumo
        // Para pegar o resumo do banco de dados e mostrar na interface para o ator
    public String pegarResumo (int idVanguarda) throws Exception{
        String sql = "SELECT resumo FROM tbResumos WHERE idVanguarda = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
            PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setInt(1, idVanguarda);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getString("resumo");
        }
    }
        // Método que retorna valor booleano confirmando se existe um resumo ou não
    public boolean existeResumo(int idVanguarda) throws Exception{
        String sql = "SELECT resumo FROM tbResumos WHERE idVanguarda = ? and resumo IS NULL";
        try(Connection conn = ConnectionFactory.obterConexao();
            PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setInt(1, idVanguarda);
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
        // Método para adicionar no banco de dados um resumo digitado pelo ator
    public void adicionarResumo (Resumo resumo) throws Exception{
        String sql = "UPDATE tbResumos SET resumo = ? WHERE idVanguarda = ?";//errado: INSERT INTO tbResumos (resumo, idVanguarda) VALUES (?, ?)";
        try (Connection conn = ConnectionFactory.obterConexao();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, resumo.getResumo());
            ps.setInt(2, resumo.getIdVanguarda());
            ps.execute();
        }
    }
        // Método para remover do banco de dados um resumo digitado pelo ator
    public void removerResumo(Resumo resumo)throws Exception{
        String sql = "UPDATE tbResumos SET resumo = NULL WHERE idVanguarda = ?";
        try(Connection conn = ConnectionFactory.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, resumo.getIdVanguarda());
            ps.execute();
        }
    }
        // Método para alterar no banco de dados resumo editado pelo ator
    public void alterarResumo (int idVanguarda, String resumo) throws Exception{
        String sql = "UPDATE tbResumos SET resumo = ? WHERE idVanguarda = ?";
        try (Connection conn = ConnectionFactory.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setString(1, resumo);
        ps.execute();
        }
    }
    
        // Método para ver na tabela de professores se o idLogin existe
    public boolean existeProfessor(int idLogin) throws Exception {
        String sql = "SELECT * FROM tbProfessores WHERE idLogin = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idLogin);
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }

    ///Métodos da classe Vanguarda
        //Consultar vanguarda
    public String pegarNomeVanguarda(int idVanguarda) throws Exception {
        String sql = "SELECT vanguarda FROM tbVanguardas WHERE idVanguarda = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idVanguarda);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString("vanguarda");
        }
    }
    
    //Métodos da classe Ranking
        //Mostrar a posição de cada grupo no ranking
    public ArrayList<Ranking> pegarRanking(int idVanguarda) throws Exception {
        String sql = "SELECT nomeGrupo, qtdeAcertos, qtdeErros, tempoResolucaoVanguarda FROM tbGrupos WHERE idVanguarda = ? ORDER BY qtdeAcertos desc, qtdeErros, tempoResolucaoVanguarda desc";
        ArrayList<Ranking> ranking = new ArrayList<>();
        try(Connection conn = ConnectionFactory.obterConexao(); 
                PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
            ps.setInt(1, idVanguarda);
            ResultSet rs = ps.executeQuery();
            int posicao = 0;
            while(rs.next()){
                posicao++;
                int acertos, erros, tempoMS, tempoH, restoTempoH, tempoMIN, restoTempoMIN, tempoSEG;
                String nomeGrupo, tempoHStr, tempoMINStr, tempoSEGStr, tempo;
                nomeGrupo = rs.getString("nomeGrupo");
                acertos = rs.getInt("qtdeAcertos");
                erros = rs.getInt("qtdeErros");
                tempoMS = rs.getInt("tempoResolucaoVanguarda");
                tempoH = tempoMS/3600000;
                restoTempoH = tempoMS%3600000;
                tempoMIN = restoTempoH/60000;
                restoTempoMIN = restoTempoH%60000;
                tempoSEG = restoTempoMIN/1000;
                if(tempoH < 10){
                    tempoHStr = "0" + Integer.toString(tempoH);
                }else{
                    tempoHStr = Integer.toString(tempoH);
                }
                if(tempoMIN < 10){
                    tempoMINStr = "0" + Integer.toString(tempoMIN);
                }else{
                    tempoMINStr = Integer.toString(tempoMIN);
                }
                if(tempoSEG < 10){
                    tempoSEGStr = "0" + Integer.toString(tempoSEG);
                }else{
                    tempoSEGStr = Integer.toString(tempoSEG);            
                }
                tempo = tempoHStr + ":" + tempoMINStr + ":" + tempoSEGStr;
                ranking.add(new Ranking (posicao, nomeGrupo, acertos, erros, tempo));
            }
            return ranking;
        }
    }   
    
    // Métodos da classe EstatísticasAluno
        //Mostrar estatística dos alunos (consutlar)
    public ArrayList<EstatisticasAluno> pegarEstatisticasAlunos(int idVanguarda) throws Exception{
        String sql = "SELECT a.nomeCompleto, a.serie, a.codMatricula, g.nomeGrupo, g.qtdeAcertos, g.qtdeErros, "
                + "g.tempoResolucaoVanguarda FROM tbAlunos a JOIN tbLogins l ON "
                + "a.idLogin = l.idLogin JOIN integrantesGrupo ig ON l.idLogin = ig.idLogin "
                + "JOIN tbGrupos g ON ig.idGrupo = g.idGrupo WHERE g.idVanguarda = ?";
        ArrayList<EstatisticasAluno> estatisticasAlunos = new ArrayList<>();
        try(Connection conn = ConnectionFactory.obterConexao(); 
                PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
            ps.setInt(1, idVanguarda);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int acertos, erros, tempoMS, tempoH, restoTempoH, tempoMIN, restoTempoMIN, tempoSEG;
                String nomeAluno, serie, codMatricula, nomeGrupo, tempoHStr, tempoMINStr, tempoSEGStr, tempo;
                nomeAluno = rs.getString("a.nomeCompleto");
                serie = rs.getString("a.serie");
                codMatricula = rs.getString("a.codMatricula");
                nomeGrupo = rs.getString("g.nomeGrupo");
                acertos = rs.getInt("g.qtdeAcertos");
                erros = rs.getInt("g.qtdeErros");
                tempoMS = rs.getInt("g.tempoResolucaoVanguarda");
                tempoH = tempoMS/3600000;
                restoTempoH = tempoMS%3600000;
                tempoMIN = restoTempoH/60000;
                restoTempoMIN = restoTempoH%60000;
                tempoSEG = restoTempoMIN/1000;
                if(tempoH < 10){
                    tempoHStr = "0" + Integer.toString(tempoH);
                }else{
                    tempoHStr = Integer.toString(tempoH);
                }
                if(tempoMIN < 10){
                    tempoMINStr = "0" + Integer.toString(tempoMIN);
                }else{
                    tempoMINStr = Integer.toString(tempoMIN);
                }
                if(tempoSEG < 10){
                    tempoSEGStr = "0" + Integer.toString(tempoSEG);
                }else{
                    tempoSEGStr = Integer.toString(tempoSEG);            
                }
                tempo = tempoHStr + ":" + tempoMINStr + ":" + tempoSEGStr;
                estatisticasAlunos.add(new EstatisticasAluno(nomeAluno, serie, codMatricula, nomeGrupo, acertos, erros, tempo));
            }
            return estatisticasAlunos;
        }
    }
    
    // Métodos da classe EstatísticasQuestoes
        //Mostrar estatística das questoes (consutlar)
    public ArrayList<EstatisticasPerguntas> pegarEstatisticasQuestoes(int idVanguarda) throws Exception{
        String sql = "SELECT codQuestao, pergunta, respostaCorreta, qtdeAcertos, "
                + "qtdeErros FROM tbQuestoes WHERE idVanguarda = ?";
        ArrayList<EstatisticasPerguntas> estatisticasPerguntas = new ArrayList<>();
        try(Connection conn = ConnectionFactory.obterConexao(); 
                PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
            ps.setInt(1, idVanguarda);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int codQuestao = rs.getInt("codQuestao");
                String pergunta = rs.getString("pergunta");
                String respostaCorreta = rs.getString("respostaCorreta");
                int acertos = rs.getInt("qtdeAcertos");
                int erros = rs.getInt("qtdeErros");
                estatisticasPerguntas.add(new EstatisticasPerguntas(codQuestao, pergunta, respostaCorreta, acertos, erros));
            }
            return estatisticasPerguntas;
        }
    }
    
}
