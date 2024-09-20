fun numIdenticalPairs(nums: IntArray): Int {
    var goodPairs = 0
    for (i in 0 until nums.size) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                goodPairs++
            }
        }
    }
    return goodPairs
}

fun main() {
    println(numIdenticalPairs(intArrayOf(1,2,3,1,1,3)))
}