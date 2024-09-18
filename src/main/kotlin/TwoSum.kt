/*
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
fun twoSum(nums: IntArray, target: Int): IntArray {
    var intArray = IntArray(2)
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            val sum = nums[i] + nums[j]
            if (sum == target) {
                intArray = intArrayOf(i, j)
            }
        }
    }
    return intArray
}

fun main(args: Array<String>) {
    val response = twoSum(nums = intArrayOf(2, 7, 11, 15), target = 26)
    println(response.asList())
}