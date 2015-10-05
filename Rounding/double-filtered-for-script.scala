val dogBreads = List("Doberman", "Yorkshire Terrier", "Dachshund",
  "Scottish Terrier", "Hoge Terrier", "Great Dane", "Portuguese Water Dog")
for (bread <- dogBreads
  if bread.contains("Terrier");
  if !bread.startsWith("Yorkshire")
) println(bread)
