import kotlin.time.times
fun main() {
    print("Enter the principal amount: ")
    val principal = readLine()?.toDouble()

    print("Enter the rate of interest (%): ")
    val rate = readLine()?.toDouble()

    print("Enter the time period (years): ")
    val time = readLine()?.toDouble()

    val simpleInterest = (principal!! * rate!! * time!!) / 100

    println("Simple Interest = $simpleInterest")
}
