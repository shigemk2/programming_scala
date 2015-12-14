// トレイトのメソッドが抽象ならば、次のようになります。
trait AbstractNameTrait {
  def name: String
}
class ConcreteNameClass extends AbstractNameTrait {
  val name = "ConcreteNameClass"
}
println(new ConcreteNameClass().name) // => "ConcreteNameClass"
