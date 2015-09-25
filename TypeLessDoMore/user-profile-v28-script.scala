object OptionalUserProfileInfo {
  val UnknownLocation = ""
  val UnknownAge = -1
  val UnknownWebSite = ""
}

class OptionalUserProfileInfo (
  location: String = OptionalUserProfileInfo.UnknownLocation,
  age: Int = OptionalUserProfileInfo.UnknownAge,
  webSite: String = OptionalUserProfileInfo.UnknownWebSite
)

// 実行できてもコンパイルはできない
val a = new OptionalUserProfileInfo
val b = new OptionalUserProfileInfo(age = 29)
val c = new OptionalUserProfileInfo(age = 29, location = "Earth")
// error: positional after named argument.
val d = new OptionalUserProfileInfo(age = 29, "Earth")
println(a)
println(b)
println(c)
