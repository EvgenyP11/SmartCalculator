fun main() {
    // put your code here
    val numberA = readln().toInt()
    val numberB = readln().toInt()
    var result = 0
    for (i in numberA..numberB) {
        result += i
    }
    println(result)
}
