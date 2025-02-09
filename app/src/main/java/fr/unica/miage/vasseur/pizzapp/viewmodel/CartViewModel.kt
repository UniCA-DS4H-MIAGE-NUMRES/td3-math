package fr.unica.miage.vasseur.pizzapp.viewmodel

import androidx.lifecycle.ViewModel
import fr.unica.miage.vasseur.pizzapp.model.Pizza
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

data class CartItem(
    val pizza: Pizza,
    val extraCheese: Int,
    val totalPrice: Double = pizza.price * (1 + extraCheese / 100.0)
)

class CartViewModel : ViewModel() {
    private val _cartItems = MutableStateFlow<List<CartItem>>(emptyList())
    val cartItems: StateFlow<List<CartItem>> = _cartItems.asStateFlow()

    private val viewModelScope = CoroutineScope(Dispatchers.Main)

    val totalPrice: StateFlow<Double> = _cartItems
        .map { items -> items.sumOf { it.totalPrice } }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = 0.0
        )

    fun addToCart(pizza: Pizza, extraCheese: Int) {
        val newItem = CartItem(pizza, extraCheese)
        _cartItems.value = _cartItems.value + newItem
    }

    fun clearCart() {
        _cartItems.value = emptyList()
    }
}