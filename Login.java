/**
 *
 * @author louis
 */
public class Login {
    private int idLogin;
    private String email;
    private String senha;

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Login(int idLogin, String email, String senha) {
        this.idLogin = idLogin;
        this.email = email;
        this.senha = senha;
    }
    
    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
}
