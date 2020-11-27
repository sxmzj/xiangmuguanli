package demo;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.testng.annotations.Test;

import java.util.Properties;
@Test
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
            mimeMessage.setSubject("主题：黑客笔记");
            mimeMessage.setText("正文：我是ailx10，我喜欢2进制安全和渗透技术");
            Transport.send(mimeMessage);
            System.out.println("发送邮件成功");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
