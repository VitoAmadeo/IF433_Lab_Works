package oop_001_VitoAmadeoD.week05

class EWallet (var balance: Double)
{
    override fun processPayment(amount: Double)
    {
        if (balance > amount)
        {
            balance -= amount
            println("Payment Success")
        }
        else
        {
            println("Payment Fail")
        }
    }

    fun topUp(amount: Double): Double
    {
        return(balance + amount)
    }
}