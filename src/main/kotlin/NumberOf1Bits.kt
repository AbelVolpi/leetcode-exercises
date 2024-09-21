fun hammingWeight(n: Int): Int {
    var quotient = n
    var remainder = 0
    var hammingWeight = 0

    while (quotient != 0) {
        remainder = quotient % 2
        quotient = quotient / 2
        if (remainder == 1) {
            hammingWeight++
        }
    }
    return hammingWeight
}

fun main() {
    println(hammingWeight(8))
}