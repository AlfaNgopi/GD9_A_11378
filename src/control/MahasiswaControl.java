package control;

// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

import dao.MahasiswaDAO;
import java.util.List;
import model.Mahasiswa;

public class MahasiswaControl {
    private MahasiswaDAO mDao = new MahasiswaDAO();
    
    public List<Mahasiswa> showDataMahasiswa(){
       
        return mDao.showMahasiswa();
    }
    
}
