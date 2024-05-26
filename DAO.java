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
    
        //Cadastrar login
    public void alterarCadastro(Login login, int idLogin) throws Exception {
        String sql = "UPDATE tbLogins SET email = ?, senha = ? WHERE idLogin = ?";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            System.out.println("oiii");
            ps.setString(1, login.getEmail());
            System.out.println("oiiii");
            ps.setString(2, login.getSenha());
            System.out.println("oiiiii");
            ps.setInt(3, idLogin);
            System.out.println("oiiiiii");
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
    
        //Cadastrar  professor
    public void cadastroProfessor(UsuarioProfessor prof) throws Exception {
        String sql = "INSERT INTO tbProfessores (nomeCompleto, materiaLecionada, idLogin) VALUES (?, ?, ?)";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, prof.getNomeCompleto());
            ps.setString(2, prof.getMateriaLecionada());
            ps.setInt(3, prof.getId());
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
    public void cadastroIntegrantesGrupo(int idGrupo, int idAluno) throws Exception {
        String sql = "INSERT INTO integrantesGrupo(idAluno, idGrupo) VALUES (?, ?)";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idAluno);
            ps.setInt(2, idGrupo);
            ps.execute();
        }
    }
        //Contabilizar acertos e erros do grupo
    public void contabilizarAcertosErros(int idGrupo, int acertos, int erros) throws Exception {
        String sql = "UPDATE tbGrupos SET qtdeAcertos = ? qtdeErros = ? WHERE idGrupo = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, acertos);
            ps.setInt(2, erros);
            ps.setInt(3, idGrupo);
            ps.execute();
        }
    }
        //Mostrar a posição de cada grupo no ranking
    public ArrayList<Ranking> pegarRanking(int idVanguarda) throws Exception {
        String sql = "SELECT nomeGrupo, qtdeAcertos, qtdeErros FROM tbGrupos WHERE idVanguarda = ? ORDER BY qtdeAcertos, qtdeErros";
        ArrayList<Ranking> ranking = new ArrayList<>();
        try(Connection conn = ConnectionFactory.obterConexao(); 
                PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
            ps.setInt(1, idVanguarda);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String nomeGrupo = rs.getString("nomeGrupo");
                int qtdeAcertos = rs.getInt("qtdeAcertos");
                int qtdeErros = rs.getInt("qtdeErros");
                ranking.add(new Ranking (nomeGrupo, qtdeAcertos, qtdeErros));
            }
            return ranking;
        }
    }
    
    //Métodos da classe Questão
        //Consultar questão
    public ArrayList<Integer> obterNumeroQuestoes(int idVanguarda) throws Exception{
        String sql =  "SELECT codQuestao FROM tbQuestoes where idVanguarda = ? ORDER BY codQuestao";
        try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
            ps.setInt(1, idVanguarda);
            ResultSet rs = ps.executeQuery();
            ArrayList<Integer> numeroQuestoes = new ArrayList<>();
            int totalDeCursos = rs.last()?rs.getRow():0;
            System.out.println("total:" + totalDeCursos);
            rs.beforeFirst();
            //int contador = 0;
            while(rs.next()){
                int codQuestao = rs.getInt("codQuestao");
                numeroQuestoes.add(codQuestao);
                /*contador++;
                rs.next();*/
            }
            return numeroQuestoes;
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
    
    public String pegarNomeVanguarda(int idVanguarda) throws Exception {
        String sql = "SELECT vanguarda FROM tbVanguardas WHERE idVanguarda = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idVanguarda);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString("vanguarda");
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
            ps.setInt(1, resumo.getIdVanguarda);
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
    
}
