package oop_001_VitoAmadeoD.week9

fun main()
{
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 15, 24.8, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, -12.4, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, 8.1, "OPEN"),
        TradeLog("BNBUSDT", "SHORT", 5, -2.0, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 20, 0.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}