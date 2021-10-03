fun main() {
    var list= mutableListOf<Int>(1,2,3,1,2,3,4,5,6,7,8,9)

    println("I am a list $list")

    var set=list.toMutableSet()
    set.add(10)
    println("I'm know a set $set")


}
//converting list to map
//    val numbers: List<numbers> = listOf(
//        numbers("One", "واحد"),
//        numbers("two", "اثنين"),
//        numbers("three", "ثلاثة"),
//        numbers("two", "اثنين"),
//        numbers("two", "اثنين"),
//        numbers("three", "ثلاثة"),
//        numbers("three", "ثلاثة"),
//        numbers("four", "أربعة")
//    )
//
//    println("I am a list\n $numbers")
//
//    numbers.map { it.arabic to it.english }
//    println("I was a list but now I am a map\n $numbers")
//}
//
//data class numbers(var arabic: String, var english: String)