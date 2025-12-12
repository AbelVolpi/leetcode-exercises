fun finalValueAfterOperations(operations: Array<String>): Int {
    var value = 0
    for (i in operations) {
        if (i == "++X" || i == "X++") {
            value++
        }
        if (i == "--X" || i == "X--") {
            value--
        }
    }
    return value
}

fun main() {
    println(finalValueAfterOperations(arrayOf("--X", "X++", "X++")))
}