// このパターンは、型消去でList[A]のAは無視されるので、barは同じシグネチャ扱いになる
object Foo {
  def bar(list: List[String]) = list.toString
  def bar(list: List[Int]) = list.size.toString
}
