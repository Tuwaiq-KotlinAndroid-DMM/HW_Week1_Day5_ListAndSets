//Part I - Practice with Scope Functions.
//Create a working exmaple withing 'Let, Run, and Also'
class House() {
    var Number_of_livingRooms: Int = 1
    var Number_of_bedroom: Int = 2
    var Number_of_Bathrooms: Int = 3
    var Number_of_kitchens: Int = 4

}

fun main() {

    //example using run
    var house: House? = House()
    house?.run {
        println(this.Number_of_bedroom)
        println(this.Number_of_kitchens)
        println(this.Number_of_Bathrooms)


    }


//working example using (Also)
//Ex1
    var familyHouse = House().also {
        it.Number_of_bedroom = 8
        it.Number_of_Bathrooms = 8
        it.Number_of_kitchens = 2
        it.Number_of_livingRooms = 2

        println(it.Number_of_kitchens)
    }
//Ex2

    var the_list = mutableSetOf<String>("Abdullah", "Ahmed", "Ali", "Hussain", "John", "David", "Thomas", "Ryan")
    the_list.also {
        it.add("Adrian")
        it.remove("Abdullah")


    }
    println(the_list)


//working example using Let

//Example

//    var myList = listOf<Int>(1,23,4,56,77,854,33,455)
//    myList?.let {
//        println(it.get(7))


    var x: Double? = null
    var y = x?.let {
        println(it)
    }
    println("\n")
    println("Part II - Practice with Lists and Sets.")
//Create a list and return a data from it, the update or add elements to it
    var xList = mutableListOf<Int>(1, 2, 4, 56, 7, 4, 3, 5, 1, 1, 1, 2)
    println("List without any changes $xList")
    xList.add(33)
    xList.removeAt(1)
    println("List with changes $xList")
    println("\n")
    println("when changing it to set :")
    var theSet = mutableSetOf<Int>()
    for (set in xList) {
        theSet.add(set)

    }

    theSet.add(5)
    theSet.add(100)
    println("after add to the set :")
    println(theSet)
    println("\n")
    println("Part III - Practice with Maps.")
//Write an answer to this question: What are the cases that I need to use the map for
// one case would be when you have multiple products, and you want to assign the price for and modify it
// another case would be when you want to update bank account

    var map = mutableMapOf<String, Double>(
        "Avocado" to 1.22, "Strawberry" to 2.0, "Apple" to 2.50, "Watermelon" to 1.50, "Raspberry" to 4.20,
        "Peach" to 5.50, "Grapefruit" to 3.33, "Blueberry" to 4.0, "Lemon" to 2.89, "Coconut" to 3.10, "Kiwie" to 5.0,
        "Papaya" to 1.80, "Papaya" to 2.45, "Nectarine" to 3.60, "apricot" to 4.10, "melon" to 2.50, "Kumquat" to 6.77,
        "White currant" to 3.33, "Star apple" to 7.20, "Salak" to 3.77, "Salak" to 6.60, "Pear" to 3.95
    )

    println(map.size)

//    var map = mutableMapOf<String, Double>()
//    println("Enter the number of number of fruit you want to add: ")
//    var number_of_fruit = readLine()!!.toInt()
//    for (num in 1..number_of_fruit) {
//        println("Enter the name of the fruit you want to add: ")
//        var name_of_fruit = readLine()!!
//        println("Enter the price of the fruit here:")
//        var the_price = readLine()!!.toDouble()
//        map.put(name_of_fruit, the_price)
//
//    }
//    println(map)
}

