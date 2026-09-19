package oop_001_VitoAmadeoD.week4

fun main()
{
    val emp = Employee("Joe", 500000, 0)
    emp.work()
    emp.calculateBonus()

    val dvp = Developer("Joe mamas", 500000, 0, "kotlin")
    dvp.work()
    dvp.calculateBonus()

    val mng = Manager("Joe mama", 500000, 0)
    mng.work()
    mng.calculateBonus()

}