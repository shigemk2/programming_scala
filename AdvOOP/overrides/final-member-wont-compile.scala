class NotFixed {
  final def fixedMethod = "fixed"
}
class Changeable2 extends NotFixed {
  // method fixedMethod cannot override final member
  override def fixedMethod = "not fixed" // エラー
}
