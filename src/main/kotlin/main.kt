fun main () {
    val amount = 500_000
    val minFee = 3500
    val fee = if (amount * 0.0075 < minFee) minFee else (amount * 0.0075).toInt()
    println("Комиссия составляет: $fee коп.")
}
