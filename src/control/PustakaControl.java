/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.PustakaDAO;
import java.util.ArrayList;
import java.util.List;

import model.Pustaka;

/**
 *
 * @author ASUS
 */
public class PustakaControl {
    private PustakaDAO dDAO = new PustakaDAO();
    
    public void insertDataPustaka(Pustaka d){
        dDAO.insertPustaka(d);
    }
    
    public String showDataPustaka(){
        
        List<Pustaka> list = dDAO.showPustaka();
        
        String dosenString = "";
        
        for (Pustaka p : list) {
            dosenString = dosenString + p.showDataPustaka()+ "\n";
        }
        
        return dosenString;
        
        
    }
    
    public Pustaka searchDataPustaka(String noInduk){
        Pustaka d = null;
        d = dDAO.searchPustaka(noInduk);
        
        return d;
        
    }
    
    public void updateDataPustaka(Pustaka d, String noInduk){
        dDAO.updatePustaka(d,noInduk);
    }
    
    public void deleteDataPustaka(String noInduk){
        dDAO.deletePustaka(noInduk);
    }
}
