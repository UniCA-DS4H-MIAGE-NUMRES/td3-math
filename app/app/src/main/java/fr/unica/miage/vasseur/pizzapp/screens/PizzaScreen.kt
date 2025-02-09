package fr.unica.miage.vasseur.pizzapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import fr.unica.miage.vasseur.pizzapp.model.Pizza
import fr.unica.miage.vasseur.pizzapp.viewmodel.CartViewModel

@Composable
fun DetailPizza(
    pizza: Pizza,
    modifier: Modifier = Modifier,
    cartViewModel: CartViewModel,
    onAddToCart: (Pizza, Int) -> Unit
) {
    var extraCheese by remember { mutableStateOf(50) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { onAddToCart(pizza, extraCheese) }
            ) {
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    contentDescription = "Add to cart"
                )
            }
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = pizza.image),
                    contentDescription = pizza.name,
                    contentScale = androidx.compose.ui.layout.ContentScale.FillBounds,
                    modifier = Modifier
                        .size(400.dp)
                        .padding(16.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = pizza.name, style = MaterialTheme.typography.headlineMedium)
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Prix: ${String.format("%.2f", pizza.price)}€",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Extra Fromage: $extraCheese%",
                    style = MaterialTheme.typography.bodyMedium
                )
                Slider(
                    value = extraCheese.toFloat(),
                    onValueChange = { extraCheese = it.toInt() },
                    valueRange = 0f..100f,
                    steps = 4
                )
                Text(
                    text = "Prix total: ${String.format("%.2f", pizza.price * (1 + extraCheese/100.0))}€",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    )
}