fun main(args: Array<String>) {
    var list = mutableListOf<Int>(3, 4, 5)
    list.add(7)
    list.remove(4)
    println(list)

    var set =list.toMutableSet()
    set.add(8)
    set.add(10)
    println(set)
}



