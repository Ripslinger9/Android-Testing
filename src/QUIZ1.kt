fun main() {
    name()
    racer()
}

fun name(){
    var initial = 'r'
    println("$initial sedang mengendarai mobil")
}

fun racer(){
    var F1 = mutableMapOf(
        "Mercy" to "Mercedes-Benz",
        "McL" to "McLaren",
        "Ferrari" to "Scuderia Ferrari",
    )
    println(F1["McL"])
}