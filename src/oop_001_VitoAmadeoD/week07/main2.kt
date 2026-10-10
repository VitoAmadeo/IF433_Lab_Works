package oop_001_VitoAmadeoD.week07

fun main ()
{
    println("test regular class")
    val reg1 = RegularUser("Jack", 28)
    val reg2 = RegularUser("Jack", 28)
    println(reg1)
    println("Sama? ${reg1 == reg2}")
}