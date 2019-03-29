package DAO;

import entity.MagicEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import java.util.List;


@Stateless
public class MagicDAO extends DAO<MagicEntity> {
    public List<MagicEntity> findAll() {
        List<MagicEntity> list = (List<MagicEntity>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from MagicEntity").list();
        return list;
    }

    public MagicEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.find(MagicEntity.class, id);
    }

    public void addMagic(String name, String desc, String components){
        MagicEntity me = new MagicEntity();
        me.setMagicname(name);
        me.setMagiccomponents(components);
        me.setMagicdesc(desc);

        save(me);
    }

    public void updateMagic(MagicEntity magic, int id){
        magic.setIdMagic(id);
        update(magic);
    }

    public void removeMagic(int id){
        delete(findById(id));
    }
}
