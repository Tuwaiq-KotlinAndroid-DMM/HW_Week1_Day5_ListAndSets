import kotlin.jvm.internal.Intrinsics

/* What are the cases that I need to use the map for?
  to hold data in the form of pairs which consist of a key and a value.
  Map keys are unique and the map holds only one value for each key.
*/

// the goal of this program is to make class list that contains of 20 students their ages are between 24 & 29
fun main(){
    var KotlinClass = mutableMapOf<String,Double>()
    var name:String
    var age: Double
    println("Enter Students names & ages:")
    for(i in 1..20){
        println("$i - name:")
        name = readLine()!!
        println("enter his age: ")
        age = readLine()!!.toDouble()
        while(age <= 23 || age >= 30){
            println("student age must be above than 23 and less than 30")
            age = readLine()!!.toDouble()
        }
        KotlinClass.put(name,age)

    }
    println(KotlinClass)
}

