package oop_001_VitoAmadeoD.week4

open class ElectricCar(brand: String, val numberOfDoors: Int, val batteryCapacity: Int) : Vehicle(brand)
{
    final override fun accelerate()
    {
        println("$brand berakselerasi dalam sunyi, kapasitas battery: $batteryCapacity")
    }
}