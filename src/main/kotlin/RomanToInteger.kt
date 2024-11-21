fun main() {
    println(romanToInt("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    var charArray = s.toCharArray().reversed()
    var finalNumber = 0
    var i = 0
    while (i < charArray.size) {
        var currentCharValue = checkNumber(charArray[i])
        var nextCharValue =
            if (i != charArray.size - 1) checkNumber(charArray[i + 1])
            else 0
        if (nextCharValue < currentCharValue) {
            var resultValue = currentCharValue - nextCharValue
            finalNumber += resultValue
            i += 2
        } else {
            finalNumber += currentCharValue
            i++
        }
    }
    return finalNumber
}

fun checkNumber(char: Char): Int {
    return when (char) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}