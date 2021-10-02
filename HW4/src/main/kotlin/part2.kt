fun main (){
    var list = mutableListOf<Int>(1,1,2,3,4,5,6)
    list.also {
        it.add(7)
        it.remove(1)
    }
    println("adding a new number\n ${list}\n")

    var list2 = mutableListOf<Int>(1,1,2,3,65,3,4,5)
    var set = list2!!.toMutableSet()
    set.add(6)
    set.remove(65)
    println("converting list to set and adding element\n ${set}")
}