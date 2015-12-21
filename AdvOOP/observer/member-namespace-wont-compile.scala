// コンパイルできない
class IllegalMemberNameUse {
  def member(i: Int) = 2 * i
  val member = 2 // エラー
  object member { // エラー // member is already defined as value member
    def apply() = 2
  }
}
