package dao;

import entities.Auto;
import entities.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    public User findById(int id) throws SQLException;
    public void save(User user) throws SQLException;
    public void update(User user) throws SQLException;
    public void delete(User user) throws SQLException;
    public Auto findAutoById(int id) throws SQLException;
    public List<User> findAll() throws SQLException;
}
