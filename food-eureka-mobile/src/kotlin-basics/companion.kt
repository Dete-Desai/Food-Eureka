class Customers
{
    var date: String = ""
    var customersNumber: Int = 0

    companion object
    {
        var mealQuantity: Int = 0
    }
}

fun main(args:Array<String>)
{
    var c = Customers()
    var d = Customers()

    println("CUSTOMER ANALYTICS\n")

    println("Enter Date:")
    c.date = readLine()!!.toString()

    println("Enter Number Of Customers Served:")
    c.customersNumber = readLine()!!.toInt()

    println("Enter Quantity Of Product Served:")
    Customers.mealQuantity = readLine()!!.toInt()

    println("\nCUSTOMER ANALYSIS REPORT\n")
    println("DATE\t\t\t\tCUSTOMERS NUMBER\t\tPRODUCT NUMBER\n")
    println("${c.date}\t\t\t\t${c.customersNumber}\t\t\t\t${Customers.mealQuantity}\n\n")

    println("STATIC/COMPANION DATA\n")
    c.customersNumber++
    d.customersNumber++
    Customers.mealQuantity++
    Customers.mealQuantity++

    println(" ${c.customersNumber}\n ${d.customersNumber}\n ${Customers.mealQuantity}")

}