package oop_001_VitoAmadeoD.week05

class MathHelper (var sisi: Int, var lebar: Int, var jari: Double)
{
    fun hitungLuas(sisi: Int) : Int
    {
        return (sisi * sisi)
    }

    fun hitungLuas(panjang: Int, lebar: Int) : Int
    {
        return(panjang * lebar)
    }

    fun hitungLuas(jari: Double) : Double
    {
        return (3.14 * jari * jari)
    }
}