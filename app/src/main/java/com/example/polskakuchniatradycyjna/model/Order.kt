package com.example.polskakuchniatradycyjna.model

data class Order(
        val personOrders: List<PersonOrder> = emptyList(),
        val totalOrderCost: Double = 0.0
    )
