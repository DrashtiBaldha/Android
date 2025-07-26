fun main(){
    print("Enter distance between two cities in kilometer:")
    val km = readln()
    val kilom = km.toDoubleOrNull() ?:0.0
    val meter = kilom*1000
    val centimeter=meter*100
    val feet=meter*30
    val inche=meter*39
    println("\n Distance Conversions")
    println("$kilom km=$meter")
    println("$kilom km=$centimeter")
    println("$kilom km=$feet")
    println("$kilom km=$inche")
    println("$kilom km=$inche")

}