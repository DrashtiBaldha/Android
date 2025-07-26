fun main() {
    println("enter choose")
    println(" 1-> addition")
    println(" 2-> subtraction")
    println(" 3-> multi")
    println(" 4-> division")
    val no = readln().toInt()
    print("enter first value ")
    val a = readln().toInt()
    print("enter second ")
    val b = readln().toInt()

    fun add(a: Int, b: Int): Int {
        return a + b
    }
    fun sub(a: Int, b: Int): Int {
        return a - b
    }
    fun multi(a: Int, b: Int): Int {
        return a * b
    }
    fun div(a: Int, b: Int): Int {
        return a / b
    }
    when (no) {
        1 -> println("add ${add(a, b)}")
        2 -> println("sub ${sub(a, b)}")
        3 -> println("multi ${multi(a, b)}")
        4 -> println("div ${div(a, b)}")
        else -> "not valid"
    }
}