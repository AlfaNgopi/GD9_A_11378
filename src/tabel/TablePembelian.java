package tabel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pembelian;

public class TablePembelian extends AbstractTableModel{
    private List<Pembelian> list ;

    public TablePembelian(List<Pembelian> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getTanggal();
            case 2:
                return list.get(rowIndex).getGame().getGameName();
            case 3:
                return list.get(rowIndex).getGame().getPrice();
            case 4:
                return list.get(rowIndex).getBallance();
            default:
                return null;
        }
    }
     
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Pembelian";
            case 1:
                return "Tanggal Pembelian";
            case 2:
                return "Judul Game";
            case 3:
                return "Harga";
            case 4:
                return "Ballance";
            default:
                return null;
        }
    }
}
