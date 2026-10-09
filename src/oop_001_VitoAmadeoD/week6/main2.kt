package oop_001_VitoAmadeoD.week6

fun main()
{
    val lamp = SmartLamp("D01", "Ruang Tamu")
    val speaker = SmartSpeaker("D02", "Google Nest")
    val cctv = SmartCCTV("D03", "Bardi Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}