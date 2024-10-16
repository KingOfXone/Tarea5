package edu.ucne.tarea5.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import edu.ucne.tarea5.presentation.cliente.ClienteListScreen
import edu.ucne.tarea5.presentation.cliente.ClienteScreen
import edu.ucne.tarea5.presentation.libro.LibroListScreen
import edu.ucne.tarea5.presentation.libro.LibroScreen

@Composable
fun PrioridadNavHost(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.HomeScreen
    ) {
        composable<Screen.HomeScreen>  {
            Screen.HomeScreen(navController = navHostController)
        }

        composable<Screen.Cliente> {
            val args = it.toRoute<Screen.Cliente>()
            ClienteScreen(
                clienteId = args.clienteId,
                goBack = {
                    navHostController.navigateUp()
                },
                isClienteDelete = args.isClienteDelete
            )
        }


        composable<Screen.Ticket> {
            val args = it.toRoute<Screen.Ticket>()
            LibroScreen(
                ClienteId = args.ticketId,
                goBack = {
                    navHostController.navigateUp()
                },
                //isTicketDelete = args.isTicketDelete
            )
        }
    }
}