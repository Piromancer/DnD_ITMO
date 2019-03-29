package DAO;

import entity.ClazzEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import java.util.List;


@Stateless
public class ClassDAO extends DAO<ClazzEntity> {
    public List<ClazzEntity> findAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<ClazzEntity> list = (List<ClazzEntity>) session.createQuery("from ClazzEntity").list();
        session.close();
        return list;
    }

    public static ClazzEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        ClazzEntity ce = session.find(ClazzEntity.class, id);
        session.close();
        return ce;
    }

    public void addClass(String classname, String classdesc, String classimg){
        ClazzEntity ce = new ClazzEntity();
        ce.setClassdesc(classdesc);
        ce.setClassname(classname);
        ce.setClassimg(classimg);
        save(ce);
    }

    public void updateClazz(ClazzEntity clazz, int id){
        clazz.setIdClass(id);
        update(clazz);
    }

    public void removeClazz(int id){
        delete(findById(id));
    }
//    public void addRelatedItem(int itemid, int classid){
//        findById(classid).addItem(Test.findById(itemid));
//    }
}
