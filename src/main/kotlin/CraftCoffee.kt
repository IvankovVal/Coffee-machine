
class CraftCoffee: Coffee () {

    override var water:Int = 0
    override var coffee: Int = 0
    override var milk: Int = 0
    override var sugar: Int = 0
    override var ice: Int = 0
    override var whisky: Int = 0
    override var cups: Int = 1

    override fun takeIngredient() {

        println("Введите колличество воды")
        var w: Int = readLine()!!.toInt()
        this.water = w
        println("Введите колличество кофе")
        var c: Int = readLine()!!.toInt()
        this.coffee = c
        println("Введите колличество молока")
        var m: Int = readLine()!!.toInt()
        this.milk = m
        println("Введите колличество сахара")
        var s: Int = readLine()!!.toInt()
        this.sugar = s
        println("Введите колличество льда")
        var i: Int = readLine()!!.toInt()
        this.ice = i
        println("Введите колличество виски")
        var whis: Int = readLine()!!.toInt()
        this.whisky = whis
    }






    }