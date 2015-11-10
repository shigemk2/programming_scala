// 可視公開性
// 可視性キーワードを使用していないすべての宣言は「公開」です。つまりどこからでも参照できます。Scalaにはpublicキーワードがありません。
package scopeA {
  class PublicClass1 {
    val publicField = 1
    class Nested {
      val nestedField = 1
    }
    val nested = new Nested
  }
  class PublicClass2 extends PublicClass1 {
    val field2 = publicField + 1
    val nField2 = new Nested().nestedField
  }
}
package scopeB {
  class PublicClass1B extends scopeA.PublicClass1
  class UsingClass(val publicClass: scopeA.PublicClass1) {
    def method = "UsingClass:" +
    " field: " + publicClass.publicField +
    " nested field: " + publicClass.nested.nestedField
  }
}

object Public {
  def main(args: Array[String]) {
    val a = new scopeA.PublicClass1
    val b = new scopeB.UsingClass(a)
    println(b.method) // UsingClass: field: 1 nested field: 1
  }
}

