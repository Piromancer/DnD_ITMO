package DAO;

import entity.LobbyEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class LobbyDAO extends DAO<LobbyEntity> {
    /**
     * Fetches entity entries
     * @return All entity entries
     */
    public List<LobbyEntity> findAll() {
        List<LobbyEntity> users = (List<LobbyEntity>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from LobbyEntity").list();
        return users;
    }

    public LobbyEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.find(LobbyEntity.class, id);
    }

    public void addLobby(String lobbyname, int maxPlayers){
        LobbyEntity ue = new LobbyEntity();
        ue.setLobbyName(lobbyname);
        ue.setMaxPlayers(maxPlayers);
        save(ue);
    }

    public void updateLobby(LobbyEntity user, int id){
        user.setLobbyId(id);
        update(user);
    }

    public void removeLobby(int id){
        delete(findById(id));
    }
}
