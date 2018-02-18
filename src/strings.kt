fun main(args: Array<String>) {
    val str = "Kotlin is awesome!"
    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()
    println(uppercase)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)

    val name = "Yogie"
    val age = 29
    val isMale = true
    val laptop = "MacBook Pro"
    println("$name is $age years old. He is $isMale male. His laptop is ${laptop.toUpperCase()}")
}