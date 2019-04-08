package utils;

import entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(RaceEntity.class);
                configuration.addAnnotatedClass(CharacterEntity.class);
                configuration.addAnnotatedClass(ClazzEntity.class);
//                configuration.addAnnotatedClass(EffectEntity.class);
//                configuration.addAnnotatedClass(FeatureEntity.class);
                configuration.addAnnotatedClass(ItemEntity.class);
                configuration.addAnnotatedClass(LandscapeEntity.class);
//                configuration.addAnnotatedClass(LandscapeElementEntity.class);
                configuration.addAnnotatedClass(MagicEntity.class);
//                configuration.addAnnotatedClass(MonsterEntity.class);
//                configuration.addAnnotatedClass(RacetypeEntity.class);
//                configuration.addAnnotatedClass(SkillEntity.class);
                configuration.addAnnotatedClass(UsersEntity.class);
                configuration.addAnnotatedClass(LobbyEntity.class);
//                configuration.addAnnotatedClass(WeaponEntity.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Exception " + e);
            }
        }
        return sessionFactory;
    }
}