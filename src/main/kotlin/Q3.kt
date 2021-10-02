fun main (){
    var MAP = mutableMapOf<String, Double>()
    var N = 0
    while (N <= 19) {
        MAP["$N"] = N + 1.0
        N++
    }
    println(MAP)



}