fun defangIPaddr(address: String): String {
    var resultString = ""
    val charArray: CharArray = address.toCharArray()
    for (i in 0 until charArray.size) {
        if (charArray[i] == '.') {
            resultString = resultString + "[.]"
        } else {
            resultString = resultString + charArray[i]
        }
    }
    return resultString
}

fun main() {
    println(defangIPaddr("1.1.1.1"))
}