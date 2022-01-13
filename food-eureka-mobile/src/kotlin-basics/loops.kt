fun main(args:Array<String>){
    println("Enter Number Of Inventory:")
    var stockQuantity: Int = readLine()!!.toInt()

    var stockRemainder: Int = 10 - stockQuantity

    for(stockRemainder in 1..stockQuantity){
        println(stockRemainder)
    }

    when(stockQuantity){
        in 1..10 -> println("When Loop\n")
        else -> println("Number Not In Range")
    }

    while (stockQuantity <= 10) {
        println("$stockQuantity")
        stockQuantity++
    }

    for (stockRemainder in 9 downTo 1){
        println("$stockRemainder")
    }
}