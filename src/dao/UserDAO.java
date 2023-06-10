package dao;

import connection.DbConnection;
import model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public List<User> showUser(){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM user";
        
        System.out.println("Mengambil Data User...");
        
        List<User> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    User u = new User(rs.getInt("user_id"),
                           rs.getInt("wallet"),
                           rs.getString("nama"),
                           rs.getString("password"),
                           rs.getString("library")
                    );
                    list.add(u);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading User...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
    
    public void updateUser(User u){
        con = dbcon.makeConnection();
        
        String sql = "UPDATE user SET wallet = "+u.getWallet()
                +", library = '"+u.getLibrary()+"' WHERE user_id = "+u.getUser_id()+"'";
        
        System.out.println("Editing User...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " User " + u.getUser_id());
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing User...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
}
