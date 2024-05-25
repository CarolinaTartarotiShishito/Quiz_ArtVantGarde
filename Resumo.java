public class Resumo {
    private String resumo;
    private int idVanguarda;

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
}
