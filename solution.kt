import java.lang.reflect.Array.set

//HWListAndSets
//
//The Homework has three components
//
//1- Scope Functions.
//2- Lists and Sets.
//3- Maps.
//
//
//Instructions:
//Part I - Practice with Scope Functions.
//Create a working example withing 'Let, Run, and Also'

//Part II - Practice with Lists and Sets.
//Create a list and return a data from it, the update or add elements to it
//Create a list then add repetitive and unique elements to it, the convert it to set, then add new elements to it and check the set value

//Part III - Practice with Maps.
//Write an answer to this question: What are the cases that I need to use the map for
//Create a map of 20 elements of string key and double value





fun main() {
//
////Part I - Practice with Scope Functions.
//    //*****************Let***********************
    var yuga: Int? = null
    yuga?.let { println(it) }
    yuga = 20
    yuga?.let { println(it) }
//    //*****************Let***********************
//
//    //*****************run***********************
    var company: university? = null
    println("university Name:")
    company?.run { print(this.title) }

    var yuga1 = university().apply { title = "Tuwaiq Academy"; position = "student"; salary = "average" }

    print("university Name: ")
    yuga1?.run { print(this.title) }


//    //*****************run***********************
//
//    //*****************also***********************
     var list = mutableListOf<Int>(1,2,3,4)
    println(list)
    list.apply { this.add(5); this.remove(2) }
    println(list)

    //*****************also***********************

//Part II - Practice with Lists and Sets.

var ahmedList = mutableListOf<String>("Khalid", "Faisal", "Ali", "Saad")
    println(ahmedList)

// Adding the element of "Tuwaiq Academy" @ Index # [4]
    ahmedList.add(4, "Tuwaiq Academy")
    println(ahmedList)

    //Updating all elements in [ahmedList] with new string values
    ahmedList.set(0, "Red");ahmedList.set(1, "Black");ahmedList.set(2, "Yallow");ahmedList.set(3, "Blue");ahmedList.set(4, "Kotlin-Path")
    println(ahmedList)


    var ahmedlist2 = mutableListOf<String>("1", "2", "3", "4", "5")
    println(ahmedlist2)

    ahmedlist2.add("Ahmed")


    var mySet = ahmedlist2.toSet()
    println(mySet)
    mySet.forEach { println(it) }

////***********************************************************************
//    //Part III - Practice with Maps.

//    //==================================================================================================================
//    //
//    //Q: What are the cases that I need to use the map for?
//    //A: Maps are needed for storing logical connections between objects,  example of that is when assigning employees an ID and their position.
//    //Create a map of 20 elements of string key and double value :

    var Ahmedmap = mutableMapOf<String, Double>(
        "stringkey1" to 3.2, "stringkey2" to 8.4, "stringkey3" to 2.1,
        "stringkey4" to 5.1, "stringkey5" to 4.1, "stringkey6" to 8.1, "stringkey7" to 32.2, "stringkey8" to 43.1, "stringkey9" to 43.6, "stringkey10" to 11.20,
        "stringkey11" to 2.1, "stringkey12" to 33.1, "stringkey13" to 34.1, "stringkey14" to 62.1, "stringkey15" to 23.1,
        "stringkey16" to 4.1, "stringkey17" to 40.1, "stringkey18" to 1354.1, "stringkey19" to 19.1, "stringkey20" to 22.1
    )
    println(Ahmedmap)




}




class university() {
     lateinit var title: String
     lateinit var position: String
     lateinit var salary: String
}