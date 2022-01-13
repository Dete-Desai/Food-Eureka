fun main(args:Array<String>)
{
    println("Enter Item:")
    var item: String = readLine()!!.toString()

    println("Enter Price:")
    var price: Int = readLine()!!.toInt()

    println("Enter Quantity:")
    var quantity: Int = readLine()!!.toInt()

    if (price < 1000) {
        println("Beverage on menu")
    }
    else {
        println("Du jour on menu")
    }

    when(quantity) {
        1 -> println(item)
        2 -> println(item+ " and a soda for free")
        3 -> println("$item, chips and soda for free")
        4 -> println("$item, chips, salad and soda for free")
        in 5 ..10 -> println(item+ "full bouquet")
        else -> println("No Item")
    }

}