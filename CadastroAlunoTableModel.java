/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizartvantgarde;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author louis
 */
public class CadastroAlunoTableModel extends AbstractTableModel{
    private ArrayList<CadastroAluno> cadastrosAlunos;
    private String [] colunas = {"ID Login", "ID Aluno", "Email", "Senha", "Nome Completo", "Série", "Código de Matrícula"};
    
    public CadastroAlunoTableModel () throws Exception{
        DAO dao = new DAO ();
        this.cadastrosAlunos = dao.pegarCadastrosAlunos();
    }
    
    
    @Override
    public int getRowCount() {
        return cadastrosAlunos.size();
    }
    
    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.cadastrosAlunos.get(rowIndex).getIdLogin();
            case 1:
                return this.cadastrosAlunos.get(rowIndex).getIdAluno();
            case 2:
                return this.cadastrosAlunos.get(rowIndex).getEmail();
            case 3:
                return this.cadastrosAlunos.get(rowIndex).getSenha();
            case 4:
                return this.cadastrosAlunos.get(rowIndex).getNomeCompleto();
            case 5:
                return this.cadastrosAlunos.get(rowIndex).getSerie();
            case 6:
                return this.cadastrosAlunos.get(rowIndex).getCodMatricula();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
}

