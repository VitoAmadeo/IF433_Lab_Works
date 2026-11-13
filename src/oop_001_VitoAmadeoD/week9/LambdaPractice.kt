package oop_001_VitoAmadeoD.week9

fun main()
{
    println("--- Lambda Test ---")
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Sum Lambda: ${sumLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = {it * it}
    println("Square Result: ${squareImplicit(4)}")
}