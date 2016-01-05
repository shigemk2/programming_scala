// ループによってスタックオーバーフローの可能性がなくなり、再帰的な関数呼び出しのオーバーヘッドを取り除くことによってパフォーマンスが向上します
// 末尾再帰の最適化はまだJVMによってサポートされていませんが、scalacは最適化を行うことができます
def factorial(i: BigInt): BigInt = {
  def fact(i: BigInt, accumulator: BigInt): BigInt = i match {
    case _ if i == 1 => accumulator
    case _ => fact(i - 1, i * accumulator)
  }
  fact(i, 1)
}
for (i <- 1 to 10)
  printf("%s: %s\n", i, factorial(i))
