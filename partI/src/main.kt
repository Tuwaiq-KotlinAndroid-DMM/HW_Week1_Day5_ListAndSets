/*Part I - Practice with Scope Functions.
Create a working exmaple withing 'Let, Run, and Also'*/
//============================================================= (also)
//class List {
//    var name:String = ""
//    var id:Int = 0
//    var major:String = ""
//}
//fun main() {
//    var student = List().also { s ->
//        s.name = "Mustafa"
//        s.id = 11601132
//        s.major = "Electrical Engineering"
//    //return the object
//        println(s.name)
//        println(s.id)
//        println(s.major)
//    }
////    println(student.name)
////    println(student.id)     //--> because it's out of the Block ^
////    println(student.major)
//}
//========================================================== (Let)
//fun main() {
//    var name: String? = "Hello World"
//    var example: String? = null
//   var result = name?.let {
//        println("name's length ${it.length}") // here the length will be executed
//        println("name's reversed ${it.reversed()}") //here the String will be reversed
//    "Done"  // ---> this the return of this function && it's gonna be executed
//    }
//        var result2 = example?.let {
//            println("example's length ${it.length}")
//            println("example's reversed ${it.reversed()}")
//            // in this example nothing will gonna be executed because the variable = <null>
//        }
//    println(result)
//    println()
//    println(result2)
//}
//========================================================= (Run)

class List {
    var name:String = "Mustafa"
    var id:Int = 11601123
    var major:String = "Electrical Engineering"
}
fun main(){
    var student:List? = List()

    var result= student?.run {
        println("student's name: ${this.name}")
        println("student's id: ${this.id}")
        println("student's major: ${this.id}")
        "Done"
    }
    println(result)

}