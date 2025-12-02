fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
    var intList = mutableListOf<Int>()
    for (i in 0 .. words.size - 1){
        val currentWord = words[i]
        val currentCharArray: CharArray = currentWord.toCharArray()

        for (j in 0 .. currentCharArray.size-1){
            if (currentCharArray[j] == x){
                intList.add(i)
                break
            }
        }
    }
    return intList
}

fun main() {
    println(findWordsContaining(words = arrayOf("leet", "code"), x = 'e'))
    println(findWordsContaining(words = arrayOf("abc","bcd","aaaa","cbc"), x = 'a'))
}