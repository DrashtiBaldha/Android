fun main()
{
    println("1->Addition")
    println("2->Substraction")
    println("3->Multiplication")
    println("4->Division")

    print("Enter Your Choice")
    var a= readLine()!!.toInt()

    print("Enter First Value")
    var b= readLine()!!.toInt()

    print("Enter Second Value")
    var c= readLine()!!.toInt()

    when(a)
    {
                1->println("Addition:-"+(b+c))
                2->println("Substraction:-"+(b-c))
                3->println("Multiplication:-"+(b*c))
                4->println("Division:-"+(b/c))
    }

}