package oop_001_VitoAmadeoD.week05

class Dosen(name: String, val nidn: String) : Pegawai(name)
{
    override fun berkerja()
    {
        println("[$nama] sedang menyiapkan materi perkuliahan dan revisi RPKPS.")
    }

    fun ngajar()
    {
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}