open class Complaint
{
    var customerName: String = ""
    open fun customerComplaint(customerReply:String)
    {
        println("$customerName: $customerReply\n")
    }
}

class Defense:Complaint()
{
    var employeeName: String = ""
    override fun customerComplaint(employeeReply:String)
    {
        println("My Name Is $employeeName\n $employeeReply")
    }
}

fun main(args:Array<String>)
{
    var c = Complaint()
    var d = Defense()

    println("\n Customer Complaint Hot Point\n")
    println("Enter Your Name Please:")
    c.customerName = readLine()!!.toString()

    println("Enter Your Complaint:")
    c.customerComplaint(customerReply = readLine()!!.toString())

    println("Enter Employee Name:")
    d.employeeName = readLine()!!.toString()

    println("Enter Complaint Feedback:")
    d.customerComplaint(employeeReply = readLine()!!.toString())

}