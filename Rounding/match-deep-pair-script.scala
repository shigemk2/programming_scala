class Role
case object Manager extends Role
case object Developer extends Role

case class Person(name: String, age: Int, role: Role)

val alice = new Person("Alice", 25, Developer)
val bob = new Person("Bob", 32, Manager)

val charlie = new Person("Charlie", 32, Developer)
for (item <- Map(1 -> alice, 2 -> bob, 3 -> charlie)) {
  item match {
    // p @ Person(...)構文を使うと、入れ子のマッチ文を1つの文に平坦化できます
    case (id, p @ Person(_, _, Manager)) => printf("%s is overpaid.\n", p)
    case (id, p @ Person(_, _, _)) => printf("%s is underpaid.\n", p)
  }
}
