fun main() {
    println(buyChoco(intArrayOf(69,91,78,19,40,13), 94))
}

fun buyChoco(prices: IntArray, money: Int): Int {
    var cheapestChoco1 = Int.MAX_VALUE
    var cheapestChoco2 = Int.MAX_VALUE
    var i = 0

    while (i < prices.size) {
        if (prices[i] < cheapestChoco1) {
            cheapestChoco2 = cheapestChoco1
            cheapestChoco1 = prices[i]
        } else if (prices[i] < cheapestChoco2) {
            cheapestChoco2 = prices[i]
        }
        i++
    }

    var chocolatesBought = 0
    val sum = cheapestChoco1 + cheapestChoco2
    if (sum <= money) {
        chocolatesBought = sum
    }
    return money - chocolatesBought
}