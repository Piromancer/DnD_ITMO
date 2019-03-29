package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "monster", schema = "public", catalog = "postgres")
public class MonsterEntity {
    private int idMonster;
    private String monstername;
    private String monsterdesc;
    private Integer monsterstr;
    private Integer monsterdex;
    private Integer monsterwis;
    private Integer monsterint;
    private Integer monstercon;
    private Integer monstercha;
    private Integer monsterac;
    private Integer monsterstep;
    private Integer monstermoneyloot;

    @Id
    @Column(name = "id_monster", nullable = false)
    public int getIdMonster() {
        return idMonster;
    }

    public void setIdMonster(int idMonster) {
        this.idMonster = idMonster;
    }

    @Basic
    @Column(name = "monstername", nullable = false, length = -1)
    public String getMonstername() {
        return monstername;
    }

    public void setMonstername(String monstername) {
        this.monstername = monstername;
    }

    @Basic
    @Column(name = "monsterdesc", nullable = true, length = -1)
    public String getMonsterdesc() {
        return monsterdesc;
    }

    public void setMonsterdesc(String monsterdesc) {
        this.monsterdesc = monsterdesc;
    }

    @Basic
    @Column(name = "monsterstr", nullable = true)
    public Integer getMonsterstr() {
        return monsterstr;
    }

    public void setMonsterstr(Integer monsterstr) {
        this.monsterstr = monsterstr;
    }

    @Basic
    @Column(name = "monsterdex", nullable = true)
    public Integer getMonsterdex() {
        return monsterdex;
    }

    public void setMonsterdex(Integer monsterdex) {
        this.monsterdex = monsterdex;
    }

    @Basic
    @Column(name = "monsterwis", nullable = true)
    public Integer getMonsterwis() {
        return monsterwis;
    }

    public void setMonsterwis(Integer monsterwis) {
        this.monsterwis = monsterwis;
    }

    @Basic
    @Column(name = "monsterint", nullable = true)
    public Integer getMonsterint() {
        return monsterint;
    }

    public void setMonsterint(Integer monsterint) {
        this.monsterint = monsterint;
    }

    @Basic
    @Column(name = "monstercon", nullable = true)
    public Integer getMonstercon() {
        return monstercon;
    }

    public void setMonstercon(Integer monstercon) {
        this.monstercon = monstercon;
    }

    @Basic
    @Column(name = "monstercha", nullable = true)
    public Integer getMonstercha() {
        return monstercha;
    }

    public void setMonstercha(Integer monstercha) {
        this.monstercha = monstercha;
    }

    @Basic
    @Column(name = "monsterac", nullable = true)
    public Integer getMonsterac() {
        return monsterac;
    }

    public void setMonsterac(Integer monsterac) {
        this.monsterac = monsterac;
    }

    @Basic
    @Column(name = "monsterstep", nullable = true)
    public Integer getMonsterstep() {
        return monsterstep;
    }

    public void setMonsterstep(Integer monsterstep) {
        this.monsterstep = monsterstep;
    }

    @Basic
    @Column(name = "monstermoneyloot", nullable = true)
    public Integer getMonstermoneyloot() {
        return monstermoneyloot;
    }

    public void setMonstermoneyloot(Integer monstermoneyloot) {
        this.monstermoneyloot = monstermoneyloot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonsterEntity that = (MonsterEntity) o;
        return idMonster == that.idMonster &&
                Objects.equals(monstername, that.monstername) &&
                Objects.equals(monsterdesc, that.monsterdesc) &&
                Objects.equals(monsterstr, that.monsterstr) &&
                Objects.equals(monsterdex, that.monsterdex) &&
                Objects.equals(monsterwis, that.monsterwis) &&
                Objects.equals(monsterint, that.monsterint) &&
                Objects.equals(monstercon, that.monstercon) &&
                Objects.equals(monstercha, that.monstercha) &&
                Objects.equals(monsterac, that.monsterac) &&
                Objects.equals(monsterstep, that.monsterstep) &&
                Objects.equals(monstermoneyloot, that.monstermoneyloot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMonster, monstername, monsterdesc, monsterstr, monsterdex, monsterwis, monsterint, monstercon, monstercha, monsterac, monsterstep, monstermoneyloot);
    }
}
