package oop_001_VitoAmadeoD.week07

fun main ()
{
    println("test regular class")
    val reg1 = RegularUser("Jack", 28)
    val reg2 = RegularUser("Jack", 28)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    val reg3 = reg1.copy(age = 23)
    println(reg3)

    val (username, age) = reg1
    println("$username, $age")
}