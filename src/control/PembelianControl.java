package control;

import dao.PembelianDAO;
import model.Pembelian;
import java.util.List;
import tabel.TablePembelian;

public class PembelianControl {
    private PembelianDAO pDao = new PembelianDAO();
    
    public void insertDataPembelian(Pembelian p){
        pDao.insertPembelian(p);
    }
    
    public TablePembelian showdataPembelian(String query){
        List<Pembelian> dataPembelian = pDao.showPembelian(query);
        TablePembelian tp = new TablePembelian(dataPembelian);
        
        return tp;
    }
    
    public List<Pembelian> getList(){
        return pDao.showPembelian("");
    }
    
    public void deleteDataPembelian(int id){
        pDao.deletePembelian(id);
    }
}
