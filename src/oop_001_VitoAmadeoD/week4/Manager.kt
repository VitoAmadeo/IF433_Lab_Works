package oop_001_VitoAmadeoD.week4

open class Manager (name: String, baseSalary: Int , bonus: Int) : Employee(name, baseSalary, bonus)
{
    override fun work()
    {
        println("$name is leading a division meeting")
    }
    override fun calculateBonus()
    {
        super.calculateBonus()
        bonus += 500000
    }
}