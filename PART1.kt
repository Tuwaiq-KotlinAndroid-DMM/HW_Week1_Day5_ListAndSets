//Part I - Practice with Scope Functions.

//run
class Person() {
    lateinit var name: String
    lateinit var City: String
    var Age: Int = 0
}
fun main(){
    var Person1 = Person()

    Person1.run {
        this.name="Hanaa"
        this.City="Dammam"
        this.Age=32

        println(this.name)
        println(this.City)
        println(this.Age)
    }

//also
    val fruits = mutableListOf<String>("Apple" , "Orange" , "Banana")

    fruits.also {
        it.add("Pear")
        it.remove("Apple")

        println(fruits)

    }

//let
    val person:String? = "Hanaa Alrashidi"
    person.let {
        println(it)
    }

//Part II - Practice with Lists and Sets.
//Q1
    var Animals = mutableListOf<String>("cat","dog","lion")
    Animals.add("tiger")
    Animals.removeAt(1)
    println(Animals)

//Q2
    var number = listOf<Int>(10, 20, 30, 40, 20, 10)

   var convert =number.toMutableSet()

    convert.add(50)
    convert.add(60)
    println(convert)


// Part III - Practice with Maps
//Q1
//I use it when I need to linke the keys to another values .

//Q2

    var mymap = mutableMapOf<String,Double>()

    for (num in 1..20){

        mymap.put("$num",num.toDouble())

        println(mymap)


    }


}