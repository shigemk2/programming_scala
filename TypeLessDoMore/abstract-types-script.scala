// Javaと同様に、extendsキーワードを使って親クラスを指定します
import java.io._

abstract class BulkReader {
  type In
  val source: In
  def read: String
}

class StringBulkReader(val source: String) extends BulkReader {
  type In = String
  // フィールドをただ返すだけ
  def read = source
}

class FileBulkReader(val source: File) extends BulkReader {
  type In = File
  // ファイルの中身を読み込んでいる
  def read = {
    val in = new BufferedInputStream(new FileInputStream(source))
    val numBytes = in.available()
    val bytes = new Array[Byte](numBytes)
    in.read(bytes, 0, numBytes)
    new String(bytes)
  }
}

println( new StringBulkReader("Hello Scala!").read )
println( new FileBulkReader(new File("abstract-types-script.scala")).read )
