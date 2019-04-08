package servlet;

import DAO.UsersDAO;

import java.io.*;
import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/registration")
public class RegistrationServlet extends HttpServlet {
    @Inject
    UsersDAO udao;

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException{
        String login = request.getParameter("login");
        String pass = request.getParameter("password");
        String mail = request.getParameter("email");
        try {
            udao.addUser(login, pass, mail);
            response.sendRedirect(request.getContextPath());
        } catch(Exception e){
            request.setAttribute("message", "Username unavailable");
            try {
                request.getRequestDispatcher("reg.jsp").forward(request, response);
            } catch (Exception ex){}
            response.sendRedirect(request.getContextPath()+"/reg.jsp");
        }
    }
}