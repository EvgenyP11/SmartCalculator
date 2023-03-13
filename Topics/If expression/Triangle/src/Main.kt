import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val res = if( abs(a * b * c) >= 0) {
        if( (a * a + b * b) == c * c) {"YES"} else {"NO"}
    } else "NO"

    println(res)

}