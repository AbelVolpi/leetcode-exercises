fun main() {
    println(romanToInt("MCMXCIV"))
    println(romanToIntOptimized("MCMXCIV"))
    println(romanToIntWithHashTable("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    val charArray = s.toCharArray().reversed()
    var finalNumber = 0
    var i = 0
    while (i < charArray.size) {
        val currentCharValue = checkNumber(charArray[i])
        val nextCharValue =
            if (i != charArray.size - 1) checkNumber(charArray[i + 1])
            else 0
        if (nextCharValue < currentCharValue) {
            val resultValue = currentCharValue - nextCharValue
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

fun romanToIntWithHashTable(s: String): Int {
    val hashTable = createHashTable()
    val charArray = s.toCharArray().reversed()
    var finalNumber = 0
    var i = 0
    while (i < charArray.size) {
        val currentCharValue = hashTable[charArray[i]]
        val nextCharValue =
            if (i != charArray.size - 1) hashTable[charArray[i + 1]]
            else 0
        if (nextCharValue!! < currentCharValue!!) {
            val resultValue = currentCharValue - nextCharValue
            finalNumber += resultValue
            i += 2
        } else {
            finalNumber += currentCharValue
            i++
        }
    }
    return finalNumber
}

fun createHashTable(): HashMap<Char, Int> {
    val hashTable = HashMap<Char, Int>()
    hashTable['I'] = 1
    hashTable['V'] = 5
    hashTable['X'] = 10
    hashTable['L'] = 50
    hashTable['C'] = 100
    hashTable['D'] = 500
    hashTable['M'] = 1000
    return hashTable
}

fun romanToIntOptimized(s: String): Int {
    val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    val charArray = s.toCharArray()
    var total = 0
    var i = 0;

    while (i < charArray.size - 1) {
        val currentValue = romanMap[charArray[i]] ?: 0
        val nextValue = romanMap[charArray[i + 1]] ?: 0
        if (currentValue < nextValue) {
            total -= currentValue
        } else {
            total += currentValue
        }
        i++
    }
    val lastNumber = romanMap[charArray[charArray.size - 1]] ?: 0
    return (total + lastNumber)
}
