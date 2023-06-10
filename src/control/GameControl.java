package control;

import dao.GameDAO;
import java.util.List;
import model.Game;
import tabel.TableGame;

public class GameControl {
    private GameDAO gDao = new GameDAO();
    
    public void insertDataGame(Game g){
        gDao.insertGame(g);
    }
    
    public void updateDataGame(Game g, int game_id){
        gDao.updateGame(g, game_id);
    }
    
    public List<Game> showDataGame(){
        return gDao.showGame();
    }
    
    public TableGame showDataGames(String query){
        System.out.println("Tampil saat di home page");
        List<Game> dataGame = gDao.showGame(query);
        TableGame tg = new TableGame(dataGame);
        
        return tg;
    }
    
    public Game searchDataGame(int game_id){
        Game g = null;
        g = gDao.searchGame(game_id);
        return g;
    }
    
}
