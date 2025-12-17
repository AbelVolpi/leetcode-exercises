fun numJewelsInStones(jewels: String, stones: String): Int {
    val jewelsCharArray = jewels.toCharArray()
    val stonesCharArray = stones.toCharArray()
    var counter = 0

    for (stoneChar in stonesCharArray){
        for (jewelChar in jewelsCharArray){
            if (stoneChar == jewelChar){
                counter++
            }
        }
    }
    return counter
}

fun main() {
    println(numJewelsInStones(jewels = "aA", stones = "aAAbbbb"))
}