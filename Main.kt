class School(){
   lateinit var name: String
   lateinit var objectives: String
   lateinit var founder: String
}
fun main(args: Array<String>) {
    //==================================================================================================================
    //Part I - Practice with Scope Functions.
    //==================================================================================================================
    //Create a working example withing 'Let, Run, and Also'
    //==================================================================================================================
    //Let
    var a:Int? = null
    a?.let{
        println(it)
    }
    a = 20
    a?.let{
        println(it)
    }
    //------------------------------------------------------------------------------------------------------------------
    //this
    var tu = School().apply{
        name = "Tuwaiq Academy"
        objectives = "To make the future bright"
        founder = "Muhammad"
    }
    var mi = School().apply{
        name = "Misk Academy"
        objectives = "To make the future bright"
        founder = "Salman"
    }
    println(tu.name)
    println(mi.name)
    //------------------------------------------------------------------------------------------------------------------
    //with
    var tuw = School().apply{
        name = "Tuwaiq Academy"
        objectives = "To make the future bright"
        founder = "Muhammed"
    }
    var mis = School().apply{
        name = "Misk Academy"
        objectives = "To make the future bright"
        founder = "Salman"
    }
    with(tuw) {
        println("$name" + " is founded by " + "$founder" + " And the objective is " + "$objectives")
    }
    with(mi) {
        println("$name" + " is founded by " + "$founder" + " And the objective is " + "$objectives")
    }
    //------------------------------------------------------------------------------------------------------------------
    //run
    var company: School? = null
    println("School Name: ")
    company?.run{
        print(this.name)
    }
    var tuwaiq = School().apply{
        name = "Tuwaiq Academy"
        objectives = "To make the future bright"
        founder = "Saad Iqbal"
    }
    var misk = School().apply{
        name = "Misk Academy"
        objectives = "To make the future bright"
        founder = "Saad khan"
    }

    print("School Name: ")
    tuwaiq?.run{
        print(this.name)
    }
    //------------------------------------------------------------------------------------------------------------------
    //also
    var list = mutableListOf<Int>(1,2,3,4)
    println(list)
    list.apply{
        this.add(5)
        this.remove(2)
    }
    println(list)
 //==================================================================================================================
    //Part II - Practice with Lists and Sets.
    //==================================================================================================================
    //Create a list and return a data from it, the update or add elements to it.
    //Create a list then add repetitive and unique elements to it,
    // then convert it to set, then add new elements to it and check the set value.
    //==================================================================================================================
    var list2 = mutableListOf<Int>(0,1,2,34,70)
    print(list2)
    list2.add(4)
    print(list2)

    var fibo = mutableListOf<Int>(0,1,1,2,3,5,8,13,21,34,55,89)
    println(fibo)
    fibo.add(144)
    fun convertToSet(fibo: MutableList<Int>): MutableSet<Int> { return HashSet(fibo) }
    val fiboSet: MutableSet<Int> = convertToSet(fibo)
    fiboSet.add(233)
    println(fiboSet)

 //==================================================================================================================
    //Part III - Practice with Maps.
    //==================================================================================================================
    //Write an answer to this question:
    //Q: What are the cases that I need to use the map for?
    // Create a map of 20 elements of string key and double value
    //==================================================================================================================
    //
    //Q: What are the cases that I need to use the map for?
    //A: Incase We have large sets of data, map has fast read and write access to them.
    //
    //Create a map of 20 elements of string key and double value :
    var namesAndScores = mutableMapOf(
        "Muhammad" to 2,
        "Bader" to 2,
        "Saad" to 8,
        "Saeed" to 7,
        "Nora" to 3,
        "Hana" to 4,
        "Sarah" to 11,
        "Sawsan" to 12,
        "Shihana" to 15,
        "Sadiah" to 16,
        "Shahad" to 6,
        "Ibtehal" to 5,
        "zainab" to 1,
        "Ali" to 0,
        "Marzooq" to 10,
        "Waleed" to 9,
        "Hamad" to 13,
        "Ibtihal" to 14,
        "Aiman" to 19,
        "Naser" to 20,
    )
    println(namesAndScores)
}

