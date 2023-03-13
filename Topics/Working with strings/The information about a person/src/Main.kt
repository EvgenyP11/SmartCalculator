fun main() {
    val (a, b, c) = readln().split(" ").map{ it }
    println("${a.first()}. " +
            "${b}, " +
            "${c.toInt()} years old")

}