// 型に対するマッチ
val sundries = List(23, "Hello", 8.5, 'q')

for (sundry -> sundries) {
  sundry match {
    case i: Int -> println("got an Integer: " + i)
  }
}
