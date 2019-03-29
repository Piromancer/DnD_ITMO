package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "landscape", schema = "public", catalog = "postgres")
public class LandscapeEntity {
    private int idLandscape;
    private String landscapename;
    private String landscapedesc;
    private String landscapeimg;

    @Id
    @Column(name = "id_landscape", nullable = false)
    @GeneratedValue
    public int getIdLandscape() {
        return idLandscape;
    }

    public void setIdLandscape(int idLandscape) {
        this.idLandscape = idLandscape;
    }

    @Basic
    @Column(name = "landscapename", nullable = false, length = -1)
    public String getLandscapename() {
        return landscapename;
    }

    public void setLandscapename(String landscapename) {
        this.landscapename = landscapename;
    }

    @Basic
    @Column(name = "landscapedesc", nullable = true, length = -1)
    public String getLandscapedesc() {
        return landscapedesc;
    }

    public void setLandscapedesc(String landscapedesc) {
        this.landscapedesc = landscapedesc;
    }

    @Basic
    @Column(name = "landscapeimg", nullable = false, length = -1)
    public String getLandscapeimg() {
        return landscapeimg;
    }

    public void setLandscapeimg(String landscapeimg) {
        this.landscapeimg = landscapeimg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LandscapeEntity that = (LandscapeEntity) o;
        return idLandscape == that.idLandscape &&
                Objects.equals(landscapename, that.landscapename) &&
                Objects.equals(landscapedesc, that.landscapedesc) &&
                Objects.equals(landscapeimg, that.landscapeimg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLandscape, landscapename, landscapedesc, landscapeimg);
    }
}
