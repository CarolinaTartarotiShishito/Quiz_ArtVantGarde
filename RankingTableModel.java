import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author louis
 */
public class RankingTableModel extends AbstractTableModel{
    private ArrayList<Ranking> ranking;
    private String [] colunas = {"Posição", "Nome do Grupo/Apelido", "Respostas Correstas", "Respostas Incorretas", "Cronômetro"};
    
    public RankingTableModel (int idVanguarda) throws Exception{
        DAO dao = new DAO ();
        this.ranking = dao.pegarRanking(idVanguarda);
    }
    
    
    @Override
    public int getRowCount() {
        return ranking.size();
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.ranking.get(rowIndex).getPosicao();
            case 1:
                return this.ranking.get(rowIndex).getNomeGrupo();
            case 2:
                return this.ranking.get(rowIndex).getAcertos();
            case 3:
                return this.ranking.get(rowIndex).getErros();
            case 4: 
                return this.ranking.get(rowIndex).getCronometro();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
}
