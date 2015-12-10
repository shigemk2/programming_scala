// 親のメソッドが抽象ならば、overrideキーワードは任意です。
abstract class AbstractParent {
  def name: String
}
class ConcreteChild extends AbstractParent {
  val name = "Child"
}
println(new ConcreteChild().name) // => "Child"
