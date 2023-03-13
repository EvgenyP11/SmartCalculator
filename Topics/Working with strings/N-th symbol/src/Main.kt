fun main() {
    val str = readln()
    val num = readLine()!!.toInt()
    println("Symbol # $num of the string \"$str\" is '${str[num - 1]}'")
}