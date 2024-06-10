/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizartvantgarde;

/**
 *
 * @author louis
 */
public class IntegranteGrupo {
    private int idIG;
    private int idLogin;
    private int idGrupo;

    public int getIdIG() {
        return idIG;
    }

    public void setIdIG(int idIG) {
        this.idIG = idIG;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public IntegranteGrupo(int idIG, int idLogin, int idGrupo) {
        this.idIG = idIG;
        this.idLogin = idLogin;
        this.idGrupo = idGrupo;
    }

    public IntegranteGrupo(int idLogin, int idGrupo) {
        this.idLogin = idLogin;
        this.idGrupo = idGrupo;
    }
    
}
