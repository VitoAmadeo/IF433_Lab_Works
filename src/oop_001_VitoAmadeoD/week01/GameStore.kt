package oop_001_VitoAmadeoD.week01

fun calcPrice(price: Int) = if(price > 500000) (price * 0.8) else (price * 0.9)

fun main()
{
    val gameTitle= "Red Dead Redemption 3"
    val price= 650000

    calcPrice(price)
    println("Price: $price")
}