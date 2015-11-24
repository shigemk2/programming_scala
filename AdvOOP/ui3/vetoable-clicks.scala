package ui3
import observer._
// maxAllowedを公開varにした修正版トレイトVetoableClicks
trait VetoableClicks extends Clickable {
  var maxAllowed = 1 // default
  private var count = 0
  abstract override def click() = {
    count += 1
    if (count <= maxAllowed)
      super.click()
  }
}
