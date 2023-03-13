fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val res = if ( a - b > 0) "$a" else "$b"

    println(res)

}