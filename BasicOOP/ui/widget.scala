package ui
abstract class Widget {
  class Properties {
    import scala.collection.immutable.HashMap
    private var values: Map[String, Any] = new HashMap
    def size = values.size
    def get(key: String) = values.get(key)
    def update(key: String, value: Any) = {
      // 前処理。フィルタリングなど。
      // Scala 2.8ではコンパイル時にMap.updateに対して非推奨の警告が出力される。警告を抑制するには、Map.updatedを使用する
      values = values.update(key, value)
      // 後処理。
    }
    val properties = new Properties
  }
}
