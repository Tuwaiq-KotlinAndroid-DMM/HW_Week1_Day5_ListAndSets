fun main() {
    var list = mutableListOf<Int>(1, 2, 3, 4,5,6,7)


    list.add(7)
    list.add(2)
    list.add(3)
    list.remove(1)
println(list)
   var set= list.toMutableSet()
    set.add(11)
    set.remove(3)
    println(set)

}