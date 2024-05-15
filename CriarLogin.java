/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizartvantgarde;

/**
 *
 * @author louis
 */
public class CriarLogin {
    private String novoLogin;
    private String novaSenha;
    
    public String getNovoLogin() {
        return novoLogin;
    }

    public void setNovoLogin(String novoLogin) {
        this.novoLogin = novoLogin;
    }

    public String getNovaSenha() {
        return novaSenha;
    }

    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }

    
    public CriarLogin(String novoLogin, String novaSenha) {
        this.novoLogin = novoLogin;
        this.novaSenha = novaSenha;
    }
}
