package oop_001_VitoAmadeoD.week07

class NetworkClient private constructor(val url : String) {

    companion object
    {
        const val BASE_URL = "http://api.column.ac.id/"

        fun createClient(): NetworkClient
        {
            println("membangun network dengan base URL : $BASE_URL")
            return NetworkClient("$BASE_URL")
        }
    }

    fun connect()
    {
        println("connecting to $BASE_URL")
    }
}