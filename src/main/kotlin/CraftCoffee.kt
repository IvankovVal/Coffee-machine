fun craftCoffee() {
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
    val fullCup: Int = (water + coffee + milk + sugar + ice + whisky)
    if (water < 0 || coffee < 0 || milk < 0 || sugar < 0 || ice < 0 || whisky < 0 )  {
        println("Ошибка ввода")
        return craftCoffee()
    }
    else if (fullCup > 245) {
                   println("Стакан перельётся. Добавьте ингридиентов в меньшем количестве для стакана 250 грамм")
            return craftCoffee()
        }
        else  {
            conWater -= water
            conCoffee -= coffee
            conMilk -= milk
            conSugar -= sugar
            conIce -= ice
            conWhisky -= whisky
            conCups -= cups
            if (conCups % 5 == 0) {
                println("Очистка кофе-машины")
            }
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

            val more = readLine()?.lowercase()
            when (more) {
                "c", "C" -> {
                    val b: Coffemachine = Coffemachine()
                    b.makecoffee()
                }
                "s" -> addContainer()
                "q" -> {
                    println("Кофе-машина выключена")
                }
            }
        }
    }