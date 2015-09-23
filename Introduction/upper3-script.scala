// Javaとは違い、1つのファイルの中にいくつでも好きなだけ公開型を持つことができます
// $ scalac upper3-script.scala
// $ scala Upper "A" "First" "Scala" "Program"
object Upper {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ",_))
    println("")
  }
}
