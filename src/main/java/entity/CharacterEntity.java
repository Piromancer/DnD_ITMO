package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "character", schema = "public", catalog = "postgres")
public class CharacterEntity {
    private int idCharacter;
    private Date charactercreationdate;
    private String charactername;
    private int characterstr;
    private int characterdex;
    private int charactercon;
    private int characterint;
    private int characterwis;
    private int charactercha;
    private int charecterlevel;
    private boolean characternpc;

    @Basic
    @Column(name = "characteruser", nullable = false)
    public int getCharacteruser() {
        return characteruser;
    }

    public void setCharacteruser(int characteruser) {
        this.characteruser = characteruser;
    }

    private int characteruser;

    @Id
    @GeneratedValue
    @Column(name = "id_character", nullable = false)
    public int getIdCharacter() {
        return idCharacter;
    }

    public void setIdCharacter(int idCharacter) {
        this.idCharacter = idCharacter;
    }

    @Basic
    @Column(name = "charactercreationdate", nullable = false)
    public Date getCharactercreationdate() {
        return charactercreationdate;
    }

    public void setCharactercreationdate(Date charactercreationdate) {
        this.charactercreationdate = charactercreationdate;
    }

    @Basic
    @Column(name = "charactername", nullable = false, length = -1)
    public String getCharactername() {
        return charactername;
    }

    public void setCharactername(String charactername) {
        this.charactername = charactername;
    }

    @Basic
    @Column(name = "characterstr", nullable = false)
    public int getCharacterstr() {
        return characterstr;
    }

    public void setCharacterstr(int characterstr) {
        this.characterstr = characterstr;
    }

    @Basic
    @Column(name = "characterdex", nullable = false)
    public int getCharacterdex() {
        return characterdex;
    }

    public void setCharacterdex(int characterdex) {
        this.characterdex = characterdex;
    }

    @Basic
    @Column(name = "charactercon", nullable = false)
    public int getCharactercon() {
        return charactercon;
    }

    public void setCharactercon(int charactercon) {
        this.charactercon = charactercon;
    }

    @Basic
    @Column(name = "characterint", nullable = false)
    public int getCharacterint() {
        return characterint;
    }

    public void setCharacterint(int characterint) {
        this.characterint = characterint;
    }

    @Basic
    @Column(name = "characterwis", nullable = false)
    public int getCharacterwis() {
        return characterwis;
    }

    public void setCharacterwis(int characterwis) {
        this.characterwis = characterwis;
    }

    @Basic
    @Column(name = "charactercha", nullable = false)
    public int getCharactercha() {
        return charactercha;
    }

    public void setCharactercha(int charactercha) {
        this.charactercha = charactercha;
    }

    @Basic
    @Column(name = "charecterlevel", nullable = false)
    public int getCharecterlevel() {
        return charecterlevel;
    }

    public void setCharecterlevel(int charecterlevel) {
        this.charecterlevel = charecterlevel;
    }

    @Basic
    @Column(name = "characternpc", nullable = false)
    public boolean isCharacternpc() {
        return characternpc;
    }

    public void setCharacternpc(boolean characternpc) {
        this.characternpc = characternpc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterEntity that = (CharacterEntity) o;
        return idCharacter == that.idCharacter &&
                characterstr == that.characterstr &&
                characterdex == that.characterdex &&
                charactercon == that.charactercon &&
                characterint == that.characterint &&
                characterwis == that.characterwis &&
                charactercha == that.charactercha &&
                charecterlevel == that.charecterlevel &&
                characternpc == that.characternpc &&
                Objects.equals(charactercreationdate, that.charactercreationdate) &&
                Objects.equals(charactername, that.charactername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCharacter, charactercreationdate, charactername, characterstr, characterdex, charactercon, characterint, characterwis, charactercha, charecterlevel, characternpc);
    }
}
