package entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "lobby", schema = "public", catalog = "postgres")
public class LobbyEntity {
    private int lobbyId;
    private Date creationDate;
    private String lobbyName;
    private int maxPlayers;
    private String lobbyDesc;

    @Basic
    @Column(name = "lobby_desc", nullable = false)
    public String getLobbyDesc() {
        return lobbyDesc;
    }

    public void setLobbyDesc(String lobbyDesc) {
        this.lobbyDesc = lobbyDesc;
    }

    @Id @GeneratedValue
    @Column(name = "lobby_id", nullable = false)
    public int getLobbyId() {
        return lobbyId;
    }

    public void setLobbyId(int lobbyId) {
        this.lobbyId = lobbyId;
    }

    @Basic @CreationTimestamp
    @Column(name = "creation_date", nullable = false)
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "lobby_name", nullable = false)
    public String getLobbyName() {
        return lobbyName;
    }

    public void setLobbyName(String lobbyName) {
        this.lobbyName = lobbyName;
    }

    @Basic
    @Column(name = "max_players", nullable = false)
    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LobbyEntity that = (LobbyEntity) o;

        if (lobbyId != that.lobbyId) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lobbyId;
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }
}
