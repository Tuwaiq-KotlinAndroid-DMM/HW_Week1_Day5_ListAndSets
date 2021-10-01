fun main() {
    // Part 2 - Practice lists & sets
    // Q1: Create a list and return a data from it, then update or add elements to it.
    var list1 = mutableListOf<Int>(22, 23, 24)
    list1.add(25)
    list1.remove(23)
    println("The list elements after adding 5 and removing 23 are $list1")
    list1[2] = 26
    println("The list elements are $list1")

    // Q2: Create a list then add repetitive and unique elements to it, the convert it to set,
    // then add new elements to it and check the set value.
    var list2 = mutableListOf<Int>(101, 102, 101, 104, 104, 103, 105)
    println("The second list elements are $list2")
    var set = list2.toMutableSet()
    set.add(106)
    set.add(101) // it will not add it
    set.add(107)
    println("The set elements are $set")
}