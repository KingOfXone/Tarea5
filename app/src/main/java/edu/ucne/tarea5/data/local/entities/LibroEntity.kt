package edu.ucne.tarea5.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Libros")
data class LibroEntity(
    @PrimaryKey
    val libroId: Int = 0,
    val titulo: String? = null,
    val autor: String? = null,
    val genero: String? = null,
    val estaPrestado: Boolean = false
)
