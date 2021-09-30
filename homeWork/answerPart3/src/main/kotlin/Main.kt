fun main() {
       // Q1
    //When I need to associate an object with another object,
    // such as linking the ID status number to a person with his name


        //Q2
    //  create initialization map
    var map = mutableMapOf<String,Double>()
    println(map)
     // add 20 element to map (key,value)
    for (i in 1 .. 20){
        map["$i"] = i + 0.5
    }

    //print map
    println(map)

}