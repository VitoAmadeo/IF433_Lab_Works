package oop_001_VitoAmadeoD.week10

class Box<T>(var value: T)

fun main()
{
    println("--- Test Generic Class ---")
    val intBox = Box(100)
    val stringBox = Box("Generics in cotlin)")

    println("Value inside intBox : ${intBox.value}")
    println("Value inside stringBox : ${stringBox.value}")

}