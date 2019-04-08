package servlet;

import DAO.LandscapeDAO;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/landscape_creation")
public class LandscapeServlet extends HttpServlet {

    @Inject
    LandscapeDAO ldao;

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException{
        ldao.addLandscape(request.getParameter("lname"), request.getParameter("ldesc"), request.getParameter("limg"));
        response.sendRedirect("home.jsp");
    }
}
