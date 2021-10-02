class Company() {
    lateinit var name: String
    lateinit var founder: String

}
//             Part I
//                       "run"
//fun main(){
//
//    var company: Company? = null
//    println("Company Name: ")
//    company?.run {
//        print(this.name)
//    }
//
//    var Apple = Company().apply {
//        name = "Apple company"
//        founder = "Steve Jobs"
//    }
//}

//                        "also"

//fun main(){
//    var list = mutableListOf<String>("Turki", "Saad", "Ali")
//    println(list)
//    list.also{
//        it.add("Mohammed")
//        it.remove("Ali")
//    }
//    println(list)
//}


//                         "let"

//fun main(){
//    var myname:String? = null
//    myname?.let{
//        println(it)
//    }
//    myname = "Turki Alhajri"
//    myname?.let{
//        println(it)
//    }
//}

//                       Part II
//fun main() {
//
//    var list = mutableListOf<Int>(1, 2, 3)
//
//    list.add(4)
//    list.add(5)
//
//    println(list)
//
//
//    var list1 = mutableListOf<Int>(1, 2, 3, 4, 5)
//    list1.add(5)
//    println(list1)
//    var convert = list1.toMutableSet()
//    convert.add(2)
//    convert.add(6)
//    println(convert)
//}


//                   Part III
//     using map allows you to transform a collection from one type to another.

//fun main(){
//    var map = mutableMapOf<String, Double>()
//
//
//    for (num in 1..20) {
//        map["$num"] = num+5.8
//    }
//    println(map)
//}