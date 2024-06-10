/**
 *
 * @author louis
 */
public class Ranking {
    private int posicao;
    private String nomeGrupo;
    private int acertos;
    private int erros;
    private String cronometro;

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

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

    public String getCronometro() {
        return cronometro;
    }

    public void setCronometro(String cronometro) {
        this.cronometro = cronometro;
    }

    public Ranking(int posicao, String nomeGrupo, int acertos, int erros, String cronometro) {
        this.posicao = posicao;
        this.nomeGrupo = nomeGrupo;
        this.acertos = acertos;
        this.erros = erros;
        this.cronometro = cronometro;
    }
    
}
