/**
 *
 * @author louis
 */
public class Login {
    public String email;
    public String senha;

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

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
}