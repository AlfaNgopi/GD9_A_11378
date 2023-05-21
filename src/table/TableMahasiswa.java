package table;

// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Mahasiswa;

public class TableMahasiswa extends AbstractTableModel{
    private List<Mahasiswa> list ;

    public TableMahasiswa(List<Mahasiswa> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getNpm();
            case 3:
                return list.get(rowIndex).getNo_telepon();
            
            default:
                return null;
        }
    }
     
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Nama";
            case 2:
                return "NPM";
            case 3:
                return "No Telp";
            
            default:
                return null;
        }
    }
    
}
