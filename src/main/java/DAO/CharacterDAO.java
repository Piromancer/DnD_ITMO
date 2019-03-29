package DAO;

import entity.CharacterEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import java.util.List;


@Stateless
public class CharacterDAO extends DAO<CharacterEntity> {
    public List<CharacterEntity> findAll() {
        List<CharacterEntity> list = (List<CharacterEntity>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from CharacterEntity").list();
        return list;
    }

    public CharacterEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.find(CharacterEntity.class, id);
    }

    public void addCharacter(CharacterEntity ce){
        save(ce);
    }

    public void updateCharacter(CharacterEntity character, int id){
        character.setIdCharacter(id);
        update(character);
    }

    public void removeCharacter(int id){
        delete(findById(id));
    }
}
