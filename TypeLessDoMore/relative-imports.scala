import scala.collection.mutable._
import collection.immutable._    // 「scala」は、すでにインポートされているため
import _root_.scala.collection._ // 実際の「ルート」からのフルパス

// importは相対的であることに気をつける
package scala.actors {
  import remote._                // 「scala.actors」のスコープ内にいる
}
