def isEven(n: Int) = (n % 2) == 0

List(1, 2, 3, 4) filter isEven foreach println
List(1, 2, 3, 4).filter(x => isEven(x)).foreach(x => println(x))
List(1, 2, 3, 4) foreach println
List(1, 2, 3, 4) foreach( i => println(i) )
List(1, 2, 3, 4) foreach( println(_) )
