package control;
// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

import dao.PustakaDAO;
import java.util.List;
import model.Pustaka;

public class PustakaControl {
    private PustakaDAO pDAO = new PustakaDAO();  
    
    public void insertDataPustaka(Pustaka p){
        pDAO.insertPustaka(p);
    }
    
    public void updateDataPustaka(Pustaka p, String no_pustaka){
        pDAO.updatePustaka(p, no_pustaka);
    }
    
    public void deleteDataPustaka(String no_pustaka){
        pDAO.deletePustaka(no_pustaka);
    }
    
//    public String showDataPustaka(){
//        List<Pustaka> dataPustaka = pDAO.showPustaka();
//        String pustakaString = "";
//        for (int i = 0; i < dataPustaka.size(); i++) {
//            pustakaString = pustakaString + dataPustaka.get(i).showData() + "\n";
//        }
//        return pustakaString;
//    }
    
    public String showDataBuku(){
        List<Pustaka> dataPustaka = pDAO.showPustaka();
        String pustakaString = "";
        for (int i = 0; i < dataPustaka.size(); i++) {
            if ("Buku".equals(dataPustaka.get(i).getJenis())) {
                pustakaString = pustakaString + dataPustaka.get(i).showDataBuku() + "\n";
            }
            
        }
        return pustakaString;
    }
    
    public String showDataMajalah(){
        List<Pustaka> dataPustaka = pDAO.showPustaka();
        String pustakaString = "";
        for (int i = 0; i < dataPustaka.size(); i++) {
            if ("Majalah".equals(dataPustaka.get(i).getJenis())) {
                pustakaString = pustakaString + dataPustaka.get(i).showDataMajalah() + "\n";
            }
        }
        return pustakaString;
    }
    
    public Pustaka searchDataPustaka(String id_pustaka){
        Pustaka p = null;
        p = pDAO.searchPustaka(id_pustaka);
        return p;
    }
    
}