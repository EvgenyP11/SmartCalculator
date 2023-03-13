fun main() {
    val text = readln()
    val regex = "[a|A]+".toRegex()
    val newText = text.replace(regex, "a")
    println(newText)
}