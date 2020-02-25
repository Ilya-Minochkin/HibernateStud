package dao.Impl;

import dao.UserDAO;
import entities.Auto;
import entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements UserDAO  {


    public User findById(int id) throws SQLException {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(User user) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) throws SQLException {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public Auto findAutoById(int id) throws SQLException {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Auto.class, id);
    }

    public List<User> findAll() throws SQLException {
        return (List<User>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from Users").list();
    }
}
