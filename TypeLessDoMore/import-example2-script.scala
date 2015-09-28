def writeAboutBigInteger () = {
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
