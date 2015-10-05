val dogBreads = List("Doberman", "Yorkshire Terrier", "Dachshund",
  "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

val filteredBreads = for {
  bread <- dogBreads
  if bread.contains("Terrier")
  if !bread.startsWith("Yorkshire")
} yield bread

println(filteredBreads) // List(Scottish Terrier)
println(filteredBreads(0)) // Scottish Terrier
