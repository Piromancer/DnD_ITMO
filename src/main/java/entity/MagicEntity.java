package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "magic", schema = "public", catalog = "postgres")
public class MagicEntity {
    private int idMagic;
    private String magicname;
    private String magicdesc;
    private String magiccomponents;

    @Id
    @Column(name = "id_magic", nullable = false)
    @GeneratedValue
    public int getIdMagic() {
        return idMagic;
    }

    public void setIdMagic(int idMagic) {
        this.idMagic = idMagic;
    }

    @Basic
    @Column(name = "magicname", nullable = false, length = -1)
    public String getMagicname() {
        return magicname;
    }

    public void setMagicname(String magicname) {
        this.magicname = magicname;
    }

    @Basic
    @Column(name = "magicdesc", nullable = true, length = -1)
    public String getMagicdesc() {
        return magicdesc;
    }

    public void setMagicdesc(String magicdesc) {
        this.magicdesc = magicdesc;
    }

    @Basic
    @Column(name = "magiccomponents", nullable = true, length = -1)
    public String getMagiccomponents() {
        return magiccomponents;
    }

    public void setMagiccomponents(String magiccomponents) {
        this.magiccomponents = magiccomponents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagicEntity that = (MagicEntity) o;
        return idMagic == that.idMagic &&
                Objects.equals(magicname, that.magicname) &&
                Objects.equals(magicdesc, that.magicdesc) &&
                Objects.equals(magiccomponents, that.magiccomponents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMagic, magicname, magicdesc, magiccomponents);
    }
}
