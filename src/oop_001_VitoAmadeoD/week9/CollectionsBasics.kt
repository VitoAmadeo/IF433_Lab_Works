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

    println("\n--- Test Map ---")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "C"
    )
    println("Nilai Bob: $studentGrades")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 30
    println("Inventory: $inventory")
}

