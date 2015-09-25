// $ scalac string-util-v3.scala
// $ scalac string-util-client.scala
// $ scala -cp . StringUtilClient "Programming Scala"
import StringUtil._

object StringUtilClient {
  def main(args: Array[String]) = {
    args foreach { s => toCollection(s).foreach { x => println(x) } }
  }
}
