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
        
        String sql = "INSERT INTO refund(id_pembelian, tanggal_refund) VALUES ("
                + r.getPembelian().getId()+ ", '"
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
        
        String sql = "SELECT r.*, p.* FROM refund as r JOIN pembelian as p ON r.id_pembelian = p.id_pembelian "
                + "JOIN user as u ON p.user_id = u.user_id JOIN games as g ON p.game_id = g.game_id "
                + "WHERE (r.tanggal_refund LIKE '%" + query + "%'"
                + "OR g.game_name LIKE '%" + query + "%'"
                + "OR g.price LIKE '%" + query + "%'"
                + "OR u.wallet LIKE '%" + query + "%'"
                + "OR r.ballance LIKE '%"+ query +"&')";
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
                    
                    Pembelian p = new Pembelian(rs.getInt("id_pembelian"),
                        rs.getString("tanggal"), u, g, rs.getInt("ballance"));

                    Refund r = new Refund(rs.getInt("id_refund"),
                    p, rs.getString("tanggal_refund"), rs.getInt("ballance"));
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
