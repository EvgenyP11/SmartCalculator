package calculator

const val HELP = """    The program calculates the sum or difference of numbers. 
    The calculator calculates simple operations of addition and subtraction 
    without precedence (parentheses do not take into account the order of the 
    operation), the actions are performed in the order indicated in the example."""
fun main() {
    while (true) {
        var str = readln()
        if (str == "") continue
        str = checkingCorrectInputCommand(str)
        if (str == "Unknown command") {
            println(str)
            continue
        }
        str = checkingCorrectInputExpression(str)
        if (str == "Invalid expression") {
            println(str)
            continue
        }
        val listStr = str.split(" ")
        val firstValue = listStr[0]
        val list = removeSpaces(listStr).toList()
        if (firstValue == "/exit") {
            println("Bye!")
            break
        }
        if (firstValue == "/help") {
            println(HELP)
            continue
        }
        val listValue = splitListValue(list).toList()
        val listOperation = splitListOperation(list).toList()
        executionOfOperations(listValue, listOperation)

    }
}

fun checkingCorrectInputExpression(string: String): String {
    return if (!("/[a-z]{4}".toRegex().matches(string))) {
        val regexExpression = "(.?)*[-+]?\\s?[0-9]+".toRegex()//
        if (regexExpression.matches(string)) string
        else "Invalid expression"
    } else string
}
fun checkingCorrectInputCommand(string: String): String {
    return if ("/(.?)*".toRegex().matches(string)){
        if ("/[a-z]{4}".toRegex().matches(string)) string
        else "Unknown command"
    } else string
}
fun splitListValue(list: List<String>): IntArray {
    var tempValue = IntArray(0)
    for (i in list.indices step 2) {
        tempValue += list[i].toInt()
    }

    return tempValue
}
fun splitListOperation(list: List<String>): Array<String> {
    var tempList = Array(0){""}
    for (i in 1 until list.size step 2) {
        var tempOperation = ""
        if (list[i].length % 2 != 0 && (list[i].first() == '-' && list[i].last() == '-')) {
            tempOperation = "-"
        }
        if (list[i].first() == '+' || (list[i].length % 2 == 0 && (list[i].first() == '-' && list[i].last() == '-'))) {
            tempOperation = "+"
        }
        tempList += tempOperation
    }
    return tempList
}
fun executionOfOperations (listVal: List<Int>, listOperation: List<String>) {
    var value = listVal[0]
    for (i in listOperation.indices){
        when (listOperation[i]) {
            "-" -> value -= listVal[i + 1]
            "+" -> value += listVal[i + 1]
        }
    }
    println(value)
}
fun removeSpaces(list: List<String>): Array<String> {
    var tempList = Array(0){""}
    for (i in list.indices) {
        if (list[i] != "") tempList += list[i]
    }
    return tempList
}



