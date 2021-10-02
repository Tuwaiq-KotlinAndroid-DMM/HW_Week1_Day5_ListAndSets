fun main() {

    //Part I - Create a working example withing 'Let, Run, and Also'


    var person1 = Person().also {
        it.name = "Zainab"
        it.birthday = 1993
        it.phoneNumber = 548048523;
        it.city = "Alahsa"
        it.run {
            println("person name is $name , birthday is $birthday " +
                        ", phone Number is $phoneNumber , city is $city")
        }
    }

    person1.let {
        it.name = "Fatimah"
        it.city = "Alhofof"
        it.run {
            println("person name is $name , birthday is $birthday " +
                    ", phone Number is $phoneNumber , city is $city")
        }
    }

}


class Person() {

    lateinit var name: String
    var birthday: Int? = null
    var phoneNumber: Int? = null
    lateinit var city: String
}