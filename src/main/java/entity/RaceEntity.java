package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "race",/*, schema = "s243847", catalog = "studs"*/schema = "public", catalog = "postgres")
public class RaceEntity {
    private int idRace;
    private String racename;
    private String racedesc;
    private String raceimg;
    private CharacterEntity characterByRacename;

    @Id
    @Column(name = "id_race", nullable = false)
    @GeneratedValue
    public int getIdRace() {
        return idRace;
    }

    public void setIdRace(int idRace) {
        this.idRace = idRace;
    }

    @Basic
    @Column(name = "racename", nullable = true, length = -1)
    public String getRacename() {
        return racename;
    }

    public void setRacename(String racename) {
        this.racename = racename;
    }

    @Basic
    @Column(name = "racedesc", nullable = true, length = -1)
    public String getRacedesc() {
        return racedesc;
    }

    public void setRacedesc(String racedesc) {
        this.racedesc = racedesc;
    }

    @Basic
    @Column(name = "raceimg", nullable = true, length = -1)
    public String getRaceimg() {
        return raceimg;
    }

    public void setRaceimg(String raceimg) {
        this.raceimg = raceimg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceEntity that = (RaceEntity) o;
        return idRace == that.idRace &&
                Objects.equals(racename, that.racename) &&
                Objects.equals(racedesc, that.racedesc) &&
                Objects.equals(raceimg, that.raceimg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRace, racename, racedesc, raceimg);
    }

//    @ManyToOne
//    @JoinColumn(name = "racename", referencedColumnName = "characterrace")
//    public CharacterEntity getCharacterByRacename() {
//        return characterByRacename;
//    }
//
//    public void setCharacterByRacename(CharacterEntity characterByRacename) {
//        this.characterByRacename = characterByRacename;
//    }
}
