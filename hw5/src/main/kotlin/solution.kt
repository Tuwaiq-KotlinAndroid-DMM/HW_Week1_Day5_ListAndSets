fun main() {
    val num1 = setOf(1, 2, 3, 4)
    println("The size and number of digits of the set: ${num1.size}")
    if (num1.contains(6)) println("1 does exist in the set")
    else println("not in the set")
println("______________________________________________________________________________________________________")

    val num2 = listOf(1, 2, 3, 4, 5, 6)

    println("A list is printed complete: $num2")
    println("The size and number of digits of the list : ${num2.size}")

    println("The first element of the list has a number of: ${num2[0]}")
    println("The fourth element of the list has a number of: ${num2[1]}")

    println("First: ${num2.first()}")
    println("Last: ${num2.last()}")

    println("List check when a number exist in the list? ${num2.contains(4)}")
println("\n ---------------------------------------------------------------------------------------------------")
    println("Question: What are the cases that I need to use the map for?")
    println("Answer: Maps are used for many reasons. It stores key-value pairs. This is done so that access to value by key, or searching keys is possible")
    println("example follows:")

    val num4 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4,"key5" to 5, "key6" to 6, "key7" to 7,
        "key8" to 8,"key9" to 9, "key10" to 10,"key11" to 11, "key12" to 12, "key13" to 13, "key14" to 14,"key15" to 15,
        "key16" to 16, "key17" to 17,
        "key18" to 18,"key19" to 19, "key20" to 20)

    println("All keys: ${num4.keys}")
    println("All values: ${num4.values}")

    if ("key19" in num4)
        println("Value by key \"key19\": ${num4["key19"]}")
    else println("not correct")
    if (5 in num4.values)
        println("The value 5 is in the map")
    else println("not correct")
    if (num4.containsValue(7))
        println("The value 7 is in the map")
    else println("not correct")


}