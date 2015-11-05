package ui
/**
  * 旧式のラジオの選局ボタンのような、
  * オンとオフの2つの状態を持つボタン。
  */
class RadioButtonWithCallbacks(
  var on: Boolean, label: String, clickedCallbacks: List[() => Unit])
    extends ButtonWithCallbacks(label, clickedCallbacks) {
  def this(on: Boolean, label: String, clickedCallback: () => Unit) =
    this(on, label, List(clickedCallback))
  def this(on: Boolean, label: String) = this(on, label, Nil)
}
