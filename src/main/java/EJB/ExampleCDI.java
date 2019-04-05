package EJB;

import DAO.*;
import entity.*;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ExampleCDI implements Serializable{
    @Inject
    private Mail mail;

    public void sendEMail(){mail.sendMail();}

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemprice() {
        return itemprice;
    }

    public void setItemprice(String itemprice) {
        this.itemprice = itemprice;
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc;
    }

    private String itemname;
    private String itemprice;
    private String itemdesc;

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    private String itemid;

    public String getItemimg() {
        return itemimg;
    }

    public void setItemimg(String itemimg) {
        this.itemimg = itemimg;
    }

    private String itemimg;

    private boolean loginSuccess;
    private boolean createSuccess;

    @EJB
    private Test test;

    public void createItem(){
        test.addItem(itemname,itemprice,itemdesc,itemimg);
    }

    public void removeItem(){try {test.removeItem(Integer.parseInt(itemid));} catch(Exception e){}}

    public void updateItem(){test.updateItem(Integer.parseInt(itemid), itemname,itemprice,itemdesc,itemimg);}

    public void createRace(){
        createSuccess = test.addRace("Gnome","Little annoying creatures");
    }

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

    public int getSkillid() {
        return skillid;
    }

    public void setSkillid(int skillid) {
        this.skillid = skillid;
    }

    public String getMainstat() {
        return mainstat;
    }

    public void setMainstat(String mainstat) {
        this.mainstat = mainstat;
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    @EJB
    SkillDAO skillDAO;

    private int skillid;
    private String mainstat;
    private String skillname;

    public void addSkill(){skillDAO.addSkill(mainstat,skillname);}

    public void updateSkill(){
        SkillEntity se = new SkillEntity();
        se.setSkillname(skillname);
        se.setSkillmainstat(mainstat);
        skillDAO.updateSkill(se,skillid);
    }

    public void removeSkill(){skillDAO.removeSkill(skillid);}

    @EJB
    LandscapeDAO landscapeDAO;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLdesc() {
        return ldesc;
    }

    public void setLdesc(String ldesc) {
        this.ldesc = ldesc;
    }

    public String getLimg() {
        return limg;
    }

    public void setLimg(String limg) {
        this.limg = limg;
    }

    private int lid;
    private String lname;
    private String ldesc;
    private String limg;

    public void addLandscape(){landscapeDAO.addLandscape(lname, ldesc, limg);}

    public void updateLandscape(){
        LandscapeEntity le = new LandscapeEntity();
        le.setLandscapeimg(limg);
        le.setLandscapename(lname);
        le.setLandscapedesc(ldesc);
        landscapeDAO.updateLandscape(le,lid);
    }

    public void removeLandscape(){landscapeDAO.removeLandscape(lid);}

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getClassdesc() {
        return classdesc;
    }

    public void setClassdesc(String classdesc) {
        this.classdesc = classdesc;
    }

    public String getClassimg() {
        return classimg;
    }

    public void setClassimg(String classimg) {
        this.classimg = classimg;
    }

    @EJB
    ClassDAO classDAO;

    private int classid;
    private String classname;
    private String classdesc;
    private String classimg;

    public void addClass(){classDAO.addClass(classname, classdesc, classimg);}

    public void addClassItem(){
        ClazzEntity ce = new ClazzEntity();
        ce.setClassname(classname);
        ce.setClassdesc(classdesc);
        ce.setClassimg(classimg);
        Test.addAssociatedClass(ce, Integer.parseInt(itemid));
    }


    public int getIdFound() {
        return idFound;
    }

    public void setIdFound(int idFound) {
        this.idFound = idFound;
    }

    private int idFound;
    public void findUserByName(){
        idFound = usersDAO.findByName(username).getIdUsers();
    }


}