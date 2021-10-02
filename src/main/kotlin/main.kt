//part 1
class Student {
    var name: String? = null
    var age: Int? = null
    var address: String? = null
    var weight: Int? = null
}

fun main() {
    //apply---------------------------------------------------
    //if you want to initialise or configure an object
    var student1 = Student().apply {
        name = "hassan alwesaibi"
        age = 28
        address = "14b st "
        weight = 95
        println("name is $name")
    }
    //also: -------------------------------------------------------------------
    //perform some other oppertion on "student" object
    student1.also {
        it.name = "Mohammed alwesaibi"
        println("new name is ${it.name}")
    }
    //let:-----------------------------------------------------------------
    // It executes the block only if "student"is not null
    val student2 = Student()
    student2?.let {
        println(it.name)
    }
    var ageafterfiveyear = student1?.let {
        println(it.name)
        it.age!! + 5
    }
    println(ageafterfiveyear)
    //with--------------------------------------------------------------------
    // Refer to context object by using "this"
    //if you want to operate on a non-null object
    with(student1) {
        println(name)
        println(age)
        println(weight)
    }
    //run--------------------------------------------------
    // operate on a nullable object and avoid NullPointerException
    student2.run {
        println(this.name)
        println(age)
        println(address)
    }
}
