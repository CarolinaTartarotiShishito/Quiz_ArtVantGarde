/**
 *
 * @author louis
 */
public class UsuarioAluno {
    private int idAluno;
    private String nome;
    private String serie;
    private String codMatricula;
    private int idLogin;

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public UsuarioAluno(int idAluno, String nome, String serie, String codMatricula, int idLogin) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.serie = serie;
        this.codMatricula = codMatricula;
        this.idLogin = idLogin;
    }

    public UsuarioAluno(String nome, String serie, String codMatricula, int idLogin) {
        this.nome = nome;
        this.serie = serie;
        this.codMatricula = codMatricula;
        this.idLogin = idLogin;
    }

    public UsuarioAluno(String nome, String codMatricula) {
        this.nome = nome;
        this.codMatricula = codMatricula;
    }   
    
}
