class Company(){
    lateinit var name:String
    lateinit var objectives:String
    lateinit var founder:String
}
fun main(args: Array<String>) {
    ////////// also ////////////////
    var list = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    println(list)

    list.also {
        it.add(4,5)
        it.remove(2)
    }
    println(list)
    ///////////////////////////

    ////// run and let ////////////
    var misk = Company()
    misk.apply { name = "misk Academy"
        objectives= "To make the future btight"
        founder = "abdulaziz rajeh"
    }

    var company :Company? = null

    company?.run { println(company.name) }
    company?.let { println(company.name)  } ?: run { println("company not have name")

        }



}
