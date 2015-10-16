package ui

class ButtonWithCallbacks(val label: String,
  val clickedCallbacks: List[() => Unit]) extends Widget {
  require(clickedCallbacks != null, "Callback list can't be null!")
  def this(label: String, clickedCallback: () => Unit) =
    this(label, List(clickedCallback))
  def this(label: String) = {
    this(label, Nil)
    println("Warning: button has no click callbacks!")
  }
  def click() = {
    // ... クリックされた物理的なボタンの見た目を変更するロジック ...
    clickedCallbacks.foreach(f => f())
  }
}
