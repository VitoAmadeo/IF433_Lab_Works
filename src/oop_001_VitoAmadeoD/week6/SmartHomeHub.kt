package oop_001_VitoAmadeoD.week6

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice)
    {
        devices.add(device)
        println("${device.name} ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches()
    {
        println("\nShutting down")
        for (device in devices)
        {
            if (device is Switchable)
            {
                device.turnOff()
            }
        }
    }
}