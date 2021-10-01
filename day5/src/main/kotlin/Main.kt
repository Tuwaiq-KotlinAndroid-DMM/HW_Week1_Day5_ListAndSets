// scope of functions

class School() {

    lateinit var students:String
    lateinit var mission: String
}





    fun main(args: Array<String>) {


    // list
    var numbers = mutableListOf<Int>(5, 6, 7, 8)
    println(numbers)
    // aslo
    numbers.also {
        it.add(4, 9)
        println(it)
    }


//run

    var schoolName: School? = null
    println("unknown")
    schoolName?.run {
        println(this.students)
        println(this.mission)
    }


// apply
    var najd = School()
    najd.apply {
        this.students = "40"
        this.mission = "to teach young generation and prepare them to lead"

    }
    println(najd.mission )

    // let

    var alfaisaliah = School().let { najd.students = "50" }

    println(najd.students)
}


