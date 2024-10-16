package edu.ucne.tarea5.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Screen {

    @serializable
    data object HomeScreen : Screen()
    @serializable
    data object ClienteList : Screen()
    @serializable
    data object Cliente : Screen()
    @serializable
    data object LibroList : Screen()
    @serializable
    data object Libro : Screen()
    @serializable
    data object PrestamoList : Screen()
    @serializable
    data object Prestamo : Screen()
    @serializable
    data object PrioridadList : Screen()
    @serializable
    data object Prioridad : Screen()
    @serializable
    data class Ticket(val ticketId: Int, val isTicketDelete: Boolean) : Screen()


}