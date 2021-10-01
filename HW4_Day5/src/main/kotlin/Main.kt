import java.util.*

class Human() {
    lateinit var name: String
    lateinit var gender: String
    var age: Int = 0

    fun printInfo() {
        println("$name's information:\nAge -> $age\nGender -> $gender")
    }
}

fun main(args: Array<String>) {
    // Part 1 - Practice with scope functions.

    var human = Human() // create a Human object
    println("Please enter your name:")
    var name = readLine()
    var userAge: Int = 0
    var currentYear = Calendar.getInstance().get(Calendar.YEAR) // get the current year

    // 1. let - I use it to calculate the age
    try {
        println("Enter the year of your birth: ")
        var year = readLine()?.toInt() ?: 0
        year?.let {
            if (it != 0) {
                userAge = currentYear - it
                println("Your age is $userAge")
            }
        }
    } catch (e: Exception) {
        println("Please enter a valid year of birth")
    }
    println("Please choose your gender:\n1. Female\t2. Male\t\tPress anything if you prefer not to say")
    var genderCh = readLine()
    val gender: String
    gender = when (genderCh) {
        "1" -> "Female"
        "2" -> "Male"
        else -> "Prefer not to say"
    }
    // 2. run
    human?.run {
        this.name = name!!
        this.gender = gender
        this.age = userAge
    }
    human.printInfo()

    // 3. also
    var numbers = mutableListOf<Int>(1,2,3,4)
    numbers.also {
        it.add(5)
        it.removeAt(2)
    }
    println(numbers)
}
