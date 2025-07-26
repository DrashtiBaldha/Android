fun main()
{
    var x="this <u>is</u> not a <u>garden</u>"

    var y=x.split(">")
    for(i in y.indices)
    {
        if(i%2!=0)
        {
            print(y[i].uppercase())
        }

    }
    println("output:$y")
}