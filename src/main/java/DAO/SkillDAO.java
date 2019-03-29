package DAO;

import entity.SkillEntity;
import entity.UsersEntity;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.ejb.Stateless;
import java.util.List;


@Stateless
public class SkillDAO extends DAO<SkillEntity> {
    public List<SkillEntity> findAll() {
        List<SkillEntity> skills = (List<SkillEntity>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from SkillEntity").list();
        return skills;
    }

    public SkillEntity findById(int id){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        return session.find(SkillEntity.class, id);
    }

    public void addSkill(String mainstat, String skillname){
        SkillEntity se = new SkillEntity();
        se.setSkillmainstat(mainstat);
        se.setSkillname(skillname);
        save(se);
    }

    public void updateSkill(SkillEntity skill, int id){
        skill.setIdSkill(id);
        update(skill);
    }

    public void removeSkill(int id){
        delete(findById(id));
    }
}
