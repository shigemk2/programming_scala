// Scalaはすべてがオブジェクトのため、staticをサポートしていない
object Upper {
  // 無名関数
  def upper(strings: String*) = strings.map(_.toUpperCase())
}

println(Upper.upper("A", "First", "Scala", "Program"))
