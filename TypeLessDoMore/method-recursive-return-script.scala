// 再帰メソッドには戻り値の型を指定する必要がある
// error: recursive method fact needs result type
def factorial(i: Int) = {
  def fact(i: Int, accumulator: Int) = {
    if (i <= 1)
      accumulator
    else
      fact(i - i, i * accumulator)
  }

  fact(i, 1)
}
