// Scalaプログラムの構文解析的なはなし

def equalsign = {
  // 行末に等号がある場合、コードが次の行に続く
  val reallySuperLongValueNameThatGoesOnForeverSoYouNeedANewLine =
    "wow that was a log value name"
  println(reallySuperLongValueNameThatGoesOnForeverSoYouNeedANewLine)
}

// 行末に開き波括弧がある場合、コードが次の行に続く
def equalsign2(s: String) = {
  println("equalsign2: " + s)
}

// 行末にカンマ、演算子などがある場合、コードが次の行に続く
def commas(s1: String,
  s2: String) = {
  println("comma: " + s1 +
  ", " + s2)
}

equalsign
equalsign2("hoge")
commas("hoge", "fuga")

