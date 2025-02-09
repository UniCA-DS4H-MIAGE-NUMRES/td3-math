package fr.unica.miage.vasseur.pizzapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import fr.unica.miage.vasseur.pizzapp.data.local.OrderEntity
import fr.unica.miage.vasseur.pizzapp.viewmodel.CartItem
import fr.unica.miage.vasseur.pizzapp.viewmodel.CartViewModel
import fr.unica.miage.vasseur.pizzapp.viewmodel.OrderViewModel

@Composable
fun CartScreen(
    cartViewModel: CartViewModel,
    orderViewModel: OrderViewModel
) {
    val cartItems by cartViewModel.cartItems.collectAsState()
    val totalPrice by cartViewModel.totalPrice.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Votre commande",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        if (cartItems.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Votre panier est vide",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier.weight(1f)
            ) {
                items(cartItems) { item ->
                    CartItem(item)
                }
            }
        }

        Button(
            onClick = {
                cartItems.forEach { item ->
                    // Sauvegarder chaque article dans la base de données Room
                    orderViewModel.insertOrder(
                        OrderEntity(
                            pizzaName = item.pizza.name,
                            price = item.pizza.price,
                            extraCheese = item.extraCheese,
                            totalPrice = item.totalPrice
                        )
                    )
                }
                cartViewModel.clearCart() // Vider le panier après la sauvegarde
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Payer la commande")
        }

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Total: ${String.format("%.2f", totalPrice)}€",
                    style = MaterialTheme.typography.headlineSmall
                )
                Button(
                    onClick = { cartViewModel.clearCart() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                ) {
                    Text("Vider le panier")
                }
            }
        }
    }
}

@Composable
private fun CartItem(item: CartItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = item.pizza.name,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "Extra fromage: ${item.extraCheese}%",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Text(
                text = "${String.format("%.2f", item.totalPrice)}€",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}