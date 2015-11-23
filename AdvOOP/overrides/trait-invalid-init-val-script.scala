// with AbstractT2節の前のブロックの中で、フィールドvalueを初期化
trait AbstractT2 {
  println("In AbstractT2:")
  val value: Int
  val inverse = 1.0/value
  println("AbstractT2: value = "+value+", inverse = "+inverse)
}
val c2c = new {
  // 事前初期化ブロックの中では初期化のみが可能
  // println("In c2c:")
  val value = 10
} with AbstractT2
println("c2c.value = "+c2c.value+", inverse = "+c2c.inverse)
