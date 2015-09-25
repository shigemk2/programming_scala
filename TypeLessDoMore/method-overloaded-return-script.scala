object StringUtil {
  def joiner(strings: List[String], separator: String): String =
    strings.mkString(separator)

  // error: overloaded method joiner needs result type
  def joiner(strings: List[String]) = joiner(strings, " ")
}
import StringUtil._

println( joiner(List("Programming", "Scala")))
