fun main() {
    println("Включить кофе-машину? Y/N?")
    var btOn = readLine()
    if (btOn == "Y" || btOn == "y"){
        println("Приготовление кофе/Сервис<C/S>")
        val mod = readLine()
        when (mod) {
            "c"-> run()
            "s"-> addContainer ()

        }
        }
}

