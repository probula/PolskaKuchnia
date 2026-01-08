package com.example.polskakuchniatradycyjna.viewmodel

import androidx.lifecycle.ViewModel
import com.example.polskakuchniatradycyjna.model.Order
import com.example.polskakuchniatradycyjna.model.PersonOrder

class OrderViewModel : ViewModel() {

    var currentPersonOrder = PersonOrder()
    var order = Order()

    fun setMainDish(name: String, price: Double) {
        currentPersonOrder = currentPersonOrder.copy(mainDishName = name, mainDishPrice = price)
    }

    fun confirmPersonOrder() {
        order.personOrders.add(currentPersonOrder)
    }


}
