fun main()
{
    print("Enter any sentence: ")
    val a = readLine() ?: ""

    val words = a.split(" ")
    var count = 0
    for (i in words)
    {
        if (i == "is")
        {
            count++
        }
    }

    println("Word count is: $count")
}