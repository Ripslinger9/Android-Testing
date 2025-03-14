fun main() {

    println("Vehicle List")

    mobil()
    motor()
    pesawat()

    kelompok()
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

fun kelompok(){

    var namamember = listOf("Hanif", "Rifqi", "Daffaan", "Hapis")

    println(namamember)
}
