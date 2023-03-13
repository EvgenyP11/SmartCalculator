fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    for (i in num1 .. num2) {
        if (i % 3 == 0 && i % 5 == 0) println("FizzBuzz")
        else if (i % 3 == 0) println("Fizz")
        else if (i % 5 == 0) println("Buzz")
        else println(i)
    }
}