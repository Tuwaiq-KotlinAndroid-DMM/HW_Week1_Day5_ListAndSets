fun main(){
    //PART II

    // create a list, add elements to it, update and add new elements to it.
    var list = mutableListOf<Int>(1,2,3,4)
    list.add(5)
    list.add(6)
    list[0] = 9
    println(list)

    /*Create a list then add repetitive and unique elements to it, the convert it to set,
     then add new elements to it and check the set value*/

    var list1 = mutableListOf<Int>(0,0,1,2,3,1,5,6,7)
    var set = list1.toMutableSet()
    set.add(8)
    set.add(9)
    set.add(0)
    println("The set of elements: $set")
    //all duplicates are removed, any duplicate will not be added to the set.


}