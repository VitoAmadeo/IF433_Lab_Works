package oop_001_VitoAmadeoD.week02

import java.util.Scanner

class hero(val name: String, var hp: Int= 100, val baseDamage: Int)
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