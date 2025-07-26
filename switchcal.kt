fun main(){
//    println("1 +")
//    println("2 -")
//    println("3 *")
//    println("4 /")
    println("Enter a number:")
    val a = readln().toInt()

    println("Enter a number:")
    val b = readln().toInt()

    println("Enter a number:")
    val c = readln().toInt()

    when(a){
        1->println("Addition is:"+(b+c))
        2->println("substration is:"+(b-c))
        3->println("multiplication is:"+(b*c))
        4->println("divison is:"+(b/c))
    }
}