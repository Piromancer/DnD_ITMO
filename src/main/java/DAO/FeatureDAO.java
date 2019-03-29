package DAO;

import entity.FeatureEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import java.util.List;


@Stateless
public class FeatureDAO extends DAO<FeatureEntity> {
    public List<FeatureEntity> findAll() {
        List<FeatureEntity> list = (List<FeatureEntity>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from FeatureEntity").list();
        return list;
    }

    public FeatureEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.find(FeatureEntity.class, id);
    }

    public void addFeat(String name, String desc, String req){
        FeatureEntity ce = new FeatureEntity();
        ce.setFeaturename(name);
        ce.setFeaturedesc(desc);
        ce.setFeaturerequirement(req);
        save(ce);
    }

    public void updateFeat(FeatureEntity feat, int id){
        feat.setIdFeature(id);
        update(feat);
    }

    public void removeFeat(int id){
        delete(findById(id));
    }
}
