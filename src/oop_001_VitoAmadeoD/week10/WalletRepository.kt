package oop_001_VitoAmadeoD.week10

class WalletRepository<T>
{
    private val items = mutableListOf<T>()

    fun add(item: T)
    {
        items.add(item)
    }

    fun getAll(): List<T>
    {
        return items
    }

    fun findByName(query: String): List<T> {
        return items.filter { it is Nameable && it.name.equals(query, ignoreCase = true) }
    }
}