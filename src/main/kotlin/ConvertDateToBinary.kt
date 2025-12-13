fun convertDateToBinary(date: String): String {
    var dates = date.split('-')
    var binaryDate = ""
    for ((i, date) in dates.withIndex()) {
        var currentNumber = date.toInt()
        var currentBinaryString = ""
        while (currentNumber > 0) {
            val remainder = currentNumber % 2
            currentNumber = currentNumber / 2
            currentBinaryString = remainder.toString() + currentBinaryString
        }

        binaryDate = binaryDate + currentBinaryString
        if (i != 2)
            binaryDate = binaryDate + "-"
    }
    return binaryDate
}

fun main() {
    println(convertDateToBinary("2080-02-29"))
    println(convertDateToBinary("1900-01-01"))
}