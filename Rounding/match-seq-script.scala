// シーケンスに対するマッチ
val willWork = List(1, 3, 23, 90)
val willNotWork = List(4, 18, 52)
val empty = List()
for (l <- List(willWork, willNotWork, empty)) {
  l match {
    case List(_, 3, _, _) => println("Four elements, with the 2nd being '3'.")
    case List(_*) => println("Any other list with 0 or more elements.")
    // 一応こういう書き方もいいらしい
    case _ => println("Any other list with 0 or more elements. ANOTHER WRITING.")
  }
}
