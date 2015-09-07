package MUA

import java.util.Properties

/**
 * Created by kaneko on 2015/09/04.
 */
class SMTPProperties(host:String,port:Int) {

  val props = new Properties
  props.put("mail.smtp.host", host)
  props.put("mail.smtp.port", String.valueOf(port))
  this.setAuth(true)
  this.setTLS(true)
  this.setTimeOut(5000)
  this.setConnectionTimeOut(5000)

  def setAuth(auth:Boolean) =
    props.put("mail.smtp.auth", String.valueOf(auth))


  def setTLS(tls:Boolean)=
    props.put("mail.smtp.starttls.enable", String.valueOf(tls))


  def setTimeOut(timeout:Int) =
    props.put("mail.smtp.timeout",String.valueOf(timeout))


  def setConnectionTimeOut(timeout:Int) =
    props.put("mail.smtp.connectiontimeout",String.valueOf(timeout))


  def getProperties:Properties = this.props



}
