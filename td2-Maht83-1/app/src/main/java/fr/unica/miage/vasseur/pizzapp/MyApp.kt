package fr.unica.miage.vasseur.pizzapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import fr.unica.miage.vasseur.pizzapp.data.local.AppDatabase
import fr.unica.miage.vasseur.pizzapp.data.repository.OrderRepository
import fr.unica.miage.vasseur.pizzapp.screens.CartScreen
import fr.unica.miage.vasseur.pizzapp.screens.DetailPizza
import fr.unica.miage.vasseur.pizzapp.screens.PizzaMenu
import fr.unica.miage.vasseur.pizzapp.screens.WelcomeScreen
import fr.unica.miage.vasseur.pizzapp.viewmodel.PizzaViewModel
import fr.unica.miage.vasseur.pizzapp.viewmodel.CartViewModel
import fr.unica.miage.vasseur.pizzapp.viewmodel.OrderViewModel
import fr.unica.miage.vasseur.pizzapp.viewmodel.OrderViewModelFactory


@Composable
fun MyApp() {
    val navController = rememberNavController()
    val cartViewModel: CartViewModel = viewModel()
    val pizzaViewModel: PizzaViewModel = viewModel()

    val orderViewModel: OrderViewModel = viewModel(
        factory = OrderViewModelFactory(
            OrderRepository(AppDatabase.getDatabase(LocalContext.current).orderDao())
        )
    )

    NavHost(
        navController = navController,
        startDestination = WelcomeRoute
    ) {
        composable<WelcomeRoute> {
            WelcomeScreen(navController)
        }

        composable<PizzaList> {
            PizzaMenu(
                navController = navController,
                pizzaViewModel = pizzaViewModel,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            )
        }

        composable<PizzaRoute> { backStackEntry ->
            val pizzaRoute = backStackEntry.toRoute<PizzaRoute>()
            val pizza = pizzaViewModel.getPizza(pizzaRoute.idPizza)
            pizza?.let {
                DetailPizza(
                    pizza = it,
                    cartViewModel = cartViewModel,
                    onAddToCart = { pizza, extraCheese ->
                        cartViewModel.addToCart(pizza, extraCheese)
                        navController.navigate(CartRoute)
                    }
                )
            }
        }

        composable<CartRoute> {
            CartScreen(
                cartViewModel = cartViewModel,
                orderViewModel = orderViewModel
            )
        }
    }
}