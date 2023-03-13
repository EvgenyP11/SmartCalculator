fun main() {

    val a = readln().toInt()
    val b = readln().toInt()
    val hNormal = readln().toInt()
    println(
        if (hNormal < a){
            "Deficiency"
        } else if (hNormal > b){
            "Excess"
        } else {
            "Normal"
        }
    )
}