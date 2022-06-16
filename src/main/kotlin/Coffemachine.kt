class Coffemachine {
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    fun bt() {
        println("Включить кофе-машину? Y/N?")
        val btOn = readLine()
        if (btOn == "Y" || btOn == "y" || btOn == "н" || btOn == "Н") {
            println("Приготовление кофе/Сервис<C/S>")
            val mod = readLine()
            when (mod) {
                "c", "C", "С", "с" -> makecoffee()
                "s", "S", "ы", "Ы" -> addContainer() }}}
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

    val choice = readLine()
when (choice) {
    "a", "A", "ф", "Ф" -> {
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
    "c", "C", "с", "С" -> {
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
    "f", "F", "а", "А" -> {
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
    "i", "I", "ш", "Ш" -> {
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
    "r", "R", "к", "К" -> {
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
         println("Ещё кофе<C> Сервис<S> Выключить кофе-машину<Q>")
         val nav = readLine()
         when (nav){
             "c", "C", "с","С" -> return makecoffee()
             "s", "S", "Ы", "ы" -> return addContainer()
             "q", "Q", "й", "Й" -> println("Кофе-машина выключена")
         }
     }



    }


