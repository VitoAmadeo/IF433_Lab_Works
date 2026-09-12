package oop_001_VitoAmadeoD.week03

class player(val name: String)
{
    private var xp:Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int)
    {
        val old = level
        if (amount <0)
        {
            println("please enter a number above 0!")
        }
        else
        {
            xp += amount
            if(old != level)
            {
                println("Selamat! $name naik ke level $level")
            }
        }

    }


}