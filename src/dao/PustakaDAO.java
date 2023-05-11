package dao;
// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

import connection.DbConnection;
import model.Pustaka;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PustakaDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertPustaka(Pustaka p){
       con = dbcon.makeConnection();
       
       String sql = "INSERT INTO pustaka(id_pustaka, judul, jenis, tahunTerbit, penerbit, edisi, volume) VALUES ('"
               + p.getIdPustaka()+ "','" + p.getJudul() + "','" + p.getJenis() + "','"
               + p.getTahunTerbit() + "','" + p.getPenerbit() + "'," 
               + p.getEdisi() + "," + p.getVolume() + ")";
       
        System.out.println("Adding Pustaka....");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Pustaka");
            statement.close();
        }catch(Exception e){
            System.out.println("Error Adding Pustaka...");
            System.out.println("e");
        }
        dbcon.closeConnection();
    }
    
    public void updatePustaka(Pustaka p, String id_pustaka){
        con = dbcon.makeConnection();
        
        String sql = "UPDATE pustaka SET judul = '" + p.getJudul() + "', jenis = '" + p.getJenis()
                + "', tahunTerbit = '" + p.getTahunTerbit() + "', penerbit = '" + p.getPenerbit()
                + "', edisi = " + p.getEdisi() + ", volume = " + p.getVolume() + " "
                + "WHERE id_pustaka = '" + id_pustaka + "'";
        
        System.out.println("Editing Pustaka...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Pustaka" + id_pustaka);
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing Pustaka...");
            System.out.println("e");
        }
        dbcon.closeConnection();
    }
    
    public void deletePustaka(String id_pustaka){
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM pustaka WHERE id_pustaka = '" + id_pustaka + "'";
        
        System.out.println("Deleting Pustaka...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Pustaka " + id_pustaka);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting Pustaka...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public List<Pustaka> showPustaka(){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM pustaka";
        
        System.out.println("Mengambil Data Pustaka...");
        
        List<Pustaka> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pustaka p = new Pustaka(rs.getString("id_pustaka"),
                            rs.getString("judul"),
                            rs.getString("jenis"),
                            rs.getString("tahunTerbit"),
                            rs.getString("penerbit"),
                            rs.getInt("edisi"),
                            rs.getInt("volume")
                    );
                    list.add(p);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading Pustaka...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
    
    public Pustaka searchPustaka(String id_pustaka){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM pustaka WHERE id_pustaka = '" + id_pustaka + "'";
        
        System.out.println("Searching Pustaka...");
        
        Pustaka p = null;
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    p = new Pustaka(rs.getString("id_pustaka"),
                            rs.getString("judul"),
                            rs.getString("jenis"),
                            rs.getString("tahunTerbit"),
                            rs.getString("penerbit"),
                            rs.getInt("edisi"),
                            rs.getInt("volume")
                    );
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading Pustaka...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return p;
    }
    
}