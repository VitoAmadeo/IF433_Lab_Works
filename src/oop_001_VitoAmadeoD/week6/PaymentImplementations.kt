package oop_001_VitoAmadeoD.week6

class gopay: PaymentMethod
{
    override fun pay(amount:double) { println("Processing Rp$amount via Gopay Server")}
}

class CreditCard : PaymentMethod
{
    override fun pay(amount:Double) {println("Contacting bank for Rp$amount")}
}