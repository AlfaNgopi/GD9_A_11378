// asdlasjdl
// dasjkdah

package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import connection.DbConnection;
import java.util.ArrayList;
import java.util.List;
import model.Pustaka;

/**
 *
 * @author ASUS
 */
public class PustakaDAO {
    private DbConnection dbCON = new DbConnection();
    private Connection CON;
    
    
    
    public void insertPustaka(Pustaka d){
        CON = dbCON.makeConnection();
        
        String sql = "INSERT INTO Pustaka(id_pustaka, judul, jenis, tahunTerbit, Penerbit, edisi, volume"
                + "VALUES ('"+d.getIdPustaka()+"','"+d.getJudul()+"','"+d.getJenis()+"','"+d.getTahunTerbit()+"','"+d.getPenerbit()+"','"+d.getEdisi()+"','"+d.getVolume()+"')";
        
        System.out.println("Adding Pustaka....");
        
        try{
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("added "+ result +" Pustaka");
            statement.close();
            
        }catch(Exception e){
            System.out.println("Error Adding Pustaka....");
            System.out.println(e);
        }
        
        dbCON.closeConnection();
        
    }
    
    public List<Pustaka> showPustaka(){
        CON = dbCON.makeConnection();
        String sql = "SELECT * FROM pustaka";
        System.out.println("mengambil data dosen ....");
        
        List<Pustaka> list = new ArrayList();
        
        try{
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while(rs.next()){
                    Pustaka d = new Pustaka(
                            rs.getString("id_pustaka"),
                            rs.getString("judul"),
                            rs.getString("jenis"),
                            rs.getString("tahunTerbit"),
                            rs.getString("penerbit"),
                            rs.getInt("edisi"),
                            rs.getInt("volume")
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
    
    public Pustaka searchPustaka(String noInduk){
        CON = dbCON.makeConnection();
        String sql = "SELECT * FROM dosen WHERE nomor_induk_dosen = '" + noInduk + "'";
        System.out.println("mencari data dosen ....");
        
        Pustaka d = null;
        
        
        try{
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while(rs.next()){
                    d = new Pustaka(
                            rs.getString("id_pustaka"),
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
            System.out.println("Error Reading Database ...");
        }
        dbCON.closeConnection();
        
        
        return d;
    }
    
    public void updatePustaka(Pustaka d, String idPustaka){
        CON = dbCON.makeConnection();
        String sql = "UPDATE pustaka SET id_pustaka = '" + d.getIdPustaka()+ "' , judul = '" + d.getJudul()+ "',jenis = '" 
                + d.getJenis()+ "'" + "',tahunTerbit = '" + d.getTahunTerbit() + "',penerbit = '" + d.getPenerbit() + "',edisi = " + d.getEdisi()+ ", volume = " + d.getVolume()
                + " WHERE no_induk_dosen = '" + idPustaka + "'";
        
        System.out.println("updating data dosen ....");
        
        
        try{
            Statement statement = CON.createStatement();
            int rs = statement.executeUpdate(sql);
            
            System.out.println("Edited "+ rs +" Pustaka " + idPustaka);
            
            
            statement.close();
            
            
            
        }catch(Exception e){
            System.out.println("Error editing Database ...");
        }
        dbCON.closeConnection();
        
    }
    
    public void deletePustaka(String idPustaka){
        CON = dbCON.makeConnection();
        String sql = "DELETE FROM DOSEN "
                + "WHERE no_induk_dosen = '" + idPustaka + "'";
        
        System.out.println("updating data dosen ....");
        
        
        try{
            Statement statement = CON.createStatement();
            int rs = statement.executeUpdate(sql);
            
            System.out.println("Deleted "+ rs +" Pustaka " + idPustaka);
            
            
            statement.close();
            
            
            
        }catch(Exception e){
            System.out.println("Error deleting Database ...");
        }
        dbCON.closeConnection();
    }
    
}
