fun main(){
    print("enter string:")
    val a = readLine() ?: ""
    val b = a.split("<u>","</u>")
    for(i in b.indices)
    {
        if(i%2==0)
        {
            print(b[i])
        }
        else
        {
            print(b[i].uppercase())
        }

    }


}