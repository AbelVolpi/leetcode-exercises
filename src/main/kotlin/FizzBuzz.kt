fun main() {
    println(fizzBuzz(5))
}

fun fizzBuzz(n: Int): List<String> {
    val list = arrayListOf<String>()
    var i = 1

    while (i <= n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> list.add("FizzBuzz")
            i % 3 == 0 -> list.add("Fizz")
            i % 5 == 0 -> list.add("Buzz")
            else -> list.add(i.toString())
        }
        i++
    }
    return list
}