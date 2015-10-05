val dogBreads = List("Doberman", "Hogehoge Terrier", "Yorkshire Terrier", "Dachshund")

for (bread <- dogBreads
  if bread.contains("Terrier")
) println(bread)
