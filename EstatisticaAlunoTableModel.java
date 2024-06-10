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
public class EstatisticaAlunoTableModel extends AbstractTableModel{
    private ArrayList<EstatisticasAluno> estatisticasAluno;
    private String [] colunas = {"Nome do Aluno", "Série", "Código de Matrícula", "Nome do Grupo/Apelido", "Respostas Corretas", "Respostas Incorretas", "Cronômetro"};
    
    public EstatisticaAlunoTableModel(int idVanguarda) throws Exception{
        DAO dao = new DAO ();
        this.estatisticasAluno = dao.pegarEstatisticasAlunos(idVanguarda);
    }
    
    
    @Override
    public int getRowCount() {
        return estatisticasAluno.size();
    }
    
    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.estatisticasAluno.get(rowIndex).getNomeAluno();
            case 1:
                return this.estatisticasAluno.get(rowIndex).getSerie();
            case 2:
                return this.estatisticasAluno.get(rowIndex).getCodMatricula();
            case 3:
                return this.estatisticasAluno.get(rowIndex).getNomeGrupo();
            case 4:
                return this.estatisticasAluno.get(rowIndex).getAcertos();
            case 5:
                return this.estatisticasAluno.get(rowIndex).getErros();
            case 6:
                return this.estatisticasAluno.get(rowIndex).getCronometro();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
}
