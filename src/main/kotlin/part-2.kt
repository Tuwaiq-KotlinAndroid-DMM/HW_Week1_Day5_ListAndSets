fun main() {
// Q2 : creating a list then converting list to set

    var myList = mutableListOf("hala","lama", "lama", "nora")
        myList.add ("samya")
    /// returning a data using(for) loop
    for(names in myList) {
        println(names)
    }
    var mySet = myList.toMutableSet()
    mySet.add("reem")

    println(mySet)
}