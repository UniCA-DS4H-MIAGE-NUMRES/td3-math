package fr.unica.miage.vasseur.pizzapp


@kotlinx.serialization.Serializable
object WelcomeRoute

@kotlinx.serialization.Serializable
object PizzaList

@kotlinx.serialization.Serializable
data class PizzaRoute(val idPizza: Int)

@kotlinx.serialization.Serializable
object CartRoute