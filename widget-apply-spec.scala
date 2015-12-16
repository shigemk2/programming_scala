package objects
import org.specs._
object WidgetApplySpec extends Specification {
  // 正しいウィジェット仕様文字列を与えられたWidget.applyは
  "Widget.apply with a valid widget specification string" should {
    // 次のように正しいフィールド集合を持ったウィジェットインスタンスを返すべき
    "return a widget instance with the correct fields set" in {
      Widget("(button: label=click me, (Widget))") match {
        case Some(w) => w match {
          case b:Button => b.label mustEqual "click me"
          case x => fail(x.toString())
        }
        case None => fail("None returned.")
      }
      Widget("(textfield: text=This is text, (Widget))") match {
        case Some(w) => w match {
          case tf:TextField => tf.text mustEqual "This is text"
          case x => fail(x.toString())
        }
        case None => fail("None returned.")
      }
    }
  }
  // 不正な仕様文字列を与えられたWidget.applyは
  "Widget.apply with an invalid specification string" should {
    // 次のようにNoneを返すべき
    "return None" in {
      Widget("(button: , (Widget)") mustEqual None
    }
  }
}
