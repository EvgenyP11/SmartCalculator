fun main() {
    val numRepeat = readLine()!!.toInt()
    var numArray = IntArray(0)
    for (i in 1 .. numRepeat) {
        val tempNum = readln().toInt()
        numArray += tempNum
    }
    val numM = readLine()!!.toInt()
    var numAnswer = 0
    for (i in numArray.indices) {
        if (numArray[i] == numM) numAnswer += 1
    }
    if (numAnswer != 0) println("YES") else println("NO")
}