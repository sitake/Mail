package MUA

/**
 * Created by kaneko on 2015/09/04.
 */
import javax.mail.Message.RecipientType
import javax.mail.internet.InternetAddress
class BCC (address:InternetAddress) extends Destination{
  override val rType: RecipientType = RecipientType.BCC
  override val to: InternetAddress = address
}
