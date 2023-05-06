/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.DosenDAO;
import java.util.ArrayList;
import java.util.List;

import model.Dosen;

/**
 *
 * @author ASUS
 */
public class DosenControl {
    private DosenDAO dDAO = new DosenDAO();
    
    public void insertDataDosen(Dosen d){
        dDAO.insertDosen(d);
    }
    
    public String showDataDosen(){
        
        List<Dosen> list = dDAO.showDosen();
        
        String dosenString = "";
        
        for (Dosen dosen : list) {
            dosenString = dosenString + dosen.showDataDosen() + "\n";
        }
        
        return dosenString;
        
        
    }
    
    public Dosen searchDataDosen(String noInduk){
        Dosen d = null;
        d = dDAO.searchDosen(noInduk);
        
        return d;
        
    }
    
    public void updateDataDosen(Dosen d, String noInduk){
        dDAO.updateDosen(d,noInduk);
    }
    
    public void deleteDataDosen(String noInduk){
        dDAO.deleteDosen(noInduk);
    }
}
