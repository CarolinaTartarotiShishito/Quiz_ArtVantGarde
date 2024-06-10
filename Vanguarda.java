/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizartvantgarde;

/**
 *
 * @author louis
 */
public class Vanguarda {
    private int idVanguarda;
    private String nomeVanguarda;

    public int getIdVanguarda() {
        return idVanguarda;
    }

    public void setIdVanguarda(int idVanguarda) {
        this.idVanguarda = idVanguarda;
    } 

    public String getNomeVanguarda() {
        return nomeVanguarda;
    }

    public void setNomeVanguarda(String nomeVanguarda) {
        this.nomeVanguarda = nomeVanguarda;
    }

    public Vanguarda(int idVanguarda, String nomeVanguarda) {
        this.idVanguarda = idVanguarda;
        this.nomeVanguarda = nomeVanguarda;
    }
        
}
