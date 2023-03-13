fun main() {
    val string = readln().toCharArray()
    var summa = 0
    for (index in string.indices) {
        val num = string[index].toInt() - 48
        if (num in 1 .. 9) summa += num
    }
    println(summa)
}