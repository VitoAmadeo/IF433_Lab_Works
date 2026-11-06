package oop_001_VitoAmadeoD.week08

fun main()
{
    println("--- Test safe calls & elvis ---")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name?: "City not unknown"
    println("Desitnation order: $destination")
}