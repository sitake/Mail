package MUA

import javax.mail.Message.RecipientType
import javax.mail.internet.InternetAddress

/**
 * Created by kaneko on 2015/09/04.
 */
class To(address:InternetAddress) extends Destination{
  override val rType: RecipientType = RecipientType.TO
  override val to: InternetAddress = address
}
