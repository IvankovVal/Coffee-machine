fun randomCoffee() {
    println("Введите колличество воды")
    var water: Int = readLine()!!.toInt()
    println("Введите колличество кофе")
    var coffee: Int = readLine()!!.toInt()
    println("Введите колличество молока")
    var milk: Int = readLine()!!.toInt()
    println("Введите колличество сахара")
    var sugar: Int = readLine()!!.toInt()
    println("Введите колличество льда")
    var ice: Int = readLine()!!.toInt()
    println("Введите колличество виски")
    var whisky: Int = readLine()!!.toInt()

    var cups: Int = 1

    conWater -= water
    conCoffee -= coffee
    conMilk -= milk
    conSugar -= sugar
    conIce -= ice
    conWhisky -= whisky
    conCups -= cups
    println(
        """Ваш кофе готов!
В контейнере осталось:
воды - $conWater
кофе - $conCoffee
молока - $conMilk
сахара - $conSugar
льда - $conIce
виски - $conWhisky
стаканчиков - $conCups

**********************
Ещё кофе <C> Сервис <S> Выключить <Q>
""".trimMargin()
    )
    if (conCups % 5 == 0) {
        println("Очистка кофе-машины")
    }
    var more = readLine()
    when (more) {
        "c", "C" -> {
            var b: Coffemachine = Coffemachine()
            b.run()
        }
        "s", "S" -> addContainer()
        "q", "Q" -> {
            println("Кофе-машина выключена")
        }
    }

}