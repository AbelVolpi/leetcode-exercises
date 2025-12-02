fun minimumOperations(nums: IntArray): Int {
    var minimumOperations = 0
    for (i in 0..nums.size - 1) {
        if (((nums[i] + 1) % 3) == 0 || ((nums[i] - 1) % 3) == 0) {
            minimumOperations++
        }
    }
    return minimumOperations
}

fun main() {
    println(minimumOperations(intArrayOf(1, 2, 3, 4)))
    println(minimumOperations(intArrayOf(3,6,9)))
}