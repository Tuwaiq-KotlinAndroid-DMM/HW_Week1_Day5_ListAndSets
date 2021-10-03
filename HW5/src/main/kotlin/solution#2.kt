fun main() {

    var list = mutableListOf<Char>('A', 'B', 'C', 'D')
    println(list)


    //add element to list
    list.add(4, 'E')
    println(list)


    //update element in the list
    list.set(0, 'a')
    println(list)

}
