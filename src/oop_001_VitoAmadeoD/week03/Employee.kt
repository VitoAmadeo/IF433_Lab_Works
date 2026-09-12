package oop_001_VitoAmadeoD.week03

class Employee(val name: String)
{
    var salary: Int = 0
        set(value)
        {
            if (value < 0)
            {
                println("Error: Gaji tidak boleh negatif")
                field = 0
            }
            else
            {
                field = value
            }
        }
}

fun main()
{
    val e = Employee("Budi")
    println("Test Error")
    e.salary = 5000
}