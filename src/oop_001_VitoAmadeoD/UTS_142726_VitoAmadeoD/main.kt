package oop_001_VitoAmadeoD.UTS_142726_VitoAmadeoD

import java.util.Scanner

fun main()
{
    val scanner = Scanner(System.`in`)
    println("=== UMN Catering Manager System ")

    val nasgor = food("Nasi Goreng Spesial", "nsg01", -15000.0)
    nasgor.price = 25000.0
    val chikn = food("Ayam Bakar Madu", "aym02", -15000.0)
    val etl = drink("Es Teh Lemon", "lem011", 8000.0, true)

    val menu : List<Menu> = listOf(nasgor, chikn, etl)

    println("--- Customer Data Input ---")
    println("Enter Customer Name      :")
    val Cname = scanner.nextLine()
    println("Enter Customer Number    :")
    val Cnumber = scanner.nextLine()
    println("Enter Customer Address   :")
    val Caddress = scanner.nextLine()

    val customer = Customer(Cname, Cnumber, Caddress)
    val order = Order(customer)

    println("--- Menu Catalog ---")
    var ordering = true
    while (ordering)
    {
        for(i in menu.indices)
        {
            val item = menu[i]
            println("${i+1}. ${item.name}")
        }
        println("0. Finish and checkout")
        println("Select menu number:")
        val choice = scanner.nextLine().toIntOrNull() ?: -1

        if (choice == 0)
        {
            ordering = false
        }
        else if (choice in 1..menu.size)
        {
            val pmenu = menu[choice-1]
            println("Enter Quantity: ")
            val qqty = scanner.nextLine().toIntOrNull() ?: 0

            if (qqty>0)
            {
                order.addMenu(pmenu, qqty)
                println("Order Successful!")
            }
            else
            {
                println("Cannot fill in with 0")
            }
        }
        else
        {
            println("Invalid option, please try again")
        }
    }

    order.printOrder()
}