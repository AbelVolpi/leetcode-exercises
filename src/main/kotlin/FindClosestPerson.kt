fun findClosest(x: Int, y: Int, z: Int): Int {
    val xProximity = getProximity(x, z)
    val yProximity = getProximity(y, z)
    if (xProximity < yProximity) return 1
    if (yProximity < xProximity) return 2
    return 0
}

private fun getProximity(a: Int, b: Int): Int {
    if (a > b) return a - b
    if (b > a) return b - a
    return 0
}

fun main() {
    println(findClosest(x = 2, y = 7, z = 4))
    println(findClosest(x = 2, y = 5, z = 6))
    println(findClosest(x = 1, y = 5, z = 3))

}