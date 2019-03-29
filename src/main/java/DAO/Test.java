package DAO;

import entity.ClazzEntity;
import entity.ItemEntity;
import entity.RaceEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;

@Stateless
public class Test {

//    @PersistenceContext(unitName="NewPersistenceUnit")
//    private EntityManager entityManager;
    public static ItemEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        ItemEntity ie = session.find(ItemEntity.class, id);
        session.close();
        return ie;
    }

    public boolean addRace(String racename, String racedesc){
        RaceEntity raceEntity = new RaceEntity();
        raceEntity.setRacedesc(racedesc);
        raceEntity.setRacename(racename);
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(raceEntity);
        tx1.commit();
        session.close();
        return true;
    }

    public void addItem(String itemname, String itemprice, String itemdesc, String itemimg) {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setItemname(itemname);
        itemEntity.setItemprice(Integer.parseInt(itemprice));
        itemEntity.setItemdesc(itemdesc);
        itemEntity.setItemimg(itemimg);
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(itemEntity);
        tx1.commit();
        session.close();
    }

    public void updateItem(int itemid, String itemname, String itemprice, String itemdesc, String itemimg) {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setIdItem(itemid);
        itemEntity.setItemname(itemname);
        itemEntity.setItemprice(Integer.parseInt(itemprice));
        itemEntity.setItemdesc(itemdesc);
        itemEntity.setItemimg(itemimg);
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(itemEntity);
        tx1.commit();
        session.close();
    }

    public void removeItem(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.remove(session.find(ItemEntity.class, id));
        tx1.commit();
        session.close();
    }

    public static void addAssociatedClass(ClazzEntity ce, int itemid){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Transaction tx1 = session.beginTransaction();

        ItemEntity ie = Test.findById(itemid);
        ie.getClasses().add(ce);

        session.saveOrUpdate(ie);

        tx1.commit();
    }
}
