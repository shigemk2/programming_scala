package ui2
import org.specs._
import observer._
import ui.ButtonCountObserver
object ButtonClickableObserverVetoableSpec extends Specification {
  // 拒否可能なクリックをミックスインするボタンのオブザーバは
  "A Button Observer with Vetoable Clicks" should {
    // 次のように最初のボタンのクリックだけ観察するべき
    "observe only the first button click" in {
      val observableButton =
        new Button("Okay") with ObservableClicks with VetoableClicks
      val buttonClickCountObserver = new ButtonCountObserver
      observableButton.addObserver(buttonClickCountObserver)
      for (i <- 1 to 3) observableButton.click()
      buttonClickCountObserver.count mustEqual 1
    }
  }
}
