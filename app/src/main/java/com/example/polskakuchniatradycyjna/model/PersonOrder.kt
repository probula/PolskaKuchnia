package com.example.polskakuchniatradycyjna.model

data class PersonOrder(
    val customName: String? = null,
    val customPrice: Double = 0.0,
    val mainDishName: String? = null,
    val mainDishPrice: Double = 0.0,
) {
    val totalPrice: Double
        get() = customPrice + mainDishPrice
}
