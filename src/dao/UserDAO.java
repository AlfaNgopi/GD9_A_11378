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
    
    public void insertUser(User u){
       con = dbcon.makeConnection();
       
       String sql = "INSERT INTO user(nama, password, wallet, library) VALUES ('"
               + u.getNama() + "', '"
               + u.getPassword() + "', "
               + u.getWallet() + ", '"
               + u.getLibrary() + "')";
       
        System.out.println("Adding User....");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " User");
            statement.close();
        }catch(Exception e){
            System.out.println("Error Adding User...");
            System.out.println("e");
        }
        dbcon.closeConnection();
    }
    
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
                +", library = '"+u.getLibrary()+"' WHERE user_id = "+u.getUser_id()+"";
        
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
    
    public void updateUserNamePassword(User u){
         con = dbcon.makeConnection();
        
        String sql = "UPDATE user SET nama = '"+u.getNama()
                +"', password = '"+u.getPassword()+"' WHERE user_id = "+u.getUser_id()+"";
        
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
    
    public void deleteUser(int user_id){
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM user WHERE user_id = " + user_id + "";
        
        System.out.println("Deleting User...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Pustaka " + user_id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting User...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
}
