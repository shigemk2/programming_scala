// error: method upCase has return statement; needs result type
// upCaseメソッドに戻り値の型Stringを指定するまでコンパイルできない
// とりあえずの対策として、returnをやめるという方法がある
def upCase(s: String) = {
  if (s.length == 0)
    s
  else
    s.toUpperCase()
}

println( upCase("") )
println( upCase("Hello") )
