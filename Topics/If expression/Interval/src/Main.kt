fun main() {
    val num = readln().toInt()

    val res = if((num > -15 && num <= 12)
        || (num > 14 && num < 17)
        || (num >= 19 && num < Int.MAX_VALUE)){
        "True"
    } else {
        "False"
    }


    println(res)
}