// ナードの検索者は
"nerd finder" should {
  // 次のようにリストからナードを特定するべき
  "identify nerds from a List" in {
    val actors = List("Rick Moranis", "James Dean", "Woody Allen")
    val finder = new NerdFinder(actors)
    finder.findNerds mustEqual List("Rick Moranis", "Woody Allen")
  }
}
