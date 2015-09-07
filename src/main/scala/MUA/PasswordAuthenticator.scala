package MUA

import javax.mail.{PasswordAuthentication, Authenticator}

/**
 * Created by kaneko on 2015/09/04.
 */
class PasswordAuthenticator(username:String,password:String) extends Authenticator{
  override def getPasswordAuthentication = new PasswordAuthentication(username,password)
}
