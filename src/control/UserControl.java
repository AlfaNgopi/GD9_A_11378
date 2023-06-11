package control;

import dao.UserDAO;
import java.util.List;
import model.User;

public class UserControl {
    private UserDAO uDao = new UserDAO();
    
    public List<User> showDataUser(){
        return uDao.showUser();
    }
    
    public void updateDataUser(User u){
        uDao.updateUser(u);
    }

    public void insertDataUser(User u) {
        uDao.insertUser(u);
    }
    
    public void updateDataUserNamePassword(User u){
        uDao.updateUserNamePassword(u);
    }
    
    public void deleteDataUser(int user_id){
        uDao.deleteUser(user_id);
    }
    
}
