val dogBreads = List("Doberman", "Yorkshire Terrier", "Dachshund")

for (bread <- dogBreads
  if bread.contains("Terrier")
) println(bread)
