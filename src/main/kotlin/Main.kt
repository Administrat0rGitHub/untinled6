fun main() {
    println("Введите 1-ю цифру:")
    val firstDig = readlnOrNull()?.trim()
    println("Введите 2-ю цифру:")
    val secondDig = readlnOrNull()?.trim()
    if (firstDig == null || secondDig == null ||
        firstDig.length != 1 || secondDig.length != 1 ||
        !firstDig.all { it.isDigit() } || !secondDig.all { it.isDigit() } ||
        firstDig == secondDig) {
        println("Ошибка!: Введите 2-е различные цифры.")
        return
    }

    val dig1 = firstDig[0]
    val dig2 = secondDig[0]

    val num1 = "$dig1$dig2"
    val num2 = "$dig2$dig1"

    if (num1.toInt() % 2 == 1) {
        println("Создано нечетное число: $num1")
    } else if (num2.toInt() % 2 == 1) {
        println("Создано нечетное число: $num2")
    } else {
        println("Создать нечетное число невозможно.")
    }
}