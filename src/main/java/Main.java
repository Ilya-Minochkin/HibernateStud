import entities.Auto;
import entities.User;
import services.UserService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        User user = new User("Masha", 28);
        try {
            userService.saveUser(user);
        } catch (SQLException e){
            System.out.println("SQLException - " + e);
        }
        Auto ferrari = new Auto("Ferrari", "Red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "Blue");
        ford.setUser(user);
        user.addAuto(ford);
        try {
            userService.update(user);
        } catch (SQLException e){
            System.out.println("SQLException " + e);
        }
    }
}
