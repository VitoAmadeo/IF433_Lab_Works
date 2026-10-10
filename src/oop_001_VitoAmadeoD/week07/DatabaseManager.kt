package oop_001_VitoAmadeoD.week07

object DatabaseManager
{
    var connectionStatus: String = "Disconnected"

    fun connect()
    {
        connectionStatus = "Connected"
        println("Database is ready")

    }
}