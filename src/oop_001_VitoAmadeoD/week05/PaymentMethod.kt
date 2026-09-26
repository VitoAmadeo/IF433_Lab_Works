package oop_001_VitoAmadeoD.week05

abstract class PaymentMethod (val acountName: String)
{
    abstract fun processPayment(amount: Double)
    {

    }
}