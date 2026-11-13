package oop_001_VitoAmadeoD.week9

fun main()
{
    println("--- Test List ---")
    val framework: List<String> = listOf("kotlin", "java", "C++")
    println("Immutable List : $framework")
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n--- Test Set ---")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("UniqueNumbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("ActiveUsers: $activeUsers")
}

