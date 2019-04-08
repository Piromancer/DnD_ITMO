package servlet;

import EJB.Mail;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/mail")
public class MailServlet extends HttpServlet {
    @Inject
    Mail mail;

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException{
        mail.sendMail();
        response.sendRedirect(request.getContextPath()+"/home.jsp");
    }
}
