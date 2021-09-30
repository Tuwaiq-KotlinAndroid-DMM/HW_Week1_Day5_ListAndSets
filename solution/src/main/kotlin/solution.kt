fun main(args: Array<String>) {
    //Part I - Practice with Scope Functions.

    //1- Let

    val nameOfSchool: String? = null
    nameOfSchool?.let {
        println(it)
    } ?: println("This School has no name")
    //another example of let
    var numOfStaff: Int? = null
    numOfStaff?.let {
        println(it)
    }
    numOfStaff = 5
    numOfStaff?.let { println(it) }


    //2-Run

    class MySchool() {
        lateinit var studentName: String
        lateinit var studFaveSub: String
    }

    var schoolNm: MySchool? = null
    println("Student name is not register here")
    schoolNm?.run {
        println(this.studentName)
        println(this.studFaveSub)
    }

    var randSchool = MySchool().apply {
        this.studentName = "Walaa Alshaikh"
        this.studFaveSub = "English"

    }

    //Also
    var mySubject = mutableMapOf<String, Int>("English" to 99, "Physics" to 98, "Math" to 100)
    println(mySubject)
    mySubject.also {
        it.put("Biology", 80)
        it.replace("Physics", 98, 99)
    }
    println(mySubject)


    //Part II - Practice with Lists and Sets.

    var evenNum = mutableListOf<Int>(0, 2, 4, 5, 6, 8)
    evenNum.add(6, 10)
    evenNum.add(7, 12)
    evenNum.add(0, 4)
    println(evenNum)

    var oddNum = mutableListOf<Int>(1, 3, 5, 7, 9)
    oddNum.add(5)
    println(oddNum)
    var newConveted = oddNum.toMutableSet()
    newConveted.add(3)
    newConveted.add(11)
    println(newConveted)


    //Part III - Practice with Maps.
    //the answer: for example -to link the name of the subject (ie:key) to the grade (element)
    // - to link the name (key) with the age (element) "in short to link an object with another".
    var myMaps = mutableMapOf<String, Double>()

    for (num in 1..20) {
        myMaps["$num"] =
            num + 4.5
    }
    println(myMaps)
}