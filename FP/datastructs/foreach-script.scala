// foreachは、それぞれの要素に対して実行する操作を引数に取る高階関数
List(1, 2, 3, 4, 5) foreach { i => println("Int: " + i) }
val stateCapitals = Map(
  "Alabama" -> "Montgomery",
  "Alaska" -> "Juneau",
  "Wyoming" -> "Cheyenne")
stateCapitals foreach { kv => println(kv._1 + ": " + kv._2) }
