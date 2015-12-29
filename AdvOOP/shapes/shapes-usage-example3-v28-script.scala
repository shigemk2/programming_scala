// Scala 2.8限定。
import shapes._
val circle1 = Circle(Point(0.0, 0.0), 2.0)
val circle2 = circle1 copy (radius = 4.0)
println(circle1)
println(circle2)
