/*Create a list and return a data from it, the update or add elements to it
Create a list then add repetitive and unique elements to it, the convert it to set,
then add new elements to it and check the set value*/

fun main(){
    var list = mutableListOf<Int>(1,2,3,4,5,6,7)
    println("first list:")
    println(list)
    list.add(8)
    list.add(1)
    println("after adding new elements to the list:")
    println(list)
    list.toMutableSet()
    list.add(9)
    list.add(10)
    println("after changing it to a set & adding new elements:")
    println(list)

}