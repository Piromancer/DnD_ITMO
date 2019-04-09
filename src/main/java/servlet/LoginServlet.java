package servlet;

import DAO.UsersDAO;

import java.io.*;
import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Inject
    UsersDAO udao;

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException{
        String login = request.getParameter("login");
        String pass = request.getParameter("password");
        try {
            if (udao.findByName(login) != null && udao.findByName(login).getUserpass().equals(pass))
                response.sendRedirect("home.jsp");
            else response.getWriter().append("Wrong password or username");
        } catch(Exception e) {
            request.setAttribute("error", "err");
            try {
                request.getRequestDispatcher("auto.jsp").forward(request, response);
            } catch(Exception ex){e.printStackTrace();}
        }
    }
}