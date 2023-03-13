fun main() {
    val text = readLine()!!
    val regexColors = "#[0-9a-fA-F]{6}\\b".toRegex()
    val matchRes = regexColors.findAll(text)
    for (matches in matchRes) println(matches.value)
}