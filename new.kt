fun main()
{
    println("Enter Full String:-")
    var a = readLine()!!.toString()

    println("Enter String:-")
    var b = readLine()!!.toString()

    var l=b.length
    var r="*".repeat(b.length)
    var c=a?.replace(b?:"","*")
    print(c)




}