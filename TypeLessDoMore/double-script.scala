// 関数型プログラミングにおいて関数は常に値を返します。その一方で、Scalaは先頭に等号がないメソッドの本体を見つけると、プログラマが「手続き」の定義としてメソッドを書いたとみなします。手続きは、Unit型の戻り値しか持たず副作用を伴う処理を実行するためのものです。
def double(i: Int) = { 2 * i }

println(double(2))
