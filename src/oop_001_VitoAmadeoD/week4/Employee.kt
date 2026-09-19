package oop_001_VitoAmadeoD.week4

open class Employee (val name: String, val baseSalary: Int = 0)
{
    open fun work()
    {
        println("$name is working...")
    }

    open fun calculateBonus() : Int
    {
        return (baseSalary * 0.1).toInt()
    }
}