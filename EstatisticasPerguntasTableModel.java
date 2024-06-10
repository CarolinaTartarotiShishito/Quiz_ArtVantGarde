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
public class EstatisticasPerguntasTableModel extends AbstractTableModel{
    private ArrayList<EstatisticasPerguntas> estatisticasPerguntas;
    private String [] colunas = {"Código da Questão", "Pergunta", "Resposta Correta", "Quantidade de Acertos", "Quantidade de Erros"};
    
    public EstatisticasPerguntasTableModel(int idVanguarda) throws Exception{
        DAO dao = new DAO ();
        this.estatisticasPerguntas = dao.pegarEstatisticasQuestoes(idVanguarda);
    }
    
    
    @Override
    public int getRowCount() {
        return estatisticasPerguntas.size();
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.estatisticasPerguntas.get(rowIndex).getCodQuestao();
            case 1:
                return this.estatisticasPerguntas.get(rowIndex).getPergunta();
            case 2:
                return this.estatisticasPerguntas.get(rowIndex).getRespostaCorreta();
            case 3:
                return this.estatisticasPerguntas.get(rowIndex).getAcertos();
            case 4:
                return this.estatisticasPerguntas.get(rowIndex).getErros();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
}
