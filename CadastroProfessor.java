/**
 *
 * @author louis
 */
public class CadastroProfessor {
    private int idLogin;
    private int idProf;
    private String email;
    private String senha;
    private String nome;
    private String materia;

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public CadastroProfessor(int idLogin, int idProf, String email, String senha, String nome, String materia) {
        this.idLogin = idLogin;
        this.idProf = idProf;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.materia = materia;
    }

    public CadastroProfessor(String email, String senha, String nome, String materia) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.materia = materia;
    }
    
}
