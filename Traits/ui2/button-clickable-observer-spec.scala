package ui2
import org.specs._
import observer._
import ui.ButtonCountObserver
object ButtonClickableObserverSpec extends Specification {
  // ボタンのオブザーバは
  "A Button Observer" should {
    // 次のようにボタンのクリックを観察するべき
    "observe button clicks" in {
      val observableButton = new Button("Okay") with ObservableClicks
      val buttonClickCountObserver = new ButtonCountObserver
      observableButton.addObserver(buttonClickCountObserver)
      for (i <- 1 to 3) observableButton.click()
      buttonClickCountObserver.count mustEqual 3
    }
  }
}
