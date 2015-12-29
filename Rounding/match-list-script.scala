// シーケンスに対するマッチ List
val willWork = List(1, 3, 23, 90)
val willNotWork = List(4, 18, 52)
val empty = List()
def processList(l: List[Any]): Unit = l match {
  // ::を使用してリストから先頭と末尾を抽出
  // case head :: tail =>
  // こいつは↑と等価
  case ::(head, tail) =>
    printf("elem: %s, ", head)
    processList(tail)
  case Nil => println("")
}
for (l <- List(willWork, willNotWork, empty)) {
  print("List: ")
  processList(l)
}
