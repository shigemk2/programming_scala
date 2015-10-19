package ui
import org.specs._
import observer._
object ButtonObserverSpec extends Specification {
  // ボタンのオブザーバは
  "A Button Observer" should {
    // 次のようにボタンのクリックを観察するべき
    "observe button clicks" in {
      val observableButton = new ObservableButton("Okay")
      val buttonObserver = new ButtonCountObserver
      observableButton.addObserver(buttonObserver)
      for (i <- 1 to 3) observableButton.click()
      buttonObserver.count mustEqual 3
    }
  }
}
