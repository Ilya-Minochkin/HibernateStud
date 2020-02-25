package services;

import dao.Impl.UserDAOImpl;
import entities.Auto;
import entities.User;

import java.sql.SQLException;
import java.util.List;

public class UserService {

    private UserDAOImpl userDAOImpl = new UserDAOImpl();

    public UserService(){
    }

    public User findUser(int id) throws SQLException {
        return userDAOImpl.findById(id);
    }

    public void saveUser(User user) throws SQLException{
        userDAOImpl.save(user);
    }

    public void deleteUser(User user) throws SQLException{
        userDAOImpl.delete(user);
    }

    public void update(User user) throws SQLException{
        userDAOImpl.update(user);
    }

    public List<User> findAllUsers() throws SQLException{
        return userDAOImpl.findAll();
    }

    public Auto findAutoById(int id) throws SQLException{
        return userDAOImpl.findAutoById(id);
    }
}
