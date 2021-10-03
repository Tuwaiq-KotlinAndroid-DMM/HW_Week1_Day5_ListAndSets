fun main(){

    //Part II - Practice with Lists and Sets

    //Create a list and return a data from it, the update or add elements to it

    var lisNames = mutableListOf<String>("amal","maha","layan","talen","mona","manar")
    //add element ( faisl )
    lisNames.add("faisl")
    //update element ( mone -> maha )
    lisNames[2]="maha"

    //Create a list then add repetitive and unique elements to it
    lisNames.addAll(arrayOf("ahmad","ali","amal","layan"))
    println("My list values is : $lisNames")

    //convert it to set
    var setName = lisNames.toMutableSet()
    //add new elements to it
    setName.addAll(arrayOf("fars","nawaf"))
    //check the set alue
    println("My set values is : $setName")
}


