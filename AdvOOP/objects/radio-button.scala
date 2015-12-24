package objects
/**
  * 旧式なラジオのチャンネル選択ボタンみたいな、
  * onとoffの2状態を持つボタン。
  */
class RadioButton(val on: Boolean, label: String) extends Button(label)
object RadioButton {
  def unapply(button: RadioButton) = Some((button.on, button.label))
  // このように書いてもよい： = Some(Pair(button.on, button.label))
}
