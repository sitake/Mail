package MUA

import javafx.application.Application
import javax.mail.internet.InternetAddress

/**
 * Created by kaneko on 2015/09/02.
 */
object main extends App{

  val props = new SMTPProperties("mail.ms.dendai.ac.jp",587)
  val writer = new MimeMessageWriter(new InternetAddress("12ec036@ms.dendai.ac.jp"),new To(new InternetAddress("sitake13625@gmail.com")))
  val authenticator = new PasswordAuthenticator("12ec036@ms.dendai.ac.jp",)

  writer.setSubject("test")
  writer.setText("sendMessageTest")

  SMTPClient.sendMsg(props,writer,authenticator)

}
