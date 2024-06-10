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
public class CadastroProfessorTableModel extends AbstractTableModel{
    private ArrayList<CadastroProfessor> cadastrosProfessores;
    private String [] colunas = {"ID Login", "ID Professor", "Email", "Senha", "Nome Completo", "Matéria Lecionada"};
    
    public CadastroProfessorTableModel () throws Exception{
        DAO dao = new DAO ();
        this.cadastrosProfessores = dao.pegarCadastrosProfessores();
    }
    
    
    @Override
    public int getRowCount() {
        return cadastrosProfessores.size();
    }
    
    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return this.cadastrosProfessores.get(rowIndex).getIdLogin();
            case 1:
                return this.cadastrosProfessores.get(rowIndex).getIdProf();
            case 2:
                return this.cadastrosProfessores.get(rowIndex).getEmail();
            case 3:
                return this.cadastrosProfessores.get(rowIndex).getSenha();
            case 4:
                return this.cadastrosProfessores.get(rowIndex).getNome();
            case 5:
                return this.cadastrosProfessores.get(rowIndex).getMateria();
            default:
                return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
}
