package com.example.polskakuchniatradycyjna.model

data class Order(
    val personOrders: MutableList<PersonOrder> = mutableListOf()
) {
    val totalCost: Double
        get() = personOrders.sumOf { it.totalPrice }
}
