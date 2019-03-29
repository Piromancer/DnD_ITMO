package entity;

import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "class", schema = "public", catalog = "postgres")
public class ClazzEntity {
    private int idClass;
    private String classname;
    private String classdesc;
    private String classimg;

    @Id
    @Column(name = "id_class", nullable = false)
    @GeneratedValue
    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    @Basic
    @Column(name = "classname", nullable = true, length = -1)
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Basic
    @Column(name = "classdesc", nullable = true, length = -1)
    public String getClassdesc() {
        return classdesc;
    }

    public void setClassdesc(String classdesc) {
        this.classdesc = classdesc;
    }

    @Basic
    @Column(name = "classimg", nullable = true, length = -1)
    public String getClassimg() {
        return classimg;
    }

    public void setClassimg(String classimg) {
        this.classimg = classimg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClazzEntity that = (ClazzEntity) o;
        return idClass == that.idClass &&
                Objects.equals(classname, that.classname) &&
                Objects.equals(classdesc, that.classdesc) &&
                Objects.equals(classimg, that.classimg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClass, classname, classdesc, classimg);
    }

    private Set<ItemEntity> items = new HashSet<>();
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "class_item",
            joinColumns = @JoinColumn(name = "id_class"),
            inverseJoinColumns = @JoinColumn(name = "id_item"))
    public Set<ItemEntity> getItems() {
        return items;
    }

    public void setItems(Set<ItemEntity> employeeSet) {
        this.items = employeeSet;
    }

//    public void addItem(ItemEntity ie){
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        session.getTransaction().commit();
//    }
//
//    public void removeItem(ItemEntity ie){
//        items.remove(ie);
//        ie.getClasses().remove(this);
//    }
//
//    public Set<ItemEntity> getItems() {
//        return items;
//    }
//
//    public void setItems(Set<ItemEntity> items) {
//        this.items = items;
//    }
//
//    @ManyToMany(cascade = { CascadeType.ALL })
//    @JoinTable(
//            name = "class_item",
//            joinColumns = { @JoinColumn(name = "id_class")},
//            inverseJoinColumns = { @JoinColumn(name = "id_item")}
//    )
//    Set<ItemEntity> items = new HashSet<>();

}
