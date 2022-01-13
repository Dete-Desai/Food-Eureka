open class Feedback
{
    var employeeName: String = ""

    fun salesReply(employeeReply:String)
    {
        println("$employeeName: $employeeReply")
    }
}

class Order:Feedback()
{
    var customerName: String = ""

    fun customerReply(customerOrder:String)
    {
        println("$customerName: $customerOrder")
    }
}

fun main(args:Array<String>)
{
    var order = Order()

    println("MENU ORDER SYSTEM\n")

    println("Please Enter Your Name: ")
    order.customerName = readLine()!!.toString()

    println("Enter Your Order: ")
    order.customerReply(customerOrder = readLine()!!.toString())


    println("Please Enter Your Work Name: ")
    order.employeeName = readLine()!!.toString()

    println("Customer Feedback Please: ")
    order.salesReply(employeeReply = readLine()!!.toString())

}