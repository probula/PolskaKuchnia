package com.example.polskakuchniatradycyjna.model

data class PersonOrder(
    val soupName: String? = null,
    val soupPrice: Double = 0.0,
    val mainDishName: String? = null,
    val mainDishPrice: Double = 0.0,
    val drinkName: String? = null,
    val drinkPrice: Double = 0.0
) {
    val totalPrice: Double
        get() = soupPrice + mainDishPrice + drinkPrice
}
