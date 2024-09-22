fun subtractProductAndSum(n: Int): Int {
    var remainder = -1
    var quotient = n
    var digitsSum = 0
    var digitsProduct = 1

    while (quotient != 0) {
        remainder = quotient % 10
        quotient = quotient / 10

        digitsSum += remainder
        digitsProduct *= remainder
    }
    return digitsProduct - digitsSum
}

fun main() {
    println(subtractProductAndSum(234))
}