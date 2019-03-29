package entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users", schema = "public", catalog = "postgres")
public class UsersEntity {
    private int idUsers;
    private String username;
    private String userpass;
    private String useremail;
    private Date userregdata;

    @Id
    @Column(name = "id_users", nullable = false)
    @GeneratedValue
    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    @Basic
    @Column(name = "username", nullable = true, length = -1)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "userpass", nullable = false, length = -1)
    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    @Basic
    @Column(name = "useremail", nullable = false, length = -1)
    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    @Basic
    @Column(name = "userregdata", nullable = false)
    @CreationTimestamp
    public Date getUserregdata() {
        return userregdata;
    }

    public void setUserregdata(Date userregdata) {
        this.userregdata = userregdata;
    }

    @OneToMany
    Set<LandscapeEntity> projects = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return idUsers == that.idUsers &&
                Objects.equals(username, that.username) &&
                Objects.equals(userpass, that.userpass) &&
                Objects.equals(useremail, that.useremail) &&
                Objects.equals(userregdata, that.userregdata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsers, username, userpass, useremail, userregdata);
    }
}
