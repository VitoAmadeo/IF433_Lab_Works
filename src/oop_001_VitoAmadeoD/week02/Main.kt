package oop_001_VitoAmadeoD.week02

import java.util.Scanner

fun main()
{
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan nama: ")
    val name = scanner.nextLine()

    println("Masukkan NIM (Wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if(nim.length != 5)
    {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    }
    else
    {
        print("Masukkan Juruusan: ")
        val major = scanner.nextLine()
        println("Status: Pendaftaran Selesai")
    }
}
