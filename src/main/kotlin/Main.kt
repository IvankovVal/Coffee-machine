fun main() {
    println("Включить кофе-машину? Y/N?")
    var btOn = readLine()
    if (btOn == "Y" || btOn == "y" || btOn == "н" || btOn == "Н"){
        println("Приготовление кофе/Сервис<C/S>")
        val mod = readLine()
        when (mod) {
            "c", "C", "С", "с"-> run()
            "s", "S", "ы", "Ы"-> addContainer ()

        }
        }
}

