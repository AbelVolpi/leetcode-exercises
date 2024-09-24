fun main() {
    println(searchInsert(intArrayOf(1, 3, 5, 6), 5))
    println(searchInsert(intArrayOf(1, 3, 5, 6), 2))
    println(searchInsert(intArrayOf(1, 3, 5, 6), 7))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1
    var mid: Int = -1
    mid = low + ((high - low) / 2)
    while (low <= high) {
        when {
            nums[mid] > target -> high = mid - 1
            nums[mid] < target -> low = mid + 1
            nums[mid] == target -> return mid
        }
        mid = low + ((high - low) / 2)
    }
    return mid
}