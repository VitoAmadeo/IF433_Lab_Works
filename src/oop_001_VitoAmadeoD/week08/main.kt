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

    println("\n--- test safe casting ---")
    val mixedData: List<any> = listOf(
        "smartphone",
        1500000,
        UserProfile("Andi", null)
        "laptop",
        4500000.0
    )

    for (item in mixedData)
    {
        val text = item as? String
        text?.let
        {
            println("Found text: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100

    val safeString = someObject as? String ?: "unknown string"
    println("Cast Result + fallback: $safeString")
}