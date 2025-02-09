package fr.unica.miage.vasseur.pizzapp.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "orders")
data class OrderEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "pizzaName") val pizzaName: String,
    @ColumnInfo(name = "price") val price: Double,
    @ColumnInfo(name = "extraCheese") val extraCheese: Int,
    @ColumnInfo(name = "totalPrice") val totalPrice: Double
)
