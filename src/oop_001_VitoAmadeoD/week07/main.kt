package oop_001_VitoAmadeoD.week07

fun main ()
{
    println(" Testing ")
    println("Status : ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println(" Testing Companion")
    val client = NetworkClient.createClient()
    client.connect()
}