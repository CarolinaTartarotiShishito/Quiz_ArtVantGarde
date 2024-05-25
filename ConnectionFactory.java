import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author louis
 */
public class ConnectionFactory {
    private static String host = "mysql-2bee4216-quizartvantgarde-803a.d.aivencloud.com";
    private static String porta = "20445";
    private static String db = "quizArtVantGarde";
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_vsWw4i6D6oJ4T7iYI4J";
    
    public static Connection obterConexao() throws Exception {
        String url = "jdbc:mysql://" + host + ":" + porta + "/" + db;  
        return DriverManager.getConnection(url, usuario, senha);
    }
}
