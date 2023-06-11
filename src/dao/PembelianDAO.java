package dao;

import connection.DbConnection;
import model.Game;
import model.User;
import model.Pembelian;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PembelianDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertPembelian(Pembelian p){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO pembelian(user_id, game_id, tanggal, ballance) VALUES ('"
                + p.getUser().getUser_id()+ "',"
                + p.getGame().getGameId() + ",'"
                + p.getTanggal() + "', "
                + p.getBallance() + ")";
        System.out.println("Adding data Pembelian...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + "Pembelian");
            statement.close();
        }catch(Exception e){
            System.out.println("Error Adding data Pembelian...");
            System.out.println("e");
        }
        dbcon.closeConnection();
    }
    
    public List<Pembelian> showPembelian(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT p.*, u.*, g.* FROM pembelian as p JOIN user as u ON p.user_id = u.user_id "
                + "JOIN games as g ON p.game_id = g.game_id WHERE (u.user_id = " + query +" "
                + ")"
                ;
        System.out.println("Mengambil data Pembelian...");
        List<Pembelian> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Game g = new Game(rs.getString("game_name"),
                            rs.getString("genre"),
                            rs.getString("release_date"),
                            rs.getString("deskripsi"),
                            rs.getString("review"), 
                            rs.getInt("game_id"),
                            rs.getInt("price"),
                            rs.getBytes("image"),
                            rs.getString("publisher")
                    );
                
                    User u = new User(rs.getInt("user_id"),
                           rs.getInt("wallet"),
                           rs.getString("nama"),
                           rs.getString("password"),
                           rs.getString("library")
                    );

                    Pembelian p = new Pembelian(rs.getInt("id_pembelian"),
                        rs.getString("tanggal"), u, g, rs.getInt("ballance"));
                    list.add(p);
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
    
    public void deletePembelian(int id){
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM pembelian WHERE id_pembelian = " + id + "";
        System.out.println("Deleting Pembelian...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleted " + result + " Pembelian " + id);
            statement.close();
        }catch(Exception e){
            System.out.println("Errod Deleting Pembelian...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
}
