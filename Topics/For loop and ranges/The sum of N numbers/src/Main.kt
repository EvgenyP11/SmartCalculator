fun main() {
    // write your code here
    val iteraciy = readln().toInt()
    var sum = 0
    for (i in 1 .. iteraciy){
        sum += readln().toInt()
    }
    println(sum)
}
