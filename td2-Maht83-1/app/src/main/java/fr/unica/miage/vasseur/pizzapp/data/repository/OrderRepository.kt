package fr.unica.miage.vasseur.pizzapp.data.repository

import fr.unica.miage.vasseur.pizzapp.data.local.OrderDao
import fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity

class OrderRepository(private val orderDao: OrderDao) {
    suspend fun insertOrder(order: OrderEntity) {
        orderDao.insertOrder(order)
    }

    suspend fun getAllOrders(): List<OrderEntity> {
        return orderDao.getAllOrders()
    }

    suspend fun clearOrders() {
        orderDao.clearOrders()
    }
}