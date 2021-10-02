//Also Example
fun main() {
    var numberlist: MutableList<Int> = mutableListOf(1, 2, 3)
    numberlist.also {
        println("The list elements are $it")
        it.add(4)
        println("The list element after adding an element: $it")
        it.remove(2)
        println("The list element after removing an element: $it")

    }
// let example
    val name: String? = "Hello"
    val stringLength = name?.let {
        println(it.reversed())
        println(it.uppercase())
        it.length
    }
    println(stringLength)
//Run Example
    val str = "How Are You?"
    str.run {
        println("The receiver string length: $length")
    }
}

