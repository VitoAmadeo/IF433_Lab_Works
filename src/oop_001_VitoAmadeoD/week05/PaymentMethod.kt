package oop_001_VitoAmadeoD.week05

abstract class PaymentMethod (val accountName: String)
{
    abstract fun processPayment(amount: Double)
}