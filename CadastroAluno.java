/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizartvantgarde;

/**
 *
 * @author louis
 */
public class CadastroAluno {
    public int idLogin;
    public int idAluno;
    public String email;
    public String senha;
    public String nomeCompleto;
    public String serie;
    public String codMatricula;

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
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

    public CadastroAluno(int idLogin, int idAluno, String email, String senha, String nomeCompleto, String serie, String codMatricula) {
        this.idLogin = idLogin;
        this.idAluno = idAluno;
        this.email = email;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.serie = serie;
        this.codMatricula = codMatricula;
    }
    
    
}
