package MUA

import javax.mail.internet.{MimeMessage, InternetAddress}

/**
 * Created by kaneko on 2015/09/04.
 */
class MimeMessageWriter(from:InternetAddress,to: To) {

  var text = ""
  var subject = ""
  var dList = List.empty[Destination]

  def addDestination(destination: Destination)=
    dList = destination::dList


  def setText(text:String)=
    this.text = text

  def setSubject(subject:String)=
    this.subject = subject

  def write(msg:MimeMessage)={
    msg.setFrom(this.from)
    var (r,t) = to.getDestination
    msg.setRecipient(r,t)
//    for(d<-dList){
//      (r,t) = d.getDestination
//      msg.addRecipient(r,t)
//    }
    msg.setSubject(subject)
    msg.setText(text)
  }
}
