/**
 *
 * @author louis
 */
public class Questao {
    public int codQuestao;
    public String pergunta;
    public String respostaCorreta;
    public String respostaIncorreta1;
    public String respostaIncorreta2;
    public String respostaIncorreta3;
    public int qtdeAcertos;
    public int qtdeErros;
    public int idVanguarda;

    public int getCodQuestao() {
        return codQuestao;
    }

    public void setCodQuestao(int codQuestao) {
        this.codQuestao = codQuestao;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public String getRespostaIncorreta1() {
        return respostaIncorreta1;
    }

    public void setRespostaIncorreta1(String respostaIncorreta1) {
        this.respostaIncorreta1 = respostaIncorreta1;
    }

    public String getRespostaIncorreta2() {
        return respostaIncorreta2;
    }

    public void setRespostaIncorreta2(String respostaIncorreta2) {
        this.respostaIncorreta2 = respostaIncorreta2;
    }

    public String getRespostaIncorreta3() {
        return respostaIncorreta3;
    }

    public void setRespostaIncorreta3(String respostaIncorreta3) {
        this.respostaIncorreta3 = respostaIncorreta3;
    }

    public int getQtdeAcertos() {
        return qtdeAcertos;
    }

    public void setQtdeAcertos(int qtdeAcertos) {
        this.qtdeAcertos = qtdeAcertos;
    }

    public int getQtdeErros() {
        return qtdeErros;
    }

    public void setQtdeErros(int qtdeErros) {
        this.qtdeErros = qtdeErros;
    }

    public int getIdVanguarda() {
        return idVanguarda;
    }

    public void setIdVanguarda(int idVanguarda) {
        this.idVanguarda = idVanguarda;
    }

    public Questao(int codQuestao, String pergunta, String respostaCorreta, String respostaIncorreta1, String respostaIncorreta2, String respostaIncorreta3, int qtdeAcertos, int qtdeErros, int idVanguarda) {
        this.codQuestao = codQuestao;
        this.pergunta = pergunta;
        this.respostaCorreta = respostaCorreta;
        this.respostaIncorreta1 = respostaIncorreta1;
        this.respostaIncorreta2 = respostaIncorreta2;
        this.respostaIncorreta3 = respostaIncorreta3;
        this.qtdeAcertos = qtdeAcertos;
        this.qtdeErros = qtdeErros;
        this.idVanguarda = idVanguarda;
    }
    
    
}
