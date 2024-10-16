package edu.ucne.tarea5.data.remote.dto

data class LibroDto (

    val libroId: Int?,
    val titulo: String?,
    val autor: String?,
    val genero: String,
    val estaPrestado: Boolean?,
)