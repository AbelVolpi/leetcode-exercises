fun maxDistinct(s: String): Int {
    val unrepeatedChars = mutableListOf<Char>()

    for (char in s) {
        var exists = false
        for (unrepeatedChar in unrepeatedChars){
            if (char == unrepeatedChar){
                exists = true
                break
            }
        }
        if (!exists)
            unrepeatedChars.add(char)
    }
    return unrepeatedChars.size
}

fun main() {
    println(maxDistinct("abab"))
    println(maxDistinct("abcd"))
    println(maxDistinct("aaaa"))
}