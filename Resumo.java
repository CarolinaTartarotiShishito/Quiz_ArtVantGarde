/**
 *
 * @author carol
 */
public class Resumo {
    private String resumo;
    private int idVanguarda;
    private int codResumo;

    public int getCodResumo() {
        return codResumo;
    }

    public void setCodResumo(int codResumo) {
        this.codResumo = codResumo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getIdVanguarda() {
        return idVanguarda;
    }

    public void setIdVanguarda(int idVanguarda) {
        this.idVanguarda = idVanguarda;
    } 
    
    public Resumo(int idVanguarda, String resumo) {
        this.resumo = resumo;
        this.idVanguarda = idVanguarda;
    }
    public Resumo(int codResumo, String resumo, int idVanguarda) {
        this.codResumo = codResumo;
        this.resumo = resumo;
        this.idVanguarda = idVanguarda;
    }
}
