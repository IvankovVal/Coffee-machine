open class Cotainer
var conWater: Int = 10000
var conCoffee: Int = 1000
var conMilk: Int = 1000
var conSugar: Int = 1000
var conIce: Int = 100
var conWhisky: Int = 100
var conCups: Int = 100

fun addContainer (){
    var addWater: Int
    var addCoffee: Int
    var addMilk: Int
    var addSugar: Int
    var addWhisky: Int
    var addCups: Int

    println("""Добавить ингридиенты
        Добавить воды - <w>
        Добавить кофе - <c>
        Добавить молоко - <m>
        Добавить сахар - <s>
        Добавить льда - <i>
        Добавить виски - <p>
        Добавить стаканчиков - <t>
    """.trimMargin())
    var serv = readLine()
    when (serv){
        "w"->{
    println("Введите необходимое количество воды")
    val add = readLine()?.toInt()
    conWater = (conWater + add!!)
    }
    "c"->{
        println("Введите необходимое количество кофе")
        val add = readLine()?.toInt()
        conCoffee = (conCoffee + add!!)
    }
    "m"->{
        println("Введите необходимое количество молока")
        val add = readLine()?.toInt()
        conMilk = (conMilk + add!!)
    }
    "s"->{
        println("Введите необходимое количество сахара")
        val add = readLine()?.toInt()
        conSugar = (conSugar + add!!)
    }
    "i"->{
        println("Введите необходимое количество льда")
        val add = readLine()?.toInt()
        conIce = (conIce + add!!)
    }
    "p"->{
        println("Введите необходимое количество виски")
        val add = readLine()?.toInt()
        conWhisky = (conWhisky + add!!)
    }
    "t"->{
        println("Введите необходимое количество воды")
        val add = readLine()?.toInt()
        conCups = (conCups + add!!)
    }
        else -> {println("Ошибка ввода")
            return addContainer()}
}}