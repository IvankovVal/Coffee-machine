class Coffemachine {
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    fun bt() {
        println("Включить кофе-машину? Y/N?")
        val btOn = readLine()?.lowercase()
        if (btOn == "y" || btOn == "н" ) {
            println("Приготовление кофе/Сервис<C/S>")
            val mod = readLine()
            when (mod) {
                "c", "с" -> makecoffee()
                "s", "ы" -> addContainer()
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

        conWater -= cofe.water
        conCoffee -= cofe.coffee
        conMilk -= cofe.milk
        conSugar -= cofe.sugar
        conIce -= cofe.ice
        conWhisky -= cofe.whisky
        conCups -= cofe.cups
        println("Ваш кофе готов")
        clean ()
        printContainer()
        navigation ()
    }
    "c", "с" -> {
        val cofe: Cappuccino = Cappuccino()
        conWater -= cofe.water
        conCoffee -= cofe.coffee
        conMilk -= cofe.milk
        conSugar -= cofe.sugar
        conIce -= cofe.ice
        conWhisky -= cofe.whisky
        conCups -= cofe.cups
        println("Ваш кофе готов")
        clean ()
        printContainer()
        navigation ()
    }
    "f", "а" -> {
        val cofe: Frappe = Frappe()
        conWater -= cofe.water
        conCoffee -= cofe.coffee
        conMilk -= cofe.milk
        conSugar -= cofe.sugar
        conIce -= cofe.ice
        conWhisky -= cofe.whisky
        conCups -= cofe.cups
        println("Ваш кофе готов")
        clean ()
        printContainer()
        navigation ()
    }
    "i", "ш" -> {
        val cofe: Irish = Irish()
        conWater -= cofe.water
        conCoffee -= cofe.coffee
        conMilk -= cofe.milk
        conSugar -= cofe.sugar
        conIce -= cofe.ice
        conWhisky -= cofe.whisky
        conCups -= cofe.cups
        println("Ваш кофе готов")
        clean ()
        printContainer()
        navigation ()
    }
    "r", "к" -> {
        craftCoffee()

    }}}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



    fun choiceInContainer() {
        println("Продолжить обслуживание<S> Приготовить кофе <C> Выйти <Q> ")
        val choiceInContainer = readLine()
        when (choiceInContainer) {
            "s", "S" -> addContainer()
            "c", "C" -> makecoffee()
            "q", "Q" -> println("Кофе-машина выключена") }}
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    fun printContainer() { //Печать содержимого контейнера
        println(
            """
                В контейнере осталось:
        воды - $conWater
        кофе - $conCoffee
        молока - $conMilk
        сахара - $conSugar
        льда - $conIce
        виски - $conWhisky
        стаканчиков - $conCups
    """.trimIndent()
        )}
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


    fun clean (){
    if (conCups % 5 == 0) {println("Очистка кофе-машины")}}
     fun navigation (){
         println("Приготовить кофе<C> Сервис<S> Выключить кофе-машину<Q>")
         val nav = readLine()?.lowercase()
         when (nav){
             "c", "с" -> return makecoffee()
             "s", "ы" -> return addContainer()
             "q", "й" -> println("Кофе-машина выключена")
             else -> {
                 println("Ошибка ввода попробуйте ещэ раз")
                 return navigation ()
             }
         }
     }



    }


