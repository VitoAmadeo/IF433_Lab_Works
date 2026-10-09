package oop_001_VitoAmadeoD.week6

class SmartSpeaker( override val id: String, override val name: String) : SmartDevice, Switchable
{

    override fun turnOn()
    {
        println("Speaker '$name' ON, siap memutar musik.")
    }

    override fun turnOff()
    {
        println("Speaker '$name' OFF.")
    }

    fun playMusic(song: String)
    {
        println("Listening to : $song")
    }
}