package oop_001_VitoAmadeoD.week6

fun processCheckout(method: PaymentMethod, amount: Double)
{
    println("-> memulai Checkout....")
    method.pay(amount)
}

fun main()
{
    val myWatch = `Smartwatch.kt`()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()
    val pay1 = Gopay()
    val pay2 = Creditcard()

    println("Testing")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}