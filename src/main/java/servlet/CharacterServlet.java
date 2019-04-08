package servlet;

import DAO.CharacterDAO;
import entity.CharacterEntity;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/character_creation")
public class CharacterServlet extends HttpServlet {
    @Inject
    CharacterDAO cdao;


    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException{
        HttpSession hs = request.getSession();
        String name = request.getParameter("name");
        String race = request.getParameter("race");
        String str = request.getParameter("str");
        String dex = request.getParameter("dex");
        String con = request.getParameter("con");
        String wis = request.getParameter("wis");
        String cha = request.getParameter("cha");
        String inteligence = request.getParameter("int");
        String npc = request.getParameter("npc");
        String sex = request.getParameter("sex");


        CharacterEntity ce = new CharacterEntity();
        ce.setCharactername(name);
        ce.setCharactercha(Integer.parseInt(cha));
        ce.setCharactercon(Integer.parseInt(con));
        ce.setCharacterstr(Integer.parseInt(str));
        ce.setCharacterdex(Integer.parseInt(dex));
        ce.setCharacterwis(Integer.parseInt(wis));
        ce.setCharacterint(Integer.parseInt(inteligence));
        ce.setCharacternpc(Boolean.parseBoolean(npc));
        ce.setCharacterrace(race);
        ce.setCharactersex(sex);
        ce.setCharacteruser(32);

        cdao.addCharacter(ce);
        response.sendRedirect(request.getContextPath()+"/home.jsp");
    }
}
