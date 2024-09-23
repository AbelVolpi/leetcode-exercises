/*
    Input: prices = [7,1,5,3,6,4]
    Output: 5
 */

fun main() {
    val maxProfit = maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
    val maxProfit2 = maxProfit(intArrayOf(7, 6, 4, 3, 1))
    println(maxProfit)
}

fun maxProfit(prices: IntArray): Int {
    var minPrice = prices[0]
    var maxProfit = 0

    for (i in 0 until prices.size) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]
        } else {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice)
        }
    }
    return maxProfit
}