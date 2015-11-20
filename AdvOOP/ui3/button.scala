package ui3
class Button(val label: String) extends Widget with Clickable {
  def click() = {
    // クリックされたボタンの見た目を変更するロジック ...
  }
  def draw() = {
    // ボタンを画面やWebページなどに表示するロジック ...
  }
  override def toString() =
    "(button: label=" + label + ", " + super.toString() + ")"
}
