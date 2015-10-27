package ui2
import org.specs._
import observer._
import ui.ButtonCountObserver

object ButtonVetoableClickableObserverSpec extends Specification {
  // クリックのオブザーバを持つ拒否可能なボタンは
  "A Vetoable Button with Click Observer" should {
    // 次のようにいくつかのボタンのクリックが拒否される場合でも、すべてのボタンのクリックを観察すべき
    "observe all the button clicks, even when some are vetoed" in {
      val observableButton =
        new Button("Okay") with VetoableClicks with ObservableClicks
      val buttonClickCountObserver = new ButtonCountObserver
      observableButton.addObserver(buttonClickCountObserver)

      for(i <- 1 to 3) observableButton.click()
      buttonClickCountObserver.count mustEqual 3
    }
  }
}
