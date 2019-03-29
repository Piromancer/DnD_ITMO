package DAO;

import entity.LandscapeElementEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import java.util.List;


@Stateless
public class LEDAO extends DAO<LandscapeElementEntity> {
    public List<LandscapeElementEntity> findAll() {
        List<LandscapeElementEntity> list = (List<LandscapeElementEntity>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from LandscapeElementEntity").list();
        return list;
    }

    public LandscapeElementEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.find(LandscapeElementEntity.class, id);
    }

    public void addLE(int coorx, int coory, int lanid, boolean passable){
        LandscapeElementEntity ce = new LandscapeElementEntity();
        ce.setLanElCoordX(coorx);
        ce.setLanElCoordY(coory);
        ce.setLanElPassable(passable);
        ce.setLanid(lanid);
        save(ce);
    }

    public void updateLE(LandscapeElementEntity le, int id){
        le.setIdLandscapeElement(id);
        update(le);
    }

    public void removeLE(int id){
        delete(findById(id));
    }
}
