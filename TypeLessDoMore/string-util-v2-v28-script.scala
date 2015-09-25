// 開発者がメソッド引数に良い名前を付けていれば、メソッド呼び出し時に、名前付き引数がそれぞれドキュメント化されます
object StringUtil {
  def joiner(strings: List[String], separator: String = " "): String =
    strings.mkString(separator)
}

import StringUtil._

println(joiner(List("Programming", "Scala")))
println(joiner(strings = List("Programming", "Scala")))
println(joiner(List("Programming", "Scala"), " ")) // #1
println(joiner(List("Programming", "Scala"), separator = " ")) // #2
println(joiner(strings = List("Programming", "Scala"), separator = " "))
