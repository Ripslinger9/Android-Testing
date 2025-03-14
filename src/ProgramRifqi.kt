fun main() {

    println("Vehicle List")

    mobil()
    motor()
    pesawat()
}

fun mobil(){
    var cars = mutableMapOf(
        "Lamborghini" to "Aventador",
        "Ferrari" to "Testarossa",
        "Porsche" to "Panamera"
    )
    println(cars)
}

fun motor(){
    var motors = mutableMapOf(
        "Kawasaki" to "Ninja",
        "Ducati" to "Panigale",
        "BMW" to "1100rr"
    )
    println(motors)
}

fun pesawat(){

    var planes = mutableListOf("Boeing", "Airbus")
    var helis = listOf("Sikorsy", "Blackhawk")

    println(planes)
    println(helis)
}
