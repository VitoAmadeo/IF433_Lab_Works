//package oop_001_VitoAmadeoD.week05
//
//class EWallet (val accountName: String,var  balance: Double) : PaymentMethod (accountName)
//{
//    override fun processPayment(amount: Double)
//    {
//        if (balance > amount)
//        {
//            balance -= amount
//            println("Payment Success")
//        }
//        else
//        {
//            println("Payment Fail")
//        }
//    }
//
//    fun topUp(amount: Double): Double
//    {
//        return(balance + amount)
//    }
//}