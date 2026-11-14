package oop_001_VitoAmadeoD.week10

fun main()
{
    println("\n--- Test Constraints ---")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Largest: ${math.getMax(45, 90)}")
}