package MUA

import javax.mail.{Transport, Authenticator, Session}
import javax.mail.internet.MimeMessage

/**
 * Created by kaneko on 2015/09/04.
 */
object SMTPClient {

  def sendMsg(properties: SMTPProperties,writer: MimeMessageWriter,authenticator:Authenticator)={
    val session =
      Session.getInstance(properties.getProperties, authenticator)

    val msg = new MimeMessage(session)
    writer.write(msg)
    Transport.send(msg)
  }


}
