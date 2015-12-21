abstract class AbstractParent {
  def name: String
}
class ConcreteChild extends AbstractParent {
  override val name = "Child"
}
println(new ConcreteChild().name) // => "Child"
