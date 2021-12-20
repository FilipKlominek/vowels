fun main() {
    println("Enter number of words")
    val words = Array(readLine()!!.toInt()) {
        println("Enter word ${it + 1}")
        readLine()!!
    }
    val map = words.map { word -> Pair(vowelCount(word), word) }
    println("Enter number of vowels or end")
    var currentVowels = readLine()!!
    while (currentVowels != "end") {
        println("Enter number of vowels or end")
        val current = map.groupBy { it.first }[currentVowels.toInt()]
        println(current?.map { pair -> pair.second })
        currentVowels = readLine()!!
    }
}

fun vowelCount(input: String): Int {
    val vowels = "aeiouy"
    var count = 0
    var i = 0
    while (i < input.length) {
        var j = 0
        while (j < vowels.length) {
            if (input[i] == vowels[j]) count++
            j++
        }
        i++
    }
    return count
}