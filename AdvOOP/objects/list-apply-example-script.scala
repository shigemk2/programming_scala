// 暗黙のうちにList.applyが使われるスクリプトの例を
val list1 = List()
val list2 = List(1, 2.2, "three", 'four) // 'fourはシンボル
val list3 = List.apply("1", "2.2", "three", "four") // こういうやつ
println("1: "+list1)
println("2: "+list2)
println("3: "+list3)
