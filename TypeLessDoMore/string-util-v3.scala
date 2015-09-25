object StringUtil {
  def joiner(strings: List[String], separator: String): String =
    strings.mkString(separator)

  def joiner(strings: List[String]): String = strings.mkString(" ")

  def toCollection(string: String): List[String] = string.split(' ').toList
}

import StringUtil._

println(joiner(List("Programming", "Scala")))
println(joiner(List("Programming", "Scala"), " "))
println(toCollection("Programming Scala"))
