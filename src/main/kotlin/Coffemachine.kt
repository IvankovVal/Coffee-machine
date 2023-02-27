class Coffemachine {
    private val container: Container = Container()

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    fun bt() {
        println("Включить кофе-машину? Y/N?")
        val btOn = readLine()?.lowercase()
        if (btOn == "y" || btOn == "н" ) {
            println("Приготовление кофе/Сервис<C/S>")
            val mod = readLine()?.lowercase()
            when (mod) {
                "c", "с" -> makecoffee()
                "s", "ы" -> container.addContainer()
                else -> {
                    println("Ошибка ввода")
                    return navigation()

                }
            }}}
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    fun makecoffee() { //Приготовление кофе

        println(
            """Выберете напиток
                Для американа введите - <a>
                Для капучино введите - <c>
                Для фраппе введите - <f>
                Для кофе по-ирландски введите - <i>
                Для кофе по своему рецепту введите <r>
            """.trimMargin())

    val choice = readLine()?.lowercase()
when (choice) {
    "a", "ф" -> {
        val cofe: Americana = Americana()
        makeCoffee(cofe)
    }
    "c", "с" -> {
        val cofe: Cappuccino = Cappuccino()
        makeCoffee(cofe)
    }
    "f", "а" -> {
        val cofe: Frappe = Frappe()
        makeCoffee(cofe)
    }
    "i", "ш" -> {
        val cofe: Irish = Irish()
        makeCoffee(cofe)
    }
    "r", "к" -> {
        val cofe: CraftCoffee = CraftCoffee()
        cofe.takeIngredient()
        if (cofe.water + cofe.coffee + cofe.milk + cofe.sugar + cofe.ice + cofe.whisky > 250){
            println("Слишком много ингридиентов.  Стакан перельётся.")
            return navigation()
        }
        else if (cofe.water < 0 || cofe.coffee < 0 || cofe.milk < 0 || cofe.sugar < 0 || cofe.ice < 0 || cofe.whisky < 0 ){
            println("Допущено отрицательное значение. Попробуйте ещё раз.")
            return navigation()
        }
        else makeCoffee(cofe)
        }
}
    }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    fun makeCoffee(reciepe: Coffee) {
        container.extractFor(reciepe)
        println("Ваш кофе готов")
        clean ()
        printContainer()
        navigation ()
    }



    fun choiceInContainer() {
        println("Продолжить обслуживание<S> Приготовить кофе <C> Выйти <Q> ")
        val choiceInContainer = readLine()
        when (choiceInContainer) {
            "s", "S" -> container.addContainer()
            "c", "C" -> makecoffee()
            "q", "Q" -> println("Кофе-машина выключена") }}
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    fun printContainer() { //Печать содержимого контейнера
        container.printContainer()
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    fun clean (){
    if (container.conCups % 5 == 0) {println("Очистка кофе-машины")}}
     fun navigation (){
         println("Приготовить кофе<C> Сервис<S> Выключить кофе-машину<Q>")
         val nav = readLine()?.lowercase()
         when (nav){
             "c", "с" -> return makecoffee()
             "s", "ы" -> return container.addContainer()
             "q", "й" -> println("Кофе-машина выключена")
             else -> {
                 println("Ошибка ввода попробуйте ещэ раз")
                 return navigation ()
             }
         }
     }
 


    }


