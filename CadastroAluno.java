public class CadastroAluno {
    private int idLogin;
    private int idAluno;
    private String email;
    private String senha;
    private String nomeCompleto;
    private String serie;
    private String codMatricula;

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
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

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public CadastroAluno(int idLogin, int idAluno, String email, String senha, String nomeCompleto, String serie, String codMatricula) {
        this.idLogin = idLogin;
        this.idAluno = idAluno;
        this.email = email;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.serie = serie;
        this.codMatricula = codMatricula;
    }

    public CadastroAluno(String email, String senha, String nomeCompleto, String serie, String codMatricula) {
        this.email = email;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.serie = serie;
        this.codMatricula = codMatricula;
    }
    
}
