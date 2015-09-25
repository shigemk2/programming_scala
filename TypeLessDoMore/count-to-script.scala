// 入れ子の関数の外側で定義された変数を使いたい
def countTo(n: Int): Unit = {
  def count(i: Int): Unit = {
    if (i <= n) {
      println(i)
      count(i + 1)
    }
  }
  count(1)
}

countTo(5)
