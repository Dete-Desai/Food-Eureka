class stockReceiver {
    var employeeNumber: Int = 0
    var name: String = ""
    var item: String = ""
    var quantity: Int = 0
    var date: String = ""

    constructor(){
        println("Enter Employee Number:")
        employeeNumber= readLine()!!.toInt()

        println("Enter Name Of Employee:")
        name=readLine()!!.toString()

        println("Enter Item Received:")
        item=readLine()!!.toString()

        println("Enter Quantity Of Item:")
        quantity=readLine()!!.toInt()

        println("Enter Date:")
        date=readLine()!!.toString()
    }
}
fun main(args:Array<String>)
{
    var receiver = stockReceiver()
    println("\nEMPLOYEE RECEIVERSHIP DATA\n")
    println("Employee Number: "+receiver.employeeNumber)
    println("Name: "+receiver.name)
    println("Item: "+receiver.item)
    println("Quantity: "+receiver.quantity)
    println("Date: "+receiver.date)
}
