open class Coffemachine() {
        fun bt() {
        println("Включить кофе-машину? Y/N?")
        var btOn = readLine()
        if (btOn == "Y" || btOn == "y" || btOn == "н" || btOn == "Н") {
            println("Приготовление кофе/Сервис<C/S>")
            val mod = readLine()
            when (mod) {
                "c", "C", "С", "с" -> run()
                "s", "S", "ы", "Ы" -> addContainer()

            }
        }
    }

    fun choiceInContainer() {
        println("Продолжить обслуживание<S> Приготовить кофе <C> Выйти <Q> ")
        val choiceInContainer = readLine()
        when (choiceInContainer) {
            "s", "S" -> addContainer()
            "c", "C" -> run()
            "q", "Q" -> println("Кофе-машина выключена")
        }
    }

    fun printContainer() { //Печать содержимого контейнера
        println(
            """
        $conWater
        $conCoffee
        $conMilk
        $conSugar
        $conIce
        $conWhisky
        $conCups
    """.trimIndent()
        )
    }

    open fun run() { //Приготовление кофе

        println(
            """Выберете напиток
Для американа введите - <a>
Для капучино введите - <c>
Для фраппе введите - <f>
Для кофе по-ирландски введите - <i>
Для кофе по своему рецепту введите <r>
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
            "r", "R", "к", "К" -> randomCoffee()

        }

    }
}
