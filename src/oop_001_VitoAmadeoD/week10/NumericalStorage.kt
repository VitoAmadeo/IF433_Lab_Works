package oop_001_VitoAmadeoD.week10

class MathBox <T: Number>(var value1: T, var value2: T)
{
    fun sum(): Double
    {
        return value1.toDouble() + value2.toDouble()
    }
}