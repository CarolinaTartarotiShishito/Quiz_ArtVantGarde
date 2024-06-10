/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizartvantgarde;

/**
 *
 * @author louis
 */
public class EstatisticasPerguntas {
    private int codQuestao;
    private String pergunta;
    private String respostaCorreta;
    private int acertos;
    private int erros;
    private int cronometro;

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

    public int getCronometro() {
        return cronometro;
    }

    public void setCronometro(int cronometro) {
        this.cronometro = cronometro;
    }

    public EstatisticasPerguntas(int codQuestao, String pergunta, String respostaCorreta, int acertos, int erros, int cronometro) {
        this.codQuestao = codQuestao;
        this.pergunta = pergunta;
        this.respostaCorreta = respostaCorreta;
        this.acertos = acertos;
        this.erros = erros;
        this.cronometro = cronometro;
    }

    public EstatisticasPerguntas(int codQuestao, String pergunta, String respostaCorreta, int acertos, int erros) {
        this.codQuestao = codQuestao;
        this.pergunta = pergunta;
        this.respostaCorreta = respostaCorreta;
        this.acertos = acertos;
        this.erros = erros;
    }
    
}
