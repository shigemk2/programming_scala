package ui3
import org.specs._
import observer._
import ui.ButtonCountObserver
object ButtonClickableObserverVetoableSpec2 extends Specification {
  // Vetoable Clicksを持つButton Observerは
  "A Button Observer with Vetoable Clicks" should {
    // 次のように最初のmaxAllowedクリックのみを観測するべき
    "observe only the first 'maxAllowed' clicks" in {
      val observableButton =
        new Button("Okay") with ObservableClicks with VetoableClicks {
          maxAllowed = 2
        }
      observableButton.maxAllowed mustEqual 2
      val buttonClickCountObserver = new ButtonCountObserver
      observableButton.addObserver(buttonClickCountObserver)
      for (i <- 1 to 3) observableButton.click()
      buttonClickCountObserver.count mustEqual 2
    }
  }
}
