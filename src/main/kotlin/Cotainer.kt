open class Cotainer
var conWater: Int = 10000
var conCoffee: Int = 1000
var conMilk: Int = 1000
var conSugar: Int = 1000
var conIce: Int = 100
var conWhisky: Int = 1000
var conCups: Int = 100



fun addContainer (){
    var addWater: Int
    var addCoffee: Int
    var addMilk: Int
    var addSugar: Int
    var addWhisky: Int
    var addCups: Int

    println("""Добавить ингридиенты
        Добавить воды - <w>. Текущее содержание - $conWater
        Добавить кофе - <c> Текущее содержание - $conCoffee
        Добавить молоко - <m> Текущее содержание - $conMilk
        Добавить сахар - <s> Текущее содержание - $conSugar
        Добавить льда - <i> Текущее содержание - $conIce
        Добавить виски - <p> Текущее содержание - $conWhisky
        Добавить стаканчиков - <t> Текущее содержание - $conCups
    """.trimMargin())
    var serv = readLine()
    when (serv){
        "w"->{
    println("Введите необходимое количество воды. Для пополнения до максимума введите " + (10000 - conWater))
    val add = readLine()?.toInt()
    conWater = (conWater + add!!)
            if (conWater > 10000) {
                conWater = (conWater - add)
                println("Слишком много воды. До максимума введите:" + (10000 - conWater))
                choiceInContainer ()
            }
            printContainer ()
            choiceInContainer ()
    }
    "c"->{
        println("Введите необходимое количество кофе Для пополнения до максимума введите " + (1000 - conCoffee))
        val add = readLine()?.toInt()
        conCoffee = (conCoffee + add!!)
        if (conCoffee > 1000) {
            conCoffee = (conCoffee - add)
            println("Слишком много кофе. До максимума введите:" + (1000 - conCoffee))
        conCoffee = (conCoffee + add)
        printContainer ()
        choiceInContainer ()
    }}
    "m"->{
        println("Введите необходимое количество молока. Для пополнения до максимума введите " + (1000 - conMilk))
        val add = readLine()?.toInt()
        conMilk = (conMilk + add!!)
        if (conMilk > 1000) {
            conMilk = (conMilk - add)
            println("Слишком много молока. До максимума введите:" + (1000 - conMilk))
            choiceInContainer ()
        }
        printContainer ()
        choiceInContainer ()
    }
    "s"->{
        println("Введите необходимое количество сахара. Для пополнения до максимума введите " + (1000 - conSugar))
        val add = readLine()?.toInt()
        conSugar = (conSugar + add!!)
        if (conSugar > 1000) {
            conSugar = (conSugar - add)
            println("Слишком много сахара. До максимума введите:" + (1000 - conSugar))
            choiceInContainer ()
        }
        printContainer ()
        choiceInContainer ()
    }
    "i"->{
        println("Введите необходимое количество льда. Для пополнения до максимума введите " + (100 - conIce))
        val add = readLine()?.toInt()
        conIce = (conIce + add!!)
        if (conIce > 1000) {
            conIce = (conIce - add)
            println("Слишком много льда. До максимума введите:" + (100 - conIce))
            choiceInContainer ()
        }
        printContainer ()
        choiceInContainer ()
    }
    "p"->{
        println("Введите необходимое количество виски. Для пополнения до максимума введите " + (1000 - conWhisky))
        val add = readLine()?.toInt()
        conWhisky = (conWhisky + add!!)
        if (conWhisky > 1000) {
            conWhisky = (conWhisky - add)
            println("Слишком много виски. До максимума введите:" + (1000 - conWhisky))
            choiceInContainer ()
        }
        printContainer ()
        choiceInContainer ()
    }
    "t"->{
        println("Введите необходимое количество стаканчиков. Для пополнения до максимума введите " + (100 - conCups))
        val add = readLine()?.toInt()
        conCups = (conCups + add!!)
        if (conCups > 100) {
            conCups = (conCups - add)
            println("Слишком много стаканчиков. До максимума введите:" + (100 - conCups))
            choiceInContainer ()
        }
        printContainer ()
        choiceInContainer ()
    }
        else -> {println("Ошибка ввода")
            return addContainer()}
}}