fun main(args: Array<String>) {

    val motors = arrayListOf("Beat", "Vario", "Mio")
    val second_profiles = hashMapOf("Name" to "Kevin", "Gender" to "Male")


    // For loop
    for (motor in motors){
        println("Motor: $motor")
    }

    for ((key, value) in second_profiles){
        println("$key is $value")
    }


    // While loop
    var  x = 10
    while (x > 0){
        println(x)
        x--
    }

}