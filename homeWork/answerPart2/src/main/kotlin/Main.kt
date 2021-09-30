fun main(args: Array<String>) {
    //Q1
    // create list
    var list = mutableListOf<Int>(1,2,3,4,5,2,7,1,8,9,10)

    // update list
    list.add(3,10)
    // print list
    println("list: $list")
    // print size list
    println("list size: ${list.size}")


    //Q2

    var list1 = mutableListOf<Int>(1,2,3,4,5,2,7,1,8,9,10)
    // add to list repetitive and unique elements
    list1.add(2,5)
    list1.add(4,12)
    // convsrt list to set
    var set = list1.toMutableSet()
    //print set
    println("set: $set")

    //print size set
    println("set size: ${set.size}")
}