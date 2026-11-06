package oop_001_VitoAmadeoD.week08

class OrderModels
{
    class City(val name: String)
    class Address(val city: String?)
    class DeliveryDetails(val address: Address?)
    class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)
}