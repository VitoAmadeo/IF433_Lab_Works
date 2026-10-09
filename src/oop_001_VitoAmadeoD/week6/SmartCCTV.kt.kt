package oop_001_VitoAmadeoD.week6

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable
{
    override fun turnOn()
    {
        println("CCTV '$name' ON.")
    }

    override fun turnOff()
    {
        println("CCTV '$name' OFF.")
    }

    override fun startRecord()
    {
        println("CCTV '$name' recording in progress.")
    }
}