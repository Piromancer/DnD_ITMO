package EJB;

import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import javax.ejb.Stateless;
import java.util.Properties;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.ejb.Timeout;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;


@Named
@RequestScoped
public class Mail {
    @Resource(lookup = "EMailME")
    private Session mailSession;


    private final String host = "smtp.yandex.ru";
    private final String user = "DnDTechService";
    private final String pass = "dnd1scool";
    private final String from = "DnDTechService@yandex.ru";
    private final String subject = "DnD welcomes you!";
    private final String message = "Welcome to our service";
    private final boolean debug  = false;

    public void sendMail() {
        try {
            String to = "Den2000_09@mail.ru";
//            if(mailSession==null) {
//                Properties props = System.getProperties();
//                props.put("mail.smtp.starttls.enable", "true");
//                props.put("mail.smtp.host", host);
//                props.put("mail.smtp.port", "587");
//                props.put("mail.smtp.auth", "true");
//                props.put("mail.smtp.starttls.required", "true");
//                mailSession = Session.getDefaultInstance(props, null);
//                mailSession.setDebug(debug);
//            }
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            MimeMessage msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(mailSession.getProperty("mail.from")));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(message);
            Transport.send(msg);
//            Transport transport = mailSession.getTransport("smtp");
//            transport.connect(host, user, pass);
//            transport.sendMessage(msg, msg.getAllRecipients());
//            transport.close();

        } catch(Exception e){e.printStackTrace();}
    }
}
