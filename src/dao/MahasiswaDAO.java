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
    
}
