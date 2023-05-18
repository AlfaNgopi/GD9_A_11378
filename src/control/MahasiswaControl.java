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
    
    public String showDataMahasiswa(){
        List<Mahasiswa> dataMahasiswa = mDao.showMahasiswa();
        String MahasiswaString = "";
        for (int i = 0; i < dataMahasiswa.size(); i++) {
            MahasiswaString = MahasiswaString + dataMahasiswa.get(i).showDataMahasiswa() + "\n";
        }
        return MahasiswaString;
    }
    
}
