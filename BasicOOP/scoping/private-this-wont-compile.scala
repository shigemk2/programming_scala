// コンパイルできない
package scopeA {
  class PrivateClass1(private[this] val privateField1: Int) {
    private[this] val privateField2 = 1
    def equalFields(other: PrivateClass1) =
      (privateField1 == other.privateField1) && // エラー
    (privateField2 == other.privateField2) &&
    (nested == other.nested)
    class Nested {
      private[this] val nestedField = 1
    }
    private[this] val nested = new Nested
  }
  class PrivateClass2 extends PrivateClass1(1) {
    val field1 = privateField1 // エラー
    val field2 = privateField2 // エラー
    val nField = new Nested().nestedField // エラー
  }
  class PrivateClass3 {
    val privateClass1 = new PrivateClass1(1)
    val privateField1 = privateClass1.privateField1 // エラー
    val privateField2 = privateClass1.privateField2 // エラー
    val privateNField = privateClass1.nested.nestedField // エラー
  }
}
