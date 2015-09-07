package MUA

import javax.mail.Message.RecipientType
import javax.mail.internet.InternetAddress

/**
 * Created by kaneko on 2015/09/04.
 */
trait Destination {

  val rType:RecipientType
  val to:InternetAddress

  def getDestination:(RecipientType,InternetAddress)=(rType,to)

}
