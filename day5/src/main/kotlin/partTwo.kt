fun main() {

    // creating a list
    var myList = mutableListOf<String>("hind", "ziad", "ziad", "alzarah")

//     returning a data from the list
    for (list in myList) {
        println(list)
    }

    // adding and removing elements
    myList.add("studies Kotlin")



    // also

    myList.also { it.add("and she enjoys it") }



    // converting a list to a set

    var mySet = myList.toMutableSet()
    println(mySet)

    mySet.forEach { println(it) }

}










