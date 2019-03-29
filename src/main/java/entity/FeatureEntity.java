package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "feature", schema = "public", catalog = "postgres")
public class FeatureEntity {
    private int idFeature;
    private String featurename;
    private String featuredesc;
    private String featurerequirement;

    @Id
    @Column(name = "id_feature", nullable = false)
    @GeneratedValue
    public int getIdFeature() {
        return idFeature;
    }

    public void setIdFeature(int idFeature) {
        this.idFeature = idFeature;
    }

    @Basic
    @Column(name = "featurename", nullable = true, length = -1)
    public String getFeaturename() {
        return featurename;
    }

    public void setFeaturename(String featurename) {
        this.featurename = featurename;
    }

    @Basic
    @Column(name = "featuredesc", nullable = true, length = -1)
    public String getFeaturedesc() {
        return featuredesc;
    }

    public void setFeaturedesc(String featuredesc) {
        this.featuredesc = featuredesc;
    }

    @Basic
    @Column(name = "featurerequirement", nullable = true, length = -1)
    public String getFeaturerequirement() {
        return featurerequirement;
    }

    public void setFeaturerequirement(String featurerequirement) {
        this.featurerequirement = featurerequirement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeatureEntity that = (FeatureEntity) o;
        return idFeature == that.idFeature &&
                Objects.equals(featurename, that.featurename) &&
                Objects.equals(featuredesc, that.featuredesc) &&
                Objects.equals(featurerequirement, that.featurerequirement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFeature, featurename, featuredesc, featurerequirement);
    }
}
