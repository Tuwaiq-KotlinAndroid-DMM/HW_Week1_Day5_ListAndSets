fun main()
{
    //Part 1
    var message="Program that converts a name to uppercase letters. What is your name?"
    message.let {
        println(it)

    }
    var uname:String=readLine()!!

    var Ahmad=user()
    Ahmad.name= uname!!
    Ahmad.run {
println("Hello "+this.name)

    }
    Ahmad.also {

        println("Your name in upper case is like this: "+it.name.toUpperCase())
        println("***************************************")
        //part 2
        var lst= mutableListOf<Int>(1, 2, 3)
        println(lst)
        println("Enter a number")
        var num= readLine()?.toInt()
        lst.add(num!!)
        println(lst)
        println("Enter a number to remove it")
        var num2= readLine()?.toInt()
        lst.remove(num2!!)
        println(lst)
        println("***************************************")
        var lst2= mutableListOf<Int>(1,1,2,3,3)
        println("The list which will be converted to a set is "+ lst2)
        println("Enter a number")
        var num3= readLine()?.toInt()
        var set1=lst2.toMutableSet()
        set1.add(num3!!)
        println(set1)
        //part 3
        //Answer: When you want to refer to an index of an element as something other than a number as they will always be a pair and you can just refer to that index if you have so many elements


        var map1= mutableMapOf<String,Double>("1" to 1.0,"2" to 2.0,"3" to 3.0,"4" to 4.0,"5" to 5.0,"6" to 6.0,"7" to 7.0,"8" to 8.0,"9" to 9.0,"10" to 10.0,"11" to 11.0,"12" to 12.0,"13" to 13.0,"14" to 14.0,"15" to 15.0,"16" to 16.0,"17" to 17.0,"18" to 18.0,"19" to 19.0,"20" to 20.0)
        println(map1)
    }
}

class user
{
    lateinit var name:String
}