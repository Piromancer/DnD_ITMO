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
        udao.addUser(login, pass, mail);
        response.sendRedirect(request.getContextPath());
    }
}