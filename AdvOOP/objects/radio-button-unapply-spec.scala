package objects
import org.specs._
object RadioButtonUnapplySpec extends Specification {
  // RadioButton.unapplyは
  "RadioButton.unapply" should {
    // 次のようにRadioButtonオブジェクトにマッチすべき
    "should match a RadioButton object" in {
      val b = new RadioButton(true, "click me")
      b match {
        case RadioButton(on, label) =>
        case _ => fail()
      }
    }
    // 次のようにButton（親クラス）オブジェクトにはマッチしないべき
    "not match a Button (parent class) object" in {
      val b = new Button("click me")
      b match {
        case RadioButton(on, label) => fail()
        case _ =>
      }
    }
    // 次のようにRadioButtonオブジェクト以外にはマッチしないべき
    "not match a non-RadioButton object" in {
      val tf = new TextField("hello world!")
      tf match {
        case RadioButton(on, label) => fail()
        case _ =>
      }
    }
    // 次のようにRadioButtonのon/off状態とラベルを抽出できるべき
    "extract the RadioButton's on/off state and label" in {
      val b = new RadioButton(true, "click me")
      b match {
        case RadioButton(on, label) => {
          label mustEqual "click me"
          on mustEqual true
        }
        case _ => fail()
      }
    }
  }
}
