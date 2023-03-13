fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line

    val sec = totalSeconds % 60
    val min = ((totalSeconds - sec) / 60) % 60
    val hours = (((totalSeconds - sec) - (min * 60)) / 3600) % 24
    println("$hours:$min:$sec")
}