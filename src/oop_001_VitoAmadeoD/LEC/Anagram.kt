package oop_001_VitoAmadeoD.LEC

fun anagram(first: String, second: String): Boolean
{
    val first = first.filter { it in 'a'..'z' || it in 'A'..'Z' }
    val second = second.filter { it in 'A'..'Z' || it in 'a'..'z' }

    if (first.length != second.length) return false

    val count = IntArray(26)

    for (i in first.indices)
    {
        count[first[i] - 'a']++
        count[second[i] - 'a']--
    }
    for (counts in count)
    {
        if (counts != 0) return false

    }

    return true
}

fun main()
{
    val word1 = readln()
    val word2 = readln()

    println("result")
    println("${anagram(word1, word2)}")
}


