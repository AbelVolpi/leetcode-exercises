fun getSneakyNumbers(nums: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()
    val array = mutableListOf<Int>()
    for (num in nums) {
        val count = map[num] ?: 0
        map[num] = count + 1
    }

    for ((key) in map){
        if (map[key]!! > 1){
            array.add(key)
        }
    }
    return array.toIntArray()
}

fun main() {
    println(getSneakyNumbers(nums = intArrayOf(0, 1, 1, 0)).asList())
}