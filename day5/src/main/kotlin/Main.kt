////this is for run and let
//fun main(){
//    var a:Int? = null
//    a?.let{
//        println(it)
//    }
//    a = 20
//    a?.run{
//        println(this)
//    }
//}
////this is for also
//fun main(){
//    var list = mutableListOf<Int>(1,2,3,4)
//    println(list)
//    list.also {
//        it.add(5)
//        it.remove(1)
//    }
//    println(list)
//
//}
////////////////////////////////////


//part2-a
//fun main() {
//
//    var x = mutableListOf<Int>(2,4,6)
//    x.add(8)
//    println(x)
//
//}

//part2-b
//fun main() {
//        var x = mutableListOf<Int>(2,4,6)
//    x.add(8)
//    x.add(2)
//    println(x)
//    var set = x.toMutableSet()
//    set.add(4)
//    println(set)
//}
//part3
//The default implementation of Map – LinkedHashMap – preserves the order of elements insertion when iterating the map. In turn, an alternative implementation – HashMap – says nothing about the
//fun main(){
//    //Initialization of List
//    var list = mutableListOf<Int>(1,2,3)
//
//    // List Operations
//    list.add(5)
//    list.remove(1)
//    println(list)
//    println(list.get(2))
//    println(list.getOrNull(5))
//    println(list.getOrElse(5, {it}))
//    println(list)
//    println(list.size)

// Sorting
//    list.sort()
//    println(list)
//
//    list.sortDescending()
//    println(list)
//
//    list.reverse()
//    println(list)

// loops
//    for(num in list){
//        println(num)
//    }
//
//    list.forEachIndexed { i, el ->
//        println(i.toString() + " ------ " + el)
//    }
//
//    if(30 in list){
//        println("true")
//    }
//    else
//    {
//        println("false")
//    }

//    val students = listOf<String>("Saad","Ali","Muhammad")
//    val mutableStudents = students.toMutableList()
//    val readonly = mutableStudents.toList()
//}


//fun main(){
//    // Initialization
//    var set = mutableSetOf<Int>(1,2,3,4, 1, 3)
//    println(set)
//    set.add(5)
//    set.remove(1)
////    println(set.size)
//    println(set)
//
//    for(num in set){
//        println(num)
//    }
//
//}
//
//fun main(){
//    var noor = mutableMapOf<String, Double>("one" to 1.0,
//        "two" to 2.0, "three" to 3.0,"four" to 4.0,"five" to 5.0,"six" to 6.0,"seven" to 7.0,"eight" to  8.0,
//        "nine" to 9.0,"ten" to 10.0,"eleven" to  11.0,"twelve" to 12.0,"thirteen" to 13.0,"fourteen" to 14.0,
//        "fifteen" to 15.0,"sixteen" to 16.0, "seventeen" to 17.0, "eighteen" to 18.0, "nineteen" to 19.0, " twenty" to 20.0)
//    println(noor)}
//

