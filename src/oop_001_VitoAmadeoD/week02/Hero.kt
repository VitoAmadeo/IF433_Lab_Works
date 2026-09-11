package oop_001_VitoAmadeoD.week02

import java.util.Scanner

class Hero(val name: String, var hp: Int= 100, val baseDamage: Int)
{
    fun attack(targetName: String) = println("$name has attacked $targetName!")
    fun takeDamage(damage: Int)
        {
            hp -= damage
            if (hp <= 0)
            {
                hp = 0
            }
        }
    fun isAlive() = hp>0
}

fun main()
{
    val scanner = Scanner(System.`in`)
    print("Hero's name: ")
    val name = scanner.nextLine()
    print("Damage Output: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine()
    val hero = Hero(name, 100, baseDamage)
    var enemyHp = 100


    while(hero.isAlive() && enemyHp >0)
    {
        println("Your HP = ${hero.hp}, Enemy's HP = $enemyHp")
        println("Menu")
        println("1. Fight")
        println("2. Run")
        val opt = scanner.nextInt()

        if(opt == 1)
        {
            enemyHp -= hero.baseDamage*((1..2).random()) // random crit
            hero.attack("Enemy")
            if(enemyHp > 0)
            {
                hero.takeDamage((10..20).random()*(1..2).random()) // enemy random crit
            }
        }
        else if(opt == 2)
        {
            println("You Ran!")
            break
        }

    }
    if(!hero.isAlive()) // dead
    {
        println("You Lose!, Enemy's HP : $enemyHp")
    }
    else if(hero.isAlive() && enemyHp>0) // run
    {
        println("Your HP : ${hero.hp}, Enemy's HP : $enemyHp")
    }
    else // win
    {
        println("You Win!, Your HP :${hero.hp}")
    }
}