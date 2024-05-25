/**
 *
 * @author louis
 */
public class UsuarioAluno {
    public String nome;
    public String serie;
    public String codMatricula;
    public int idLogin;

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

    public UsuarioAluno(String nome, String serie, String codMatricula, int idLogin) {
        this.nome = nome;
        this.serie = serie;
        this.codMatricula = codMatricula;
        this.idLogin = idLogin;
    }
    
    
    
}
