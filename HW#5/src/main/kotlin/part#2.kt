fun main(){
//create a list and return a data from it, the update or add elements to it.
    var list = mutableListOf<Int>(4,8,9,6)
    list.add(6)
    list.add(7)
    println(list)
//create a list then add repetitive and unique elements to it...etc
    var list1 = mutableListOf<Int>(5,6,6,9,8,7)
    var set = list1.toMutableSet()
    set.add(3)
    set.add(2)
    set.add(1)
    println(set)
}