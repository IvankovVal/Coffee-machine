fun choiceInContainer () {
    println("Продолжить обслуживание<S> Приготовить кофе <C> Выйти <Q> ")
    val choiceInContainer = readLine()
    when (choiceInContainer){
        "s", "S" -> addContainer ()
        "c", "C" -> run()
        "q", "Q" -> println("Кофе-машина выключена")
    }
}
fun printContainer (){ //Печать содержимого контейнера
    println("""
        $conWater
        $conCoffee
        $conMilk
        $conSugar
        $conIce
        $conWhisky
        $conCups
    """.trimIndent())
}
fun run() { //Приготовление кофе

    println(
        """Выберете напиток
Для американа введите - <a>
Для капучино введите - <c>
Для фраппе введите - <f>
Для кофе по-ирландски введите - <i>
""".trimMargin()
    )

    val choice = readLine()
    when (choice) {
        "a", "A", "ф", "Ф" -> {
            var cofe: Americana = Americana()
            cofe.makeCoffee()
        }
        "c", "C", "с", "С" -> {
            var cofe: Cappuccino = Cappuccino()
            cofe.makeCoffee()
        }
        "f", "F", "а", "А" -> {
            var cofe: Frappe = Frappe()
            cofe.makeCoffee()
        }
        "i", "I", "ш", "Ш" -> {
            var cofe: Irish = Irish()
            cofe.makeCoffee()
        }

    }

}
