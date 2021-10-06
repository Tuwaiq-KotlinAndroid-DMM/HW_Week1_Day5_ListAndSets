////               This is the  Scope functions part of the code
fun main () {
/// let
    val str = "String"
    val strLength = str.let { it.length

    }
    println(strLength)


/// run
    var employee = "Hussain"
    employee = run {
        var employee1 = "Hussain has a car "
        println("Hussain has a car")
        employee1

    }

//also

    var alphabet = mutableListOf ("A , B , C ")
    alphabet.also {
        println("letters are :$it")}
        .add("D")
    println(alphabet)
}