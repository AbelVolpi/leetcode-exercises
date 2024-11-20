fun main() {
    println(removeDuplicates("abbccae"))
}

fun removeDuplicates(s: String): String {
    val result = StringBuilder()
    for (char in s) {
        if (result.isNotEmpty() && result.last() == char) {
            result.deleteCharAt(result.lastIndex)
        } else {
            result.append(char)
        }
    }
    return result.toString()
}
