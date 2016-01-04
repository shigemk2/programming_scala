// 今回は可変な変数を使っていません
def factorial(i: BigInt): BigInt = i match {
  case _ if i == 1 => i
  case _ => i * factorial(i - 1)
}
for (i <- 1 to 10)
  printf("%s: %s\n", i, factorial(i))
