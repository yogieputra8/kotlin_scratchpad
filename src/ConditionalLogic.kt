fun main(args: Array<String>) {

    val name = "Yogie"
    val phone = "081290409883"

    if (name == "Yogie" && phone == "081290409883"){
        println("Hello my name is $name")
    }


    val x = 3
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not equal 1 or 2")
    }


    fun vaderIsFeeling(mood: String = "angry"){
        if (mood == "angry"){
            println("Run baby, run!")
        } else {
            println("don't make him angry!")
        }
    }

    vaderIsFeeling("happy")

}