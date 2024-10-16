package edu.ucne.tarea5.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Clientes")
data class ClienteEntity (
    @PrimaryKey
    val clienteId: Int? = null,
    val cliente: String = "",
    val asunto: String = "",
    val descripcion: String = "",
    val prioridadId: Int? = null,
)