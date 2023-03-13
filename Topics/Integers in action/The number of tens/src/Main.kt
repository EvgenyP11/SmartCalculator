fun main() {
    val n  = readln().toLong()
    if(n >= 10) {
        val hundreds = (n % 100) / 10
        println(hundreds)
    } else println(0)
}