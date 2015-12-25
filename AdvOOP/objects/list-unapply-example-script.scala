// List(x, y, _*)という構文は、少なくとも2つの要素を持ったリストにだけマッチし、その2つの要素をxとyに代入するということを意味します。リストのそれ以降の要素には関知しません。_*は残り0個以上の要素にマッチします。
val list = List(1, 2.2, "three", 'four)
list match {
  case List(x, y, _*) => println("x = "+x+", y = "+y)
  case _ => throw new Exception("No match!"+list)
}
