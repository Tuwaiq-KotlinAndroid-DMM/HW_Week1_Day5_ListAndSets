fun main(args: Array<String>) {


   var a = 7
    var b = 9
     var c = "hello"
    var le = a.let { it + b }.let { it * 6 }
 println("this is an example of let function")
    println("the result -> ${le} \n"  )

    var run = c.run {
     println("this is an example of run function")
     println ("hello every one\n" )
    }

data class student (val name:String,val age :Int)
 println("this is an example of also function")
 var student1 = student("Ahmed", 21).also {
  println("create one student name: ${it.name} ,age: ${it.age}")
 }
println("${student1} \n")




}