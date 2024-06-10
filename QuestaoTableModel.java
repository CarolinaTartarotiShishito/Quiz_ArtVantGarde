/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author louis
 */
public class QuestaoTableModel extends AbstractTableModel{
    private ArrayList<Questao> questoes;
    private String [] colunas = {"Código da Questão", "Pergunta", "URL da Imagem", "Resposta Correta", "Resposta Incorreta 1", "Resposta Incorreta 2", "Resposta Incorreta 3"};
    
    public QuestaoTableModel (int idVanguarda) throws Exception{
        DAO dao = new DAO ();
        this.questoes = dao.pegarQuestoes(idVanguarda);
    }
    
    
    @Override
    public int getRowCount() {
        return questoes.size();
    }
    
    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.questoes.get(rowIndex).getCodQuestao();
            case 1:
                return this.questoes.get(rowIndex).getPergunta();
            case 2:
                return this.questoes.get(rowIndex).getUrlImagem();
            case 3:
                return this.questoes.get(rowIndex).getRespostaCorreta();
            case 4:
                return this.questoes.get(rowIndex).getRespostaIncorreta1();
            case 5:
                return this.questoes.get(rowIndex).getRespostaIncorreta2();
            case 6:
                return this.questoes.get(rowIndex).getRespostaIncorreta3();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
}
