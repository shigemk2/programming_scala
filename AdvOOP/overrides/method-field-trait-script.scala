// トレイトのメソッドが具象ならば、次のようになります
trait NameTrait {
  def name = "NameTrait"
}
class ConcreteNameClass extends NameTrait {
  override val name = "ConcreteNameClass"
}
println(new ConcreteNameClass().name) // => "ConcreteNameClass"
