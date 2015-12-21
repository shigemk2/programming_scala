// 親のメソッドが具象ならば、overrideキーワードが必要です。
class Parent {
  def name = "Parent"
}
class Child extends Parent {
  override val name = "Child"
}
println(new Child().name) // => "Child"
