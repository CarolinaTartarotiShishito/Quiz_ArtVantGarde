
/**
 *
 * @author louis
 */
public class CriarLogin {
    private String novoLogin;
    private String novaSenha;
    
    public String getNovoLogin() {
        return novoLogin;
    }

    public void setNovoLogin(String novoLogin) {
        this.novoLogin = novoLogin;
    }

    public String getNovaSenha() {
        return novaSenha;
    }

    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }

    
    public CriarLogin(String novoLogin, String novaSenha) {
        this.novoLogin = novoLogin;
        this.novaSenha = novaSenha;
    }
}
