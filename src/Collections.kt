fun main(args: Array<String>) {

    // immutable list
    val cars = listOf("Jazz", "Yaris", "Expander")
    println(cars.sorted())
    println(cars[2])
    println(cars.last())
    println(cars.contains("Jazz"))
    println(cars)

    // mutable list
    val motors = arrayListOf("Beat", "Vario", "Mio")
    println(motors.size)
    motors.add("NMax")
    println(motors)
    motors.add(0, "XMax")
    println(motors)
    println(motors.indexOf("Beat"))
    motors.remove("Beat")
    println(motors)


    // immutable collections
    val profiles = mapOf("Name" to "Yogie", "Phone" to "081290409883")
    println(profiles["Name"])
    println(profiles.get("Name"))
    println(profiles.getOrDefault("Address", "Address does not exist!"))
    println(profiles.values)


    // mutable collections
    val second_profiles = hashMapOf("Name" to "Kevin", "Gender" to "Male")
    second_profiles["Name"] = "Kevin F. R."
    second_profiles.put("Address", "Bogor")
    println(second_profiles)
    second_profiles.remove("Gender")
    println(second_profiles)
    second_profiles.isEmpty()



}