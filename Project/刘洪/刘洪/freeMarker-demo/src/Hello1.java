

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Hello1 {
    public static void main(String[] args) {
    	String to = "3334693467@qq.com";
        String from = "2906938728@qq.com";
        String host = "smtp.qq.com";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host",host);
        properties.put("mail.smtp.auth","true");


        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication("2@qq.com","bksioiahxdhkddec");
            }
        });

        try {
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(from));
            mimeMessage.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            mimeMessage.setSubject("刘洪 2017011711");
//          mimeMessage.setContent("<img src=\"http://hackbiji.top/images/avatar.jpg\" width=\"50\" height=\"50\" />","text/html");
            mimeMessage.setContent("<img src=\"F:/JAVA/workspace/freeMarker-demo/test-output/01.png\" width=\"50\" height=\"50\" />","text/html");
            Transport.send(mimeMessage);
            System.out.println("发送邮件成功");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
