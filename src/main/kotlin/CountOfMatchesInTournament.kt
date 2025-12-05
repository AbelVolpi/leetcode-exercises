fun numberOfMatches(n: Int): Int {
    var numberOfMatches = 0
    var numberOfTeams = n

    while (numberOfTeams > 1) {
        val matches = numberOfTeams / 2
        numberOfTeams -= matches
        numberOfMatches += matches
    }
    return numberOfMatches
}

fun main() {
    println(numberOfMatches(14))
}