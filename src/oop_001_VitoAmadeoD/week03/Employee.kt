package oop_001_VitoAmadeoD.week03

class Employee(val name: String)
{
    var salary: Int = 0
        set(value)
        {
            println("Mencoba set gaji ke $value")
            this.salary = value
        }
}

fun main()
{
    val e = Employee("Budi")
    println("Test Error")
    e.salary = 5000
}