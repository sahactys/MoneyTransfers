const val COMMISSION = 0.0075
const val MINCOMMISSION:Double = 3500.0

fun main() {
    var sum: Double
    println("Введите сумму перевода")
    while (true) {
        try {
            sum = (readLine()?.toDouble() ?: return) * 100
            break
        } catch (e: Exception) {
            println("Неверная сумма, попробуйте еще раз")
        }
    }
    val sumCommission:Double = (if (sum * COMMISSION > MINCOMMISSION) sum * COMMISSION else MINCOMMISSION)
    sum = (sum - sumCommission) / 100
    println("Сумма комиссии = ${(sumCommission/100).format(2)} руб.")
    println("Итоговая сумма перевода = ${sum.format(2)} руб.")
}

fun Double.format(digits: Int) = "%.${digits}f".format(this)


