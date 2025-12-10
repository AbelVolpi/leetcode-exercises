fun maxFreqSum(s: String): Int {
    val charArray = s.toCharArray()
    val map = hashMapOf<Char, Int>()
    var consonantSum = 0
    var vowelsSum = 0

    for (i in 0 until charArray.size) {
        var currentCharSum = map.get(charArray[i])
        if (currentCharSum == null)
            currentCharSum = 1
        else
            currentCharSum++

        map.put(charArray[i], currentCharSum)

        if (checkIsVowel(charArray[i])) {
            if (currentCharSum > vowelsSum) vowelsSum = currentCharSum
        } else {
            if (currentCharSum > consonantSum) consonantSum = currentCharSum
        }
    }
    println(map)
    return consonantSum + vowelsSum
}

private fun checkIsVowel(char: Char) = char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u'


fun main() {
    println(maxFreqSum("successes"))
    println(maxFreqSum("aeiaeia"))
}