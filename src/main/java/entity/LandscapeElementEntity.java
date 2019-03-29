package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "landscape_element", schema = "public", catalog = "postgres")
public class LandscapeElementEntity {
    private int idLandscapeElement;
    private int lanElCoordX;
    private int lanElCoordY;
    private boolean lanElPassable;

    @Basic
    @Column(name = "lan_id", nullable = false)
    public int getLanid() {
        return lanid;
    }

    public void setLanid(int lanid) {
        this.lanid = lanid;
    }

    private int lanid;

    @Basic
    @Column(name = "lan_el_coor_x", nullable = false)
    public int getLanElCoordX() {
        return lanElCoordX;
    }

    public void setLanElCoordX(int lanElCoordX) {
        this.lanElCoordX = lanElCoordX;
    }

    @Basic
    @Column(name = "lan_el_coor_y", nullable = false)
    public int getLanElCoordY() {
        return lanElCoordY;
    }

    public void setLanElCoordY(int lanElCoordY) {
        this.lanElCoordY = lanElCoordY;
    }

    @Id
    @Column(name = "id_landscape_element", nullable = false)
    @GeneratedValue
    public int getIdLandscapeElement() {
        return idLandscapeElement;
    }

    public void setIdLandscapeElement(int idLandscapeElement) {
        this.idLandscapeElement = idLandscapeElement;
    }

    @Basic
    @Column(name = "lan_el_passable", nullable = false)
    public boolean isLanElPassable() {
        return lanElPassable;
    }

    public void setLanElPassable(boolean lanElPassable) {
        this.lanElPassable = lanElPassable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LandscapeElementEntity that = (LandscapeElementEntity) o;
        return idLandscapeElement == that.idLandscapeElement &&
                lanElPassable == that.lanElPassable &&
                Objects.equals(lanElCoordX, that.lanElCoordX) &&
                Objects.equals(lanElCoordY, that.lanElCoordY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLandscapeElement, lanElCoordX, lanElCoordY, lanElPassable);
    }
}
