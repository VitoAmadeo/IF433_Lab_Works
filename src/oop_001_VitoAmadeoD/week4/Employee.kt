package oop_001_VitoAmadeoD.week4

open class Employee (val name: String, val baseSalary: Int, var bonus: Int)
{
    open fun work()
    {
        println("$name is working...")
    }

    open fun calculateBonus()
    {
        bonus =  (baseSalary * 0.1).toInt()
        println("your bonus is : $bonus")
    }
}