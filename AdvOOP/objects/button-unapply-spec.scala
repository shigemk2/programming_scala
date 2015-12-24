package objects
import org.specs._
object ButtonUnapplySpec extends Specification {
  // Button.unapplyは
  "Button.unapply" should {
    // 次のようにボタン・オブジェクトとマッチすべき
    "match a Button object" in {
      val b = new Button("click me")
      b match {
        case Button(label) =>
        case _ => fail()
      }
    }
    // 次のようにRadioButtonオブジェクトにマッチすべき
    "match a RadioButton object" in {
      val b = new RadioButton(false, "click me")
      b match {
        case Button(label) =>
        case _ => fail()
      }
    }
    // 次のようにButton以外のオブジェクトにはマッチしないべき
    "not match a non-Button object" in {
      val tf = new TextField("hello world!")
      tf match {
        case Button(label) => fail()
        case _ =>
      }
    }
    // 次のようにButtonのラベルを抽出できるべき
    "extract the Button's label" in {
      val b = new Button("click me")
      b match {
        case Button(label) => label mustEqual "click me"
        case _ => fail()
      }
    }
    // 次のようにRadioButtonのラベルを抽出できるべき
    "extract the RadioButton's label" in {
      val rb = new RadioButton(false, "click me, too")
      rb match {
        case Button(label) => label mustEqual "click me, too"
        case _ => fail()
      }
    }
  }
}
