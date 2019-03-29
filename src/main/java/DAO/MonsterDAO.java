package DAO;

import entity.MonsterEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import java.util.List;


@Stateless
public class MonsterDAO extends DAO<MonsterEntity> {
    public List<MonsterEntity> findAll() {
        List<MonsterEntity> list = (List<MonsterEntity>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from MonsterEntity").list();
        return list;
    }

    public MonsterEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.find(MonsterEntity.class, id);
    }

    public void addCharacter(MonsterEntity ce){
        save(ce);
    }

    public void updateCharacter(MonsterEntity character, int id){
        character.setIdMonster(id);
        update(character);
    }

    public void removeCharacter(int id){
        delete(findById(id));
    }
}
