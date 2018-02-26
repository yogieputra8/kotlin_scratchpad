fun main(args: Array<String>) {

    var name: String = "Yogie"
    // name = null

    var nullableName: String? = "Do I really exist?"
    nullableName = null

    var length = 0
    if (nullableName != null){
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)


    val l = if (nullableName != null) nullableName.length else -1
    println(l)


    // Second method safe call operator
    println(nullableName?.length)

    // Third method is Elvis Operator
    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me"
    println(noName)
    println(len)


    // !!
    println(nullableName!!.length)

}