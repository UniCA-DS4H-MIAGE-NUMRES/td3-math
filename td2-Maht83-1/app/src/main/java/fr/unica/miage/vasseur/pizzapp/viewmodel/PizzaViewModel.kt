package fr.unica.miage.vasseur.pizzapp.viewmodel

import androidx.lifecycle.ViewModel
import fr.unica.miage.vasseur.pizzapp.R
import fr.unica.miage.vasseur.pizzapp.model.Pizza
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PizzaViewModel : ViewModel() {
    private val _pizzas = MutableStateFlow<List<Pizza>>(emptyList())
    val pizzas: StateFlow<List<Pizza>> = _pizzas.asStateFlow()

    init {
        loadPizzas()
    }

    private fun loadPizzas() {
        _pizzas.value = listOf(
            Pizza("Margherita", 8.0, R.drawable.pizza1),
            Pizza("Capricciosa", 10.0, R.drawable.pizza2),
            Pizza("Diavola", 9.0, R.drawable.pizza3),
            Pizza("Quattro Stagioni", 11.0, R.drawable.pizza4),
            Pizza("Quattro Formaggi", 12.0, R.drawable.pizza5),
            Pizza("Marinara", 7.0, R.drawable.pizza6),
            Pizza("Pepperoni", 9.0, R.drawable.pizza7),
            Pizza("Prosciutto", 10.0, R.drawable.pizza8),
            Pizza("Frutti di Mare", 13.0, R.drawable.pizza9)
        )
    }

    fun getPizza(id: Int): Pizza? = pizzas.value.getOrNull(id)
}