package DAO;

import entity.EffectEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import java.util.List;


@Stateless
public class EffectDAO extends DAO<EffectEntity> {
    public List<EffectEntity> findAll() {
        List<EffectEntity> list = (List<EffectEntity>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from EffectEntity").list();
        return list;
    }

    public EffectEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.find(EffectEntity.class, id);
    }

    public void addEffect(EffectEntity ce){
        save(ce);
    }

    public void updateEffect(EffectEntity character, int id){
        character.setIdEffect(id);
        update(character);
    }

    public void removeEffect(int id){
        delete(findById(id));
    }
}
