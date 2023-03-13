fun main() {
    val text = readln()
    val regex = "(Am |A |Em |E |Dm |D |G |C )".toRegex()
    val newText = text.replace(regex, "")
    println(newText)

}