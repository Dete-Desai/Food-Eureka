fun main(args:Array<String>)
{
    println("STATIC OR FIXED ARRAY\n")
    var Items = arrayOf("Beverages\n","Vegetables\n", "Cereals\n", "Deserts\n", "Meat\n")

    println("Enter a number below or equal 4:")
    var itemNumber: Int = readLine()!!.toInt()

    println("DYNAMIC ARRAYS\n")
    println("Enter quantity:")
    var quantityAmount: Int = readLine()!!.toInt()

    var quantity=ArrayList<String>()
    quantity.add("$itemNumber litre\n")
    quantity.add("$quantityAmount kilograms\n")
    quantity.add("$quantityAmount kilograms\n")
    quantity.add("$quantityAmount kilograms\n")
    quantity.add("$quantityAmount kilograms\n")

    println("Enter Amount in Ksh")
    var priceAmount: Int = readLine()!!.toInt()

    var price = HashMap<String, Int>()
    price.put("Kenyan Shillings",1000*quantityAmount)
    price.put("Kenyan Shillings",1500*quantityAmount)
    price.put("Kenyan Shillings",1000*quantityAmount)
    price.put("Kenyan Shillings",2000*quantityAmount)
    price.put("Kenyan Shillings",3000*quantityAmount)

    for (x in Items)
        print(x)
    for (y in quantity)
        print(y)
    for (z in price)
        print(z)

    when(itemNumber){
     in 0..4 -> println(Items[itemNumber])
     else -> println("Number Not In Range\n")
    }
    when(quantityAmount){
        in 0..4 -> println(quantity[quantityAmount])
        else -> println("Service per plate\n")
    }
    when(priceAmount){
        in 500..100000 -> println(Items[priceAmount])
        else -> println("Not In Range\n")
    }
}