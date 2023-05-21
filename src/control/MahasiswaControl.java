package control;

// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

import dao.MahasiswaDAO;
import java.util.List;
import model.Mahasiswa;
import table.TableMahasiswa;

public class MahasiswaControl {
    private MahasiswaDAO mDao = new MahasiswaDAO();
    
    public List<Mahasiswa> showDataMahasiswa(){
       
        return mDao.showMahasiswa();
    }
    
    public TableMahasiswa showMahasiswa(String query){
        List<Mahasiswa> dataMahasiswa = mDao.showMahasiswa(query);
        TableMahasiswa tpm = new TableMahasiswa(dataMahasiswa);
        
        return tpm;
    }
    
    public void insertDataMahasiswa(Mahasiswa p){
        mDao.insertMahasiswa(p);
    }
    
    public void updateDataMahasiswa(Mahasiswa p){
        mDao.updateMahasiswa(p);
    }
    
    public void deleteDataMahasiswa(int id){
        mDao.deleteMahasiswa(id);
    }
    
}
