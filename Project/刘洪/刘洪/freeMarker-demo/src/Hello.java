
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import java.util.Properties;
public class Hello {
    public static void main(String[] args) {
        String to = "3334693467@qq.com";
        String from = "2906938728@qq.com";
        String host = "smtp.qq.com";
        //String password = "pzokkkvmongccheh";//etkorccftwfbcjbd mldnqpluocpqcijh  feupmzurxoyrdagf
        //
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host",host);
        properties.put("mail.smtp.auth","true");


        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication("2906938728@qq.com","bksioiahxdhkddec" + 
                		"");
            }
        });

        try {
        	MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(from));
            mimeMessage.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            mimeMessage.setSubject("主题：第一次测试");

            MimeBodyPart msgBodyPart = new MimeBodyPart();
            msgBodyPart.setText("F:\\JAVA\\workspace\\freeMarker-demo\\test-output\\index1.html");
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(msgBodyPart);
            msgBodyPart = new MimeBodyPart();
            String filepath = "F:\\JAVA\\workspace\\freeMarker-demo\\test-output\\01.png";
            String filename = "01.png";
            FileDataSource fileDataSource = new FileDataSource(filepath);
            msgBodyPart.setDataHandler(new DataHandler(fileDataSource));
            msgBodyPart.setFileName(filename);
            mimeMultipart.addBodyPart(msgBodyPart);

            mimeMessage.setContent(mimeMultipart);

            Transport.send(mimeMessage);
            System.out.println("发送邮件成功");


        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
