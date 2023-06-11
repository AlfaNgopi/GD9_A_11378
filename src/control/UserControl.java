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

    public void insertUser(User newUser) {
    }

    public void deleteUser(User user) {
    }
}
