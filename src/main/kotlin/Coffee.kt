abstract class Coffee() {
    open var water: Int = 200
    open var coffee: Int = 20
    open var milk: Int = 0
    open var sugar: Int = 0
    open var ice: Int = 0
    open var whisky: Int = 0
    open var cups: Int = 1
    open var counter: Int = 1

    open fun makeCoffee() {
        counter = (counter + 1)
        conWater = (conWater - water)
        conCoffee = (conCoffee - coffee)
        conMilk = (conMilk - milk)
        conSugar = (conSugar - sugar)
        conIce = (conIce - ice)
        conWhisky = (conWhisky - whisky)
        conCups = (conCups - cups)
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
        when (more ) {
            "c", "C" -> run()
            "s", "S" -> addContainer ()
            "q", "Q" -> println("Кофе-машина выключена")
        }

    }
}