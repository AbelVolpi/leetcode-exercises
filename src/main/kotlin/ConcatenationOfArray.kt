// 1ms to run
fun getConcatenation1(nums: IntArray): IntArray {
    val ans = IntArray(2 * nums.size)
    for (i in nums.indices) {
        ans[i] = nums[i]
        ans[i + nums.size] = nums[i]
    }
    return ans
}

// 9ms to run
fun getConcatenation2(nums: IntArray): IntArray {
    return nums + nums
}

fun main() {
    println(getConcatenation1(intArrayOf(1, 2, 3, 4, 5)).asList())
    println(getConcatenation2(intArrayOf(1, 2, 3, 4, 5)).asList())
}