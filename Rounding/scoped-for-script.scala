// forの最初に内側で定義した変数をあとで使用できる
val dogBreads = List("Doberman", "Yorkshire Terrier", "Dachshund",
  "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

for {
  bread <- dogBreads
  upcasdBread = bread.toUpperCase()
} println(upcasdBread)
