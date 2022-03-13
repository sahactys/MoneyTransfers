const val COMMISSION = 0.0075
const val MIN_COMMISSION: Double = 3500.0

fun main() {
    var amount: Double
    println("Введите сумму перевода")
    while (true) {
        try {
            amount = (readLine()?.toDouble() ?: return) * 100
            if (amount<0) error(0)
            break
        } catch (e: Exception) {
            println("Неверная сумма, попробуйте еще раз")
        }
    }
    val sumCommission: Int = (if (amount * COMMISSION > MIN_COMMISSION) amount * COMMISSION else MIN_COMMISSION).toInt()
    val totalAmount = (amount - sumCommission).toInt()
    println("Сумма комиссии = " + sumCommission / 100 + "руб. " + sumCommission % 100 + "коп.")
    println("Итоговая сумма перевода = " + totalAmount / 100 + "руб. " + totalAmount%100 + "коп.")
}




