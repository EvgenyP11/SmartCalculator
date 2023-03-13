fun main() {
    val string = readLine()!!
    val n = readLine()!!.toInt()
    val listStr = string.split("[ ]+".toRegex(), n)
    for (i in listStr.indices) {
        println(listStr[i])
    }
}