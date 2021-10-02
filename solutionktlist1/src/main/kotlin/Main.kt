fun main(args: Array<String>) {
    var name:String?= null
    name?.let{it
    println("waad")}
}

    class School(){
        lateinit var studentsNames:String
        lateinit var teachersNames:String
        lateinit var adminNames:String
    }
    fun main(){
        var School:School?=null
        println("School studentsNames:")
        School?.run{
            println(this.studentsNames)
            var Dammam=School
        }
    } fun numbers(){
        var list = mutableListOf<Int>(2,7,9,10)
    println(list)
    list.also { it
    it.add(5)
    it.remove(9)}
    println(list)
    } 


