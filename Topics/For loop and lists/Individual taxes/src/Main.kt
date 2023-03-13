fun main() {
    val numberCompanies = readln().toInt()
    val income: MutableList<Int> = mutableListOf()
    val interest: MutableList<Int> = mutableListOf()

    for (i in 0 until numberCompanies){
        val incomeCompanies = readln().split(" ").map { it.toInt() }.toMutableList()
        income += incomeCompanies
    }
    println()
    for (i in 0 until numberCompanies){
        val interestCompanies = readln().split(" ").map { it.toInt() }.toMutableList()
        interest += interestCompanies
    }

    for (i in 0 until numberCompanies){
        interest[i] *= income[i]
    }
    val numCom: Int = interest.indexOf(interest.maxOrNull()) + 1
    println(numCom)
}