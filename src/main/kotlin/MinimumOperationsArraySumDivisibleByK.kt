fun minOperations(nums: IntArray, k: Int): Int {
    var numsSum = 0
    var numberOfOperations = 0

    for (i in 0 until nums.size) {
        numsSum += nums[i]
    }
    for (i in numsSum downTo 0) {
        if (i % k == 0) {
            break
        }
        numberOfOperations++
    }
    return numberOfOperations
}

fun main() {
    println(minOperations(nums = intArrayOf(3, 9, 7), k = 5))
}