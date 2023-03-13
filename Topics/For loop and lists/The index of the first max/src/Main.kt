fun main() {
    val num  = readln().toInt()
    val numberList: MutableList<Int> = mutableListOf()
    for (i in 0 until num) {
        val number = readln().split(" ").map { it.toInt() }.toMutableList()
        numberList += number
    }
    val index = numberList.indexOf(numberList.maxOrNull())
    println(index)
}