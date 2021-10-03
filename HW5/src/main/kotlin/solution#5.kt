
fun main(){


    val myMap= mutableMapOf<String,Double>("Ab1" to 1.0)
    var key1="Ab"
    var key2=1
    var value1=2.0


    for(key2 in 1 .. 19){
        myMap.put(key1 + (key2 + 1), value1++)
    }
    //myMap.put("Ab"+1,2.00)
    println(myMap)


}