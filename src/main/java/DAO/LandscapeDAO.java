package DAO;

import entity.LandscapeEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import java.util.List;


@Stateless
public class LandscapeDAO extends DAO<LandscapeEntity> {
    public List<LandscapeEntity> findAll() {
        List<LandscapeEntity> list = (List<LandscapeEntity>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from LandscapeEntity").list();
        return list;
    }

    public LandscapeEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.find(LandscapeEntity.class, id);
    }

    public void addLandscape(String lname, String ldesc, String limg){
        LandscapeEntity le = new LandscapeEntity();
        le.setLandscapename(lname);
        le.setLandscapedesc(ldesc);
        le.setLandscapeimg(limg);
        save(le);
    }

    public void updateLandscape(LandscapeEntity landscape, int id){
        landscape.setIdLandscape(id);
        update(landscape);
    }

    public void removeLandscape(int id){
        delete(findById(id));
    }
}
