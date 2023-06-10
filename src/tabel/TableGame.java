package tabel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Game;

public class TableGame extends AbstractTableModel{
    private List<Game> list ;

    public TableGame(List<Game> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    public int getColumnCount() {
        return 3;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getGameName();
            case 1:
                return list.get(rowIndex).getGenre();
            case 2:
                return list.get(rowIndex).getPrice();
            
            default:
                return null;
        }
    }
    
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Name";
            case 1:
                return "Genre";
            case 2:
                return "Price";
            
            default:
                return null;
        }
    }
    
}
