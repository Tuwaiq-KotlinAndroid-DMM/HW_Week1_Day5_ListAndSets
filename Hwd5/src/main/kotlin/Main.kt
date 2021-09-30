import javax.print.DocFlavor

//Part 1 /RUN
//class Company(){
//    lateinit var name :String
//    lateinit var Objectives :String
//    lateinit var founder :String
//}
//fun main(){
//    val Google = Company().apply {
//        name = "Google"
//        Objectives = "let your life easy"
//        founder = "Belal"
//    }
//    Google?.run { println(this.name)
//    print("Company objectives :")
//    print(this.Objectives)}
//    }

//PART 1 ALSO
//fun main(){
//    var list = mutableListOf<String>("Welcome","to","the","world")
//    println(list)
//    list.also {
//        it.remove("Welcome")
//        it.remove("to")
//    }
//    println(list)
//}
//PART 1 LET
//fun main(){
//    var a:String? = null
//    a?.let { println(a) }
//    a= "Hi there"
//    a?.let { println(a) }// we can use it instead of a
//}
//PART 2/1
//fun main(){
//    var list = mutableListOf<String>("Hi","to","the","world",)
//    println(list)
//    list[0]= ("Welcome")
//  println("Edited list $list")
//}
//PART 2/2
//fun main(){
//    var list = mutableListOf<Int>(1,2,3,4,4,5)
//    println("list = $list")
//    list.add(6)
//    list.add(1)
//   var set = list.toMutableSet()
//    set.add(7)
//    set.add(7)
//    println("set = $set")
//}
//PART 3/1
//I need it when associate an object called a key with another object
//PART 3/2
//fun main() {
//    var map = mutableMapOf<String, Double>()
//    var i = 1
//    while (i <=20 ){
//        map ["$i"] = i+0.1
//        i++
//    }
//    println(map)
//}
