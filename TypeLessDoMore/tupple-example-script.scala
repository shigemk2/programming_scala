def tupleator(x1: Any, x2: Any, x3: Any) = (x1, x2, x3)

val t = tupleator("Hello", 1, 2.3)
println( "Print the whole tuple: " + t )
println( "Print the first item: "  + t._1 )
println( "Print the second item: " + t._2 )
println( "Print the third item: "  + t._3 )

val (t1, t2, t3) = tupleator("World", '!', 0x22)
println( t1 + " " + " " + t3 )
val t4 = ("Hello", 1, 2.3)
println(t4._3)
val t5 = ("Hello", 1, 2, 3)
println(t5._4)
val t6 = 1 -> 2
println(t6)
println(Tuple2(1, 2))
println(Pair(1, 2))
// error: too many arguments
// println(Pair(1, 2, 3))
