fun main() {
    val statement = "this <u> is </u> a <u> garden </u>"
    val a = statement.split("<u>", "</u>")
    var isupper = false

    for (word in a) {
        if (isupper) {
            print(word.uppercase())
        } else {
            print(word)
        }
        isupper = !isupper
    }
}
