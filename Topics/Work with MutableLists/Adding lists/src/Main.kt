fun main() {
    // do not touch the lines above
    // write your code here
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()

    firstList += secondList

    println(firstList.joinToString())

}