//QUESTION1-HW5-WEEK1

//part1 using Let

/*fun main(){
    var a: String? = null
    a?.let {
        println(it)
    }

    a="welcome winter"
    a?.let {
        print(it)
    }
}*/

//part2 using Run
/*class secondgratdeteachersname(){

    lateinit var class1: String
    lateinit var class2: String
    lateinit var class3: String
}

fun main() {

    var secondgratdeteachersname: secondgratdeteachersname?=  null
    println( "elementryschool name:")
    secondgratdeteachersname?. run{
        print(this.class1)
        print(this.class2)
        print(this.class3)
    }

    var name = secondgratdeteachersname().apply {
        this.class1 = " Arwa Alomari"
        this.class2 = " Luliya Wail"
        this.class3 = " Amani Saleh"

        println(this.class1)
        println(this.class2)
        println(this.class3)

    }

    }*/


//part3 also


/*fun main(){

    var list = mutableListOf<String>("ARWA","SALEH","AHMAD","OBEAD")

    list.also{
        it.add("ALOMARI")
        it.remove("OBEAD")
    }

    print(list)
}*/

//QUESTION2-HW5-WEEK1
// part1
/*fun main(){
    var list = mutableListOf<String>("ARWA","SALEH","AHMAD","ALOMARI")
    println(list)
    list[0]= ("AHMAD")
    list[1]= ("SALEH")
    list[2]= ("ALOMARI")
    list[3]= ("ARWA")

    println("Edited list $list")
}*/

//part2

/*fun main() {
    var list = mutableListOf<Int>(2, 4, 6, 8, 10, 12)
    println("list = $list")
    list.add(14)
    list.add(16)

    var set = list.toMutableSet()
    set.add(18)
    set.add(20)
    println("set = $set")
}*/

////QUESTION2-HW5-WEEK1

// part1

//Write an asnwer to this question: What are the cases that I need to use the map for??


//       Answer: When we need to connect two pieces of information,
//       we usually use a map [object (key) to another object (element)].


//part2

/*fun main() {
    var map = mutableMapOf<String, Double>()


    for (num in 1..20) {

        map.put("$num", num.toDouble())

        println(map)
    }
}*/


