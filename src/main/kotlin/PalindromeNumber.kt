fun isPalindrome(x: Int): Boolean {
    if (x < 0) {
        return false
    }

    var reversed = 0
    var aux = x

    while (aux != 0) {
        reversed = (reversed * 10) + (aux % 10)
        aux = aux / 10
    }
    return reversed == x
}

fun main() {
    println(isPalindrome(22221))
}
