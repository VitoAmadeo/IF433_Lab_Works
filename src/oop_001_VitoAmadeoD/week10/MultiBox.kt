    package oop_001_VitoAmadeoD.week10

    class PairBox<K, V>(val key: K, val value: V)
    {
    }

    fun main()
    {
        println("\n--- Test Multiple Parameters ---")
        val itemPrice = PairBox("Bitcoin", 65000)
        println("asset: ${itemPrice.key}, price: ${itemPrice.value} USD")
    }