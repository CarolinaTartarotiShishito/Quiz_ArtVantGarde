/**
 *
 * @author louis
 */
public class UsuarioProfessor {
    public int id;
    public String nomeCompleto;
    public String materiaLecionada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public UsuarioProfessor(int id, String nomeCompleto, String materiaLecionada) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.materiaLecionada = materiaLecionada;
    }
}
