fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    while (true) {
        val str = readLine()!!
        if (str == "stop") break
        if (studentsMarks.containsKey(str)) continue
        if ("[A-Z](.?)*".toRegex().matches(str)) studentsMarks[str] = readLine()!!.toInt()
    }
    println(studentsMarks)
}