package oop_001_VitoAmadeoD.week6

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable
{

    override fun turnOn()
    {
        println("Lampu '$name' ON")
    }

    override fun turnOff()
    {
        println("Lampu '$name' OFF")
    }
}