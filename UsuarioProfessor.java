/**
 *
 * @author louis
 */
public class UsuarioProfessor {
    private int idProfessor;
    private String nomeCompleto;
    private String materiaLecionada;
    private int idLogin;

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getMateriaLecionada() {
        return materiaLecionada;
    }

    public void setMateriaLecionada(String materiaLecionada) {
        this.materiaLecionada = materiaLecionada;
    }

    public UsuarioProfessor(int idProfessor, String nomeCompleto, String materiaLecionada, int idLogin) {
        this.idProfessor = idProfessor;
        this.nomeCompleto = nomeCompleto;
        this.materiaLecionada = materiaLecionada;
        this.idLogin = idLogin;
    }

    public UsuarioProfessor(int idLogin, String nomeCompleto, String materiaLecionada) {
        this.idLogin = idLogin;
        this.nomeCompleto = nomeCompleto;
        this.materiaLecionada = materiaLecionada;
    }

    public UsuarioProfessor(String nomeCompleto, String materiaLecionada) {
        this.nomeCompleto = nomeCompleto;
        this.materiaLecionada = materiaLecionada;
    }
    
}
