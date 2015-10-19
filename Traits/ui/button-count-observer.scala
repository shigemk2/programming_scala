package ui
import observer._

class ButtonCountObserber {
  var count = 0
  def receiveUpdate(subject: Any) = count += 1
}
