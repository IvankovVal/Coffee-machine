fun run (){
println("""Выберете напиток
Для американа введите - <a>
Для капучино введите - <c>
Для фраппе введите - <f>
Для кофе по-ирландски введите - <i>
""".trimMargin())

var choice = readLine()
    var counter: Int = 1
when (choice) {
    "a" , "A" , "ф" , "Ф" -> {
        var cofe: Americana = Americana()
        cofe.makeCoffee() }
    "c" , "C" , "с" , "С" -> {
        var cofe: Cappuccino = Cappuccino ()
        cofe.makeCoffee() }
    "f" , "F" , "а" , "А" -> {
        var cofe: Frappe = Frappe ()
        cofe.makeCoffee() }
    "i" , "I" , "ш" , "Ш"-> {
        var cofe: Irish = Irish ()
        cofe.makeCoffee() }

}
    counter = (counter + 1)
    if (counter == 3) println("Очистка кофе-машины")
}
