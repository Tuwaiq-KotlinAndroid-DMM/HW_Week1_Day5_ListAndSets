fun main() {

    var myList = mutableListOf("Ahmed","Ali", "Hassan", "Hussain")
    myList.add ("Ahmed")
    /// This part of the code returns a data using(for) loop feature
    for(names in myList) {
        println(names)
    }
    var mySet = myList.toMutableSet()
    mySet.add("Ali")

    println(mySet)
}