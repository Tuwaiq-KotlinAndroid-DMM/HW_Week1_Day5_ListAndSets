////    Q1 : Scope functions
fun main () {
/// let
    val str = "String"
    val strLength = str.let { it.length

    }
    println(strLength)


/// run
    var employee = "khalid"
    employee = run {
        var employee1 = "khalid is happy "
        println("Darla is happy")
        employee1

    }

//also

    var alphabet = mutableListOf ("A , B , C ")
    alphabet.also {
        println("letters of alphabet are :$it")}
        .add("D")
    println(alphabet)
}
