//part 2
fun main() {
    var number = mutableListOf<Int>(1, 2, 3, 4)
    with(number) {
        add(5)
        println(number)// add 5 to list = [1,2,3,4,5]
        remove(3) // remove element = [1,2,4,5]
        println(number)
        removeAt(0) // will remove 1 = [2,4,5]
        println(number)
        number[0] = 9 //replace an element at a given position
        println(number)
    }
    var car = mutableListOf<String>() // empty list
    with(car) {
        add("bmw")
        add("ford")
        add("bmw")
        add("ford")
        add("toyota")
        add("mercedes")
        add("audi")
        println(car) // list = [bmw, ford, bmw, ford, toyota, mercedes, audi]
    }
    var car_set = car!!.toMutableSet()
    println(car_set)// set = [bmw, ford, toyota, mercedes, audi]
    with(car_set) {
        add("bmw") // will not add it bc we have bmw and set contains different elements
        add("chevy")
        remove("toyota")
    }
    println(car_set) // [bmw, ford, mercedes, audi, chevy]
    car_set.also {
        println(it.size) // 5
        it.forEach() {
            println(it)
        }
    }
}


