class NotFixed {
  final def fixedMethod = "fixed"
}
class Changeable2 extends NotFixed {
  override def fixedMethod = "not fixed" // エラー
}
