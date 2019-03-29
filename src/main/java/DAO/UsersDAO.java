package DAO;

import entity.UsersEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * This class provides a sufficient DAO functionality for the Users entity
 */

@Stateless
public class UsersDAO extends DAO<UsersEntity> {
    /**
     * Fetches entity entries
     * @return All entity entries
     */
    public List<UsersEntity> findAll() {
        List<UsersEntity> users = (List<UsersEntity>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from UsersEntity").list();
        return users;
    }

    /**
     * Fetches entries by id
     * @param id The id of the searched entry
     * @return An entity
     */
    public UsersEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.find(UsersEntity.class, id);
    }

    public UsersEntity findByName(String name){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.createQuery("SELECT a FROM UsersEntity a WHERE a.username = :name", UsersEntity.class).setParameter("name",name).getSingleResult();
    }

    /**
     * Adds a record with given params
     * @param username A user's name
     * @param userpass A password
     * @param usermail A mail
     */
    public void addUser(String username, String userpass, String usermail){
        UsersEntity ue = new UsersEntity();
        ue.setUseremail(usermail);
        ue.setUsername(username);
        ue.setUserpass(userpass);
        save(ue);
    }

    /**
     * Replace an old record with a given one
     * @param user A new user
     * @param id An old record's id
     */
    public void updateUser(UsersEntity user, int id){
        user.setIdUsers(id);
        update(user);
    }


    /**
     * Removes a record with a given id
     * @param id A record's id
     */
    public void removeUser(int id){
        delete(findById(id));
    }
}
