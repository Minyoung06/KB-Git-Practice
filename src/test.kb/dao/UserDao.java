// UserDao.java
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private List<User> users = new ArrayList<>();
    
    public void saveUser(User user) {
        users.add(user);
    }
    
    public List<User> getAllUsers() {
        return users;
    }
}