package lagashuniversity;

// Clase que se encarga del envio de emails al usuario del parquímetro
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.swing.JOptionPane;

public class ServicioExterno {

    private static final String USERNAME = "lokijuop@gmail.com";
    private static final String PASSWORD = "best0passworD";

    static String ASUNTO = "Ciudad de Buenos Aires - Parquímetros Inteligentes";
    static String CUERPO = "El valor a pagar por el vehiculo de patente PATENTE registrado a esta direccion de email es de IMPORTE centavos";

    //Metodo para enviar emails (no implementado todavia)
    static void enviarEmail(String asunto, String cuerpo, String destinatario) {
        System.out.println("ASUNTO: " + asunto);
        System.out.println("CUERPO: " + cuerpo);
        System.out.println("DESTINATARIO " + destinatario);

        Properties props = System.getProperties();
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.debug", "true");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        try {
            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(USERNAME, PASSWORD);
                }
            });

            //session.setDebug(true);  
            Transport transport = session.getTransport();
            InternetAddress addressFrom = new InternetAddress(USERNAME);

            MimeMessage message = new MimeMessage(session);
            message.setSender(addressFrom);
            message.setSubject(asunto);
            message.setContent(cuerpo, "text/plain");
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));

            transport.connect();
            Transport.send(message);
            transport.close();

            JOptionPane.showMessageDialog(null, "Mail enviado");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//Metodo para conseguir el email de la patente enviada
    static String obtenerEmailPorPatente(String patente) {
        if (patente.equals("AAA111")) {
            return "agustinminanvalero@hotmail.com";
        }
        if (patente.equals("BBB222")) {
            return "agus21111996@hotmail.com";
        }
        return null;
    }
}
