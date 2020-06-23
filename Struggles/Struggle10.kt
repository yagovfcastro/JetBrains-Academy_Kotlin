package Struggles

data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            if (value < -92 || value > 57) {
                if (name == "Moscow") field = 5
                if (name == "Hanoi") field = 20
                if (name == "Dubai") field = 30
            } else {
                field = value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    println(when {
        firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees -> "${firstCity.name}"
        secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees -> "${secondCity.name}"
        thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees -> "${thirdCity.name}"
        else -> "neither"
    })
}