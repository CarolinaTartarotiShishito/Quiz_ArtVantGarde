/**
 *
 * @author louis
 */
public class Grupo {
    private int idGrupo;
    private String grupo;
    private int acertos;
    private int erros;
    private int tempoResolucaoVanguarda;
    private int idVanguarda;

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public int getTempoResolucaoVanguarda() {
        return tempoResolucaoVanguarda;
    }

    public void setTempoResolucaoVanguarda(int tempoResolucaoVanguarda) {
        this.tempoResolucaoVanguarda = tempoResolucaoVanguarda;
    }

    public int getIdVanguarda() {
        return idVanguarda;
    }

    public void setIdVanguarda(int idVanguarda) {
        this.idVanguarda = idVanguarda;
    }

    public Grupo(int idGrupo, String grupo, int acertos, int erros, int tempoResolucaoVanguarda, int idVanguarda) {
        this.idGrupo = idGrupo;
        this.grupo = grupo;
        this.acertos = acertos;
        this.erros = erros;
        this.tempoResolucaoVanguarda = tempoResolucaoVanguarda;
        this.idVanguarda = idVanguarda;
    }

    public Grupo(String grupo) {
        this.grupo = grupo;
    }
    
}
