fun main(){

    var car_1=Car()
    var car_2=Car()
    var car_3=Car()

    car_1.apply{
        BrandName ="Honda"
        carName ="Accord"
        carColor="white"
    }


    car_2.run{
        this.carName="sunny"
        this.BrandName="toyota"
        this.carColor="silver"
        println(this.BrandName +this.carName +this.carColor)
    }
    car_1?.let {
      println(it.carColor + it.carName +it.BrandName)
    }

    val cars = mutableListOf("honda", "ford", "toyota")
    cars.also { println("The list of three cars: $it") }.add("mazda")
    println("The list of four cars: $cars")
}




class Car {
    lateinit var BrandName:String
    lateinit var carName:String
    lateinit var carColor: String

}