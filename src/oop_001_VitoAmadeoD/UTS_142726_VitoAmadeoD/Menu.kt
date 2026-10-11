package oop_001_VitoAmadeoD.UTS_142726_VitoAmadeoD

abstract class Menu(val name: String, IMenuCode: String, Iprice: Double = 0.0) : Bill
{
    var menuCode: String= ""
    get() = "UMN-$field"
    set(value)
    {
        field = value.uppercase()
    }

    var price: Double = 0.0
    set(value)
    {
        if (value >= 0.0)
        {
            field = value
        }
        else
        {
            println("Error on price!")
        }
    }

    init
    {
        this.menuCode = IMenuCode
        this.price = Iprice
    }

    abstract override fun calculateSubtotal(qty: Int): Double
    abstract override fun printMenu(qty: Int)
}