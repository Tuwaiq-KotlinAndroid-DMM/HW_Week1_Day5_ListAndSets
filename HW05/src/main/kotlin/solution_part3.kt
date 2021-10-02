import java.lang.Exception

fun main() {
    // PART III

    /* map can be used to create a collection of key,value pairs that will have meaningful data.For example:
    we can have map that holds key,value pairs as the following: 1 to "One", 2 to "Two" to hold the number itself,
    and the number written as english word.
     */

    //This program will represent an electronic store. The key value pair will be the product, with its price.

    try {
        var map = mutableMapOf<String, Double>()
        var price: Double
        var product: String
        println("Enter the product first, and then the price of it.")
        for (num in 1..20) {
            print("The product#$num:")
            product = readLine()!!
            print("The price:")
            price = readLine()!!.toDouble()
            map.put(product, price)

        }
        println(map)
    } catch (e: Exception) {
        println(e)

    }
}