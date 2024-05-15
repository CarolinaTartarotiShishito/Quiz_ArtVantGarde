/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizartvantgarde;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author louis
 */
public class DAO {
    public boolean existe(Usuario usuario) throws Exception {
        System.out.println("existe");
        String sql = "SELECT * FROM tbLogins WHERE email = ? AND senha = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            System.out.println("try existe");
            ps.setString(1, usuario.getEmail());
            ps.setString(2, usuario.getSenha());
            System.out.println("try existe 2");
            
            try(ResultSet rs = ps.executeQuery()){
                System.out.println("try existe return");
                return rs.next();
            }
        }
    }
    
    public int pegarId (String email, String senha) throws Exception {
        String sql = "SELECT * FROM tbLogins WHERE email = ? and senha = ?";
        try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            System.out.println("try pegarId");
            ps.setString(1, email);
            ps.setString(2, senha);
            System.out.println("try pegarId 2");
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt("idLogin");
        }
    }    
    
    public int pegarIdGrupo (String nomeGrupo) throws Exception {
        String sql = "SELECT idGrupo FROM tbGrupos WHERE nomeGrupo = ?";
        try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nomeGrupo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt("idGrupo");
        }
    }
    
    public int pegarIdAluno (String nome, String serie) throws Exception{
        String sql = "SELECT idAluno FROM tbAlunos WHERE nomeCompletoAluno = ? and salaAluno = ?";
        try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nome);
            ps.setString(2, serie);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt("idAluno");
        }
    }
    
    public String pegarResumo(String vanguardaResumo) throws Exception {
        String sql = "SELECT resumo FROM tbResumos WHERE vanguardaResumo = ?";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, vanguardaResumo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getString("resumo");
        }
    }
    
    
    public void novoLogin (CriarLogin criarLogin) throws Exception{
        String sql = "INSERT INTO tbLogins (email, senha) VALUES (?, ?);";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            System.out.println("try novoLogin");
            ps.setString(1, criarLogin.getNovoLogin());
            ps.setString(2, criarLogin.getNovaSenha());
            System.out.println("try novoLogin 2");
            ps.execute();
        }
    }
    
    public void cadastroProfessor(UsuarioProfessor prof) throws Exception {
        String sql = "INSERT INTO tbProfessores (nomeCompletoProfessor, materiaLecionada, idLogin) VALUES (?, ?, ?)";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            System.out.println("try cadastroProfessor");
            ps.setString(1, prof.getNomeCompleto());
            ps.setString(2, prof.getMateriaLecionada());
            ps.setInt(3, prof.getId());
            System.out.println("try cadastroProfessor");
            ps.execute();
        }
    }
    
    public void cadastroAluno(UsuarioAluno aluno) throws Exception {
        String sql = "INSERT INTO tbAlunos (nomeCompletoAluno, materiaLecionada, idLogin) VALUES (?, ?, ?)";
        try (Connection conexao = ConnectionFactory.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
            System.out.println("try cadastroProfessor");
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getSerie());
            ps.setInt(3, aluno.getId());
            System.out.println("try cadastroProfessor");
            ps.execute();
        }
    }
    
    public void cadastroGrupo(String nomeGrupo) throws Exception {
        String sql = "INSERT INTO tbGrupos(nomeGrupo) VALUES (?)";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, nomeGrupo);
            ps.execute();
        }
    }
    
    public void cadastroIntegrantesGrupo(int idGrupo, int idAluno) throws Exception {
        String sql = "INSERT INTO integrantesGrupo(idAluno, idGrupo VALUES (?, ?)";
        try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, idAluno);
            ps.setInt(2, idGrupo);
            ps.execute();
        }
    }
   
}
