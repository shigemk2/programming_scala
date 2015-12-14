// トレイトのメソッドが抽象ならば、次のようになります。
// 派生クラスやトレイトは、単純なフィールドのアクセスで十分な場合はそれを使い、初期化の遅延などのもっと処理を必要とする場合にはメソッドを呼ぶことができます。これは統一形式アクセスの原則に一般的にあてはまります(UAP)
trait AbstractNameTrait {
  def name: String
}
class ConcreteNameClass extends AbstractNameTrait {
  val name = "ConcreteNameClass"
}
println(new ConcreteNameClass().name) // => "ConcreteNameClass"
