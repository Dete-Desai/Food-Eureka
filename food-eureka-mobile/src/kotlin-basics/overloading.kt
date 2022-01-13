class Sales
{
    fun dailySales(drinkSales:Int, mealSales:Int)
    {
        var total: Int = drinkSales + mealSales
        println("Total Sales For Drinks and Meals: $total\n")
    }

    fun annualSales(drinkSales:Int, mealSales:Int, days:Int)
    {
        var total: Int = drinkSales + mealSales
        var monthlySales: Int = (total * days)
        println("Total Sales Of The Month: $monthlySales\n")
    }
}
fun main(args:Array<String>)
{
    var dS = Sales()

    println("END OF DAY CALCULATION\n\n")
    println("Enter End Of Day Drink Sales & Meal Sales:\n")
    dS.dailySales(drinkSales = readLine()!!.toInt(), mealSales = readLine()!!.toInt())

    println("ANNUAL SALES CALCULATION\n\n")
    println("Enter End Of Day\n Drink Sales\n Meal Sales\n Total Days Of The Month:\n")
    dS.annualSales(drinkSales = readLine()!!.toInt(), mealSales = readLine()!!.toInt(),days = readLine()!!.toInt())
}