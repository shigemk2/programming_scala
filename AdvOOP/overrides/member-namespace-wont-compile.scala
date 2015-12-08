// 呼び出し側から見ればobjectメンバの定義もフィールドと同様に振る舞うため、これもメソッドやフィールドと同じ名前空間にあります。そのため、次のクラスはコンパイルできません。
class IllegalMemberNameUse {
  def member(i: Int) = 2 * i
  val member = 2 // エラー
  object member { // エラー
    def apply() = 2
  }
}
