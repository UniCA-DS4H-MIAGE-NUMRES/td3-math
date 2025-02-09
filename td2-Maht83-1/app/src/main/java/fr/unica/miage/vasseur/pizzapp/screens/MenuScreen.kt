package fr.unica.miage.vasseur.pizzapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import fr.unica.miage.vasseur.pizzapp.PizzaRoute
import fr.unica.miage.vasseur.pizzapp.model.Pizza
import fr.unica.miage.vasseur.pizzapp.ui.theme.PizzAppTheme
import fr.unica.miage.vasseur.pizzapp.viewmodel.PizzaViewModel

@Composable
fun PizzaMenu(
    navController: NavController,
    pizzaViewModel: PizzaViewModel,
    modifier: Modifier = Modifier
) {
    val pizzas by pizzaViewModel.pizzas.collectAsState()

    LazyColumn(modifier = modifier) {
        items(pizzas) { pizza ->
            PizzaCard(
                pizza = pizza,
                modifier = Modifier.padding(16.dp),
                onClickPizza = {
                    navController.navigate(PizzaRoute(pizzas.indexOf(pizza)))
                }
            )
        }
    }
}


@Composable
fun PizzaCard(pizza: Pizza, modifier: Modifier = Modifier, onClickPizza: (Pizza) -> Unit) {
    Card(
        modifier = modifier,
        onClick = {
            onClickPizza(pizza)
        }
    ) {
        Column(modifier = modifier) {
            Image(
                painter = painterResource(id = pizza.image),
                contentDescription = pizza.name,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = pizza.name,
                modifier = modifier
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.headlineMedium
            )
            Text(
                text = "Prix = " + pizza.price.toString() + "€",
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PizzaCardView() {
    PizzAppTheme {
        val previewNavController = rememberNavController()
        val previewViewModel = PizzaViewModel()
        PizzaMenu(
            navController = previewNavController,
            pizzaViewModel = previewViewModel,
            modifier = Modifier.padding(16.dp)
        )
    }
}