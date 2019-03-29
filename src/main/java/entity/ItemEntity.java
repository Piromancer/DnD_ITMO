package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "item", schema = "public", catalog = "postgres")
public class ItemEntity {
    private int idItem;
    private String itemname;
    private Integer itemprice;
    private String itemdesc;
    private String itemimg;

    @Id
    @Column(name = "id_item", nullable = false)
    @GeneratedValue
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    @Basic
    @Column(name = "itemname", nullable = true, length = -1)
    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    @Basic
    @Column(name = "itemprice", nullable = true)
    public Integer getItemprice() {
        return itemprice;
    }

    public void setItemprice(Integer itemprice) {
        this.itemprice = itemprice;
    }

    @Basic
    @Column(name = "itemdesc", nullable = true, length = -1)
    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc;
    }

    @Basic
    @Column(name = "itemimg", nullable = true, length = -1)
    public String getItemimg() {
        return itemimg;
    }

    public void setItemimg(String itemimg) {
        this.itemimg = itemimg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemEntity that = (ItemEntity) o;
        return idItem == that.idItem &&
                Objects.equals(itemname, that.itemname) &&
                Objects.equals(itemprice, that.itemprice) &&
                Objects.equals(itemdesc, that.itemdesc) &&
                Objects.equals(itemimg, that.itemimg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItem, itemname, itemprice, itemdesc, itemimg);
    }

    private Set<ClazzEntity> classes = new HashSet<>();
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "class_item",
            joinColumns = @JoinColumn(name = "id_item"),
            inverseJoinColumns = @JoinColumn(name = "id_class"))
    public Set<ClazzEntity> getClasses() {
        return classes;
    }

    public void setClasses(Set<ClazzEntity> employeeSet) {
        this.classes = employeeSet;
    }

//
//    public Set<ClazzEntity> getClasses() {
//        return classes;
//    }
//
//    public void setClasses(Set<ClazzEntity> classes) {
//        this.classes = classes;
//    }
//
//    @ManyToMany(mappedBy = "class")
//    private Set<ClazzEntity> classes = new HashSet<>();
}
