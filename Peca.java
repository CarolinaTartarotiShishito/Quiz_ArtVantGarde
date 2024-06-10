/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizartvantgarde;

/**
 *
 * @author louis
 */
public class Peca {
    private String nomePeca;
    private String urlImagem;
    private int idVanguarda;

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public int getIdVanguarda() {
        return idVanguarda;
    }

    public void setIdVanguarda(int idVanguarda) {
        this.idVanguarda = idVanguarda;
    }

    public Peca(String nomePeca, String urlImagem, int idVanguarda) {
        this.nomePeca = nomePeca;
        this.urlImagem = urlImagem;
        this.idVanguarda = idVanguarda;
    }
    
}
