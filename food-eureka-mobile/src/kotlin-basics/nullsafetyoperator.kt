fun main(args:Array<String>)
{
    println("Enter Your Name:")
    var name: String = readLine().toString()

    println("Enter Phone Number:")
    var phoneNumber: Int ?= readLine()?.toInt()

    println("Enter Your Age:")
    var age: Int = readLine()!!.toInt()

    println("Enter Membership Number:")
    var membershipNumber: Int = readLine()!!.toInt()

    println("Name:$name")
    println("Phone Number:$phoneNumber")
    println("Age:$age")
    println("Membership Card:$membershipNumber")
}