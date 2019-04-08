package EJB;

import utils.SmtpAuthenticator;

import javax.annotation.Resource;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;

@Named
@ViewScoped
@ManagedBean
public class Mail implements Serializable {
    @Resource(lookup = "EMailME")
    private Session mailSession;


    private final String host = "smtp.gmail.com";
    private final String user = "DnDTechService@gmail.com";
    private final String pass = "dnd1scool";
    private final String from = "DnDTechService@gmail.com";
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
//                props.put("mail.smtp.password","dnd1scool");
//                mailSession = Session.getDefaultInstance(props,new SmtpAuthenticator());
//                mailSession.setDebug(debug);
//            }

            System.out.println("Send started");
            Message msg = new MimeMessage(mailSession);
            msg.setSubject(subject);
            msg.setText(message);
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            Transport.send(msg);
            System.out.println("Send finished");
//            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
//            MimeMessage msg = new MimeMessage(mailSession);
//            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
//            msg.addHeader("format", "flowed");
//            msg.addHeader("Content-Transfer-Encoding", "8bit");
//            msg.setFrom(new InternetAddress(from));
//            msg.setReplyTo(InternetAddress.parse(from, false));
//            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to,false));
//            msg.setSubject(subject, "UTF-8");
//            msg.setSentDate(new Date());
//            msg.setText(message,"UTF-8");
//            Transport.send(msg);
//            System.out.println("Message sent");

//            Transport transport = mailSession.getTransport("smtp");
//            transport.connect(host, user, pass);
//            transport.sendMessage(msg, msg.getAllRecipients());
//            transport.close();

        } catch(Exception e){e.printStackTrace();}
    }
}
