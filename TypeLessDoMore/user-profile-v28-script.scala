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
println(new OptionalUserProfileInfo)
println(new OptionalUserProfileInfo(age = 29))
println(new OptionalUserProfileInfo(age = 29, location = "Earth"))
