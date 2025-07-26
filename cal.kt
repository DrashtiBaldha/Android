fun main(){
    println("1 +")
    println("2 -")
    println("3 *")
    println("4 /")
    println("Enter the number:")
    val a = readln().toInt()

    println("Enter the number:")
    val b = readln().toInt()

    println("Enter the number:")
    val c = readln().toInt()

    if(a==1){
        println("Addition is"+(b+c))
    }else if(a==2){
        println("substration is"+(b-c))
    }else if(a==3){
        println("multiplication is"+(b*c))
    }else if(a==4){
        println("divison is"+(b/c))
    }

}