
//class Car(val make: String, val model: String, var color: String){
//
//    fun accelerate(){
//        println("vroom vroom")
//    }
//
//    fun details(){
//        println("This is a $color $make $model")
//    }
//
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int){
//
//    fun tow(){
//        println("taking the horses to the rodeo")
//    }
//
//    fun details(){
//        println("The $make $model has a towing capacity of $towingCapacity")
//    }
//
//}




// Inheritance
open class Vehicle(val make: String, val model: String){

    open fun accelerate(){
        println("vroom vroom")
    }

    fun park(){
        println("parking the vehicle")
    }

    fun brake(){
        println("Stop!")
    }

}


class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous mode!")
        super.accelerate()
    }
}


class Truck(make: String, model: String, var towingCapacity: Int) : Vehicle(make, model){
    fun tow(){
        println("Headed to the mountain")
    }
}


class Motor(make: String, model: String) : Vehicle(make, model)


fun main(args: Array<String>) {

    val tesla = Car("Tesla", "Model S", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 100000)
    truck.brake()
    truck.tow()

    val motor = Motor("Honda", "Vario")
    motor.accelerate()


//    val car = Car("Toyota", "Corolla Altis", "Dark Grey")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//
//    val truck = Truck("Ford", "F-150", 10000)
//    truck.tow()
//    truck.details()

}