package oop_001_VitoAmadeoD.UTS_142726_VitoAmadeoD

class Order(val customer: Customer, var status : OrderStatus = OrderStatus.COOKING)
{
    private val orders: MutableList<Pair<Menu, Int>> = mutableListOf()

    fun addMenu(menu: Menu, qty: Int)
    {
        orders.add(Pair(menu, qty))
    }

    fun printOrder()
    {
        println("\n====================Final List==================")
        println("Customer Name    : ${customer.name}")
        println("Customer Phone   : ${customer.phone}")
        println("Customer Address : ${customer.address}")
        println("Order Status     : ${status.name}")
        println("\n Items Ordered:")
        var ttl = 0.0
        for((menu, qty) in orders)
        {
            menu.printMenu(qty)
            ttl += menu.calculateSubtotal(qty)
        }

        println("----------------------------------------------------")
        println("Total = Rp $ttl")
    }
}