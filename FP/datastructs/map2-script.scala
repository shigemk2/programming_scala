// 簡単にMapを作ることができます
val stateCapitals = Map(
  "Alabama" -> "Montgomery",
  "Alaska" -> "Juneau",
  "Wyoming" -> "Cheyenne")
val map2 = stateCapitals map { kv => (kv._1, kv._2.length) }
// val lengths = Map(map2) // エラー：うまくいかない
val lengths = Map[String,Int]() ++ map2
println(lengths)
