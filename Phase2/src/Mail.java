import java.time.LocalDateTime;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport;

public class Mail
{
    //Instance variables of the class Mail as per the UML diagram
    
    //newSession creates a new session in Java so that the program can access the internet and perform e-mailing functions
   private Session newSession = null;
   //mimeMessage creates the skeleton of an e-mail, which will be populated through parameter parsing and then sent as an email
   private MimeMessage mimeMessage = null;
   
   /**
    * Default constructor of the class Mail, initializes an Object of type Mail
    */
   public Mail()
   {
   }
   
   /**
    * Void Method that combines a completed mimeMessage, connects to the Gmail SMTP using the server properties set up in setupServerProperties(),
    * uses the newSession Session and sends an email
    * @throws NoSuchProviderException
    * @throws MessagingException 
    */
   public void sendEmail() throws NoSuchProviderException, MessagingException
   {
       //The following strings are the login credentials for the email address that this email is being sent from
       String fromUser = "medicalpracticeproject1@gmail.com";
       String fromUserPassword = "jhxrpgmnsmaangpc";
       //this specifies the mail transfer protocol to be used by the session
       String emailHost = "smtp.gmail.com";
       //this is the code to combine all the aspects of the Mail class and send a complete email
       try (Transport transport = newSession.getTransport("smtp")) {
           transport.connect(emailHost, fromUser, fromUserPassword);
           transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
       }
   }
   
   /**
    * Method that populates the mimeMessage with a recipient address and the physical content of the email address
    * @param emailRecipient - this is the email address that the email will be sent to
    * @param emailBody - this is the physical content that will be included in the email address
    * @returns mimeMessage which is the final, populated mimeMessage that is ready to be sent as an email
    * @throws AddressException
    * @throws MessagingException 
    */
   public MimeMessage draftEmail(String emailRecipient, String emailBody) throws AddressException, MessagingException
   {
       //the subject line of the email
       String emailSubject = "Script issued on: " + LocalDateTime.now().toString();
       
       //linking the mimeMessage to the session so that the recipient email address can be recorded
       mimeMessage = new MimeMessage (newSession);
       mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailRecipient));
       //populating the mimeMessage and structuring the mimeMessage with the final email
       mimeMessage.setSubject(emailSubject);
       MimeBodyPart bodyPart = new MimeBodyPart();
       bodyPart.setContent(emailBody, "text/plain");
       MimeMultipart multiPart = new MimeMultipart();
       multiPart.addBodyPart(bodyPart);
       mimeMessage.setContent(multiPart);
       return mimeMessage;
   }
   
   /**
    * Void method that organizes and sets up the SMTP server properties for the Session to use when sending the email
    */
   public void setupServerProperties()
   {
       Properties properties = System.getProperties();
       properties.put("mail.smtp.port", "587");
       properties.put("mail.smtp.auth", "true");
       properties.put("mail.smtp.starttls.enable", "true");
       newSession = Session.getDefaultInstance(properties, null);
   }
}
