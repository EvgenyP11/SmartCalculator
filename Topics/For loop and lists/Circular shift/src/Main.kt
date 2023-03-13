fun main() {
    val num = List(readLine()!!.toInt()) { readLine()!! }
    println((num.takeLast(1) + num.dropLast(1)).joinToString(" "))
}