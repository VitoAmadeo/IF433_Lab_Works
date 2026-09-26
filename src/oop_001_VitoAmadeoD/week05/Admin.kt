package oop_001_VitoAmadeoD.week05

class Admin (nama: String) : Pegawai (nama)
{
    override fun berkerja()
    {
        println("[$nama] sedang duduk did depan komputer melayani administrasi")
    }

    fun doAdminWork()
    {
        println("[$nama] sedang merekap data absensi mahasiswa")
    }
}