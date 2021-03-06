// コンパイルできない
// Class1とClass2の両方を囲んでいるパッケージ（または型）に対してスコープ指定している非公開メンバは参照できちゃう
package scopeA {
  class Class1 {
    private[scopeA] val scopeA_privateField = 1
    protected[scopeA] val scopeA_protectedField = 2
    private[Class1] val class1_privateField = 3
    protected[Class1] val class1_protectedField = 4
    private[this] val this_privateField = 5
    protected[this] val this_protectedField = 6
  }
  class Class2 extends Class1 {
    val field1 = scopeA_privateField
    val field2 = scopeA_protectedField
    val field3 = class1_privateField // エラー
    val field4 = class1_protectedField
    val field5 = this_privateField // エラー
    val field6 = this_protectedField
  }
}
package scopeB {
  class Class2B extends scopeA.Class1 {
    val field1 = scopeA_privateField // エラー
    val field2 = scopeA_protectedField
    val field3 = class1_privateField // エラー
    val field4 = class1_protectedField
    val field5 = this_privateField // エラー
    val field6 = this_protectedField
  }
}
