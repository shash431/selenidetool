package helpers.mailer;

import java.util.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.mail.*;

/**
 * Created by martynov on 18.04.2016.
 */
public class GmailInbox {
    //magoratestsite@gmail.com
    //ibonLishod3


    public static Integer read() {
        Properties props = new Properties();
        Integer messageCount = 0;
        try {

            props.put("mail.smtp.user","magoratestsite@gmail.com");
            props.put("mail.smtp.password","ibonLishod3");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "465");
            props.put("mail.debug", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable","true");
            props.put("mail.smtp.EnableSSL.enable","true");

            props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.setProperty("mail.smtp.socketFactory.fallback", "false");
            props.setProperty("mail.smtp.port", "465");
            props.setProperty("mail.smtp.socketFactory.port", "465");

            Session session = Session.getDefaultInstance(props, null);

            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", "magoratestsite@gmail.com", "ibonLishod3");

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_WRITE);
            messageCount = inbox.getUnreadMessageCount();


            System.out.println("------------------------------");
            System.out.println("Total Messages:- " + messageCount);

            for(Message message : inbox.getMessages()){


                if(inbox.getMessages().length >0) {
                    message.setFlag(Flags.Flag.SEEN, true);
                }
            }

            inbox.close(true);
            store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return messageCount;
    }

}
