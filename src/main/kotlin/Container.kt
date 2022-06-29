class Container {

    var conWater: Int = 10000
    var conCoffee: Int = 1000
    var conMilk: Int = 1000
    var conSugar: Int = 1000
    var conIce: Int = 1000
    var conWhisky: Int = 1000
    var conCups: Int = 100

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

    fun extractFor(coffee: Coffee) {
        conWater -= coffee.water
        conCoffee -= coffee.coffee
        conMilk -= coffee.milk
        conSugar -= coffee.sugar
        conIce -= coffee.ice
        conWhisky -= coffee.whisky
        conCups -= coffee.cups
    }
    fun addContainer() {


        println(
            """Добавить ингридиенты
        Добавить воды - <w>. Текущее содержание - $conWater
        Добавить кофе - <c> Текущее содержание - $conCoffee
        Добавить молоко - <m> Текущее содержание - $conMilk
        Добавить сахар - <s> Текущее содержание - $conSugar
        Добавить льда - <i> Текущее содержание - $conIce
        Добавить виски - <p> Текущее содержание - $conWhisky
        Добавить стаканчиков - <t> Текущее содержание - $conCups
        Выйти без изменений - <q>
    """.trimMargin()
        )
        var c: Coffemachine = Coffemachine()
        var serv = readLine()?.lowercase()
        when (serv) {
            "w" -> {
                println("Введите необходимое количество воды. Для пополнения до максимума введите " + (10000 - conWater))
                val add = readLine()?.toInt()
                if ( add in 0 ..(10000 - conWater)) {
                    conWater += add!!
                    c.printContainer()
                    c.choiceInContainer()
                }
                else {
                    println("Ошибка ввода. До максимума введите:" + (10000 - conWater))
                    c.choiceInContainer()
                }

            }

            "c" -> {
                println("Введите необходимое количество кофе. Для пополнения до максимума введите " + (1000 - conCoffee))
                val add = readLine()?.toInt()
                if ( add in 0 ..(1000 - conCoffee)) {
                    conCoffee += add!!
                    c.printContainer()
                    c.choiceInContainer()
                }
                else {
                    println("Ошибка ввода. До максимума введите:" + (1000 - conCoffee))
                    c.choiceInContainer()
                }

            }


            "m" -> {
                println("Введите необходимое количество молока. Для пополнения до максимума введите " + (1000 - conMilk))
                val add = readLine()?.toInt()
                if ( add in 0 ..(1000 - conMilk)) {
                    conMilk += add!!
                    c.printContainer()
                    c.choiceInContainer()
                }
                else {
                    println("Ошибка ввода. До максимума введите:" + (1000 - conMilk))
                    c.choiceInContainer()
                }}
            "s" -> {
                println("Введите необходимое количество сахара. Для пополнения до максимума введите " + (1000 - conSugar))
                val add = readLine()?.toInt()
                if ( add in 0 ..(1000 - conSugar)) {
                    conSugar += add!!
                    c.printContainer()
                    c.choiceInContainer()
                }
                else {
                    println("Ошибка ввода. До максимума введите:" + (1000 - conSugar))
                    c.choiceInContainer()
                }}
            "i" -> {
                println("Введите необходимое количество льда. Для пополнения до максимума введите " + (1000 - conIce))
                val add = readLine()?.toInt()
                if ( add in 0 ..(1000 - conIce)) {
                    conIce += add!!
                    c.printContainer()
                    c.choiceInContainer()
                }
                else {
                    println("Ошибка ввода. До максимума введите:" + (1000 - conIce))
                    c.choiceInContainer()
                }}
            "p" -> {
                println("Введите необходимое количество виски. Для пополнения до максимума введите " + (1000 - conWhisky))
                val add = readLine()?.toInt()
                if ( add in 0 ..(1000 - conWhisky)) {
                    conWhisky += add!!
                    c.printContainer()
                    c.choiceInContainer()
                }
                else {
                    println("Ошибка ввода. До максимума введите:" + (1000 - conWhisky))
                    c.choiceInContainer()
                }}
            "t" -> {
                println("Введите необходимое количество стаканчиков. Для пополнения до максимума введите " + (100 - conCups))
                val add = readLine()?.toInt()
                if ( add in 0 ..(1000 - conCups)) {
                    conCups += add!!
                    c.printContainer()
                    c.choiceInContainer()
                }
                else {
                    println("Ошибка ввода. До максимума введите:" + (1000 - conCups))
                    c.choiceInContainer()
                }}
            "q" -> c.navigation()
            else -> {
                println("Ошибка ввода")
                return addContainer()
            }
        }
    }
}
