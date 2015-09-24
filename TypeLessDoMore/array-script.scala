val array: Array[String] = new Array(5)
// valで定義した変数に再代入はできない
// array = new Array(2)
// arrayそのものを変更することはできる。それはArrayがmutableだから
array(0) = "Hello"
println(array)
