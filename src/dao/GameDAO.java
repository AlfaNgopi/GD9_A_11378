package dao;

import connection.DbConnection;
import model.Game;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GameDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
//    public void insertGame(Game g){
//        con = dbcon.makeConnection();
//        
//        String sql = "INSERT INTO games(game_name, genre, price, release_date, deskripsi, review) VALUES('"
//                +g.getGameName()+"', '"
//                +g.getGenre()+"', "
//                +g.getPrice()+", '"
//                +g.getReleaseDate()+"', '"
//                +g.getDeskripsi()+"', '"
//                +g.getReview()+"')";
//        
//        System.out.println("Adding Games...");
//        
//        try{
//            Statement statement = con.createStatement();
//            int result = statement.executeUpdate(sql);
//            System.out.println("Added " + result + " Games");
//            statement.close();
//        }catch(Exception e){
//            System.out.println("Error Adding Games...");
//            System.out.println("e");
//        }
//        dbcon.closeConnection();
//    }
    
//    public void updateGame(Game g, int id_game){
//        con = dbcon.makeConnection();
//        
//        String sql = "UPDATE games SET game_name = '"+g.getGameName()+"', genre = '"+g.getGenre()
//                +"', price = "+g.getPrice()
//                +", release_date = '"+g.getReleaseDate()
//                +"', deskripsi = '"+g.getDeskripsi()
//                +"', review = '"+g.getReview()+"' WHERE game_id = "+id_game;
//        
//        System.out.println("Editing Games...");
//        
//        try{
//            Statement statement = con.createStatement();
//            int result = statement.executeUpdate(sql);
//            System.out.println("Edited " + result + " Games" + id_game);
//            statement.close();
//        }catch(Exception e){
//            System.out.println("Error editing Games...");
//            System.out.println("e");
//        }
//        dbcon.closeConnection();
//    }
    
    public List<Game> showGame(){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * from games";
        
        System.out.println("Mengambil Data Games...");
        
        List<Game> list = new ArrayList();
        
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
                    list.add(g);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading Games...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
    
    public List<Game> showGame(String query){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM games WHERE ( "
                + "game_id LIKE '%" + query + "%'"
                + "OR game_name LIKE '%" + query + "%'"
                + "OR genre LIKE '%" + query + "%'"
                + "OR price LIKE '%" + query + "%'"
                + "OR release_date LIKE '%"+ query +"%'"
                + "OR deskripsi LIKE '%"+ query +"%'"
                + "OR review LIKE '%"+ query +"%')";
        System.out.println("Mengambil data Game...");
        List<Game> list = new ArrayList();
        
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
                               
                    list.add(g);
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
    
    public Game searchGame(int id_game){
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM games WHERE game_id = '" + id_game + "'";
        
        System.out.println("Searching Games...");
        
        Game g = null;
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    g = new Game(rs.getString("game_name"),
                            rs.getString("genre"),
                            rs.getString("release_date"),
                            rs.getString("deskripsi"),
                            rs.getString("review"), 
                            rs.getInt("game_id"),
                            rs.getInt("price"),
                            rs.getBytes("image"),
                            rs.getString("publisher")
                    );
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading Games...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return g;
    }
    
}
