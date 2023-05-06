/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import connection.DbConnection;
import java.util.ArrayList;
import java.util.List;
import model.Dosen;

/**
 *
 * @author ASUS
 */
public class DosenDAO {
    private DbConnection dbCON = new DbConnection();
    private Connection CON;
    
    
    
    public void insertDosen(Dosen d){
        CON = dbCON.makeConnection();
        
        String sql = "INSERT INTO Dosen(nomor_induk_dosen, nama, email, no_handphone"
                + "VALUES ('"+d.getNomerIndukDosen()+"','"+d.getNama()+"','"+d.getEmail()+"','"+d.getNoHandphone()+"')";
        
        System.out.println("Adding Dosen....");
        
        try{
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("added "+ result +" Dosen");
            statement.close();
            
        }catch(Exception e){
            System.out.println("Error Adding Dosen....");
            System.out.println(e);
        }
        
        dbCON.closeConnection();
        
    }
    
    public List<Dosen> showDosen(){
        CON = dbCON.makeConnection();
        String sql = "SELECT * FROM dosen";
        System.out.println("mengambil data dosen ....");
        
        List<Dosen> list = new ArrayList();
        
        try{
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while(rs.next()){
                    Dosen d = new Dosen(
                            rs.getString("nomor_induk_dosen"),
                            rs.getString("nama"),
                            rs.getString("email"),
                            rs.getString("no_handphone")
                    );
                    
                    list.add(d);
                }
            }
            
            rs.close();
            statement.close();
            
            
            
        }catch(Exception e){
            System.out.println("Error Reading Database ...");
        }
        dbCON.closeConnection();
        
        return list;
    }
    
}
