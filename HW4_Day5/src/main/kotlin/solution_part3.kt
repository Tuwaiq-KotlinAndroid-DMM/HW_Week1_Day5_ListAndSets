fun main() {
    // Part 3 - Practice with maps

    /* Q1: What are the cases that I need to use the map for?
       Answer: When we need to connect two pieces of information, we usually use a map [object (key) to another object (element)].
       As an example, the student ID could be linked to the student's grade, college name, or major.
       Another example, "+966" -> "Saudi Arabia" is to link the country phone code number to the country name.
    */

    /* Q2:
       For this question, I created a program that allows teachers to enter a student's midterm grade and calculate the average of the grades.
       Assume there are 20 students. The map key will serve as their unique identifier, and it will take the form of high school graduation
       year & 0 & #NO.
    */
    // I assumed their graduation year from high school is 2017
    var i = 1
    var total = 0.0
    var avg = 0.0
    var map = mutableMapOf<String, Double>()
    do {
        println("Enter the midterm grade for student#$i")
        var element = readLine()!!.toDouble()
        map["2170$i"] = element
        total += element
        i++
    } while (i <= 20)

    map.forEach { (t, u) ->
        println("Student ID: $t,\t Midterm Grade: $u")
    }
    avg = total / (map.size).toDouble()
    println("\n\nThe Midterm average is ${"%.1f".format(avg)}")
}
