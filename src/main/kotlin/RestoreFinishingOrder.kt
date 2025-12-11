fun recoverOrder(order: IntArray, friends: IntArray): IntArray {
    val recoveredOrder = IntArray(friends.size)
    var currentPosition = 0

    for (i in 0 until order.size) {
        for (j in 0 until friends.size) {
            if (order[i] == friends[j]) {
                recoveredOrder[currentPosition] = friends[j]
                currentPosition++
            }
        }
    }
    return recoveredOrder
}

fun main() {
    println(recoverOrder(order = intArrayOf(3, 1, 2, 5, 4), friends = intArrayOf(1, 3, 4)))
    println(recoverOrder(order = intArrayOf(1, 4, 5, 3, 2), friends = intArrayOf(2, 5)))
}