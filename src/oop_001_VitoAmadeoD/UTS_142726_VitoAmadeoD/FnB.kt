package oop_001_VitoAmadeoD.UTS_142726_VitoAmadeoD

class food (name : String, menuCode: String, price: Double = 0.0, val packagingFee: Double = 3000.0): Menu(name, menuCode, price )
{
    override fun calculateSubtotal(qty: Int): Double
    {
        return (price + packagingFee) * qty
    }

    override fun printMenu(qty: Int)
    {
        val subtotal = calculateSubtotal(qty)
        println("[$menuCode] $name * $qty +(Fee: Rp$packagingFee / box = Rp $subtotal")
    }
}

class drink (name: String, menuCode: String, price: Double = 0.0, val large: Boolean = false): Menu(name, menuCode, price )
{
    override fun calculateSubtotal(qty: Int): Double
    {
        val drinkPrice = if (large) price + 5000.0 else price
        return drinkPrice * qty
    }

    override fun printMenu(qty: Int)
    {
        val size = if (large) "Large" else "Small"
        val subtotal = calculateSubtotal(qty)
        println("[$menuCode] $name ($size) = Rp $subtotal")
    }
}
