fun run() {

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
