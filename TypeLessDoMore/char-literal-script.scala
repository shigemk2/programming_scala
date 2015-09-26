val a = 'A'
val b = '\u0041'
val c = '\012'
val d = '\t'

val e = "Programming\nScala"
// エスケープ文字がエスケープ文字として判定されない
val f = """Programming\nScala"""
val g = """He exclaimed, "Scala is great!" """
// "He exclaimed, "Scala is great!" " こういう書き方をしたらエラーになる
val h = """First line\n
Second line\t

Fourth line"""

