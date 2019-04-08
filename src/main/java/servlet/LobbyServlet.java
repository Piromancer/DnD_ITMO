package servlet;

import DAO.LobbyDAO;
import DAO.UsersDAO;
import entity.LobbyEntity;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/lobby")
public class LobbyServlet extends HttpServlet {
    @Inject
    LobbyDAO ldao;

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException{
        ldao.addLobby(request.getParameter("name"), Integer.parseInt(request.getParameter("personCount")));
        response.sendRedirect("game.jsp");
    }
}
