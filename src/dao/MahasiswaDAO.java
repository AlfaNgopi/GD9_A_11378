package dao;

// Nama : Vincentius Kenton
// NPM : 210711307

// Nama : Alfa Nada Yulaswara
// NPM : 210711378

import connection.DbConnection;
import model.Mahasiswa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public List<Mahasiswa> showMahasiswa(){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM mahasiswa";
        
        System.out.println("Mengambil Data Mahasiswa...");
        
        List<Mahasiswa> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Mahasiswa m = new Mahasiswa(rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("npm"),
                            rs.getString("no_telepon")
                    );
                    list.add(m);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading Mahasiswa...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
    
    public List<Mahasiswa> showMahasiswa(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM mahasiswa WHERE ( "
                
                
                + "id LIKE '%" + query + "%'"
                + "OR nama LIKE '%" + query + "%'"
                + "OR npm LIKE '%" + query + "%'"
                + "OR no_telepon LIKE '%" + query + "%')";
        System.out.println("Mengambil data Mahasiswa...");
        List<Mahasiswa> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Mahasiswa mhs = new Mahasiswa(
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("npm"),
                            rs.getString("no_telepon"));
                            
                
                    
                               
                    list.add(mhs);
                } 
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error Reading Database...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
    
    public void insertMahasiswa(Mahasiswa m){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO mahasiswa(id, nama, npm, no_telepon) VALUES ('"
                + m.getId()+ "',"
                + m.getNama()+ ",'"
                + m.getNpm()+ "','"
                + m.getNo_telepon()+ "')";
        System.out.println("Adding data Mahasiswa...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + "Mahasiswa");
            statement.close();
        }catch(Exception e){
            System.out.println("Error Adding data Mahasiswa...");
            System.out.println("e");
        }
        dbcon.closeConnection();
    }
    
    public void updateMahasiswa (Mahasiswa m){
        con = dbcon.makeConnection();
        
        String sql = "UPDATE mahasiswa SET nama = '" + m.getNama()
                + "', npm = '" + m.getNpm()
                + "', no_telepon = '" + m.getNo_telepon()
                + "' WHERE id = '" + m.getId() + "'";
        
        System.out.println("Editing Mahasiswa...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Mahasiswa " + m.getId());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing Mahasiswa...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    public void deleteMahasiswa(int id){
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM mahasiswa WHERE id = " + id + "";
        System.out.println("Deleting mahasiswa...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleted " + result + " mahasiswa " + id);
            statement.close();
        }catch(Exception e){
            System.out.println("Errod Deleting mahasiswa...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
}
