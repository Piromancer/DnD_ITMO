package EJB;

import DAO.UsersDAO;
import entity.UsersEntity;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.List;

@Named
@SessionScoped
public class Othertest implements java.io.Serializable {
    @EJB
    private UsersDAO usersDAO;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    private int userid;
    private String username;
    private String userpass;
    private String usermail;

    public void addUser(){usersDAO.addUser(username,userpass,usermail);}

    public void updateUser(){
        UsersEntity ue = new UsersEntity();
        ue.setUsername(username);
        ue.setUserpass(userpass);
        ue.setUseremail(usermail);

        usersDAO.updateUser(ue, userid);
    }

    public void removeUser(){usersDAO.removeUser(userid);}

    public List<UsersEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UsersEntity> users) {
        this.users = users;
    }

    private List<UsersEntity> users;

    public void diplayUsers(){users = usersDAO.findAll();}
}
