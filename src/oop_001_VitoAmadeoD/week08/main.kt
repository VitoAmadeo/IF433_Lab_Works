package oop_001_VitoAmadeoD.week08

fun main()
{
    println("--- Test safe calls & elvis ---")
    val emptyOrder = OrderModels.Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "City not unknown"
    println("Desitnation order: $destination")

    println("\n--- Test Let Block ---")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let{ price -> val tax = price * 0.11 "transaction Successful. Price: Rp$price, Tax: $tax"} ?: "Transaction failed, price is not set"
    println(receipt)
}