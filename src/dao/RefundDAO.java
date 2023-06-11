package dao;

import connection.DbConnection;
import model.Game;
import model.User;
import model.Refund;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Pembelian;

public class RefundDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertRefund(Refund r){
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO refund(game_id, user_id, tanggal_refund, ballance) VALUES ("
                + r.getGame().getGameId()+ ", "
                + r.getUser().getUser_id()+", '"
                + r.getTanggal_refund() + "', "
                + r.getBallance()+ ")";
        System.out.println("Adding data refund...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + "refund");
            statement.close();
        }catch(Exception e){
            System.out.println("Error Adding data refund...");
            System.out.println("e");
        }
        dbcon.closeConnection();
    }
    
    public List<Refund> showRefund(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT r.*, u.*, g.* FROM refund as r JOIN user as u ON r.user_id = u.user_id "
                + "JOIN games as g ON r.game_id = g.game_id WHERE (u.user_id =" + query +" "
                + ")";
        System.out.println("Mengambil data Refund...");
        List<Refund> list = new ArrayList();
        
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
                    
                    

                    Refund r = new Refund(rs.getInt("id_refund"),
                    g, u, rs.getString("tanggal_refund"), rs.getInt("ballance"));
                    list.add(r);
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
    
    public void deleteRefund(int id){
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM refund WHERE id_refund = " + id + "";
        System.out.println("Deleting Refund...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleted " + result + " Refund " + id);
            statement.close();
        }catch(Exception e){
            System.out.println("Errod Deleting Refund...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
}
