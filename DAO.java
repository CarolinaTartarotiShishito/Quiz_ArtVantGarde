import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author monic
 */
public class DAO {
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
    public void adicionarResumo (int idVanguarda, Resumo resumo) throws Exception{
        System.out.println("acessei1");
        String sql = "UPDATE tbResumos SET resumo = ? WHERE idVanguarda = ?";//errado: INSERT INTO tbResumos (resumo, idVanguarda) VALUES (?, ?)";
        System.out.println("acessei2");
        try (Connection conn = ConnectionFactory.obterConexao();
            PreparedStatement ps = conn.prepareStatement(sql)){
            System.out.println("acessei3");
        
            ps.setString(1, resumo.getResumo());
            ps.execute();
        }
    }
    // Método para remover do banco de dados um resumo digitado pelo ator
    public void removerResumo(int idVanguarda, String resumo)throws Exception{
        String sql = "UPDATE tbResumos SET resumo = NULL WHERE idVanguarda = ?";
        try(Connection conn = ConnectionFactory.obterConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idVanguarda);
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
