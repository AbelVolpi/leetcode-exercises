fun main() {
    println(scoreOfString("hello"))
}

fun scoreOfString(s: String): Int {
    var totalSum = 0
    val charArray: CharArray = s.toCharArray()

    for (i in 0..(charArray.size - 2)) {
        val currentAsciiValue = charArray[i].toInt()
        val adjacentAsciiValue = charArray[i + 1].toInt()
        val subtractionResult = absoluteValueSubtraction(currentAsciiValue, adjacentAsciiValue)
        totalSum += subtractionResult
    }
    return totalSum
}

private fun absoluteValueSubtraction(a: Int, b: Int): Int =
    if (b > a) (a - b) * -1 else a - b

