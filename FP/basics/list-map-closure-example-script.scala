// multiplierは不変な関数値であるにもかかわらず、factorが変更されるとその振る舞いが変わりました。
// multiplierには2つの自由変数であるiとfactorがあります。そのうちの1つiは関数の仮引数です。したがって、multiplierが呼び出されるたびに、iは新しい値に束縛されます
var factor = 3
val multiplier = (i:Int) => i * factor
val l1 = List(1, 2, 3, 4, 5) map multiplier
factor = 5
val l2 = List(1, 2, 3, 4, 5) map multiplier
println(l1)
println(l2)
