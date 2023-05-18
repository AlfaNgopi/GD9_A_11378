package table;

// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Peminjaman;

public class TablePeminjaman extends AbstractTableModel{
    private List<Peminjaman> list ;

    public TablePeminjaman(List<Peminjaman> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    public int getColumnCount() {
        return 5;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getPustaka().getJudul();
            case 1:
                return list.get(rowIndex).getPustaka().getJenis();
            case 2:
                return list.get(rowIndex).getMahasiswa().getNama();
            case 3:
                return list.get(rowIndex).getLama_pinjam();
            case 4:
                return list.get(rowIndex).getTanggal_peminjaman();
            case 5:
                return list.get(rowIndex).getKondisi_cacat();
            case 6:
                return list.get(rowIndex).getPustaka().getEdisi();
            case 7:
                return list.get(rowIndex).getPustaka().getVolume();
            case 8:
                return list.get(rowIndex).getId();
            case 9:
                return list.get(rowIndex).getPustaka().getIdPustaka();
            case 10:
                return list.get(rowIndex).getMahasiswa().getId();
            default:
                return null;
        }
    }
     
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Judul Pustaka";
            case 1:
                return "Jenis Pustaka";
            case 2:
                return "Nama Mahasiswa";
            case 3:
                return "Lama Pinjam";
            case 4:
                return "Tanggal";
            case 5:
                return "Kondisi Cacat";
            case 6:
                return "Edisi";
            case 7:
                return "Volume";
            default:
                return null;
        }
    }
    
}
