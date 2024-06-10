/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizartvantgarde;

/**
 *
 * @author louis
 */
public class EstatisticasAluno {
    private String nomeAluno;
    private String serie;
    private String codMatricula;
    private String nomeGrupo;
    private int acertos;
    private int erros;
    private String cronometro;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
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

    public EstatisticasAluno(String nomeAluno, String serie, String codMatricula, String nomeGrupo, int acertos, int erros, String cronometro) {
        this.nomeAluno = nomeAluno;
        this.serie = serie;
        this.codMatricula = codMatricula;
        this.nomeGrupo = nomeGrupo;
        this.acertos = acertos;
        this.erros = erros;
        this.cronometro = cronometro;
    }

}
