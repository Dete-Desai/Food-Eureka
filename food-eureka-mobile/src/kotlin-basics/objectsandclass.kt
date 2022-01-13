class vendor {
    var idNumber: Int = 0
    var name: String = ""
    var company: String = ""
    var item: String = ""
    var quantity: Int = 0
    var date: String = ""
}
fun main(args:Array<String>)
{
    var foodVendor=vendor()

    println("Enter ID Number:")
    foodVendor.idNumber = readLine()!!.toInt()

    println("Enter Name:")
    foodVendor.name= readLine()!!.toString()

    println("Enter Company:")
    foodVendor.company = readLine()!!.toString()

    println("Enter Item:")
    foodVendor.item = readLine()!!.toString()

    println("Enter Quantity:")
    foodVendor.quantity = readLine()!!.toInt()

    println("Enter Date Of Delivery:")
    foodVendor.date = readLine()!!.toString()

    println("\nFOOD VENDOR DATA REPORT\n")
    println("ID Number: "+foodVendor.idNumber)
    println("Name: "+foodVendor.idNumber)
    println("Company: "+foodVendor.company)
    println("Item: "+foodVendor.item)
    println("Quantity: "+foodVendor.quantity+ "/GramsKilograms/Litres")
    println("Date: "+foodVendor.date)

}