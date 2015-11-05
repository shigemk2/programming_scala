package ui
abstract class Widget {
  class Properties {
    import scala.collection.immutable.HashMap
    private var values: Map[String, Any] = new HashMap
    def size = values.size
    def get(key: String) = values.get(key)
    def update(key: String, value: Any) = {
      // 前処理。フィルタリングなど。
      values = values.update(key, value)
      // 後処理。
    }
    val properties = new Properties
  }
}
