package oop_001_VitoAmadeoD.week6

interface SmartDevice
{
    val id: String
    val name: String
}
interface Switchable
{
    fun turnOn()
    fun turnOff()
}

interface Recordable
{
    fun startRecord()
    fun stopRecord()
    {
        println("Perekaman stop dan disimpan ke Cloud.")
    }
}