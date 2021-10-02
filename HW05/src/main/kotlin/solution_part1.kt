import java.awt.Color
import java.lang.Exception

fun main() {
    //PART I
    /* Let example is a currency converter. You can convert USD,EUR or SAR. Enter the currency that you want to convert from
    , enter the amount, and the currency you want to convert to. You can only convert from and to USD,EUR and SAR*/
    try {
        println("-----------------LET example------------------------\n")
        println("Enter a currency to convert from (USD, EUR, SAR):")
        var currencyFrom: String = readLine()!!.uppercase()
        println("Enter the amount: ")
        var amount: Double = readLine()!!.toDouble()
        println("Enter a currency to convert to (USD, EUR, SAR):")
        var currencyTo: String = readLine()!!.uppercase()
        currencyFrom.let { from ->
            currencyTo.let { to ->
                amount.let { amount ->
                    var total: Double = when (currencyFrom) {
                        "USD" -> when (currencyTo) {
                            "USD" -> amount
                            "EUR" -> amount * 0.86
                            "SAR" -> amount * 3.75
                            else -> 0.0
                        }
                        "EUR" -> when (currencyTo) {
                            "USD" -> amount * 1.16
                            "EUR" -> amount
                            "SAR" -> amount * 4.35
                            else -> 0.0
                        }
                        "SAR" -> when (currencyTo) {
                            "USD" -> amount * 0.27
                            "EUR" -> amount * 0.23
                            "SAR" -> amount
                            else -> 0.0
                        }
                        else -> 0.0
                    }
                    println("$amount $currencyFrom equals ${"%.2f".format(total)} $currencyTo")
                }
            }
        }

        //Run example is to get the values of green, red and blue in a color :
        println("\n-----------------RUN example------------------------\n")
        var red = Color.LIGHT_GRAY
        red.run {
            println("red value in the color is " + this.red)
            println("blue value in the color is " + this.blue)
            println("green value in the color is " + this.green)
        }
        //Also example
        println("\n-----------------ALSO example------------------------\n")
        var list = mutableListOf<Int>(1, 2, 3)
        list.also {
            it.add(5)
            it.remove(1)
            it.reverse()
            println(it)
            println("The size of the list is " + it.size)
        }
    } catch (e: Exception) {
        println(e)
    }
}