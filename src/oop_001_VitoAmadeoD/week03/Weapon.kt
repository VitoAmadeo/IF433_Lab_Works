package oop_001_VitoAmadeoD.week03

class weapon(val name: String)
{
    var damage: Int = 0
        set(value)
        {
            if(value < 0)
            {
                println("Error, cannot have damage less than 0!")
                field = 0
            }
            else if(value > 1000)
            {
                println("Error, cannot have damage greater than 1000! damage set to 1000")
                field = 1000
            }
            else
            {
                field = value
            }
        }
    val tier: String
        get() = when
        {
            damage >= 800 -> "Legendary"
            damage >= 500 -> "Epic"
            else -> "Common"
        }
}

fun main()
{
    val glock = weapon("Glock")
    glock.damage = 2000
    println("${glock.damage}, ${glock.tier}")

}
