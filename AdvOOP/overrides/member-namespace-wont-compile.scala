class IllegalMemberNameUse {
  def member(i: Int) = 2 * i
  val member = 2 // エラー
  object member { // エラー
    def apply() = 2
  }
}
