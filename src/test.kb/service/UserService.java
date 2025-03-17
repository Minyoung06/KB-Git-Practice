// UserService.java
import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();
    
    public void addUser(User user) {
        userDao.saveUser(user);
    }
    
    public List<User> getUsers() {
        return userDao.getAllUsers();
    }
}
