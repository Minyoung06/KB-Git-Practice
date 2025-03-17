// UserController.java
public class UserController {
    private UserService userService = new UserService();
    
    public void createUser(String name, int age) {
        User user = new User(name, age);
        userService.addUser(user);
    }
    
    public void getUsers() {
        for (User user : userService.getUsers()) {
            System.out.println(user);
        }
    }
}