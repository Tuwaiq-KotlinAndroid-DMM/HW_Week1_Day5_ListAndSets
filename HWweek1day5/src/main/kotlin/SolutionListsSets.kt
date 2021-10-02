fun main(){

    //Part II - Practice with Lists and Sets

    //Create a list and return a data from it, the update or add elements to it

    var lisNames = mutableListOf<String>("Zainab","sara","fatimah","nora","kothar","mariam")
    //add element ( ali )
    lisNames.add("ali")
    //update element ( fatimah -> ftoom )
    lisNames[2]="ftoom"

    //Create a list then add repetitive and unique elements to it
    lisNames.addAll(arrayOf("kaled","sadd","Zainab","nora"))
    println("My list values is : $lisNames")

    //convert it to set
    var setName = lisNames.toMutableSet()
    //add new elements to it
    setName.addAll(arrayOf("fahad","naser"))
    //check the set value
    println("My set values is : $setName")
}