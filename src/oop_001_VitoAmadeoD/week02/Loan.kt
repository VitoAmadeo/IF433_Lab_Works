package oop_001_VitoAmadeoD.week02

class loan(val bookTitle: String,val borrower: String,var loanDuration: Int = 0)
{
    fun calculateFine()
    {
        if (loanDuration > 3)
        {
            val fine: Int= (loanDuration -3) * 2000
        }
        else
        {
            val fine: Int = 0
        }
    }
}