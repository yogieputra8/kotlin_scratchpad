fun main(args: Array<String>) {


    fun forceChoke(){
        println("Hello, my name is yogie...")
    }
    forceChoke()

    fun greetings(name: String){
        println("Hello, my name is $name")
    }
    greetings("yogie")

    fun calculateNumbers(angka1: Int, angka2: Int): Int {
        val result = angka1 + angka2
        return result
    }
    val result = calculateNumbers(3, 8)
    println(result)
    println("Hi, ${calculateNumbers(10, 6)}")

    fun feeling(mood: String = "angry"){
        println(mood)
    }
    feeling("meh")
    

}