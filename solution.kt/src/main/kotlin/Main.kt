data class Student(var name: String, var subject: String)
{




}
fun main(args: Array<String>) {
   //1- Practice with Scope Functions.
    // let , run , also examoles
    //let--->

   /* Student("Abdulrazaq", "kotlin").let {


    }
    //let
    var studentlastname = "sami"
    var studenlastlength = studentlastname.let { it.length }
    println("famly name length: $studenlastlength")

    //run-->
    var firstyearstudent: Student?= null
    println("student name")
    firstyearstudent?.run {
        print(this.name)
        println(this.subject)

    }
    //also-->

    var mylist = mutableListOf< String>( "abdulrazaq", "Ahemed")
    println(mylist)
    mylist.also {
        it.add("saleh")
        it.remove ("Ahemed")
    }
    println(mylist)

//solution part 2
*/
    var mylist1 = mutableListOf< Int>( 1, 2)
    println(mylist1)
    mylist1.also {
        it.add(3)
        it.add(4)
        it.add (5)
    }
    println(mylist1)
    var myset = mutableSetOf<Int>(1, 2, 3)
    myset.add (1)
    myset.add (2)
    myset.add (2)
    myset.add (3)
    println(myset)
//solution part3
    // the cases to use the map in is to refer an objects to key value, connecting or linking them
    //together, example to link id number to the name


    var mymap = mutableMapOf<String, Int>()


    for (i in 1..20) {
       mymap["$i"] = i + 0
    }

    println(mymap)

}
