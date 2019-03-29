package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "effect", schema = "public", catalog = "postgres")
public class EffectEntity {
    private int idEffect;
    private String effectname;
    private String effectdesc;
    private Integer effectduration;
    private Object effectcondition;

    @Id
    @Column(name = "id_effect", nullable = false)
    public int getIdEffect() {
        return idEffect;
    }

    public void setIdEffect(int idEffect) {
        this.idEffect = idEffect;
    }

    @Basic
    @Column(name = "effectname", nullable = true, length = -1)
    public String getEffectname() {
        return effectname;
    }

    public void setEffectname(String effectname) {
        this.effectname = effectname;
    }

    @Basic
    @Column(name = "effectdesc", nullable = true, length = -1)
    public String getEffectdesc() {
        return effectdesc;
    }

    public void setEffectdesc(String effectdesc) {
        this.effectdesc = effectdesc;
    }

    @Basic
    @Column(name = "effectduration", nullable = true)
    public Integer getEffectduration() {
        return effectduration;
    }

    public void setEffectduration(Integer effectduration) {
        this.effectduration = effectduration;
    }

    @Basic
    @Column(name = "effectcondition", nullable = true)
    public Object getEffectcondition() {
        return effectcondition;
    }

    public void setEffectcondition(Object effectcondition) {
        this.effectcondition = effectcondition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EffectEntity that = (EffectEntity) o;
        return idEffect == that.idEffect &&
                Objects.equals(effectname, that.effectname) &&
                Objects.equals(effectdesc, that.effectdesc) &&
                Objects.equals(effectduration, that.effectduration) &&
                Objects.equals(effectcondition, that.effectcondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEffect, effectname, effectdesc, effectduration, effectcondition);
    }
}
