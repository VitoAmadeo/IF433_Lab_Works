package oop_001_VitoAmadeoD.week4

open class Developer(name: String, baseSalary: Int, bonus: Int, val programmingLanguage: String) : Employee(name, baseSalary, bonus)
{
    override fun work()
    {
        println("$name is coding in $programmingLanguage")
    }
}