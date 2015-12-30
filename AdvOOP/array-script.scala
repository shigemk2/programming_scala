println(Array(1, 2) == Array(1, 2))
// sameElementsを使用すれば、2つのArrayが同じ要素を含んでいることを検査
// 2つの可変なデータ構造の等価性に明示的な検査を必要
println(Array(1, 2).sameElements(Array(1, 2)))
