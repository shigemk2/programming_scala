def writeAboutBigInteger () = {
  // Javaと違って、importはファイルの先頭以外のところにも書ける
  // ので、importのスコープ(影響範囲)を小さくできる
  import java.math.BigInteger.{
    ONE => _,
    TEN,
    ZERO => JAVAZERO }

  // ONEは事実上、未定義
  // println( "ONE:" + ONE )
  println( "TEN: " + TEN )
  println( "ZERO: " + JAVAZERO )
}

writeAboutBigInteger()
