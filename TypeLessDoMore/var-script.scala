// varで定義した変数には再代入が可能
var stockPrice: Double = 100
stockPrice = 10
// 変数の型はDoubleなので、Int値を入れてもDouble型のまま
println(stockPrice)

// こういうキャストの仕方はできない
// stockPrice: Int = 10
println(stockPrice.toInt)
