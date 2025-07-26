fun main(){
    val principal=10000
    val rate=5
    val n=1
    val amount=principal*Math.pow((1+rate/n).toDouble(),n.toDouble())
    val ci = amount-principal
    println("compound interest=$ci")
}