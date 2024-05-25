/**
 *
 * @author louis
 */
public class Ranking {
    public String nomeGrupo;
    public int acertos;
    public int erros;

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
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

    public Ranking(String nomeGrupo, int acertos, int erros) {
        this.nomeGrupo = nomeGrupo;
        this.acertos = acertos;
        this.erros = erros;
    }
    
    
}
