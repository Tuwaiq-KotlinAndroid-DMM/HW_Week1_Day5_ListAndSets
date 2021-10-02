//part 3
//i need some complex data types as keys, need the insertion-ordering of your keys and Map is more flexible in use-cases and has consistent syntax.
fun main() {
    var number = mapOf<String, Double>(
        "first" to 1.0, "second" to 3.6, "third" to 8.0, "fourth" to 7.0,
        "fifth" to 9.0, "sixth" to 4.0, "seventh" to 5.5, "eighth" to 5.0,
        "ninth" to 6.7, "tenth" to 6.6, "eleventh" to 11.2, "twelfth" to 6.7,
        "thirteenth" to 5.7, "fourteenth" to 9.0, "fifteenth" to 4.4, "sixteenth" to 2.1,
        "seventeenth" to 18.8, "eighteenth" to 6.6, "nineteenth" to 69.69, "twentieth" to .6
    )
    number.forEach() {
        println(it)
    }
}


