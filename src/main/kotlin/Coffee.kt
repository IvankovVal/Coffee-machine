abstract class Coffee() {
    abstract var water: Int
    abstract var coffee: Int
    abstract var milk: Int
    abstract var sugar: Int
    abstract var ice: Int
    abstract var whisky: Int
    abstract var cups: Int


    open fun makeCoffee() {
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
}