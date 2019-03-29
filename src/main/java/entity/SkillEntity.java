package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "skill", schema = "public", catalog = "postgres")
public class SkillEntity {
    private int idSkill;
    private String skillname;
    private String skillmainstat;

    @Id
    @Column(name = "id_skill", nullable = false)
    @GeneratedValue
    public int getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(int idSkill) {
        this.idSkill = idSkill;
    }

    @Basic
    @Column(name = "skillname", nullable = true, length = -1)
    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    @Basic
    @Column(name = "skillmainstat", nullable = false)
    public String getSkillmainstat() {
        return skillmainstat;
    }

    public void setSkillmainstat(String skillmainstat) {
        this.skillmainstat = skillmainstat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillEntity that = (SkillEntity) o;
        return idSkill == that.idSkill &&
                Objects.equals(skillname, that.skillname) &&
                Objects.equals(skillmainstat, that.skillmainstat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSkill, skillname, skillmainstat);
    }
}
