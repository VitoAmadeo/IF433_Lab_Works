package oop_001_VitoAmadeoD.week10

fun main()
{
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.2))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Response Status: ${response.status}")
    println("Coins List:")
    response.data.forEach{ coin -> println("- Coin: ${coin.name}, Balance: ${coin.balance}") }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 250.0))
    txRepo.add(Transaction("TX-002", 1200.5))

    println("\nTransactions List:")
    txRepo.getAll().forEach { tx -> println("- ID: ${tx.id}, Amount: ${tx.amount}")}
}