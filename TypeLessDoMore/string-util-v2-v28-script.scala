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
