fun main() {
    val num = readln().toInt()

    val res = if(num < 0){"negative"}
    else{ if(num > 0){"positive"}
    else{"zero"}
    }
    println(res)// write your code here
}