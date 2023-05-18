package control;

// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

import dao.PeminjamanDAO;
import model.Peminjaman;
import java.util.List;
import table.TablePeminjaman;

public class PeminjamanControl {
    private PeminjamanDAO pmDao = new PeminjamanDAO();
    
    public void insertDataMataKuliah(Peminjaman pm){
        pmDao.insertPeminjaman(pm);
    }
    
    public TablePeminjaman showPeminjaman(String query){
        List<Peminjaman> dataPeminjaman = pmDao.showPeminjaman(query);
        TablePeminjaman tpm = new TablePeminjaman(dataPeminjaman);
        
        return tpm;
    }
    
    public void updateDataPeminjaman(Peminjaman pm){
        pmDao.updatePeminjaman(pm);
    }
    
    public void deleteDataPeminjaman(int id){
        pmDao.deletePeminjaman(id);
    }
    
}
