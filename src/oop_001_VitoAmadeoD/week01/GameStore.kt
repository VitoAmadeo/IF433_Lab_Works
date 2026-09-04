package oop_001_VitoAmadeoD.week01

fun calcPrice(price: Int): Int = if(price > 500000) (price * 80)/100 else (price * 90)/100

fun receipt(gameTitle: String, finalPrice: Int) = println("Title: $gameTitle, Price: $finalPrice")

fun main()
{
    val gameTitle= "Red Dead Redemption 3"
    val price= 650000

    val finalPrice= calcPrice(price)
    receipt(gameTitle, finalPrice)
}