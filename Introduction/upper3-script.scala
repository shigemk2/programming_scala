// Javaとは違い、1つのファイルの中にいくつでも好きなだけ公開型を持つことができます
// $ scalac upper3-script.scala
// 実行
// $ scala Upper "A" "First" "Scala" "Program"
// $ scala -cp . Upper Hello World!
// cpはクラスパス追加
object Upper {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ",_))
    println("")
  }
}
