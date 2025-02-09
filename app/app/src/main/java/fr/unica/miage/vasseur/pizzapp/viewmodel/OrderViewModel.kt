package fr.unica.miage.vasseur.pizzapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity
import fr.unica.miage.vasseur.pizzapp.data.repository.OrderRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class OrderViewModel (private val repository: OrderRepository) : ViewModel() {
    private val _orders = MutableStateFlow<List<OrderEntity>>(emptyList())
    val orders: StateFlow<List<OrderEntity>> = _orders

    fun insertOrder(order: OrderEntity) {
        viewModelScope.launch {
            repository.insertOrder(order)
            loadOrders()
        }
    }

    fun loadOrders() {
        viewModelScope.launch {
            _orders.value = repository.getAllOrders()
        }
    }

    fun clearOrders() {
        viewModelScope.launch {
            repository.clearOrders()
            loadOrders()
        }
    }
}